import java.util.StringTokenizer;

public class StringOps {

	public static void main(String[] args) {
		String temp = "Tokenize;1, this; fuck;";
		parse2(temp);

	}

	private static void parse2(String temp2) {
		StringTokenizer t1 = new StringTokenizer(temp2,",;");
		while(t1.hasMoreTokens()){
			System.out.println(t1.nextElement());
		}
		System.out.println(temp2);
		
	
	}
}
