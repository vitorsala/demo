
import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordTest {

	@Test
	public void test() {
		String pass = Password.genNewPassword(3, 5);
		assertNotNull(pass);
		System.out.println(pass);
	}

}
