package devmultitask;

import java.util.*;

public class BancoDeDadosOrdenados {
    public static final List<String> LISTA_ORDENADA_DE_BANCOS_DE_DADOS = criarListaBancosDeDados();

    private static List<String> criarListaBancosDeDados() {
        List<String> listaDeBancosDeDados = new ArrayList<>();
        
        listaDeBancosDeDados.add("MySQL");
        listaDeBancosDeDados.add("PostgreSQL");
        listaDeBancosDeDados.add("Oracle Database");
        listaDeBancosDeDados.add("Microsoft SQL Server");
        listaDeBancosDeDados.add("SQLite");
        listaDeBancosDeDados.add("IBM DB2");
        listaDeBancosDeDados.add("Apache Derby");
        listaDeBancosDeDados.add("MariaDB");
        listaDeBancosDeDados.add("H2 Database Engine");
        listaDeBancosDeDados.add("SAP HANA");
        listaDeBancosDeDados.add("Amazon Redshift");
        listaDeBancosDeDados.add("Google Cloud Spanner");
        listaDeBancosDeDados.add("MongoDB");
        listaDeBancosDeDados.add("Cassandra");
        listaDeBancosDeDados.add("Couchbase");
        listaDeBancosDeDados.add("Neo4j");
        listaDeBancosDeDados.add("Redis");
        listaDeBancosDeDados.add("InfluxDB");
        listaDeBancosDeDados.add("Apache Kafka");
        listaDeBancosDeDados.add("Elasticsearch");
        listaDeBancosDeDados.add("VoltDB");
        listaDeBancosDeDados.add("Firebird");
        listaDeBancosDeDados.add("Informix");
        listaDeBancosDeDados.add("Teradata");
        listaDeBancosDeDados.add("SAP Sybase ASE");
        listaDeBancosDeDados.add("Snowflake");
        listaDeBancosDeDados.add("Greenplum");
        listaDeBancosDeDados.add("Apache Hive");
        listaDeBancosDeDados.add("Amazon Aurora");
        listaDeBancosDeDados.add("Presto");
        listaDeBancosDeDados.add("Google BigQuery");
        listaDeBancosDeDados.add("IBM Informix");
        listaDeBancosDeDados.add("Hadoop HDFS");
        listaDeBancosDeDados.add("Apache Ignite");
        listaDeBancosDeDados.add("JanusGraph");
        listaDeBancosDeDados.add("Hazelcast");
        listaDeBancosDeDados.add("MemSQL");
        listaDeBancosDeDados.add("Google Cloud Firestore");
        listaDeBancosDeDados.add("Apache Phoenix");
        listaDeBancosDeDados.add("ArangoDB");
        listaDeBancosDeDados.add("DynamoDB");
        listaDeBancosDeDados.add("Microsoft Access");
        listaDeBancosDeDados.add("Google Cloud SQL");
        listaDeBancosDeDados.add("CockroachDB");
        listaDeBancosDeDados.add("MaxDB");
        listaDeBancosDeDados.add("Exasol");
        listaDeBancosDeDados.add("RocksDB");
        listaDeBancosDeDados.add("Sphinx");
        listaDeBancosDeDados.add("EclipseLink");
        // repetidos
        listaDeBancosDeDados.add("MySQL");
        listaDeBancosDeDados.add("PostgreSQL");
        listaDeBancosDeDados.add("Oracle Database");
        listaDeBancosDeDados.add("MariaDB");
        listaDeBancosDeDados.add("MongoDB");
        listaDeBancosDeDados.add("Cassandra");
        listaDeBancosDeDados.add("MySQL");
        listaDeBancosDeDados.add("PostgreSQL");
        listaDeBancosDeDados.add("Oracle Database");
        listaDeBancosDeDados.add("MariaDB");
        listaDeBancosDeDados.add("MongoDB");
        listaDeBancosDeDados.add("Cassandra");
        listaDeBancosDeDados.add("MySQL");
        listaDeBancosDeDados.add("PostgreSQL");
        listaDeBancosDeDados.add("Oracle Database");
        listaDeBancosDeDados.add("MariaDB");
        listaDeBancosDeDados.add("MongoDB");
        listaDeBancosDeDados.add("Cassandra");

        Collections.sort(listaDeBancosDeDados);

        return listaDeBancosDeDados;
    }

    public static final Set<String> CONJUNTO_ORDENADO_BANCOS_DE_DADOS = criarHashSetBancosDeDados();

    private static Set<String> criarHashSetBancosDeDados() {

        Set<String> conjuntoDeBancosDeDados = new TreeSet<>();

        conjuntoDeBancosDeDados.add("MySQL");
        conjuntoDeBancosDeDados.add("PostgreSQL");
        conjuntoDeBancosDeDados.add("Oracle Database");
        conjuntoDeBancosDeDados.add("Microsoft SQL Server");
        conjuntoDeBancosDeDados.add("SQLite");
        conjuntoDeBancosDeDados.add("IBM DB2");
        conjuntoDeBancosDeDados.add("Apache Derby");
        conjuntoDeBancosDeDados.add("MariaDB");
        conjuntoDeBancosDeDados.add("H2 Database Engine");
        conjuntoDeBancosDeDados.add("SAP HANA");
        conjuntoDeBancosDeDados.add("Amazon Redshift");
        conjuntoDeBancosDeDados.add("Google Cloud Spanner");
        conjuntoDeBancosDeDados.add("MongoDB");
        conjuntoDeBancosDeDados.add("Cassandra");
        conjuntoDeBancosDeDados.add("Couchbase");
        conjuntoDeBancosDeDados.add("Neo4j");
        conjuntoDeBancosDeDados.add("Redis");
        conjuntoDeBancosDeDados.add("InfluxDB");
        conjuntoDeBancosDeDados.add("Apache Kafka");
        conjuntoDeBancosDeDados.add("Elasticsearch");
        conjuntoDeBancosDeDados.add("VoltDB");
        conjuntoDeBancosDeDados.add("Firebird");
        conjuntoDeBancosDeDados.add("Informix");
        conjuntoDeBancosDeDados.add("Teradata");
        conjuntoDeBancosDeDados.add("SAP Sybase ASE");
        conjuntoDeBancosDeDados.add("Snowflake");
        conjuntoDeBancosDeDados.add("Greenplum");
        conjuntoDeBancosDeDados.add("Apache Hive");
        conjuntoDeBancosDeDados.add("Amazon Aurora");
        conjuntoDeBancosDeDados.add("Presto");
        conjuntoDeBancosDeDados.add("Google BigQuery");
        conjuntoDeBancosDeDados.add("IBM Informix");
        conjuntoDeBancosDeDados.add("Hadoop HDFS");
        conjuntoDeBancosDeDados.add("Apache Ignite");
        conjuntoDeBancosDeDados.add("JanusGraph");
        conjuntoDeBancosDeDados.add("Hazelcast");
        conjuntoDeBancosDeDados.add("MemSQL");
        conjuntoDeBancosDeDados.add("Google Cloud Firestore");
        conjuntoDeBancosDeDados.add("Apache Phoenix");
        conjuntoDeBancosDeDados.add("ArangoDB");
        conjuntoDeBancosDeDados.add("DynamoDB");
        conjuntoDeBancosDeDados.add("Microsoft Access");
        conjuntoDeBancosDeDados.add("Google Cloud SQL");
        conjuntoDeBancosDeDados.add("CockroachDB");
        conjuntoDeBancosDeDados.add("MaxDB");
        conjuntoDeBancosDeDados.add("Exasol");
        conjuntoDeBancosDeDados.add("RocksDB");
        conjuntoDeBancosDeDados.add("Sphinx");
        conjuntoDeBancosDeDados.add("EclipseLink");
        // repetidos
        conjuntoDeBancosDeDados.add("MySQL");
        conjuntoDeBancosDeDados.add("PostgreSQL");
        conjuntoDeBancosDeDados.add("Oracle Database");
        conjuntoDeBancosDeDados.add("MariaDB");
        conjuntoDeBancosDeDados.add("MongoDB");
        conjuntoDeBancosDeDados.add("Cassandra");
        conjuntoDeBancosDeDados.add("MySQL");
        conjuntoDeBancosDeDados.add("PostgreSQL");
        conjuntoDeBancosDeDados.add("Oracle Database");
        conjuntoDeBancosDeDados.add("MariaDB");
        conjuntoDeBancosDeDados.add("MongoDB");
        conjuntoDeBancosDeDados.add("Cassandra");
        conjuntoDeBancosDeDados.add("MySQL");
        conjuntoDeBancosDeDados.add("PostgreSQL");
        conjuntoDeBancosDeDados.add("Oracle Database");
        conjuntoDeBancosDeDados.add("MariaDB");
        conjuntoDeBancosDeDados.add("MongoDB");
        conjuntoDeBancosDeDados.add("Cassandra");

        return conjuntoDeBancosDeDados;
    }

    public static final Map<String, String> MAPA_ORDENADO_BANCOS_DE_DADOS =  criarHashMapBancosDeDados() ;

    private static Map<String,String> criarHashMapBancosDeDados() {

        Map<String, String> mapaDeBancosDeDados = new TreeMap<>();
        mapaDeBancosDeDados.put("Oracle", "Relacional");
        mapaDeBancosDeDados.put("MySQL", "Relacional");
        mapaDeBancosDeDados.put("MongoDB", "Documento");
        mapaDeBancosDeDados.put("PostgreSQL", "Relacional");
        mapaDeBancosDeDados.put("Microsoft SQL Server", "Relacional");
        mapaDeBancosDeDados.put("SQLite", "Relacional");
        mapaDeBancosDeDados.put("IBM DB2", "Relacional");
        mapaDeBancosDeDados.put("Apache Derby", "Relacional");
        mapaDeBancosDeDados.put("MariaDB", "Relacional");
        mapaDeBancosDeDados.put("H2 Database Engine", "Relacional");
        mapaDeBancosDeDados.put("SAP HANA", "Relacional");
        mapaDeBancosDeDados.put("Amazon Redshift", "Relacional");
        mapaDeBancosDeDados.put("Google Cloud Spanner", "Relacional");
        mapaDeBancosDeDados.put("Cassandra", "Chave-Valor");
        mapaDeBancosDeDados.put("Couchbase", "Documento");
        mapaDeBancosDeDados.put("Neo4j", "Grafo");
        mapaDeBancosDeDados.put("Redis", "Chave-Valor");
        mapaDeBancosDeDados.put("InfluxDB", "Série Temporal");
        mapaDeBancosDeDados.put("Apache Kafka", "Event Streaming");
        mapaDeBancosDeDados.put("Elasticsearch", "Busca e Análise");
        mapaDeBancosDeDados.put("VoltDB", "Relacional");
        mapaDeBancosDeDados.put("Firebird", "Relacional");
        mapaDeBancosDeDados.put("Informix", "Relacional");
        mapaDeBancosDeDados.put("Teradata", "Relacional");
        mapaDeBancosDeDados.put("SAP Sybase ASE", "Relacional");
        mapaDeBancosDeDados.put("Snowflake", "Relacional");
        mapaDeBancosDeDados.put("Greenplum", "Relacional");
        mapaDeBancosDeDados.put("Apache Hive", "Processamento de Dados");
        mapaDeBancosDeDados.put("Amazon Aurora", "Relacional");
        mapaDeBancosDeDados.put("Presto", "Processamento de Dados");
        mapaDeBancosDeDados.put("Google BigQuery", "Armazenamento e Análise");
        mapaDeBancosDeDados.put("IBM Informix", "Relacional");
        mapaDeBancosDeDados.put("Hadoop HDFS", "Sistema de Arquivos Distribuído");
        mapaDeBancosDeDados.put("Apache Ignite", "In-Memory Data Fabric");
        mapaDeBancosDeDados.put("JanusGraph", "Grafo");
        mapaDeBancosDeDados.put("Hazelcast", "Cache Distribuído");
        mapaDeBancosDeDados.put("MemSQL", "Relacional");
        mapaDeBancosDeDados.put("Google Cloud Firestore", "Documento");
        mapaDeBancosDeDados.put("Apache Phoenix", "Relacional");
        mapaDeBancosDeDados.put("ArangoDB", "Documento");
        mapaDeBancosDeDados.put("DynamoDB", "Chave-Valor");
        mapaDeBancosDeDados.put("Microsoft Access", "Relacional");
        mapaDeBancosDeDados.put("Google Cloud SQL", "Relacional");
        mapaDeBancosDeDados.put("CockroachDB", "Relacional");
        mapaDeBancosDeDados.put("MaxDB", "Relacional");
        mapaDeBancosDeDados.put("Exasol", "Relacional");
        mapaDeBancosDeDados.put("RocksDB", "Chave-Valor");
        mapaDeBancosDeDados.put("Sphinx", "Busca Full-Text");
        mapaDeBancosDeDados.put("EclipseLink", "ORM (Object-Relational Mapping)");
        // repetidos
        mapaDeBancosDeDados.put("MySQL", "Relacional");
        mapaDeBancosDeDados.put("PostgreSQL", "Relacional");
        mapaDeBancosDeDados.put("Oracle Database", "Relacional");
        mapaDeBancosDeDados.put("MariaDB", "Relacional");
        mapaDeBancosDeDados.put("MongoDB", "Documento");
        mapaDeBancosDeDados.put("Cassandra", "Chave-Valor");
        mapaDeBancosDeDados.put("MySQL", "Relacional");
        mapaDeBancosDeDados.put("PostgreSQL", "Relacional");
        mapaDeBancosDeDados.put("Oracle Database", "Relacional");
        mapaDeBancosDeDados.put("MariaDB", "Relacional");
        mapaDeBancosDeDados.put("MongoDB", "Documento");
        mapaDeBancosDeDados.put("Cassandra", "Chave-Valor");
        mapaDeBancosDeDados.put("MySQL", "Relacional");
        mapaDeBancosDeDados.put("PostgreSQL", "Relacional");
        mapaDeBancosDeDados.put("Oracle Database", "Relacional");
        mapaDeBancosDeDados.put("MariaDB", "Relacional");
        mapaDeBancosDeDados.put("MongoDB", "Documento");
        mapaDeBancosDeDados.put("Cassandra", "Chave-Valor");

        return mapaDeBancosDeDados;

    }

}
