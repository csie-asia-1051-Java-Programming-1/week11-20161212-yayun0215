package hw;
import java.util.Scanner;
/*
 * Date: 2016/12/12
 * Author: 105021***  ???
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		String str =scn.nextLine();
		int n=scn.nextInt();

		for (int i=0;i<str.length();i++) {
			char q=str.charAt(i);
			if (q>=65 && q<=90) {
				if (q+n>=90) {
					System.out.print((char) (q-25+n-1));
				} else {
					System.out.print((char) (q+n));
				}
			} else if (q>=97&&q<= 122) {
				if (q+n>=122) {
					System.out.print((char) (q-25+n-1));
				} else {
					System.out.print((char) (q+n));
				}
			}

			else {
				System.out.print((char)q);
			}
		}

	}
}