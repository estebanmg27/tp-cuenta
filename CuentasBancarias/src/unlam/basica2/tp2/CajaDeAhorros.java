package unlam.basica2.tp2;

public class CajaDeAhorros extends Cuenta {
	
	private Integer cantidadDeExtracciones = 0;
	private Double costoAdicional = 6.0;
	
	public CajaDeAhorros (Integer dni, Double saldo){
		super();
		this.dni = dni;
		this.saldo = saldo; 
	}
	
	public void ExtraerSaldo(Double saldoAExtraer){
		if(saldoAExtraer >= this.saldo){
			if(cantidadDeExtracciones > 5){
				cantidadDeExtracciones++;
				this.saldo = this.saldo - saldoAExtraer - costoAdicional; 
			}
			else {
				saldo = saldo - saldoAExtraer; 
			}
		}
	}

}
