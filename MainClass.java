
public class MainClass {
	
	private double one;
	private double two;
	
	public MainClass() {
		
		one = 0;
		two = 0;
		
	}
	
	//or (double a, double b)
	//one = a;
	//two = b;
	public MainClass(double one, double two) {
		this.one = one;
		this.two = two;
		
		
	}
	public double getAverage() {
		return (one + two) / 2;
	}
	public void setNum(double one, double two) {
		this.one = one;
		this.two = two;
		
	}
}
