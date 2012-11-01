import java.util.StringTokenizer;

public class StringOps {
	public static void main(String[] args) {
		String temp = "Tokenize;1, this; duck;";
		parse2(temp);
		System.out.println((int)(Math.random() * 100));
		
		StringBuilder s = new StringBuilder(temp);
		s.append("aaa");
		System.out.println(s.toString());
	}
	private static void parse2(String temp2) {
		StringTokenizer t1 = new StringTokenizer(temp2,",;");
		while(t1.hasMoreTokens()){
			System.out.println(t1.nextToken());
		}
		
		System.out.println(temp2);
	}
}
