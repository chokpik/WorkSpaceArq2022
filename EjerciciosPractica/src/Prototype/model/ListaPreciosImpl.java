package Prototype.model;

import java.util.ArrayList;

import Prototype.IListaPrecio;

public class ListaPreciosImpl implements IListaPrecio{


    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public ListaPreciosImpl(){}

    @Override
    public IListaPrecio clonarLista() {
        ListaPreciosImpl lista = null;

        try {
            lista = (ListaPreciosImpl) clone();
        } catch (CloneNotSupportedException e) {
            e.getStackTrace();
        }

        return lista;
    }
    
    @Override
    public String toString() {
        String returnString = "";

        for (Producto producto : listaProductos) {
            returnString += producto.toString();
        }

        return returnString;

    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    
}
