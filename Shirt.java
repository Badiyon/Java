
public class Shirt {

	public static String color;
	public static char size;
	
	Shirt() {}
	
	Shirt(String color, char size) {
		Shirt.color = color;
		Shirt.size = size; 
	}
	
	public static void puton() {
		System.out.println("Shirt is on");
		
	}
	public static void takeoff() {
		System.out.println("Shirt is off");
	}
	
	public static void SetColor(String newColor) {
		color = newColor;
	}
	public static void SetSize(char newSize) {
		size = newSize;
	}
	
}
