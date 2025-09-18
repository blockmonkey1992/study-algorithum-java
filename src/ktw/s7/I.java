package ktw.s7;

import java.util.LinkedList;
import java.util.Queue;

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
        System.out.println(tree.bfs(tree.root));
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

    public static int bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0;

        while(!q.isEmpty()) {
            int qSize = q.size();

            for(int i = 0; i < qSize; i++) {
                Node currentNode = q.poll();

                if(currentNode.lt == null && currentNode.rt == null) {
                    return level;
                }

                if(currentNode.lt != null) {
                    q.offer(currentNode.lt);
                }

                if(currentNode.rt != null) {
                    q.offer(currentNode.rt);
                }
            }
            level++;
        }

        return level;
    }
}
