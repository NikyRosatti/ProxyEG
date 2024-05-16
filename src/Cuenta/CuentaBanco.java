package src.Cuenta;

/*
 * @author Nicolle Rosatti
 */

import src.interfaces.ICuenta;

public class CuentaBanco implements ICuenta{
    private int id;
    private String usuario;
    private double saldo;


    public CuentaBanco(int id, String usuario, double saldo){
        this.id = id;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    //AHORA DEBEMOS IMPLEMENTAR LOS MISMOS METODOS DE LA INTERFACE
    public int getIdCuenta() {
        return id;
    }

    public void setIdCuenta(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void retirarDinero(double monto){
        saldo -= monto;
    }

    @Override
	public void depositarDinero(double monto){
        saldo += monto;
    }

    @Override
    public void transferirDinero(ICuenta cuenta, double monto) throws Exception{
        if (cuenta == null) {
            throw new Exception("No hay una cuenta en el sistema con esos datos");
        }
        this.saldo -= monto;
        cuenta.depositarDinero(monto);
    }
	
    @Override
    public double mostrarSaldo(){
        return saldo;
    }

    public String toString(){
        return "nroCuenta = " + id + " Titular " + usuario; //+ " Saldo actual: " + saldo;
    }


}
