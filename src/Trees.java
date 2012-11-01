import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;


public class Trees {

	static class Node {
		Node leftNode;
		Node rightNode;
		Integer score;
	}
	public static LinkedList<Node> q;
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
		temp1.leftNode.leftNode = new Node();
		temp1.leftNode.leftNode.score = 3;
		q = new LinkedList<Node>();
		run(temp1);
	
	}
	 
	private static void run(Node temp) {
		if (temp == null)
			return;
		//move around for pre, in-order, postorder(DFS) traversal
//		run(temp.leftNode);
//		run(temp.rightNode);
//		System.out.print(temp.score + " ");
		
		//BFS
		q.add(temp);
		while(q.size() > 0){
			Node t2 = q.remove();
			if(t2 != null)
				System.out.print(t2.score + " ");
			
			if (!(temp.leftNode == null)){
				q.add(t2.leftNode);
			}
			
			if (!(temp.rightNode == null)){
				q.add(t2.rightNode);
			}
		}
//		else if (temp.leftNode == null && temp.rightNode == null)
//			System.out.print(temp.score + ",, ");
//		else if (temp.leftNode == null){
//			run(temp.rightNode);
////			System.out.print(temp.score + ",,, ");
//		}
//		else if (temp.rightNode == null) {
//			run(temp.leftNode);
////			System.out.print(temp.score + ",,, ");
//		}
//		else{
//			run(temp.leftNode);
//			run(temp.rightNode);
//		}
//		System.out.print(temp.score + ", ");

	}
}
