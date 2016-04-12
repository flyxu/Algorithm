package Algorithm;

import java.util.Scanner;
/**
 * 二分查找
 * 白条过滤
 * @author ics
 *
 */
public class Binarysearch {
	public  int rank(int key,int[] a ){
		int i=0;
		int j=a.length-1;
	    while(i<=j){    //注意这里要小于等于，因为在等于后,i或j的值会再发生一次变化，使条件不成立
		int mid=(i+j)/2;
		if(key<a[mid]){
			j=mid-1;
		}
		else if(key>a[mid]){
			i=mid+1;
		}
		else{
			return mid;
		}
	   }
		return -1;
	}
	public static void main(String[] args){
		int b[]=new int[]{2,3,4,5,6,7,8,9,0};
		int a[]=new int[]{1,2,3,4,5,6,7};
		Binarysearch binarysearch=new Binarysearch();
		for(int i=0;i<b.length;i++){
			int c=binarysearch.rank(b[i], a);
			if(c<0){
				System.out.println("过滤值为:"+b[i]);
			}
			
		}

		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			int f=in.nextInt();
			if(f==0)
				return;
			int e=binarysearch.rank(f, a);
			if(e<0){
			System.out.println("输入的值不在列表中");
			}
			else{
				System.out.println("输入的值在列表中");
			}
		}
				
	}
}
