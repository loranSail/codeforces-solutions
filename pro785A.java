import java.util.*;
public class pro785A {
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextLine();			
		}	
		for(int j=0;j<n;j++){
			if(arr[j].equals("Tetrahedron")) count += 4;
			else {
				if(arr[j].equals("Cube")) count += 6;
				else{
					if(arr[j].equals("Octahedron")) count += 8;
					else{
						if(arr[j].equals("Dodecahedron")) count += 12;
						else{
							if(arr[j].equals("Icosahedron")) count +=20;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}