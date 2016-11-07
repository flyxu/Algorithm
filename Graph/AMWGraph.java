import java.util.ArrayList;

//邻接矩阵构造图
public class AMWGraph {
	public ArrayList vertexlist;
	public int[][] edges;
	public int numofedges;

	public AMWGraph(int n) {
		edges = new int[n][n];
		vertexlist = new ArrayList(n);
		numofedges = 0;
	}

	public int getnumofvertex() {
		return vertexlist.size();
	}

	public int getnumofedge() {
		return numofedges;
	}

	public void insertvertex(Object vertex) {
		vertexlist.add(vertex);
	}

	public void insertedge(int v1, int v2, int weight) {
		edges[v1][v2] = weight;
		numofedges++;
	}

	public void deleteedge(int v1, int v2) {
		edges[v1][v2] = 0;
		numofedges--;
	}

	public static void main(String[] args) {
		int n = 4;
		String[] labels = { "V1", "V2", "V3", "V4" };
		AMWGraph graph = new AMWGraph(4);
		for (String label : labels) {
			graph.insertvertex(label);
		}
		graph.insertedge(0, 1, 2);
		graph.insertedge(0, 2, 5);
		graph.insertedge(2, 3, 8);
		graph.insertedge(3, 0, 7);
		System.out.println(graph.getnumofvertex());
		System.out.println(graph.getnumofedge());
	}

}
