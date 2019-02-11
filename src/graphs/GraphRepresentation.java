package graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
        System.out.println(convertToAdjListDirected(edges));
    }

    static Map<Integer, Set<Integer>> convertToAdjListDirected(int[][] edges){
        Map<Integer,Set<Integer>> adjList = new HashMap<>();
        for(int[] e : edges){
            int parent = e[0];
            int child = e[1];
            adjList.computeIfAbsent(parent,k -> new HashSet<>()).add(child);
        }
        return adjList;
    }
}
