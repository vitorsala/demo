import java.util.Random;


public class Password {
	private Password(){}
	
	/**
	 * Método para gerar senha.
	 * @param numOfChar - Número de letras que irão compor o começo da senha.
	 * @param numOfNum - Número de dígitos que irão compor o fim da senha.
	 * @return Senha contendo <strong>numOfChar + numOfNum</strong> dígitos
	 */
	public static String genNewPassword(int numOfChar, int numOfNum){
		// Todos os caracteres aceito na senha além dos números
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVXWYZabcdefghijklmnopqrstuvxwyz";
		String password = "";
		
		Random r = new Random();
		
		for(int i = 0; i < numOfChar; i++){
			password += alpha.charAt(r.nextInt(alpha.length()));
		}
		
		for(int i = 0; i < numOfNum; i++){
			password += r.nextInt(10);
		}
		
		return password;
	}
}
