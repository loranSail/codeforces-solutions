import java.util.*;

public class pro791A {
	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		while(a<=b){
			count++;
			a*=3;
			b*=2;
		}
		System.out.println(count);
	}	
}