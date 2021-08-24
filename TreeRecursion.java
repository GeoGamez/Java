
public class TreeRecursion {
 public static class Node{
	 public Node left;
	 public Node right;
	 public int value;
	 public Node (int value) {
		 this.value = value;
		 this.left = null;
		 this.right = null;
	 }
	 }
 
 public static void printPreOrder(Node node) {
      //print value
      System.out.println(node.value);
   
      //print left
      if (node.left!=null)
            printPreOrder(node.left);
   
      //print right
      if (node.right!=null)
            printPreOrder(node.right);
   
 }
 public static void printInOrder(Node node) {

 
     if (node.left!=null)
           printInOrder(node.left);

     System.out.println(node.value);

     if (node.right!=null)
           printInOrder(node.right);
  
}
 public static void printPostOrder(Node node) {

	 
     if (node.left!=null)
           printPostOrder(node.left);
     if (node.right!=null)
         printPostOrder(node.right);
     System.out.println(node.value);

}
     


 public static void main(String[] args) {
	 Node root = new Node(3);
	 root.left = new Node(5);
	 root.right = new Node(8);
	 root.left.left = new Node(6);
	 root.right.right = new Node(7);
	 root.right.left = new Node(11);
	 System.out.println("Print PreOrder");
	    printPreOrder(root);
 }
}

