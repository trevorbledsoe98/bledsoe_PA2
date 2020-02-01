package bledsoe_p1;

//method
public class Encrypter {
//variables
	public int encrypta, encryptb, encryptc, encryptd, a, b, c, d;
	public void Encrypt() {
		
		//encryptor math
		a = Application.getEncryptval() / 1000;
		b = Application.getEncryptval() / 100 % 10;
		c = Application.getEncryptval() / 10 % 10;
		d = Application.getEncryptval() % 10;
		
		encrypta = (a + 7) % 10;
		encryptb = (b + 7) % 10;
		encryptc = (c + 7) % 10;
		encryptd = (d + 7) % 10;
		
		
	}
	//set getters and setters
	public int getEncryptc() {
		return (encryptc);
	}
	public void setEncryptc(int encryptc) {
		this.encryptc = encryptc;
	}
	public int getEncryptd() {
		return (encryptd);
	}
	public void setEncryptd(int encryptd) {
		this.encryptd = encryptd;
	}
	public int getEncryptb() {
		return (encryptb);
	}
	public void setEncryptb(int encryptb) {
		this.encryptb = encryptb;
	}
	public int getEncrypta() {
		return (encrypta);
	}
	public void setEncrypta(int encrypta) {
		this.encrypta = encrypta;
	}

}
