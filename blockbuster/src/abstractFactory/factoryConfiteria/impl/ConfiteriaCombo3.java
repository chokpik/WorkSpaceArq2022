package abstractFactory.factoryConfiteria.impl;

import abstractFactory.factoryConfiteria.InterfaceConfiteria;

public class ConfiteriaCombo3 implements InterfaceConfiteria {

    private double precio;
    private int tamanoCrispeta;
    private int numeroGaseosas;
    private int bolsasDulces;

    public ConfiteriaCombo3()
    {
        this.precio = 23000d;
        this.tamanoCrispeta = 200;
        this.numeroGaseosas = 3;
        this.bolsasDulces = 2;
    }

    @Override
    public void comprar() {
        System.out.println("Comprado combo 3 $" + this.precio);
        
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
        double precio = 2500d;
        this.bolsasDulces += 1;
        this.precio += precio;
        System.out.println("Agregado dulce");
    }
}
