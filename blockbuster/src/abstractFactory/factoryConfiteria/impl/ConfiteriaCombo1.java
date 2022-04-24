package abstractFactory.factoryConfiteria.impl;

import abstractFactory.factoryConfiteria.InterfaceConfiteria;

public class ConfiteriaCombo1 implements InterfaceConfiteria {

    private double precio;
    private int tamanoCrispeta;
    private int numeroGaseosas;
    private int bolsasDulces;

    public ConfiteriaCombo1()
    {
        this.precio = 15000d;
        this.tamanoCrispeta = 100;
        this.numeroGaseosas = 1;
        this.bolsasDulces = 0;
    }

    @Override
    public void comprar() {
        System.out.println("Comprado combo 1 $" + this.precio);
        
    }

    @Override
    public void agregarGaseosa() {
        double precio = 5000d;
        this.numeroGaseosas += 1;
        this.precio += precio;
        System.out.println("Agregado gaseosa");
        
    }

    @Override
    public void agregarDulces() {
        double precio = 5000d;
        this.bolsasDulces += 1;
        this.precio += precio;
        System.out.println("Agregado dulce");
    }
    
}
