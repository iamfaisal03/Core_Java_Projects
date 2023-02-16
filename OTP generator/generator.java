import java.util.Random;

public class generator {
	static char[] Password(int len) {
		System.out.println("Generate Password using random():");
		System.out.println("Your OTP is:");
		
		String Capital_letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_letters="abcdeffghijklmnopqrstuvwyz";
		String Numbers="1234567890";
		
		String values=Capital_letters+Small_letters+Numbers;
		
		Random random_method=new Random();
		
		char [] password=new char[len];
		for (int i = 0; i <len; i++) {
			password[i]=values.charAt(random_method.nextInt(values.length()));
			
		}
		return password;
	}
	
	public static void main(String[] args) {
		System.out.println("//programs strats from here");
		int length=10;
		System.out.println(Password(length));// Password calls above method
	}

}
