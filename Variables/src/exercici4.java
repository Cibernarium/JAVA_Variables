
public class exercici4 {

	public static void main(String[] args) {
		String name="Jordi Bonet Vallverd�";
		String date="23/01/1980";
		int any=1948;
		int naixement=1980;
		boolean traspas=false;
		for(any=1948;any<=naixement;any+=4) {
			if(any==naixement) {traspas=true;}
		}
		System.out.println("El meu nom �s "+name);
		System.out.println("Vaig n�ixer el "+date);
		if(traspas==true) {
			System.out.println("El meu any de naixement �s de trasp�s");
			}
		else {System.out.println("El meu any de naixement no �s de trasp�s");
		
		}
	}

}
