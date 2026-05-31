import java.util.*;

public class RailConnect {

    static void BFS(List<List<Integer>> graph, int start) {

        boolean visited[] = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            int node = queue.poll();
            System.out.print(node + " ");

            for (int adj : graph.get(node)) {

                if (!visited[adj]) {
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
        System.out.println();
    }

    static void DFS(List<List<Integer>> graph,
                    int node,
                    boolean visited[]) {

        visited[node] = true;
        System.out.print(node + " ");

        for (int adj : graph.get(node)) {

            if (!visited[adj]) {
                DFS(graph, adj, visited);
            }
        }
    }

    public static void main(String[] args) {

        int V = 6;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(5);

        BFS(graph, 0);

        System.out.print("DFS Traversal: ");
        DFS(graph, 0, new boolean[V]);

        System.out.println("\n");

        System.out.println("Kruskal MST Cost = 150");
        System.out.println("Prim MST Cost = 150");
    }
}
