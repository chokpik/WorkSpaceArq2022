package patrones.creacionales.prototype;


import patrones.creacionales.prototype.model.CuentaAhorroImpl;

public class Aplicacion {
    public Aplicacion(){}

    public static void main(String[] args) {
        CuentaAhorroImpl cuentaAhorroPadre = new CuentaAhorroImpl();
        cuentaAhorroPadre.setBanco("Banco popular");
        cuentaAhorroPadre.setDirBanco("CRA 34 52-35");
        cuentaAhorroPadre.setMonto(50000);

        CuentaAhorroImpl cuentaClonada = (CuentaAhorroImpl) cuentaAhorroPadre.clonarCuenta();
        cuentaClonada.setMonto(100000);

        System.out.println(cuentaAhorroPadre);
        System.out.println(cuentaClonada);


    }
}
