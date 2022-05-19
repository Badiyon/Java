
public class main {

	public static void main(String[] args) {
		Shirt s = new Shirt("White", 'M');
		
		System.out.println(s.color);
		System.out.println(s.size);
		
		s.SetColor("red");
		s.SetSize('S');
		
		System.out.println(s.color);
		System.out.println(s.size);
		
	}
	
}
