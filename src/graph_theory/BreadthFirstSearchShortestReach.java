package graph_theory;

import java.util.*;

public class BreadthFirstSearchShortestReach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        for (; test_cases > 0; --test_cases) {
            Map<Integer, Set<Integer>> adj = new HashMap<>();
            int vertex_count = sc.nextInt();
            int edges_count = sc.nextInt();

            Queue<Integer> priorityQueue = new LinkedList<>();
            boolean[] marked = new boolean[vertex_count + 1];
            int[] edge_to = new int[vertex_count + 1];

            int vertex_1, vertex_2;
            for (int i = 0; i < edges_count; i++) {
                vertex_1 = sc.nextInt();
                vertex_2 = sc.nextInt();
                add_neighbor(adj, vertex_1, vertex_2);
                add_neighbor(adj, vertex_2, vertex_1);
            }
            int source = sc.nextInt();

            marked[source] = true;
            edge_to[source] = -1;
            priorityQueue.offer(source);

            while (!priorityQueue.isEmpty()) {
                int v = priorityQueue.remove();
                if (null == adj.get(v)) continue;
                adj.get(v).stream().filter(w -> !marked[w]).forEach(w -> {
                    edge_to[w] = v;
                    marked[w] = true;
                    priorityQueue.offer(w);
                });
            }
            print_result(edge_to, source);
        }
    }

    private static void print_result(int[] edge_to, int source_vertex) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < edge_to.length; i++) {
            if (i == source_vertex) continue;
            int length = path_length(i, edge_to);
            int result = length == 0 ? -1 : length * 6;
            sb.append(result).append(" ");
        }

        System.out.println(sb.toString().trim());
    }

    private static int path_length(int vertex, int[] edge_to) {
        int currentV = vertex;
        List<Integer> path = new LinkedList<>();
        if (edge_to[currentV] == 0) return 0;
        while (edge_to[currentV] != -1) {
            path.add(currentV);
            currentV = edge_to[currentV];
        }
        return path.size();
    }

    public static void add_neighbor(Map<Integer, Set<Integer>> adj, int v1, int v2) {
        if (null == adj.get(v1)) adj.put(v1, new HashSet<>());
        adj.get(v1).add(v2);
    }
}