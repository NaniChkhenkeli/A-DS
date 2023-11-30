import java.util.*;

class Graph {
    private Map<Character, List<Character>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(char src, char dest) {
        adjList.computeIfAbsent(src, k -> new ArrayList<>()).add(dest);
        adjList.computeIfAbsent(dest, k -> new ArrayList<>()).add(src);
    }

    // (1) Identify Connected Components
    public List<List<Character>> connectedComponents() {
        Set<Character> visited = new HashSet<>();
        List<List<Character>> components = new ArrayList<>();

        for (char vertex : adjList.keySet()) {
            if (!visited.contains(vertex)) {
                List<Character> component = new ArrayList<>();
                dfs(vertex, visited, component);
                components.add(component);
            }
        }

        return components;
    }

    // (2) Find Eulerian Path
    public List<Character> eulerianPath() {
        int oddDegreeVertices = 0;
        char startVertex = ' ';

        for (char vertex : adjList.keySet()) {
            int degree = adjList.get(vertex).size();
            if (degree % 2 != 0) {
                oddDegreeVertices++;
                startVertex = vertex;
            }
        }

        if (oddDegreeVertices != 0 && oddDegreeVertices != 2) {
            return null;  // No Eulerian path
        }

        List<Character> path = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            char currentVertex = stack.peek();
            List<Character> neighbors = adjList.get(currentVertex);

            if (neighbors != null && !neighbors.isEmpty()) {
                char nextVertex = neighbors.remove(0);
                stack.push(nextVertex);
            } else {
                path.add(stack.pop());
            }
        }

        Collections.reverse(path);
        return path;
    }

    private void dfs(char node, Set<Character> visited, List<Character> component) {
        visited.add(node);
        component.add(node);

        for (char neighbor : adjList.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited, component);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge('A', 'B');
        graph.addEdge('A', 'C');
        graph.addEdge('B', 'C');
        graph.addEdge('D', 'E');

        // (1) Identify Connected Components
        List<List<Character>> components = graph.connectedComponents();
        System.out.println("Connected Components:");
        for (List<Character> component : components) {
            System.out.println(component);
        }

        // (2) Find Eulerian Path
        List<Character> eulerianPath = graph.eulerianPath();
        System.out.println("Eulerian Path:");
        System.out.println(eulerianPath);
    }
}
