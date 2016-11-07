package Algorithm;

public class HanoiTest {
	static int step=0;
    public static void move(int num,String a,String b){   //参数num代表盘子号，不是指盘子个数
    	step++;
    	System.out.println("第"+step+"步,盘子"+num+"从"+a+"塔移动到"+b+"塔");
    }
    public static void hanoiSort(int n,String a,String b,String c){
    	if(n==1){
    		move(n, a, c);
    	}
    	else{
    	hanoiSort(n-1,a,c,b);
    	move(n, a, c);
    	hanoiSort(n-1,b,a,c);
    	}
    }
	public static void main(String[] args) {
          hanoiSort(3,"A","B","C");
	}

}
/**
 * 汉诺塔问题
 * 解法:如果柱子标为ABC，要由A搬至C，在只有一个盘子时，就将它直接搬至C，当有n个盘子，就将B当作辅助柱。
 *      先将n-1个盘移到B上，将第n个盘移到C上，然后再将B上的n-1个盘移到C上。 
 */

