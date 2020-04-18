import java.util.*;
public class pro510A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		while(n>1){
			for(int i=0; i<m;i++){
				System.out.print('#');
			}
			System.out.println();
			n--;
			for(int j=0; j<m-1;j++){
				System.out.print('.');
			}
			System.out.print('#');
			System.out.println();
			n--;
			if(n>=2){
				for(int i=0; i<m;i++){
					System.out.print('#');
				}
				n--;
				System.out.println();
				System.out.print('#');
				
				for(int j=0; j<m-1;j++){
					System.out.print('.');
				}
				System.out.println();
				n--;
			}
		}
		for(int i=0; i<m;i++){
			System.out.print('#');
		}
		System.out.println();
	}
}