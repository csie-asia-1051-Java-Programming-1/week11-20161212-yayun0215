package ex;
import java.util.Scanner;
/*
 * Date: 2016/12/12
 * Author: 105021062 鄭雅韵
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		String a[]=str.split(" ");
		int sum=0;
		float sum2=0;
		for (int i=0;i<a.length;i++) {
			float f =Float.parseFloat(a[i]);
			if (f == (int) Float.parseFloat(a[i])) {
				sum++;
				sum2 += f;
			}

		}
		double b=(Math.round(sum2 / a.length*1000)*0.001);
		System.out.println("Size:"+sum);
		System.out.printf("Average:",b);

	}
}