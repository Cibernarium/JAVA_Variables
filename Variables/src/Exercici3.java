
public class Exercici3 {

	public static void main(String[] args) {
		int inici=1948;
		boolean traspas=false;
		int naixement=1980;
		String verdad="La variable booleana �s certa";
	    String falso="La variable booleana �s falsa";
	
		
		for(inici=1948;inici<=naixement;inici+=4){ 
		
			System.out.println("L'any: "+inici+" �s de trasp�s");
			if(inici==naixement){traspas=true;
			}
		}
		if(traspas==true){
			System.out.println(verdad);
		}
		else {
			System.out.println(falso);
		}
	}
}

		
			
		
		


