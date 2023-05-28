package devmultitask.mapa;

import devmultitask.BancoDeDados;

import java.util.HashMap;
import java.util.Map;

public class ExemploMetodosHashMap {
    public static void main(String[] args) {

        Map<String, String> bancos = new HashMap<>(BancoDeDados.MAPA_BANCOS_DE_DADOS);

        // int size();
        System.out.println("Tamanho: " + bancos.size());

        // boolean isEmpty();
        boolean vazio = bancos.isEmpty();
        System.out.println("O mapa está vazio? " + vazio);

        // boolean containsKey(Object key);
        boolean contemChave = bancos.containsKey("MySQL");
        System.out.println("O mapa contém a chave 'MySQL'? " + contemChave);

        // boolean containsValue(Object value);
        boolean contemValor = bancos.containsValue("Relacional");
        System.out.println("O mapa contém o valor 'Relacional'? " + contemValor);

        // V get(Object key);
        String valor = bancos.get("MySQL");
        System.out.println("Valor associado à chave 'MySQL': " + valor);

        // V put(K key, V value);
        bancos.put("SQLite", "Relacional");
        System.out.println("Mapa após a adição do banco 'SQLite': " + bancos);

        // V remove(Object key);
        String valorRemovido = bancos.remove("MySQL");
        System.out.println("Valor removido associado à chave 'MySQL': " + valorRemovido);

        // boolean equals(Object o);
        Map<String, String> outroMapa = new HashMap<>();
        outroMapa.put("PostgreSQL", "Relacional");

        boolean saoIguais = bancos.equals(outroMapa);
        System.out.println("Os mapas são iguais? " + saoIguais);

        // int hashCode();
        int hashCode = bancos.hashCode();
        System.out.println("HashCode do mapa: " + hashCode);

        // Set<K> keySet();
        System.out.println("Chaves do mapa: " + bancos.keySet());

        // Collection<V> values();
        System.out.println("Valores do mapa: " + bancos.values());

        // Set<Map.Entry<K,V>> entrySet();
        System.out.println("Pares chave-valor do mapa: " + bancos.entrySet());

        // void clear();
        bancos.clear();
        System.out.println("Mapa após o clear: " + bancos);

    }
}
