package devmultitask.lista;

import devmultitask.BancoDeDados;
import devmultitask.BancoDeDadosOrdenados;

import java.util.List;

public class TesteArrayList {

    public static void main(String[] args) {

       List lista = BancoDeDados.LISTA_DE_BANCOS_DE_DADOS;
       List listaOrdenada = BancoDeDadosOrdenados.LISTA_ORDENADA_DE_BANCOS_DE_DADOS;

       System.out.println(" ===== LISTA com forEach =====");
       lista.forEach(System.out::println);
       System.out.println(lista.size() + " itens cadastrados");

        System.out.println(" ===== LISTA ORDENADA com forEach =====");
        listaOrdenada.forEach(System.out::println);
        System.out.println(listaOrdenada.size() + " itens cadastrados");

       System.out.println(" ===== LISTA  ===== ");
       System.out.println(lista);

        System.out.println(" ===== LISTA ORDENADA  ===== ");
        System.out.println(listaOrdenada);

    }

}
