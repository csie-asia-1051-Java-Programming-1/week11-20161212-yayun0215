package hw;
import java.util.Scanner;
/*
 * Date: 2016/12/12
 * Author: 105021062  鄭雅韵
 */
public class hw02 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String data[]=str.split(" ");
		boolean q = true;
		int n = 0;
		if (0 < data.length && data.length < 11) {
			for (int i = 0; i < data.length; i++) {
				int a = Integer.parseInt(data[i]);
				int sum = 0;
				for (int j = 0; j < data.length; j++) {
					if (a == Integer.parseInt(data[j])) {
						sum = sum + 1;
					}
				}
				if (sum > (float) (data.length / 2)) {
					n = Integer.parseInt(data[i]);
					q = true;
				} else {
					q = false;
				}

			}
		}
		if (q == true) {
			System.out.println(n);
		} else {
			System.out.println("NO");

	}
	}
}