import java.util.*;
public class pro1186A {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(compute(n,a,b));
	}
	public static String compute(int n,int a,int b){
		if(n <= a && n <= b){
			return "Yes";
		}
		else {
			return "No";
		}
	}
}