
class Caesar {
	
	private char plainTxt[], cipherTxt[];
	private int key;
	
	
	Caesar(String p, int k) {
		plainTxt = new char[p.length()];
		for(int i = 0; i < p.length(); i++) {
			plainTxt[i] = p.charAt(i);
		}
		key = k;
	}
	
	void getCipher() {
		if(cipherTxt == null) {
			System.out.println("No cipher text found!");
			return;
		}
		System.out.println("The cipher text is:");
		for(int i = 0; i < cipherTxt.length; i++) {
			System.out.print(cipherTxt[i]);
		}
		System.out.println();
	}
	void setCipher(String c, int k) {
		cipherTxt = new char[c.length()];
		for(int i = 0; i < c.length(); i++) {
			cipherTxt[i] = c.charAt(i);
		}
		key = k;
	}
	void getPlain() {
		if(plainTxt == null) {
			System.out.println("No plain text found!");
			return;
		}
		System.out.println("The plain text is:");
		for(int i = 0; i < plainTxt.length; i++) {
			System.out.print(plainTxt[i]);
		}
		System.out.println();
	}
	void setPlain(String p, int k) {
		plainTxt = new char[p.length()];
		for(int i = 0; i < p.length(); i++) {
			plainTxt[i] = p.charAt(i);
		}
		key = k;
	}
	
	void encrypt() {
		cipherTxt = new char[plainTxt.length];
		for(int i = 0; i < plainTxt.length; i++) {
			if(plainTxt[i] + key > 122)
				cipherTxt[i] = (char)(plainTxt[i] + key - 26);
			else
				cipherTxt[i] = (char)(plainTxt[i] + key);
		}
	}
	
	void decrypt() {
		plainTxt = new char[cipherTxt.length];
		for(int i = 0; i < cipherTxt.length; i++) {
			if(cipherTxt[i] - key < 97)
				plainTxt[i] = (char)(cipherTxt[i] - key + 26);
			else
				plainTxt[i] = (char)(cipherTxt[i] - key);
		}
	}
}
