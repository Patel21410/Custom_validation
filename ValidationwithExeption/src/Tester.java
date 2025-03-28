
public class Tester {
	public static void main(String []arg) {
		try{
			int age=18;
			Validation.validateage(age);
			String email="q@gmail.com";
			Validation.validateEmail(email);
			String dob="2000-02-02";
			Validation.validateDob(dob);
			
		}catch (Exception e) {
			System.out.println("Exception : "+e);
		}
		finally {
			System.out.println("Try catch run end");
		}
		
		
		
		
	}

}
