package chapter4.three;

import chapter4.shared.Node;

public class MakeTree {
	
	public Node makeGraph(int[] input, int start, int end){
		System.out.println("In makeGraph start end "+ start+" "+ end);
		if(start >end) return null;
		int mid=(start+end)/2;
		Node n = new Node(input[mid]);
		n.setLeft(makeGraph(input, start, mid-1));
		n.setRight(makeGraph(input, mid+1,end));
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
