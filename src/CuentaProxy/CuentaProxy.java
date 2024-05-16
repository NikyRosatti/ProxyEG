package src.CuentaProxy;

import java.util.logging.Logger;

import src.Cuenta.CuentaBanco;
import src.interfaces.ICuenta;

public class CuentaProxy implements ICuenta{

    private CuentaBanco cuentaReal; // Referencia a la cuenta real
    private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName()); // Logger para registrar operaciones


    // Constructor que inicializa una cuenta bancaria real con parámetros específicos
    public CuentaProxy(int i, String string, double d) {
        cuentaReal = new CuentaBanco(i, string, d);
    }

    @Override
    public void retirarDinero(double monto) throws Exception{
        LOGGER.info("--- Cuenta Proxy - Retirar Dinero---");
        // Verifica si la cuenta real está inicializada, de lo contrario, crea una nueva
        if (cuentaReal == null) {
            throw new Exception("No hay una cuenta en el sistema con esos datos");
        }
        cuentaReal.retirarDinero(monto); // Invoca el método de retirar dinero en la cuenta real
    }

    @Override
	public void depositarDinero(double monto) throws Exception{
        LOGGER.info("--- Cuenta Proxy - Depositar Dinero---");
        if (cuentaReal == null) {
            throw new Exception("No hay una cuenta en el sistema con esos datos");
        }
        cuentaReal.depositarDinero(monto);
        
    }

    @Override
    public void transferirDinero(ICuenta cuenta, double monto) throws Exception{
        LOGGER.info("--- Cuenta Proxy - Transferir Dinero---");
        if (cuentaReal == null) {
            throw new Exception("No hay una cuenta en el sistema con esos datos");
        }
        cuentaReal.transferirDinero(cuenta, monto);
    }
	
    @Override
    public double mostrarSaldo() throws Exception{
        LOGGER.info("--- Cuenta Proxy - Saldo---");
        if (cuentaReal == null) {
            throw new Exception("No hay una cuenta en el sistema con esos datos");
        }
        return cuentaReal.mostrarSaldo();
    }

    public String toString(){
        return cuentaReal.toString();
    }

}
