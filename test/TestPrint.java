package test;
import java.util.Date;
import java.util.Scanner;

public class TestPrint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String dob=sc.next();
		
		int age=17;
		try{
			
			Valid.valiDation(age);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(new Date());
	}

}
