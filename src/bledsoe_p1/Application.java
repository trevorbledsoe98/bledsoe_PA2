package bledsoe_p1;

//import scanner
import java.util.Scanner;
public class Application {
	//connect different classes
	public static int encryptval, decryptval;
	
	public static int getEncryptval() {
		return encryptval;
	}
	public static void setEncryptval(int encryptval) {
		Application.encryptval = encryptval;
	}
	
	
	public static int getDecryptval() {
		return decryptval;
	}
	public static void setDecryptval(int decryptval) {
		Application.decryptval = decryptval;
	}
	
	//main function
	public static void main(String[] args) {
		
		
		Scanner number = new Scanner(System.in);
		
	//the encryptor 
		System.out.println("Enter a Four Digit Number to be Encrypted");
		encryptval = number.nextInt();
		
		
		Encrypter Encrypter = new Encrypter();
		
		Encrypter.Encrypt();
		
		System.out.println("Your Encrypted Number is");
		System.out.print(Encrypter.getEncryptc());
		System.out.print(Encrypter.getEncryptd());
		System.out.print(Encrypter.getEncrypta());
		System.out.println(Encrypter.getEncryptb());
	
		
		System.out.println("Please Enter the Number to be Decrypted");
		decryptval = number.nextInt();
		
		Decrypter Decrypter = new Decrypter();
		
		Decrypter.Decrypt();
		
		System.out.println("Your Decrypted Number is");
		System.out.print(Decrypter.getDecryptcc());
		System.out.print(Decrypter.getDecryptdd());
		System.out.print(Decrypter.getDecryptaa());
		System.out.println(Decrypter.getDecryptbb());
	
		
	}

}