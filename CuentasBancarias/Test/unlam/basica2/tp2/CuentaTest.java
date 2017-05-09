package unlam.basica2.tp2;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {

	@Test
	public void cuentaSueldoTest() {
		
		CuentaSueldo miCuenta = new CuentaSueldo(1, 1000.0);
		
		miCuenta.ExtraerSaldo(100.0);
		
		Double saldoActual = miCuenta.getSaldo();
		Double saldoEsperado = 900.0;
		
		Assert.assertNotEquals(saldoEsperado, saldoActual) ;
		}
	
	@Test
	public void cajaDeAhorrosTest() {
		
		CajaDeAhorros miCuenta = new CajaDeAhorros(1, 1000.0);
		
		miCuenta.ExtraerSaldo(100.0);
		miCuenta.ExtraerSaldo(100.0);
		miCuenta.ExtraerSaldo(100.0);
		miCuenta.ExtraerSaldo(100.0);
		miCuenta.ExtraerSaldo(100.0);
		miCuenta.ExtraerSaldo(100.0);
		miCuenta.ExtraerSaldo(100.0);
		
		Double saldoActual = miCuenta.getSaldo();
		Double saldoEsperado = 294.0;
		
		Assert.assertNotEquals(saldoEsperado, saldoActual) ;
		}
	
	@Test
	public void cuentaCorrienteTest() {
		
		CuentaCorriente miCuenta = new CuentaCorriente(1, 1000.0);
		
		miCuenta.ExtraerSaldo(1100.0);
		
		Double saldoActual = miCuenta.getSaldo();
		Double saldoEsperado = -100.0-(miCuenta.getComision());
		
		Assert.assertNotEquals(saldoEsperado, saldoActual) ;
		}
	
	
	
	
	
	
	

}
