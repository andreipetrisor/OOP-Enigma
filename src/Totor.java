
public class Totor {
	String mapare = new String();
	int of_inel;
	int of_rot ;
	String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	String rotor1 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
	String rotor2 = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
	String rotor3 = "BDFHJLCPRTXVZNYEIWGAKMUSQO";
	String rotor4 = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
	String rotor5 = "VZBRGITYUPSDNHLXAWMJQOFECK";
	String rotor6 = "JPGVOUMFYQBENHZRDKASXLICTW";
	String rotor7 = "NZJHGRCXMYSWBOUFAIVLPEKQDT";
	String rotor8 = "FKQHTLXOCBJSPDZRAMEWNIUYGV";
	int[] notch = {-6,-6};
//	int numar;

	//Constructor
	Totor(){}
	Totor(char type,int inel, int rot){

	
		switch(type){
			case '1':{
				//numarul
				
				mapare = rotor1;
				of_inel = inel;
				of_rot = rot;
				notch[0] = 17;
				break;
			}
			case '2': {
			//	numar = type;
				mapare = rotor2;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 5;
				break;
			}
			case '3': {
			//	numar = type;
				mapare = rotor3;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 22;
				break;
			}
			case '4': {
			//	numar = type;
				mapare = rotor4;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 10;
				break;
			}
			case '5': {
		//		numar = type;
				mapare = rotor5;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 0;
				break;
			}
			case '6': {
		//		numar = type;
				mapare = rotor6;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 0;
				notch[1] = 13;
				break;
			}
			case '7': {
		//		numar = type;
				mapare = rotor7;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 0;
				notch[1] = 1;
				break;
			}
			case '8': {
			//	numar = type;
				mapare = rotor8;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 0;
				notch[1] = 13;
				break;
			}

		}
	
	}
	
	String run(String a){
		String literaNoua = "";
		int pozitie = 0;
		int offset = 0;
		
		pozitie = alfabetReferintaPozitie(a);
		offset = of_rot - of_inel;
	//	System.out.println(of_rot + " " + of_inel + " " + pozitie + " " + a);
		pozitie = pozitie + offset; 
		if(pozitie >= 26)
			pozitie -= 26;
		if(pozitie < 0)
			pozitie += 26;
		
		//litera de la pozitia pozitie in alfabet
	//	literaNoua += alfabetReferintaLitera(pozitie);
	//	System.out.println(pozitie + " " + mapare.length());
		literaNoua += mapareLitera(pozitie);
//		System.out.println("Litera: "+ a + " Mapata in: " +literaNoua + pozitie);

		pozitie = alfabetReferintaPozitie(literaNoua);
		pozitie -= offset;
		if(pozitie >= 26)
			pozitie -= 26;
		if(pozitie < 0)
			pozitie += 26;
		literaNoua = "";
	//	System.out.println(of_rot + " " + of_inel + " " + pozitie + " " + literaNoua);
		literaNoua += alfabetReferintaLitera(pozitie);
		
		return literaNoua;
		
	}

	String runAgain(String a){
		String literaNoua = "";
		int pozitie;
		int offset;
		
		pozitie = alfabetReferintaPozitie(a);
		offset = of_rot - of_inel;
	//	System.out.println("Pozitie "+pozitie + " " + offset);
		pozitie = pozitie + offset;
		if(pozitie >= 26)
			pozitie -= 26;
		if(pozitie < 0)
			pozitie += 26;

		//litera de la pozitia pozitie in alfabet
	//	literaNoua += alfabetReferintaLitera(pozitie);
		
		
//		System.out.println("Litera: "+ a + " Mapata in: "  + pozitie);
		literaNoua += alfabetReferintaLitera(pozitie);
		pozitie = maparePozitie(literaNoua);
		
		literaNoua = "";
		literaNoua += alfabetReferintaLitera(pozitie);
			
		pozitie -= offset;
		if(pozitie >= 26)
			pozitie -= 26;
		if(pozitie < 0)
			pozitie += 26;
		
		literaNoua = "";
		literaNoua += alfabetReferintaLitera(pozitie);
		
		return literaNoua;
		
		
		
	}

	
	
	
	
	private int maparePozitie(String a) {
		// TODO Auto-generated method stub
		return mapare.indexOf(a);
	}
	private char alfabetReferintaLitera(int pozitie) {
		// TODO Auto-generated method stub
		char[] a =alfabet.toCharArray();
		return a[pozitie];
	}
	private char mapareLitera(int pozitie) {
		// TODO Auto-generated method stub
		char[] a =mapare.toCharArray();

		return a[pozitie];
	}
	private int alfabetReferintaPozitie(String a) {

		return alfabet.indexOf(a);
	}
}
