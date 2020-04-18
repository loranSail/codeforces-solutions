import java.util.*;
public class pro263A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int x =0;
		int y=0;
		int[][] m = new int[5][5];
		for(int j=0;j<5;j++){
			for(int i=0;i<5;i++){
				m[i][j] = sc.nextInt();
				if(m[i][j]==1){
					x = i;
					y = j;
				}
			}
		}
		sc.close();	
		System.out.println(Math.abs(2-x)+Math.abs(2-y));
	}
}