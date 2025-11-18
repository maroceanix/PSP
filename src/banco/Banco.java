package banco;

public class Banco {

	public static void main(String[] args) {
		Cuenta cuenta1= new Cuenta(1000.00);
		
		Cliente cl1= new Cliente(cuenta1, "Mar", 100.00, 0);
		Cliente cl2= new Cliente(cuenta1, "Daniel", 200.00, 0);
		cl1.start();
		cl2.start();
	}

}
