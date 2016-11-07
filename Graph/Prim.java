package Algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
 * 最小生成树
 * Prim algorithm
 */
//顶点
class vertex{
	String key;
	vertex(String key){
		this.key=key;
	}
}

//边
class edge{
	vertex start;
	vertex end;
	int key;
	edge(vertex start,vertex end,int key){
		this.start=start;
		this.end=end;
		this.key=key;
	}
}

public class Prim {
	public static List<vertex> vertexlist=new ArrayList<vertex>();//顶点集
	public static List<edge> edgelist=new ArrayList<edge>();//边集
	public static List<vertex> newVertex=new ArrayList<vertex>();//已访问过的顶点集合
	public static void buildgraph(){
		vertex v1=new vertex("a");
		vertex v2=new vertex("b");
		vertex v3=new vertex("c");
		vertex v4=new vertex("d");
		vertex v5=new vertex("e");
		vertexlist.add(v1);
		vertexlist.add(v2);
		vertexlist.add(v3);
		vertexlist.add(v4);
		vertexlist.add(v5);
		addedge(v1, v2, 6);
		addedge(v1, v3, 7);
		addedge(v2, v3, 8);
		addedge(v2, v5, 4);
		addedge(v2, v4, 5);
		addedge(v3, v4, 3);
		addedge(v3, v5, 9);
		addedge(v4, v5, 7);
		addedge(v5, v1, 2);
		addedge(v2, v4, 2);
	}
	public static void addedge(vertex start,vertex end,int key){
		edge e=new edge(start,end,key);
		edgelist.add(e);	
	}
	public static void prim(){
		buildgraph();
		vertex start=vertexlist.get(0);
		newVertex.add(start);
		int minweight=0;
		for(int i=0;i<vertexlist.size()-1;i++){
			edge tmpedge=new edge(start,start,1000);
			vertex temp=new vertex(start.key);
			for(vertex v:newVertex){
				for(edge e:edgelist){
					if(e.start==v&&!containvertex(e.end)){
						if(e.key<tmpedge.key){
							temp=e.end;
							tmpedge = e;
						}
					}
					else if(e.end==v&&!containvertex(e.start)){
						if(e.key<tmpedge.key){
							temp=e.start;
							tmpedge=e;
						}
					}
				}		
			}
			System.out.println(tmpedge.start.key+" "+tmpedge.key+" "+tmpedge.end.key);
			newVertex.add(temp);
			minweight=minweight+tmpedge.key;
		}
		Iterator<vertex> iterator=newVertex.iterator();
		while(iterator.hasNext()){
			vertex v=iterator.next();
			System.out.println(v.key);
		}
		System.out.println("最小权重为:"+minweight);
	}
	public static boolean containvertex(vertex v){
		for(vertex ver:newVertex){
			if(ver.key.equals(v.key)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		prim();
	}

}
