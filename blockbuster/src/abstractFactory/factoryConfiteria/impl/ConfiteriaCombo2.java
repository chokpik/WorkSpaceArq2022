package abstractFactory.factoryConfiteria.impl;

import abstractFactory.factoryConfiteria.InterfaceConfiteria;

public class ConfiteriaCombo2 implements InterfaceConfiteria {

    private double precio;
    private int tamanoCrispeta;
    private int numeroGaseosas;
    private int bolsasDulces;

    public ConfiteriaCombo2()
    {
        this.precio = 20000d;
        this.tamanoCrispeta = 150;
        this.numeroGaseosas = 2;
        this.bolsasDulces = 1;
    }

    @Override
    public void comprar() {
        System.out.println("Comprado combo 2 $" + this.precio);
        
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
