//package algo.tree;
//
//public class MinimumDepthBinaryTree {
//    private Object root;
//
//    static class Node{
//    int data;
//    Node left, right;
//    public Node(int item){
//        data = item;
//        left = right = null;
//    }
//}
//
//    public static void main(String[] args) {
//        MinimumDepthBinaryTree tree = new MinimumDepthBinaryTree();
//        tree.root = new Node(1);
//        ((Node) tree.root).left = new Node(2);
//        ((Node) tree.root).right = new Node(3);
//        ((Node) tree.root).left.left = new Node(4);
//        ((Node) tree.root).left.right = new Node(5);
//        System.out.println("The Minimum depth of the binary tree " + tree.minimumDepth());
//    }
//    public class MinimumTreeHeight{
//        Node root;
//        int minimumDepth(){
//            return minimumDepth(this.root,0);
//        }
//
//        private int minimumDepth(Node root, int i) {
//            return 0;
//        }
//    }
//
//    private int minimumDepth(Node root, int level) {
//        if (root == null)
//            return level;
//        level++;
//        return Math.min(minimumDepth(root.left,level),minimumDepth(root.right,level));
//    }
//}
