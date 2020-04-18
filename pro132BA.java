import java.util.*;
public class pro132BA {
	public static void main(String[] args) {
		int count =0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a%b==0){System.out.println(0);}
			else{System.out.println(b-(a%b));}
			n--;
		}
		sc.close();
	}
}