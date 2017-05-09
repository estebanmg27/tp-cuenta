package unlam.basica2.tp2;

public class CuentaSueldo extends Cuenta {
	
	public CuentaSueldo(Integer dni, Double saldo){
		super();
		this.dni = dni; 
		this.saldo = saldo;
	}
	
	public void ExtraerSaldo(Double saldoAExtraer){
		if(saldoAExtraer >= this.saldo){
			this.saldo = this.saldo - saldoAExtraer; 
		}
	}
	
	
	

}
