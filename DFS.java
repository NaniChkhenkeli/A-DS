public class DFS {
    public static void dfs(int[][] graph, int start) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        dfsRecursive(graph, start, visited);
    }

    private static void dfsRecursive(int[][] graph, int node, boolean[] visited) {
        if (!visited[node]) {
            process(node);
            visited[node] = true;

            for (int neighbor : graph[node]) {
                dfsRecursive(graph, neighbor, visited);
            }
        }
    }

    public static void process(int node) {
        System.out.print(node + " ");
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

        System.out.println("DFS Traversal:");
        dfs(graph, 0);
    }

}
