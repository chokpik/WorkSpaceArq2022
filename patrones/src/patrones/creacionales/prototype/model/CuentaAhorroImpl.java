package patrones.creacionales.prototype.model;

import patrones.creacionales.prototype.ICuenta;

public class CuentaAhorroImpl implements ICuenta{
    private String tipo;
    private double monto;
    private String banco;
    private String dirBanco;
    
    public CuentaAhorroImpl(){
        tipo = "AHORRO";
    }
    
    
    @Override
    public ICuenta clonarCuenta() {
        CuentaAhorroImpl Cuenta = null;
        
        try {
            Cuenta = (CuentaAhorroImpl) clone();
        }catch (CloneNotSupportedException cex) {
            cex.getStackTrace();
        }
        return Cuenta;
    }

    @Override
    public String toString(){
        return "CuentaAhorroImpl [tipo=" + tipo + ", monto=" + monto + ", dirbanco= "+ dirBanco + ", banco=" + banco +"]";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


    public String getBanco() {
        return banco;
    }


    public void setBanco(String banco) {
        this.banco = banco;
    }


    public String getDirBanco() {
        return dirBanco;
    }


    public void setDirBanco(String dirBanco) {
        this.dirBanco = dirBanco;
    }

    

}
