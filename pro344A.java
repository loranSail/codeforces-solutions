import java.util.*;
public class pro344A {
	public static void main(String[] args) {
		int count = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		while(n>1){
			int y = sc.nextInt();
			if(y!=x){
				count++;
			}
			x=y;
			n--;
		}
		System.out.println(count);
	}
}