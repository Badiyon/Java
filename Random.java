
public class Random {
	public static void main(String[] args) {
		
		//Math.random returns a value between 0 and 1 by default. 
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		System.out.println();
		
		//We can change this by multiplying it by 10 to and adding 1 to make a minimum of 1 and a max of 10
		System.out.println((Math.random() * 10) + 1);
		System.out.println((Math.random() * 10) + 1);
		System.out.println((Math.random() * 10) + 1);
		System.out.println((Math.random() * 10) + 1);
		System.out.println((Math.random() * 10) + 1);
		System.out.println((Math.random() * 10) + 1);
		System.out.println((Math.random() * 10) + 1);
		
		System.out.println();
		
	
		//other tests
		
		System.out.println((Math.random() * 100) + 1); // between 1 and 100
		
		System.out.println((Math.random() * 20) + 1); // between 1 and 20
		
		System.out.println((Math.random() * 30) + 1); // between 1 and 30
		
		System.out.println((Math.random() * 40) + 1); // between 1 and 40
		
		System.out.println();
		
		//If you want integers instead of a double you can just type cast them
		System.out.println((int)(Math.random() * 10) + 1);
		System.out.println((int)(Math.random() * 10) + 1);
		System.out.println((int)(Math.random() * 10) + 1);
		
	
		
	
		
		
	}
}