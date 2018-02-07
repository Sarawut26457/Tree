package rmuti.plant;

import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class plant2 {
	public static void main( String[] args ) {
		
	//	Node e = new Node ("e", null , null);
		Node p = new Node ("f", null , null);
		Node o = new Node ("e", null , null);
		Node n = new Node ("f", null , null);
		Node m = new Node ("g", null , null);
		Node l = new Node ("i", null , null);
		Node k = new Node ("h", null , null);	
		Node j = new Node ("e", k , l);
		Node c = new Node ("c", m , p);
		Node b = new Node ("b", j , n);	
		Node root = new Node("a",b,c); 
		
		TreeDraw drawTree = new TreeDraw(root);
		drawTree.binaryTreeDraw();
		
	}

}
