import java.util.*;
public class pro1281A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] st = new String[n];
		for(int i=0;i<n;i++){
			st[i] = sc.nextLine();
			//System.out.println(st[i]);
			int l = st[i].length();
			//System.out.println(l);
			if(st[i].substring(l-2).equals("po")){
				System.out.println("FILIPINO");
			}
			else{
				if(st[i].substring(l-4).equals("desu") || st[i].substring(l-4).equals("masu")){
				System.out.println("JAPANESE");
				}
				else {
					if(st[i].substring(l-5).equals("mnida")){
						System.out.println("KOREAN");
					}	
				}	
			}
		}
	}
}