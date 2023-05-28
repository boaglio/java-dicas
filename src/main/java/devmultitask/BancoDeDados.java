package devmultitask;

import java.util.*;

public class BancoDeDados {
    public static final List<String> LISTA_DE_BANCOS_DE_DADOS = criarListaBancosDeDados();

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
        // repetidos 3 vezes
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

        return listaDeBancosDeDados;
    }

    public static final Set<String> CONJUNTO_BANCOS_DE_DADOS = criarHashSetBancosDeDados();

    private static Set<String> criarHashSetBancosDeDados() {

        Set<String> conjuntoDeBancosDeDados = new HashSet<>();

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
        // repetidos 3 vezes
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

    public static final Map<String, String> MAPA_BANCOS_DE_DADOS =  criarHashMapBancosDeDados();

    private static Map<String,String> criarHashMapBancosDeDados() {

        Map<String, String> map = new HashMap<>();
        map.put("Oracle", "Relacional");
        map.put("MySQL", "Relacional");
        map.put("MongoDB", "Documento");
        map.put("PostgreSQL", "Relacional");
        map.put("Microsoft SQL Server", "Relacional");
        map.put("SQLite", "Relacional");
        map.put("IBM DB2", "Relacional");
        map.put("Apache Derby", "Relacional");
        map.put("MariaDB", "Relacional");
        map.put("H2 Database Engine", "Relacional");
        map.put("SAP HANA", "Relacional");
        map.put("Amazon Redshift", "Relacional");
        map.put("Google Cloud Spanner", "Relacional");
        map.put("Cassandra", "Documento");
        map.put("Couchbase", "Documento");
        map.put("Neo4j", "Grafo");
        map.put("Redis", "Chave-Valor");
        map.put("InfluxDB", "Série Temporal");
        map.put("Apache Kafka", "Event Streaming");
        map.put("Elasticsearch", "Busca e Análise");
        map.put("VoltDB", "Relacional");
        map.put("Firebird", "Relacional");
        map.put("Informix", "Relacional");
        map.put("Teradata", "Relacional");
        map.put("SAP Sybase ASE", "Relacional");
        map.put("Snowflake", "Relacional");
        map.put("Greenplum", "Relacional");
        map.put("Apache Hive", "Processamento de Dados");
        map.put("Amazon Aurora", "Relacional");
        map.put("Presto", "Processamento de Dados");
        map.put("Google BigQuery", "Armazenamento e Análise");
        map.put("IBM Informix", "Relacional");
        map.put("Hadoop HDFS", "Sistema de Arquivos Distribuído");
        map.put("Apache Ignite", "In-Memory Data Fabric");
        map.put("JanusGraph", "Grafo");
        map.put("Hazelcast", "Cache Distribuído");
        map.put("MemSQL", "Relacional");
        map.put("Google Cloud Firestore", "Documento");
        map.put("Apache Phoenix", "Relacional");
        map.put("ArangoDB", "Documento");
        map.put("DynamoDB", "Documento");
        map.put("Microsoft Access", "Relacional");
        map.put("Google Cloud SQL", "Relacional");
        map.put("CockroachDB", "Relacional");
        map.put("MaxDB", "Relacional");
        map.put("Exasol", "Relacional");
        map.put("RocksDB", "Chave-Valor");
        map.put("Sphinx", "Busca Full-Text");
        map.put("EclipseLink", "ORM (Object-Relational Mapping)");
        // repetidos 3 vezes
        map.put("MySQL", "Relacional");
        map.put("PostgreSQL", "Relacional");
        map.put("Oracle Database", "Relacional");
        map.put("MariaDB", "Relacional");
        map.put("MongoDB", "Documento");
        map.put("Cassandra", "Chave-Valor");
        map.put("MySQL", "Relacional");
        map.put("PostgreSQL", "Relacional");
        map.put("Oracle Database", "Relacional");
        map.put("MariaDB", "Relacional");
        map.put("MongoDB", "Documento");
        map.put("Cassandra", "Chave-Valor");
        map.put("MySQL", "Relacional");
        map.put("PostgreSQL", "Relacional");
        map.put("Oracle Database", "Relacional");
        map.put("MariaDB", "Relacional");
        map.put("MongoDB", "Documento");
        map.put("Cassandra", "Chave-Valor");

        return map;
    }

}
