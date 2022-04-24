package abstractFactory.factoryConfiteria.impl;

import abstractFactory.factoryConfiteria.InterfaceConfiteria;

public class ConfiteriaGenerica implements InterfaceConfiteria{
    
    private double precio;
    private int tamanoCrispeta;
    private int numeroGaseosas;
    private int bolsasDulces;

    public ConfiteriaGenerica()
    {
        this.precio = 0d;
        this.tamanoCrispeta = 0;
        this.numeroGaseosas = 0;
        this.bolsasDulces = 0;
    }

    @Override
    public void comprar() {
        System.out.println("CONFITERIA GENERICA, INGRESE UN VALOR VALIDO");
        
    }

    @Override
    public void agregarGaseosa() {
        System.out.println("CONFITERIA GENERICA, INGRESE UN VALOR VALIDO");
        
    }

    @Override
    public void agregarDulces() {
        System.out.println("CONFITERIA GENERICA, INGRESE UN VALOR VALIDO");
        
    }

}
