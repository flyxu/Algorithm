package text;

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
