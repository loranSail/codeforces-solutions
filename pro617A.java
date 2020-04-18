import java.util.*;
public class pro617A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(compute(n,5,4,3,2,1));

	}
	public static int compute(int x,int a,int b,int c,int d,int e){
		return x/a + (x%a)/b + ((x%a)%b)/c + (((x%a)%b)%c)/d + ((((x%a)%b)%c)%d)*e ; 
	}
}