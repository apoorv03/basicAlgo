
public class xPowerN {

	public static void main(String[] args) {
		String[] temp = args[0].split(",");
		Integer x = Integer.parseInt(temp[0]);
		Integer n = Integer.parseInt(temp[1]);
		
		int answer = findPower (x,n);
		System.out.println(answer);
	}

	private static int findPower(Integer x, Integer n) {
		if (n==1){
			return x;
		}
		else
			return findPower(x,n/2) * findPower(x,n/2);
	}

}
