package diapositivas;

public class Diapositiva24 {

	public static void main(String[] args) {

		System.out.println(esVocal("b"));

	}
	
	static boolean esVocal(String vocal) {
		boolean result = false;
		
		if(vocal.matches("[aeiouAEIOU]")) {
			result = true;
		}
		
		return result;
	}

}
