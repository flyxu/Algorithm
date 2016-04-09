package Algorithm;

public class gcd {
	public static int gcd(int a,int b){
		if(b==0)
			return a;
		int r=a%b;
		return gcd(b, r);
	}
     public static void main(String[] args){
    	 System.out.println(gcd(24, 14));
     }
}

/**
欧几里得算法，找到两个数的最大公约数
定理：gcd(a,b) = gcd(b,a mod b) 
证明：a可以表示成a = kb + r，则r = a mod b 
      假设d是a,b的一个公约数，则有 
      d|a, d|b，而r = a - kb，因此d|r 
      因此d是(b,a mod b)的公约数 

      假设d 是(b,a mod b)的公约数，则 
      d | b , d |r ，但是a = kb +r 
      因此d也是(a,b)的公约数 

      因此(a,b)和(b,a mod b)的公约数是一样的，其最大公约数也必然相等，
*/
