package e3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestReloj {

	@Test
	void testFijarHora() throws Exception {
		Reloj r1 = new Reloj(125);
		Reloj r2  = new Reloj();
		Reloj r3 = new Reloj(12,25,30);
		
		assertEquals(r1.toString(),"Hora: 00:02:05");
		assertEquals(r2.toString(),"Hora: 00:00:00");
		assertEquals(r3.toString(),"Hora: 12:25:30");
	}

	@Test
	void testAvanza() throws Exception {
		Reloj r1 = new Reloj(12,25,30);
		r1.avanza();
		assertEquals(r1.toString(),"Hora: 12:25:31");
	}

	@Test
	void testRetrasa() throws Exception {
		Reloj r1 = new Reloj(14,25,30);
		r1.retrasa();
		assertEquals(r1.toString(),"Hora: 14:25:29");
	}

	@Test
	void testReset() throws Exception {
		Reloj r1 = new Reloj(12,25,30);
		r1.reset();
		assertEquals(r1.toString(),"Hora: 00:00:00");
	}

	@Test
	void testEnSegundos() throws Exception {
		Reloj r1 = new Reloj(12,25,30);
		
		assertEquals(r1.enSegundos(), 2970);
	}

	@Test
	void testCompareTo() throws Exception {
		Reloj r1 = new Reloj(12,25,30);
		Reloj r2 = new Reloj(r1);
		assertEquals(r1.compareTo(r2),0);
	}

	@Test
	void testDoceHoras() throws Exception {
		Reloj r1 = new Reloj(13,25,30);
		assertEquals(r1.doceHoras(),"Hora: 01:25:30 PM");
	}

}
