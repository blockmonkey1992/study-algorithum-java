package ktw.s7;

import java.util.LinkedList;
import java.util.Queue;

public class G {

    Node root;


    public static void main(String[] args) {
        G tree = new G();

        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);

        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);

        tree.BFS(tree.root);
    }

    public static void BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()) {
            int len = q.size();

            for(int i = 0; i < len; i++) {
                Node cur = q.poll();
                System.out.print(cur.data + " ");

                // lt 있으면, q 에 넣고,
                if(cur.lt != null) {
                    q.offer(cur.lt);
                }

                // rt 있으면, q 에 넣고,
                if(cur.rt != null) {
                    q.offer(cur.rt);
                }

                // level 올려치고,
                level++;
            }
            System.out.println();
        }
    }
}
