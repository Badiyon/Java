
public class StringPrac {
	public static void main(String[] args) {
		String str = "Mercifies is a real cool dude.";
		String str1 = "BRUH";
		
		String asdf = "BRUH";
		String asdf1 = "bruh";
		
		System.out.println(asdf.equals(asdf1));
		System.out.println(asdf.equalsIgnoreCase(asdf1));
		
		System.out.println(str);
		
		System.out.println(str.length());
		System.out.println(str.charAt(29));
		System.out.println(str.substring(5));
		System.out.println(str.indexOf("dude"));
		System.out.println(str.substring(20, 25));
		
		System.out.println(str + " Yo what is up my dude.");
		System.out.println(str);
		
		System.out.println(str + 1);
		System.out.println(1 + str);
		System.out.println("1234" + 1);
		
		str = str.replace("a", "b");
		
		System.out.println(str);
	}
}
