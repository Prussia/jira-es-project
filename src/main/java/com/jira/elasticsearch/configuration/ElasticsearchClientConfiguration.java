package com.jira.elasticsearch.configuration;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.admin.cluster.node.info.NodesInfoRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.inject.Named;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.slf4j.LoggerFactory.getLogger;


@Named
@Configuration
@ComponentScan(basePackages = {})
public class ElasticsearchClientConfiguration {

    @Value("${elasticsearch.hosts}")
    public String esHosts;

    @Value("${elasticsearch.clusterName}")
    public String esClusterName;

    @Value("${elasticsearch.shield.userCredentials}")
    public String esShieldUserCredentials;

    @Value("${elasticsearch.shield.keystore.path}")
    public String esShieldKeystorePath;

    @Value("${elasticsearch.shield.keystore.password}")
    public String esShieldKeystorePassword;

    @Value("${elasticsearch.shield.transport.ssl}")
    public Boolean esShieldTransportSsl;

    @Value("${elasticsearch.shield.enabled}")
    public Boolean esShieldEnabled;

    @Value("${elasticsearch.shield.transport.ssl.protocol}")
    public String esShieldSslProtocol;

    @Value("${elasticsearch.shield.transport.ssl.supported_protocols}")
    public String esShieldSslSupportedProtocol;

    @Value("${elasticsearch.shield.transport.ssl.ciphers}")
    public String esShieldSslCipher;

    @Value("${elasticsearch.shield.ssl.truststore.path}")
    public String esShieldSslTruststorePath;

    @Value("${elasticsearch.shield.ssl.truststore.password}")
    public String esShieldSslTruststorePassword;

    @Value("${elasticsearch.query.timeout}")
    public Integer esQueryTimeout;

    @Value("${elasticsearch.query.suggest.min.length}")
    public Integer esFuzzyMinLength;

    private static final Logger LOGGER = getLogger(ElasticsearchClientConfiguration.class);


        /**
         * The JAVA API does not use the standard http connection to elasticsearch.
         * It uses the node to node transport communications, so the normal http.port=9200
         * cannot not be used, the default port to be used is the transport.tcp.port=9300
         */
    @Bean(destroyMethod = "close")
    public Client elasticsearchClient() {
            return createElasticSearchClient();
        }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    private Client createElasticSearchClient() {

        validateProperties();

        TransportClient client = new TransportClient(getESSettings());

        addElasticsearchNodes(client);

        LOGGER.debug(client.admin().cluster().nodesInfo(new NodesInfoRequest()).actionGet().toString());

        return client;
    }

        private void validateProperties(){
            final String notFoundMessage = " property not found in configuration properties";

            checkArgument(isNotBlank(esHosts), " Elasticsearch host" + notFoundMessage);

            checkArgument(isNotBlank(esClusterName), " Elasticsearch cluster name" + notFoundMessage);

            checkArgument(isNotBlank(esShieldUserCredentials), " Elasticsearch shield username" + notFoundMessage);

            checkArgument(esShieldTransportSsl != null, " Elasticsearch shield transport ssl" + notFoundMessage);

            checkArgument(esShieldEnabled != null, " Elasticsearch shield enabled" + notFoundMessage);
        }


        private TransportClient addElasticsearchNodes(TransportClient client){
            List<Host> transportAddresses = extractElasticsearchHosts();

            for (Host host : transportAddresses) {
                Map.Entry address = new AbstractMap.SimpleEntry(host.getHostName(), host.getPortNumber());
                InetSocketTransportAddress transportAddress = new InetSocketTransportAddress(address.getKey().toString(),
                        Integer.parseInt(address.getValue().toString()));
                client.addTransportAddress(transportAddress);
            }

            LOGGER.info("Connecting to elasticsearch cluster {}, on following address(s) {}", esClusterName, esHosts);

            return client;
        }

        private List<Host> extractElasticsearchHosts() {
            List<Host> transportAddresses = new ArrayList<Host>();
            esHosts = esHosts.replace(" ", "");

            String[] hosts = esHosts.split(",");
            for (String address : hosts){
                String[] hostValue = address.split(":");
                checkArgument(!isBlank(hostValue[0]), " Invalid elasticsearch host information (Host)");
                checkArgument(!isBlank(hostValue[1]), " Invalid elasticsearch host information (Port)");
                Host host = new Host(hostValue[0], Integer.parseInt(hostValue[1]));
                transportAddresses.add(host);
            }

            return transportAddresses;
        }

        private Settings getESSettings() {

            ImmutableSettings.Builder builder = ImmutableSettings.settingsBuilder();

            builder.put("cluster.name", esClusterName)
                    .put("shield.user", esShieldUserCredentials)
                    .put("shield.transport.ssl", esShieldTransportSsl)
                    .put("shield.enabled", esShieldEnabled)
                    .put("shield.ssl.protocol", esShieldSslProtocol)
                    .put("shield.ssl.supported_protocols", esShieldSslSupportedProtocol)
                    .put("shield.ssl.ciphers", esShieldSslCipher)
                    .put("shield.ssl.truststore.password", esShieldSslTruststorePassword)
                    .put("shield.ssl.truststore.path", esShieldSslTruststorePath);

            if(keyStoreExists()) {
                builder.put("shield.ssl.keystore.path", esShieldKeystorePath)
                        .put("shield.ssl.keystore.password", esShieldKeystorePassword);
            }

            return builder.build();
        }


        private boolean keyStoreExists() {
            boolean keystoreProvided = isNotBlank(esShieldKeystorePath) && isNotBlank(esShieldKeystorePassword);
            LOGGER.debug("Elasticsearch keystore provided is {}", keystoreProvided);
            return keystoreProvided;
        }


        private static final class Host {
            private String hostName;
            private int portNumber;

            public Host(String hostName, int portNumber) {
                this.hostName = hostName;
                this.portNumber = portNumber;
            }

            public String getHostName() {
                return hostName;
            }

            public int getPortNumber() {
                return portNumber;
            }
        }
}

