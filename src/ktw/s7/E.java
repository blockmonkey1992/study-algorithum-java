package ktw.s7;



public class E {
    Node root;

    public void DFS(Node root) {
        if(root == null) return;

//        System.out.println("[전위순회] : " + root.data + " ");
        DFS(root.lt);
//        System.out.println("[중위순회] : " + root.data + " ");
        DFS(root.rt);
        System.out.println("[후위순회] : " + root.data + " ");
    }

    public static void main(String[] args) {
        E tree = new E();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);

        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.DFS(tree.root);
    }
}
