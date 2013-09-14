package chapter4.three;

public class MakeTree {
	
	public static class Node{
		private int id;
		private Node left;
		private Node right;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}
		
		public Node(int n){
			this.id=n;
			left = null;
			right=null; 
		}
		
	}
	
	public Node makeGraph(int[] input, int start, int end){
		System.out.println("In makeGraph start end "+ start+" "+ end);
		if(start >end) return null;
		int mid=(start+end)/2;
		Node n = new Node(input[mid]);
		n.left= makeGraph(input, start, mid-1);
		n.right = makeGraph(input, mid+1,end);
		return n;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,2,3,4};
		
		MakeTree mt = new MakeTree();
		Node n = mt.makeGraph(input,0,input.length-1);
		System.out.println("Done");
	}

}
