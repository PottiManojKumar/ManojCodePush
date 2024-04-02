import java.util.Base64;

public class Demo111 {
	

	public static String base64()
	{
		String Username = "Manojjjjjj";
		String Passwoord = "Kumar";
		String Cred = Username + ":" + Passwoord;
		String base64cred = Base64.getEncoder().encodeToString(Cred.getBytes());
		//System.out.println(base64cred);
		return base64cred;
	}

	public static String login(String Key)
	{
		String key11 =Key+"Manoj";
		
		
		return key11;
	}
	
	
	public static void main(String[] args) {
		
		String hh=Demo111.base64();
		System.out.println(hh);
		String out = Demo111.login(hh);
		System.out.println(out);
	}
	
	

}