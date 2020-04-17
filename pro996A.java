import java.util.*;

public class pro996A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(compute(n,100,20,10,5,1));
	}

	public static int compute(int x,int a,int b,int c,int d,int e){
		return x/a + (x%a)/b + ((x%a)%b)/c + (((x%a)%b)%c)/d + ((((x%a)%b)%c)%d)*e ; 
	}
}