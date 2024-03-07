package leetcode_strivers_dsa;

public class POW_XN_50 {
	public static double myPow(double x, int n) {
        double pow=Math.pow(x,n);
        return pow;
    }
	
	public static void main(String[] args) {
		double x = 2.00000;
		int n=10;
		double result =myPow(x,n);
		System.out.println(result);
	}
}
