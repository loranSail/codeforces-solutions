import java.io.*;
import java.util.*;

public class pro705A {	
	public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String[] past = {"I hate that", "I love that"};
        String[] present = {"I hate it", "I love it"};
        boolean hate = true;

        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            sb.append(hate ? past[0] : past[1]).append(" ");
            hate = !hate;
            n--;
        }

        sb.append(hate ? present[0] : present[1]);

        System.out.println(sb.toString());
	}
}