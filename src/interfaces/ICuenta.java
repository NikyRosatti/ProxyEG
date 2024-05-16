package src.interfaces;

public interface ICuenta {
    // Operaciones que voy a realizar
	void retirarDinero(double monto) throws Exception;
	void depositarDinero(double monto) throws Exception;
	void transferirDinero(ICuenta cuenta, double monto) throws Exception;
	double mostrarSaldo() throws Exception;
}