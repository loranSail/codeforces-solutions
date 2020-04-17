import java.util.*;
public class pro1146A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s =sc.next();
        int len = s.length();
        int count=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='a')
                count++;
        }
        
        System.out.println(Math.min(2*count-1, len));
	}
}