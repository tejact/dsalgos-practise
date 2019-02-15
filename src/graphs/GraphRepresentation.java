package graphs;

import java.util.*;

public class GraphRepresentation {
    public static void main(String[] args) {
        // Directed Graph
        int[][] edges = new int[][]{
                {2,3}, // parent is left and child is right
                {1,5},
                {1,4},
                {3,4},
                {5,6},
                {6,3}
        };
        System.out.println("***Undirected Graph****");
        System.out.println(convertToAdjListUnDirected(edges));
        bfs(convertToAdjListUnDirected(edges));
        System.out.println("\n***Directed Graph****");
        System.out.println(convertToAdjListDirected(edges));
        // bfs on a directed graph will only print the vertices reachable from the source
        // but not all the vertices in a graph.
        bfs(convertToAdjListDirected(edges));

        int[][] adjMap = new int[][]{
            {0,0,0,0,0,0,0},
            {0,0,0,0,1,1,0},
            {0,0,0,1,0,0,0},
            {0,0,0,0,1,0,0},
            {0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0},
            {0,0,0,1,0,1,0},
        };

        System.out.println("\n***** Directed Graph BFS with adj map ******");
        bfsAdjMap(adjMap,1);
    }

    private static Map<Integer, Set<Integer>> convertToAdjListDirected(int[][] edges){
        Map<Integer,Set<Integer>> adjList = new HashMap<>();
        for(int[] e : edges){
            int parent = e[0];
            int child = e[1];
            adjList.computeIfAbsent(parent,k -> new HashSet<>()).add(child);
            // to guarantee all childs are in the map.
            adjList.computeIfAbsent(child,k -> new HashSet<>());
        }
        return adjList;
    }

    private static Map<Integer, Set<Integer>> convertToAdjListUnDirected(int[][] edges){
        Map<Integer,Set<Integer>> adjList = new HashMap<>();
        for(int[] e : edges){
            int parent = e[0];
            int child = e[1];
            adjList.computeIfAbsent(parent,k -> new HashSet<>()).add(child);
            adjList.computeIfAbsent(child,k -> new HashSet<>()).add(parent);
        }
        return adjList;
    }

    // Graph traversals are used for both traversing the vertices and edges.
    private static void bfs(Map<Integer,Set<Integer>> graph){
        // Select any source.
        bfs(graph,1);
    }

    private static void bfs(Map<Integer,Set<Integer>> graph, int source){
        Set<Integer> visited = new HashSet<>();
        // Select any source.
        // If a matrix is added to queue, it is garunteed to be processed
        // as it will be iterated though all the neighbours
        Queue<Integer> q = new LinkedList<>();
        // adding it to will avoid cycle in infinite loop
        visited.add(source);
        q.add(source);
        while(!q.isEmpty()){
            //System.out.println("Current value of queue is : "+q);
            int current = q.poll();
            // This is process early as per algorithm design manual.
            System.out.print(current + " ");
            for(int neighbour : graph.get(current)){
                //System.out.println("Current visited is "+visited);
                if(!visited.contains(neighbour)) {
                    q.add(neighbour);
                    // neighbours to be added to avoid repetition
                    visited.add(neighbour);
                }
            }
        }
    }

    private static void bfsAdjMap(int[][] graph,int source){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        visited.add(source);
        q.add(source);
        while(!q.isEmpty()){
            int current = q.poll();
            System.out.print(current + " ");
            for(int i = 0; i < graph[0].length; i++){
                final int neighbour = i;
                if(graph[current][neighbour] != 0 && !visited.contains(neighbour)){
                    q.add(neighbour);
                    visited.add(neighbour);
                }
            }
        }
    }

    //**************************** DFS ****************************************



}
