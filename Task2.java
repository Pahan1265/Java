package Classwork2;
import java.util.Scanner;
// @name Pavlo Kacinsky
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// task 2.1
		Scanner myscan = new Scanner(System.in); 
		System.out.println("Input your name:"); 
		String mystr = myscan.nextLine(); 
		System.out.println("Hello "+mystr); 
		
		// task 2.2
		int num1, num2;
		System.out.println("Input number 1:"); 
		num1 = myscan.nextInt();
		System.out.println("Input number 2:"); 
		num2 = myscan.nextInt();
		String nums1 = String.valueOf(num1);
		String nums2 = String.valueOf(num2);
		System.out.println(nums1.length()); 
		System.out.println(nums2.length()); 
		

}
