package devmultitask.lista;

import java.util.*;
import java.util.function.UnaryOperator;

public class ExemploMetodosLista {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();
        lista.add("item 1");
        lista.add("item 2");
        lista.add("item 3");
        lista.add("item 4");

        // lista como objeto
        System.out.println(lista);

        // lista item por item
        lista.forEach(System.out::println);

        // -------------------------------------------------------------------------------------------
        //  exemplos dos métodos existentes na interface java.util.List
        // -------------------------------------------------------------------------------------------

        // int size();
        System.out.println("Tamanho da lista: "+lista.size());

        //   boolean isEmpty();
        System.out.println(" lista vazia ?  "+lista.isEmpty());

        //  boolean contains(Object o);
        System.out.println(" lista tem MongoDB ?  "+lista.contains("MongoDB"));

        //  Iterator<E> iterator();
        Iterator<String> iterator = lista.iterator();

        while (iterator.hasNext()) {
            String banco = iterator.next();
            System.out.println(banco);
        }

        // Object[] toArray();
        System.out.println(" converte em um array:  "+lista.toArray());

        // <T> T[] toArray(T[] a);
        System.out.println(" converte em um array de objetos:  "+lista.toArray(new String[0]));

        // Boolean add(E e);
        System.out.println(" adiciona ao array:  "+lista.add("Outro banco"));

        //  boolean remove(Object o);
        System.out.println(" remove do array:  "+lista.remove("Outro banco"));

        //   boolean containsAll(Collection<?> c);
        List mongoDBlist = List.of("MongoDB");
        System.out.println(" contem lista no array:  "+lista.containsAll(mongoDBlist));

        //    boolean addAll(Collection<? extends E> c);
        List  listOutroBanco = List.of("Outro Banco");
        System.out.println(" adiciona ao array:  "+lista.addAll(listOutroBanco));

        // boolean addAll(int index, Collection<? extends E> c);
        List<String> outrosBancos = new ArrayList<>();
        outrosBancos.add("SQLite");
        outrosBancos.add("IBM DB2");
        lista.addAll(2, outrosBancos);
        System.out.println("Lista atualizada após addAll: " + lista);

        // boolean removeAll(Collection<?> c);
        List<String> bancosRemover = new ArrayList<>();
        bancosRemover.add("Oracle Database");
        bancosRemover.add("SQLite");
        lista.removeAll(bancosRemover);
        System.out.println("Lista atualizada após removeAll: " + lista);

        // boolean retainAll(Collection<?> c);
        List<String> bancosRetidos = new ArrayList<>();
        bancosRetidos.add("MySQL");
        bancosRetidos.add("PostgreSQL");
        lista.retainAll(bancosRetidos);
        System.out.println("Lista atualizada após retainAll: " + lista);

        // default void replaceAll(UnaryOperator<E> operator)
        lista.replaceAll(String::toUpperCase);
        System.out.println("Lista atualizada após replaceAll: " + lista);

        // default void sort(Comparator<? super E> c)
        lista.sort(Comparator.naturalOrder());
        System.out.println("Lista ordenada após sort: " + lista);


        // boolean addAll(int index, Collection<? extends E> c);

        List<String> listaDeBancosDeDados = new ArrayList<>();

        listaDeBancosDeDados.add("MySQL");
        listaDeBancosDeDados.add("PostgreSQL");
        listaDeBancosDeDados.add("Oracle Database");
        listaDeBancosDeDados.add("Microsoft SQL Server");
        ;
        listaDeBancosDeDados.addAll(2, outrosBancos);
        System.out.println("Lista atualizada após addAll: " + listaDeBancosDeDados);

        // boolean removeAll(Collection<?> c);
        listaDeBancosDeDados.removeAll(bancosRemover);
        System.out.println("Lista atualizada após removeAll: " + listaDeBancosDeDados);

        // boolean retainAll(Collection<?> c);
        listaDeBancosDeDados.retainAll(bancosRetidos);
        System.out.println("Lista atualizada após retainAll: " + listaDeBancosDeDados);

        // default void replaceAll(UnaryOperator<E> operator)
        listaDeBancosDeDados.replaceAll(String::toUpperCase);
        System.out.println("Lista atualizada após replaceAll: " + listaDeBancosDeDados);

        // default void sort(Comparator<? super E> c)
        listaDeBancosDeDados.sort(Comparator.naturalOrder());
        System.out.println("Lista ordenada após sort: " + listaDeBancosDeDados);

        // void clear();
        listaDeBancosDeDados.clear();
        System.out.println("Lista após clear: " + listaDeBancosDeDados);

        // boolean equals(Object o);
        List<String> outraLista = new ArrayList<>();
        outraLista.add("MySQL");
        outraLista.add("PostgreSQL");
        boolean saoIguais = listaDeBancosDeDados.equals(outraLista);
        System.out.println("As listas são iguais? " + saoIguais);

        // int hashCode();
        int hashCode = listaDeBancosDeDados.hashCode();
        System.out.println("HashCode da lista: " + hashCode);

        // E get(int index);
        listaDeBancosDeDados.add("MySQL");
        listaDeBancosDeDados.add("PostgreSQL");
        listaDeBancosDeDados.add("Oracle Database");
        listaDeBancosDeDados.add("Microsoft SQL Server");

        String banco = listaDeBancosDeDados.get(0);
        System.out.println("Elemento no índice 0: " + banco);

        // E set(int index, E element);
        listaDeBancosDeDados.set(0, "MariaDB");
        System.out.println("Lista atualizada após set: " + listaDeBancosDeDados);

        // void add(int index, E element);
        listaDeBancosDeDados.add(1, "SQLite");
        System.out.println("Lista atualizada após add: " + listaDeBancosDeDados);

        // E remove(int index);
        String elementoRemovido = listaDeBancosDeDados.remove(2);
        System.out.println("Elemento removido: " + elementoRemovido);
        System.out.println("Lista atualizada após remove: " + listaDeBancosDeDados);

        // int indexOf(Object o);
        int indice = listaDeBancosDeDados.indexOf("PostgreSQL");
        System.out.println("Índice do elemento 'PostgreSQL': " + indice);

        // int lastIndexOf(Object o);
        int ultimoIndice = listaDeBancosDeDados.lastIndexOf("MySQL");
        System.out.println("Último índice do elemento 'MySQL': " + ultimoIndice);

        // ListIterator<E> listIterator();
        ListIterator<String> listIterator = listaDeBancosDeDados.listIterator();
        while (listIterator.hasNext()) {
            String elemento = listIterator.next();
            System.out.println("Elemento percorrido com listIterator: " + elemento);
        }

        // java.util.List<E> subList(int fromIndex, int toIndex);
        List<String> subLista = listaDeBancosDeDados.subList(1, 3);
        System.out.println("Sublista: " + subLista);

        // default Spliterator<E> spliterator()
        Spliterator<String> spliterator = listaDeBancosDeDados.spliterator();
        System.out.println("Spliterator elementos: ");
        spliterator.forEachRemaining(System.out::println);

        // static <E> java.util.List<E> of()
        List<String> listaVazia = List.of();
        System.out.println("Lista vazia: " + listaVazia);

        // static <E> java.util.List<E> of(E e1)
        List<String> listaComUmElemento = List.of("MySQL");
        System.out.println("Lista com um elemento: " + listaComUmElemento);

        // static <E> java.util.List<E> of(E e1, E e2)
        List<String> listaComDoisElementos = List.of("MySQL", "PostgreSQL");
        System.out.println("Lista com dois elementos: " + listaComDoisElementos);

        // static <E> java.util.List<E> of(E e1, E e2, E e3)
        List<String> listaComTresElementos = List.of("MySQL", "PostgreSQL", "Oracle Database");
        System.out.println("Lista com três elementos: " + listaComTresElementos);

        // static <E> java.util.List<E> of(E... elements)
        List<String> listaVariadica = List.of("MySQL", "PostgreSQL", "Oracle Database", "Microsoft SQL Server");
        System.out.println("Lista variádica: " + listaVariadica);

        // static <E> java.util.List<E> copyOf(Collection<? extends E> coll)
        List<String> copiaLista = List.copyOf(listaDeBancosDeDados);
        System.out.println("Cópia da lista: " + copiaLista);

    }
}
