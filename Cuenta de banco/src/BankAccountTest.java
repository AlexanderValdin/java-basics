
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount cuenta = new BankAccount();
		BankAccount cuenta2 = new BankAccount();
		
		cuenta.depositar();
		cuenta.girar();
		cuenta.obtenerEstadoCtas();
		System.out.println("El saldo total es de : $ " + BankAccount.saldoTotal);
		System.out.println("La cantidad de cuentas creadas es de : "+ BankAccount.cantCuentas);
	}

}
