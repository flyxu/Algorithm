package Algorithm;

public class HanoiTest {
	static int step=0;
    public static void move(int num,String a,String b){
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
