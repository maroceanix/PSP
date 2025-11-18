package banco;

public class Cliente extends Thread{
	private Cuenta cuenta;
	private String nombre;
	private double cantidad, total;
	
	
	public Cliente(Cuenta cuenta, String nombre, double cantidad, double total) {
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.total = total;
	}
	
	
	public void run() {
		synchronized (cuenta) {
			while(this.cuenta.devolver_saldo()>0) {
				try {
					this.cuenta.retirar(cantidad);
					this.total+=cantidad;
					this.sleep(50);
					System.out.println(this.nombre+ " acaba de retirar "+this.cantidad+" y ahora quedan en la cuenta "+this.cuenta.devolver_saldo()+"€");
					cuenta.notify();
					cuenta.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	
}
