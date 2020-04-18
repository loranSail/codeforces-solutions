import java.util.*;
public class pro734A {
	public static void main(String[] args) {
		int anton =0;
		int danik =0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		sc.close();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='A'){
				anton++;
			}
			else{
				danik++;
			}
		}
		if(anton>danik){System.out.println("Anton");}
		else{
			if(anton<danik){System.out.println("Danik");}
			else{
				System.out.println("Friendship");
			}
		}
	}
}