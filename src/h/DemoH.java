package h;

public class DemoH {

	public static void main(String[] args) {
		System.out.println("Tomorrow is Friday");
		
	char setGender = 'F';
		String getGender = "";
		
		switch(setGender) {
		case 'M':
		case 'm':
			getGender = "MALE";
			break;
		case 'F':
		case 'f':
			getGender = "FEMALE";
			break;
		default:
			getGender = "OTHERS";
		}
		System.out.println(getGender);
}
}
