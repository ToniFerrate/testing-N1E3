package testingN1E3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	
	@Test
	public void whenExceptionThrown_thenAssertionSucceeds() {
		// Validem que es llença l'excepció al llançar el mètode
	    Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> { Excepcio.llansaExcepcio(); });
	    
	    // Validem el missatge d'error
	    String expectedMessage = "Error ArrayIndexOutOfBoundsException";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}

}
