
public class Trees {

	static class Node {
		Node leftNode;
		Node rightNode;
		Integer score;
	}

	public static void main(String[] args) {
		System.out.println("Running");
		Node temp1 = new Node();
		temp1.score = 10;
		temp1.leftNode = new Node();
		temp1.rightNode = new Node();
		temp1.leftNode.score = 5;
		temp1.rightNode.score = 15;
		temp1.leftNode.rightNode = new Node();
		temp1.leftNode.rightNode.score = 7;
//		temp1.leftNode.leftNode = new Node();
//		temp1.leftNode.leftNode.score = 3;
		run(temp1);
	}

	private static void run(Node temp) {
		if (temp == null)
			return;
		else if (temp.leftNode == null && temp.rightNode == null)
			System.out.print(temp.score + ",, ");
		else if (temp.leftNode == null){
			run(temp.rightNode);
//			System.out.print(temp.score + ",,, ");
		}
		else if (temp.rightNode == null) {
			run(temp.leftNode);
//			System.out.print(temp.score + ",,, ");
		}
		else{
			run(temp.leftNode);
			run(temp.rightNode);
		}
		System.out.print(temp.score + ", ");

	}

}
