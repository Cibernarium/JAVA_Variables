
public class exercici4 {

	public static void main(String[] args) {
		String name="Jordi Bonet Vallverdú";
		String date="23/01/1980";
		int any=1948;
		int naixement=1980;
		boolean traspas=false;
		for(any=1948;any<=naixement;any+=4) {
			if(any==naixement) {traspas=true;}
		}
		System.out.println("El meu nom és "+name);
		System.out.println("Vaig nèixer el "+date);
		if(traspas==true) {
			System.out.println("El meu any de naixement és de traspàs");
			}
		else {System.out.println("El meu any de naixement no és de traspàs");
		
		}
	}

}
