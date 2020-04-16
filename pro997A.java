import java.util.*;

public class pro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String nm = Integer.toString(n);
		int iter = sc.nextInt();
		while(iter > 0){
			//int c = Integer.parseInt(nm.charAt(nm.length()-1));
			char c = nm.charAt(nm.length()-1);
			if(c != '0'){
				n--;
			}
			if(c == '0'){
				n/=10;
			}
			nm = Integer.toString(n);
			iter--;
		}
		System.out.println(n);
	}
}