package src.main;

import src.CuentaProxy.CuentaProxy;
import src.interfaces.ICuenta;

public class appMain {
    
    @SuppressWarnings("null")
    public static void main(String[] args) throws Exception {
        //el usuario no va a poder tocar esto, ya que interactua con el proxy
        //CuentaBanco c = new CuentaBanco(1, "Niky", 5000);

        ICuenta CuentaProxy = new CuentaProxy(50, "Nicolle", 3000);
        ICuenta CuentaProxy1 = new CuentaProxy(3, "Joaquin", 200);

        // Realizar algunas operaciones en la cuenta a través del proxy

        System.out.println("Saldos iniciales en las cuentas " + CuentaProxy.mostrarSaldo() + " " + CuentaProxy1.mostrarSaldo());

        CuentaProxy.depositarDinero(1000);
        System.out.println("Deposita $1000  " + CuentaProxy +  "\n");
        
        CuentaProxy.retirarDinero(500);
        System.out.println("Extrae $500  " + CuentaProxy +  "\n");
       
        double saldo = CuentaProxy.mostrarSaldo();

        // Mostrar el saldo resultante
        System.out.println("Saldo actual: " + saldo +  "\n");

        CuentaProxy1.depositarDinero(2000);
        System.out.println("Deposita $2000  " + CuentaProxy1 +  "\n");
        
        CuentaProxy1.retirarDinero(500);
        System.out.println("Extrae $500  " + CuentaProxy1 +  "\n");
        

        double saldo1 = CuentaProxy1.mostrarSaldo();
        // Mostrar el saldo resultante
        System.out.println("Saldo actual:  " + saldo1 + "\n");


        CuentaProxy.transferirDinero(CuentaProxy1, 1000);
        System.out.println(CuentaProxy + " transfiere $1000 a  " + CuentaProxy1 +  "\n");
    
        //luego de la transferencia
        System.out.println(CuentaProxy + "Saldo actual:  " + CuentaProxy.mostrarSaldo() + "\n");

        // Mostrar el saldo resultante
        System.out.println(CuentaProxy1 + "Saldo actual:  " +  CuentaProxy1.mostrarSaldo());

        //extraer de una cuenta inexistente;
        ICuenta CuentaProxy2 = null;
        try {
            CuentaProxy2.retirarDinero(3000);
        } catch (Exception e) {
            System.out.println("Se produjo una excepción al intentar realizar la operación en una cuenta inexistente: " + e.getMessage());
        }

    }
}
