package devmultitask.conjunto;

import devmultitask.BancoDeDados;
import devmultitask.BancoDeDadosOrdenados;

import java.util.List;
import java.util.Set;

public class TesteHashSet {

    public static void main(String[] args) {

        Set  conjunto = BancoDeDados.CONJUNTO_BANCOS_DE_DADOS;
        Set conjuntoOrdenado = BancoDeDadosOrdenados.CONJUNTO_ORDENADO_BANCOS_DE_DADOS;

        System.out.println(" ===== CONJUNTO com forEach =====");
        conjunto.forEach(System.out::println);
        System.out.println(conjunto.size() + " itens cadastrados");

        System.out.println(" ===== CONJUNTO ORDENADO com forEach =====");
        conjuntoOrdenado.forEach(System.out::println);
        System.out.println(conjuntoOrdenado.size() + " itens cadastrados");

        System.out.println(" ===== CONJUNTO  ===== ");
        System.out.println(conjunto);

        System.out.println(" ===== CONJUNTO ORDENADO  ===== ");
        System.out.println(conjuntoOrdenado);

    }
}
