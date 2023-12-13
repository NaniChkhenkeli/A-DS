public class PathDeterminer {

    public static int[] determinePath(int startVertex, int[] routeDesc) {
        int[] path = new int[routeDesc.length + 1];
        path[0] = startVertex;

        for (int i = 0; i < routeDesc.length; i++) {
            path[i + 1] = path[i] ^ routeDesc[i];
        }

        return path;
    }

    public static void main(String[] args) {
        int startVertex = 4;
        int[] ascendingRoute = {3, 2, 1, 5};

        int[] path = determinePath(startVertex, ascendingRoute);

        for (int vertex : path) {
            System.out.print(vertex + " ");
        }
    }
}
