package graph_theory;


import java.util.*;

/*
Help from "Discussion" tab on Hackerrank.
Try counting the children.
If the subtree has even number of nodes then the edge leading to this subtree can be removed.
Otherwise, you have to keep on searching until you find a suitable edge or the entire tree exhausted.
As it always can be decomposed into forests of even number of nodes, you will always end up with an answer greater than 1.
 */
public class EventTree {
    static Map<Integer, ArrayList<Integer>> adj = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int vertex_1, vertex_2;
        for (int i = 0; i < M; i++) {
            vertex_1 = sc.nextInt();
            vertex_2 = sc.nextInt();
            add_neighbor(vertex_2, vertex_1);
        }

        System.out.println(count_edges_to_remove(1));
    }

    public static void add_neighbor(int v1, int v2) {
        if (null == adj.get(v1)) adj.put(v1, new ArrayList<>());
        adj.get(v1).add(v2);
    }

    public static int count_edges_to_remove(int node) {
        ArrayList<Integer> child_nodes;
        if (null == adj.get(node)) return 0;
        else child_nodes = adj.get(node);

        int edges_to_remove = 0;
        int i = 0;

        while (i < child_nodes.size()) {
            int child_node = child_nodes.get(i);
            edges_to_remove += count_edges_to_remove(child_node);
            if (num_child_nodes(child_node) % 2 == 0) edges_to_remove += 1;
            i++;
        }
        return edges_to_remove;
    }

    private static int num_child_nodes(int root_node) {
        if (null == adj.get(root_node)) return 1;
        else {
            int n = 1;
            ArrayList<Integer> child_nodes = adj.get(root_node);
            for (int child_node : child_nodes) n += num_child_nodes(child_node);
            return n;
        }
    }
}