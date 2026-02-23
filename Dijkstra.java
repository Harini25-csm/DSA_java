import java.util.*;
import java.util.Arrays;
class Node {
    int vertex, weight;

    Node(int v, int w) {
        vertex = v;
        weight = w;
    }
}

public class Dijkstra {
    public static void dijkstra(ArrayList<ArrayList<Node>> graph, int src, int V) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        
        dist[src] = 0;
        pq.add(new Node(src, 0));
        
        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            int u = curr.vertex;
            
            for (Node neighbor : graph.get(u)) {
                int v = neighbor.vertex;
                int w = neighbor.weight;
                
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new Node(v, dist[v]));
                }
            }
        }
        
        // Print shortest distances
        for (int i = 0; i < V; i++) {
            System.out.println("Distance from source to " + i + " = " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Example edges (like your diagram)
        graph.get(0).add(new Node(1, 2));
        graph.get(0).add(new Node(2, 7));
        graph.get(1).add(new Node(2, 3));
        graph.get(1).add(new Node(4, 2));
        graph.get(2).add(new Node(3, 4));

        dijkstra(graph, 0, V); // source = 0 (A)
    }
}