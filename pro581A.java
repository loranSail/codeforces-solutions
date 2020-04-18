import java.util.*;

public class pro581A{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = Math.max(a,b) - Math.min(a,b);
		if(c > 1){
			System.out.println(Math.min(a,b) + " " + c/2);
		} else{
			System.out.println(Math.min(a,b) + " " + 0);
		}
	}
}