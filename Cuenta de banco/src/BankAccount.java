import java.util.Scanner;

public class BankAccount {
	
	private String numCuenta;
	private double saldoCtaC;
	private double saldoCtaA;
	
	public static int cantCuentas = 0;
	public static double saldoTotal= 0;
	
	public BankAccount() {
		this.numCuenta = setNumCuenta();
		cantCuentas++;
	}
	
	private String setNumCuenta() {
		String numCuenta = "";
		for(int i = 0; i<10; i++) {
			int rand = (int)(Math.random()*10);
			numCuenta += rand;
		}
		return numCuenta;
	}
	
	// getter 
	
	private double getSaldoCtaC() {
		return this.saldoCtaC;
	}
	private double getSaldoCtaA() {
		return this.saldoCtaA;
	}
	
	// método para el depósito
	
	public void depositar() {
		int selec = 0;
		double monto = 0;
		
		while (selec !=3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Indique a qué tipo de cuenta desea depositar");
			System.out.println("Presione 1, para Cuenta Corriente. Presione 2, para Cuenta de Ahorro. Presione 3, para SALIR");
			selec = sc.nextInt();
		
			switch(selec) {
		
				case 1:
					Scanner sd1 = new Scanner(System.in);
					System.out.println("Ingrese el monto que desea depositar");
					monto = sd1.nextDouble();
					this.saldoCtaC += monto;
					System.out.println("Operación exitosa, usted ha depositado: $ "+ monto + " a su cuenta corriente.");
					saldoTotal += this.getSaldoCtaC();
			
					break;
	
				case 2:
					Scanner sd2 = new Scanner(System.in);
					System.out.println("Ingrese el monto que desea depositar");
					monto = sd2.nextDouble();
					this.saldoCtaA += monto;
					System.out.println("Operación exitosa, usted ha depositado: $ "+ monto + " a su cuenta de ahorro.");
					saldoTotal += this.getSaldoCtaA();
			
					break;
			
				default:
					System.out.println("No ha ingresado una opción válida, intente nuevamente.");		
			}
		}
	}
	
	public void girar() {
		
		int selec = 0;
		double monto = 0;
		
		while (selec !=3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Indique de qué tipo de cuenta desea girar");
			System.out.println("Presione 1, para Cuenta Corriente. Presione 2, para Cuenta de Ahorro. Presione 3, para SALIR.");
			selec = sc.nextInt();
		
			switch(selec) {
		
				case 1:
					Scanner sg1 = new Scanner(System.in);
					System.out.println("Ingrese el monto que desea girar");
					monto = sg1.nextDouble();
					if (monto>this.getSaldoCtaC()) {
						System.out.println("Su saldo es insuficiente, sólo puede girar un máximo de : $ " + this.getSaldoCtaC());
					}
					else {
						this.saldoCtaC -= monto;
						System.out.println("Operación exitosa, usted ha girado: $ "+ monto + " de su cuenta corriente.");
						saldoTotal -= this.getSaldoCtaC();
					}
			
					break;
	
				case 2:
					Scanner sg2 = new Scanner(System.in);
					System.out.println("Ingrese el monto que desea girar");
					monto = sg2.nextDouble();
					if (monto>this.getSaldoCtaA()) {
						System.out.println("Su saldo es insuficiente, sólo puede girar un máximo de : $" + this.getSaldoCtaA());
					}
					else {
						this.saldoCtaA -= monto;
						System.out.println("Operación exitosa, usted ha girado: $ "+ monto + " de su cuenta de ahorro.");
						saldoTotal -= this.getSaldoCtaA();
					}
			
					break;
			
				default:
					System.out.println("No ha ingresado una opción válida, intente nuevamente.");		
			}
		}
	}
	
	public void obtenerEstadoCtas() {
		System.out.println("El saldo de su cuenta corriente es de : $ " + this.getSaldoCtaC());
		System.out.println("El saldo de su cuenta de ahorro es de : $ " + this.getSaldoCtaA());
	}
	
	
}
