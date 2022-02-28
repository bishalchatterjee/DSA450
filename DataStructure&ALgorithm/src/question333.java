import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class question333 {
//Detect Cycle in Directed Graph using BFS/DFS Algo

    //Khan's BFS Based Algorithm
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V)
    {
        int[] in_degree = new int[V];

        for (int u = 0; u < V; u++) {
            for (int x:adj.get(u))
                in_degree[x]++;
        }

        Queue<Integer> q1=new LinkedList<>();
        for (int i = 0; i < V; i++)
            if (in_degree[i] == 0)
                q1.add(i);

        int count=0;
        while (q1.isEmpty()==false) {
            int u = q1.poll();


            for (int x: adj.get(u))
                if (--in_degree[x] == 0)
                    q1.add(x);

            count++;
        }
        if (count != V) {
            System.out.println("There exists a cycle in the graph");
        }
        else{
            System.out.println("There exists no cycle in the graph");
        }
    }

    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 1);
        addEdge(adj,4, 1);
        addEdge(adj,1, 2);
        addEdge(adj,2, 3);
        addEdge(adj,3, 1);

        topologicalSort(adj,V);
    }
}
//T.C- O(V+E)

/*
//DFS BASED SOLUTION
class Graph {

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	static boolean DFSRec(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited, boolean[] recSt)
	{
    	visited[s]=true;
    	recSt[s]=true;

        for(int u:adj.get(s)){
            if(visited[u]==false && DFSRec(adj,u,visited,recSt)==true)
                    {return true;}
            else if(recSt[u]==true)
                {return true;}
        }
        recSt[s]=false;
        return false;
	}

	static boolean DFS(ArrayList<ArrayList<Integer>> adj, int V){
	    boolean[] visited=new boolean[V];
    	for(int i = 0; i<V; i++)
    		visited[i] = false;

    	boolean[] recSt=new boolean[V];
    	for(int i = 0; i<V; i++)
    		recSt[i] = false;

        for(int i=0;i<V;i++){
            if(visited[i]==false)
                if(DFSRec(adj,i,visited,recSt)==true)
                    return true;
        }
        return false;
	}

	public static void main(String[] args)
	{
		int V = 6;
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

		for (int i = 0; i < V; i++)
			adj.add(new ArrayList<Integer>());

			addEdge(adj,0,1);
        	addEdge(adj,2,1);
        	addEdge(adj,2,3);
        	addEdge(adj,3,4);
        	addEdge(adj,4,5);
        	addEdge(adj,5,3);

		if(DFS(adj,V)==true)
    	    System.out.println("Cycle found");
    	else
    	    System.out.println("No cycle found");
	}
}

 */
