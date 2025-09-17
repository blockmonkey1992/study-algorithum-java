package ktw.s7;

public class I {

    Node root;

    public static void main(String[] args) {
        I tree = new I();
        int level = 0;

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);

        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.println(tree.dfs(level, tree.root));
    }

    public static int dfs(int level, Node root) {
        if(
                root.lt == null &&
                root.rt == null
        ) {
            return level;
        } else {
            return Math.min(dfs(level + 1, root.lt), dfs(level + 1, root.rt));
        }
    }
}
