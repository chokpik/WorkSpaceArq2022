package Prototype;

import java.util.ArrayList;

import Prototype.model.ListaPreciosImpl;
import Prototype.model.Producto;

public class Aplicacion {
    public static void main(String[] args) {

        /*
        El prototype se usa cuando se tiene un objeto padre con ciertos atributos esenciales y se necesita trabajar al rededor de estos,
        facilita el trabajo de nuevos objetos clonados sobre el objeto padre default
        */
        ArrayList<Producto> arrayListPadre = new ArrayList<>();
        arrayListPadre.add(new Producto("producto a", 100L, 1000D));
        arrayListPadre.add(new Producto("producto b", 20L, 1500D));
        arrayListPadre.add(new Producto("producto c", 310L, 17500D));
        ListaPreciosImpl listaPadre = new ListaPreciosImpl();
        listaPadre.setListaProductos(arrayListPadre);
               
        ArrayList<Producto> arrayList2 = new ArrayList<>();
        arrayList2.add(new Producto("producto a", 56L, 465513D));
        arrayList2.add(new Producto("producto b", 5465L, 1500D));
        arrayList2.add(new Producto("producto c", 1453L, 167450D));
        arrayList2.add(new Producto("producto d", 20L, 12340D));
        ListaPreciosImpl listaClonada = (ListaPreciosImpl) listaPadre.clonarLista();
        listaClonada.setListaProductos(arrayList2);
        
        System.out.println(listaPadre);
        System.out.println("=======================================");
        System.out.println(listaClonada);
        
    }
}
