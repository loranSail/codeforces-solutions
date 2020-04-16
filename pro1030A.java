import java.util.*;

public class pro1030A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k =0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}		
		for(int j : arr){
			k += j;
		}
		if(k==0){System.out.println("EASY");}
		else{System.out.println("HARD");}
	}	
}