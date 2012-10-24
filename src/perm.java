import java.util.HashSet;
import java.util.Vector;

public class perm {
	public static final Integer temp = 3456;

	public static void main(String[] args) {
		String number = "abcd";
		// System.out.println(number.length());
		Vector<String> combs = permute(number);
		System.out.print("Apoorv - ");
		for (int i=0;i<combs.size();i++) {
			System.out.print(combs.get(i) + ", ");
		}
System.out.println();
		System.out.print("Shivam - [");
		perm1("", number);
	}

	private static Vector<String> permute(String number2) {
		int length = number2.length();
		Vector<String> result = new Vector<String>();
		Vector<String> recursiveResult = new Vector<String>();
		String child;
		if (length == 1) {
			result.add(number2);
			return result;
		}

		recursiveResult = permute(number2.substring(1));

		for (int i = 0; i < recursiveResult.size(); i++) {
			child = recursiveResult.get(i);
			for (int j = 0; j <= child.length(); j++) {
				result.add(child.substring(0, j) + 
						number2.substring(0, 1) + 
						child.substring(j));
			}
		}

		return result;
	}

	private static void perm1(String constant, String s) {

		if (s.length() == 0)
			System.out.print(constant + ", ");
		else {
			for (int i = 0; i < s.length(); i++)
				perm1(constant + s.charAt(i),
						s.substring(0, i) + s.substring(i + 1, s.length()));
		}
	}
}
