package devmultitask.mapa;

import devmultitask.BancoDeDados;
import devmultitask.BancoDeDadosOrdenados;

import java.util.Map;
import java.util.Set;

public class TesteHashMap {

    public static void main(String[] args) {

        Map mapa = BancoDeDados.MAPA_BANCOS_DE_DADOS;
        Map mapaOrdenado = BancoDeDadosOrdenados.MAPA_ORDENADO_BANCOS_DE_DADOS;

        System.out.println(" ===== MAPA com forEach =====");
        mapa.forEach( (a,b)  -> System.out.println(a + " -> "+ b));
        System.out.println(mapa.size() + " itens cadastrados");

        System.out.println(" ===== MAPA ORDENADO com forEach =====");
        mapaOrdenado.forEach( (a,b)  -> System.out.println(a + " -> "+ b));
        System.out.println(mapaOrdenado.size() + " itens cadastrados");

        System.out.println(" ===== MAPA  ===== ");
        System.out.println(mapa);
        System.out.println(" ===== MAPA  keySet  ===== ");
        System.out.println(mapa.keySet());
        System.out.println(" ===== MAPA   values ===== ");
        System.out.println(mapa.values() );

        System.out.println(" ===== MAPA ORDENADO  ===== ");
        System.out.println(mapaOrdenado);
        System.out.println(" ===== MAPA ORDENADO  keySet ===== ");
        System.out.println(mapaOrdenado.keySet() );
        System.out.println(" ===== MAPA ORDENADO  values ===== ");
        System.out.println(mapaOrdenado.values() );
    }
}
