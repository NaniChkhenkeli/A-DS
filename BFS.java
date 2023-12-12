import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void bfs(int [] [] graph, int start) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int current = queue.poll();
            process(current);

            for(int neighbor : graph[current]) {
                if(!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
    public static void process(int node) {
        System.out.println(node + " ");
    }
    public static void main(String[] args) {
        int[][] graph = {
                {1, 2},
                {0, 3, 4},
                {0, 5},
                {1, 6},
                {1, 7},
                {2, 8},
                {3},
                {4},
                {5}
        };
        System.out.println("BFS Traversal:");

        bfs(graph, 0);
    }
}

