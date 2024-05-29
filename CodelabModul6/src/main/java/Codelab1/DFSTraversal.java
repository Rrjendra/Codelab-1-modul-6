package Codelab1;

import java.io.*;
import java.util.*;

public class DFSTraversal {
    private int node;
    private LinkedList<Integer> adj[];

    DFSTraversal(int v) {
        node = v;
        adj = new LinkedList[node];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void insertEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {

        visited[v] = true;
        System.out.print(v + " ");


        for (int n : adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {

        boolean visited[] = new boolean[node];

        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        DFSTraversal graph = new DFSTraversal(6);
        graph.insertEdge(0, 4);
        graph.insertEdge(0, 5);
        graph.insertEdge(1, 0);
        graph.insertEdge(1, 5);
        graph.insertEdge(1, 2);
        graph.insertEdge(2, 1);
        graph.insertEdge(2, 3);
        graph.insertEdge(3, 2);
        graph.insertEdge(4, 0);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 0);
        graph.insertEdge(5, 1);
        graph.insertEdge(5, 4);
        System.out.println("Depth First Traversal for the graph is:");
        graph.DFS(3);
    }
}