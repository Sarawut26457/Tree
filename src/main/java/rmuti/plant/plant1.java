package rmuti.plant;

import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class plant1 {
	public static void main( String[] args ) {
		
		Node e = new Node("e", null,null);
		Node f = new Node("f", null,null);
		Node h = new Node("f", null,null);
		
		Node g = new Node("g", null,null);
		Node b = new Node("b",e,f);
		Node c = new Node("c",g,h);
		
		Node root = new Node("a",b,c); 
	
		TreeDraw drawTree = new TreeDraw(root);
		drawTree.binaryTreeDraw();
	}

}