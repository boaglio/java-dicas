package devmultitask.conjunto;

import devmultitask.BancoDeDados;

import java.util.HashSet;
import java.util.Set;

public class ExemploMetodosHashSet {
    public static void main(String[] args) {
        Set<String> bancos = BancoDeDados.CONJUNTO_BANCOS_DE_DADOS;

        // int size();
        System.out.println("Tamanho: " + bancos.size());

        // boolean isEmpty();
        boolean vazio = bancos.isEmpty();
        System.out.println("O conjunto está vazio? " + vazio);

        // boolean contains(Object o);
        boolean contemMySQL = bancos.contains("MySQL");
        System.out.println("O conjunto contém o banco 'MySQL'? " + contemMySQL);

        // boolean add(E e);
        boolean adicionouNovoBanco = bancos.add("SQLite");
        System.out.println("Adicionou novo banco? " + adicionouNovoBanco);

        // boolean remove(Object o);
        boolean removeOracle = bancos.remove("Oracle Database");
        System.out.println("Removeu o banco 'Oracle Database'? " + removeOracle);

        // void clear();
        bancos.clear();
        System.out.println("Conjunto após o clear: " + bancos);

        // boolean equals(Object o);
        Set<String> outroConjunto = new HashSet<>();
        outroConjunto.add("MySQL");
        outroConjunto.add("PostgreSQL");
        boolean saoIguais = bancos.equals(outroConjunto);
        System.out.println("Os conjuntos são iguais? " + saoIguais);

        // int hashCode();
        int hashCode = bancos.hashCode();
        System.out.println("HashCode do conjunto: " + hashCode);

        // Spliterator<E> spliterator();
        System.out.println("Elementos do conjunto: ");
        bancos.spliterator().forEachRemaining(System.out::println);
    }
}
