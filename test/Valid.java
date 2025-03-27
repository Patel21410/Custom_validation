package test;

public class Valid {

	public static  void valiDation(int x) throws Excep {
		if(x<18) {
			throw new Excep("age less then 18");
		}
	}

}
