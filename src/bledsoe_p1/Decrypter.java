package bledsoe_p1;

public class Decrypter {
	//variables
	public int decryptaa, decryptbb, decryptcc, decryptdd, aa, bb, cc, dd;
	//method
	public void Decrypt() {
		//the decryptor math
		aa = Application.getDecryptval() / 1000;
		bb = Application.getDecryptval() / 100 % 10;
		cc = Application.getDecryptval() / 10 % 10;
		dd = Application.getDecryptval() % 10;
		
		if(aa <= 6 && aa >= 0)
			aa = aa + 10;
		if(bb <= 6 && bb >= 0)
			bb = bb + 10;
		if(cc <= 6 && cc >= 0)
			cc = cc + 10;
		if(dd <= 6 && dd >= 0)
			dd = dd + 10;
	
		decryptaa = aa - 7;
		decryptbb = bb - 7;
		decryptcc = cc - 7;
		decryptdd = dd - 7;
		
	}
	
	//set getters and setters
	public int getDecryptaa() {
		return decryptaa;
	}
	public void setDecryptaa(int decryptaa) {
		this.decryptaa = decryptaa;
	}
	public int getDecryptbb() {
		return decryptbb;
	}
	public void setDecryptbb(int decryptbb) {
		this.decryptbb = decryptbb;
	}
	public int getDecryptcc() {
		return decryptcc;
	}
	public void setDecryptcc(int decryptcc) {
		this.decryptcc = decryptcc;
	}
	public int getDecryptdd() {
		return decryptdd;
	}
	public void setDecryptdd(int decryptdd) {
		this.decryptdd = decryptdd;
	}

}
