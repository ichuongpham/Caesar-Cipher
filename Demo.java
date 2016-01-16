
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Caesar Algorithm---");
		
		Caesar c1 = new Caesar("i am friend with the monster", 20);
		c1.encrypt();
		c1.getPlain();
		c1.getCipher();
		System.out.println("-----------------------");
		for(int i=0; i < 26; i++) {
			c1.setCipher("c4ug4zlcyhx4qcnb4nby4gihmnyl", i);
			c1.decrypt();
			c1.getPlain();
		}
		
		
	}

}
