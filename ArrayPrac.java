
public class ArrayPrac {
	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		String e = "e";
		
		String[] letters = {"a", "b", "c", "d", "e"};
		String[] letters1 = new String[5];
		
		int[] num = new int[10];
		
		for(int i = 0; i < 10; i++) {
			num[i] = i;
			System.out.println(num[i]);
		}
		
		for(int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
		
		letters[2] = "z";
		System.out.println(letters[2]);
		
		for(int i = 0; i < letters.length; i++) {
			System.out.println(letters[i]);
		}
	}
}
