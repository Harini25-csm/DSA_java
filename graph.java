// import java.util.*;
// public class graph {
//     public static void main(String[] args){
//         int v=5;
//         ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
//         for(int i=0;i<v;i++){
//             graph.add(new ArrayList<>());
//         }
//         addEdge(graph,0,1);
//         addEdge(graph,0,2);
//         addEdge(graph,1,3);
//         addEdge(graph,2,4);
//         for(int i=0;i<v;i++){
//             System.out.println(i+"->");
//             for(int neighbour:graph.get(i)){
//                 System.out.println(neighbour+" ");
//             }
//             System.out.println();
//         }
//     }
//     static void addEdge(ArrayList<ArrayList<Integer>> graph, int u,int v){
//         graph.get(u).add(v);
//         graph.get(v).add(u);
//     }
// }
/*******************************************************************************/

// //DFS
// import java.util.*;
// public class graph {
//     public static void main(String[] args){
//         int v=5;
//         ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
//         for(int i=0;i<v;i++){
//             graph.add(new ArrayList<>());
//         }
//         addEdge(graph,0,1);
//         addEdge(graph,0,2);
//         addEdge(graph,1,3);
//         addEdge(graph,2,4);
//         boolean[] visited=new boolean[v];
        
//         dfs(graph, 0, visited);
//     }
//     public static void dfs(ArrayList<ArrayList<Integer>> graph, int start,boolean[] visited){
//         visited[start]=true;
//         System.out.println(start+" ");
//         for(Integer neighbour:graph.get(start)){
//             if(!visited[neighbour]){
//                 dfs(graph, neighbour, visited);
//             }
//         }
//     }
//     static void addEdge(ArrayList<ArrayList<Integer>> graph, int u,int v){
//         graph.get(u).add(v);
//         graph.get(v).add(u);
//     }
// }
/*******************************************************************************/

// //Breadth-first-search using queues
// import java.util.*;
// import java.util.LinkedList;
// public class graph {
//     public static void main(String[] args){
//         int v=5;
//         ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
//         for(int i=0;i<v;i++){
//             graph.add(new ArrayList<>());
//         }
//         addEdge(graph,0,1);
//         addEdge(graph,0,2);
//         addEdge(graph,1,3);
//         addEdge(graph,2,4);
//         boolean[] visited=new boolean[v]; 
//         bfs(graph, 0, visited);
//     }
//     public static void bfs(ArrayList<ArrayList<Integer>> graph, int start,boolean[] visited){
//         Queue<Integer> queue = new LinkedList<>();
//         visited[start]=true;
//         queue.add(start);
//         while(!queue.isEmpty()){
//             int node = queue.poll();
//             System.out.print(node + " ");
//             for(Integer neighbour:graph.get(node)){
//                 if(!visited[neighbour]){
//                     visited[neighbour] = true;
//                     queue.add(neighbour);
//                 }
//             }
//         }
//     }
//     static void addEdge(ArrayList<ArrayList<Integer>> graph, int u,int v){
//         graph.get(u).add(v);
//         graph.get(v).add(u);
//     }
// }
/*******************************************************************************/

// // Detect cycles in DFS using recurrsion
// import java.util.*;
// public class graph {
//     static boolean dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited, boolean[] recStack) {
//         visited[node] = true;
//         recStack[node] = true;
//         for (Integer neighbour : graph.get(node)) {
//             if (!visited[neighbour]) {
//                 if (dfs(graph, neighbour, visited, recStack))
//                     return true;
//             }
//             else if (recStack[neighbour]) {
//                 return true;   // Cycle found
//             }
//         }
//         recStack[node] = false;  // Remove from recursion stack
//         return false;
//     }
//     public static void main(String[] args) {
//         int v = 3;
//         ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//         for (int i = 0; i < v; i++)
//             graph.add(new ArrayList<>());
//         // Directed edges (creating cycle)
//         graph.get(0).add(1);
//         graph.get(1).add(2);
//         graph.get(2).add(0);
//         boolean[] visited = new boolean[v];
//         boolean[] recStack = new boolean[v];
//         if (dfs(graph, 0, visited, recStack))
//             System.out.println("Cycle Detected");
//         else
//             System.out.println("No Cycle");
//     }
// }
