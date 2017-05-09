package unlam.basica2.tp2;

public class CuentaCorriente extends Cuenta {
	
	private Double comision = (saldo*5)/100;
	
	public CuentaCorriente(Integer dni, Double saldo){
		super();
		this.dni = dni; 
		this.saldo = saldo;
	}

	public void ExtraerSaldo(Double saldoAExtraer){
		
		if(saldoAExtraer >= this.saldo){
			this.saldo = this.saldo - saldoAExtraer; 
		}
			if(saldoAExtraer < this.saldo){
			saldo = this.saldo - saldoAExtraer - this.comision;
			
		}
	}
	
	public Double getComision (){
		return comision; 
	}
	
	
}
