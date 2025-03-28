import java.time.LocalDate;
import java.time.Period;

public class Validation {
	//basic Harded 
	public static void validateage(int ages) throws ExeptionH {
		if (ages<18) {
			 throw new ExeptionH("below age");
		}
	}
	public static void validateEmail(String email) throws ExeptionH {
		String Vemail="^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.(com|in)$";
		String semail=email;
		boolean nagetiv  = semail.matches (Vemail);
		if (!nagetiv) {
			 throw new ExeptionH("Email not currect");
		}
	}
	
	public static void validateDob(String dob) throws ExeptionH {
		LocalDate dos=LocalDate.parse(dob);
		LocalDate curd=LocalDate.now();
		
		int diff=Period.between(dos, curd).getYears();
		//System.out.println(diff);
		
		if (diff<18) {
			 throw new ExeptionH("DOB not currect");
		}
	}

}
