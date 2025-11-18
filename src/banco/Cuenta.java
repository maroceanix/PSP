package banco;

public class Cuenta {
	private double saldo;
	private int num_reintegros;
	
	
	Cuenta(double saldo){
		this.saldo=saldo;
		
	}
	
	public double devolver_saldo() {
		return this.saldo;
	}
	
	public boolean comprobarSaldoMayor(double cant) {
		boolean mayor;
		if(this.saldo<cant) {
			mayor=false;
		}else {
			mayor=true;
		}
		return mayor;
	}
	public void retirar(double cantidad) {
		if(this.comprobarSaldoMayor(cantidad)) {
			this.saldo-=cantidad;
		}
		
	}
}
