package chapter4.four;

import java.util.ArrayList;
import java.util.List;

import chapter4.shared.Node;
import chapter4.three.MakeTree;

public class ListNodes {
	List<List<Node>> nodes = new ArrayList<List<Node>>();
	
	public void makeLevels(Node n){
		if (n == null) return;
		int level = 0;
		nodes.add(new ArrayList<Node>());
		nodes.get(level).add(n);
		for(level=1;nodes.get(level-1).size()>0;level++){
			nodes.add(new ArrayList<Node>());
			for(Node b : nodes.get(level-1)){
				if(b.getLeft() != null){
					nodes.get(level).add(b.getLeft());
				}
				if(b.getRight()!= null){
					nodes.get(level).add(b.getRight());
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,2,3,4,5,6,7,8,9};
		MakeTree mt = new MakeTree();
		Node n = mt.makeGraph(input,0,input.length-1);
		ListNodes ln = new ListNodes();
		ln.makeLevels(n);
		System.out.println("done");
	}

}
