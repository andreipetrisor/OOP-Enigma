
public class Rotor {
	
	String mapare = new String();
	int of_inel;
	int of_rot ;
	String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	String rotor1 = "EKMFLGDQVZNTOWYHXUSPAIBRCJ";
	String rotor2 = "AJDKSIRUXBLHWTMCQGZNPYFVOE";
	String rotor3 = "BDFHJLCPRTXVZNYEIWGAKKUSQO";
	String rotor4 = "ESOVPZJAYQUIRHXLNFTGKDCMWB";
	String rotor5 = "VZBRGITYUPSDNHLXAWMJQOFECK";
	String rotor6 = "JPGVOUMFYQBENHZRDKASXLICTW";
	String rotor7 = "NZJHGRCXMYSWBOUFAIVLPEKQDT";
	String rotor8 = "FKQHTLXOCBJSPDZRAMEWNIUYGV";
	int[] notch = {-1,-1};
//	int numar;

	//Constructor
	Rotor(){}
	Rotor(char type,int inel, int rot){

	
		switch(type){
			case '1':{
				//numarul
				
				mapare = rotor1;
				of_inel = inel;
				of_rot = rot;
				notch[0] = 18;
				break;
			}
			case '2': {
			//	numar = type;
				mapare = rotor2;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 6;
				break;
			}
			case '3': {
			//	numar = type;
				mapare = rotor3;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 23;
				break;
			}
			case '4': {
			//	numar = type;
				mapare = rotor4;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 11;
				break;
			}
			case '5': {
		//		numar = type;
				mapare = rotor5;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 1;
				break;
			}
			case '6': {
		//		numar = type;
				mapare = rotor6;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 1;
				notch[1] = 14;
				break;
			}
			case '7': {
		//		numar = type;
				mapare = rotor7;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 1;
				notch[1] = 14;
				break;
			}
			case '8': {
			//	numar = type;
				mapare = rotor8;		
				of_inel = inel;
				of_rot = rot;
				notch[0] = 1;
				notch[1] = 14;
				break;
			}

		}
	}
	
	
	
	
	//functia rotor
	String run(String a){
		String literaNoua;
		int cod_litera;
		
		cod_litera = (codlitera(a) + of_rot - of_inel);
	
		if(cod_litera >26)
			cod_litera = (codlitera(a) + of_rot - of_inel)% 26;
			if(cod_litera < 0)
			cod_litera +=26;
	
//		System.out.println(mapare[cod_litera-1]);
//	System.out.println(cod_litera);
		
		//MAPAREA	
		
	//	System.out.println(cod_litera);
//		literaNoua = literacod(cod_litera);
	//	System.out.println(literaNoua + " " + (cod_litera-1));
		//System.out.println(mapare.substring(cod_litera-1, cod_litera));
		if(cod_litera > 0)
			literaNoua = mapare.substring(cod_litera-1, cod_litera);
		else
			literaNoua = mapare.substring(0, 1);
		System.out.println("Litera: "+ a + " Mapata in: " +literaNoua + cod_litera);
	//	System.out.println(of_inel - of_rot);
		cod_litera = (codlitera(a) + of_rot - of_inel);
		
		if(cod_litera >26)
			cod_litera = (codlitera(a) + of_rot - of_inel)% 26;
			if(cod_litera < 0)
			cod_litera +=26;
	//	System.out.println(cod_litera);
		literaNoua = literacod(cod_litera);
//		System.out.println("Iese litera " +literaNoua);
		return literaNoua;
		
	}


	String runAgain(String a){
		String literaNoua = "";
		int cod_litera = 0;
		
		
		//litera care intra in inel
	//	System.out.println(codlitera(a) + of_rot - of_inel);
		cod_litera = (codlitera(a) + of_rot - of_inel);
		
		if(cod_litera >=26)
			cod_litera = (codlitera(a) + of_rot - of_inel)% 26;
			if(cod_litera < 0)
			cod_litera +=26;
	//	System.out.println(mapare[cod_litera-1]);
	//	System.out.println(literacod(cod_litera));
		
		//MAPAREA	
			
	//	System.out.println(alfabet.substring(19,20));
//		System.out.println(cod_litera);
		literaNoua = literacod(cod_litera);
		//System.out.println(literaNoua +" " + (cod_litera));
		//System.out.println(mapare.substring(cod_litera-1, cod_litera));
		cod_litera = codlitera1(literaNoua);
	//	System.out.println((cod_litera));
		if(cod_litera > 0)
			literaNoua = alfabet.substring(cod_litera-1, cod_litera);
		else
			literaNoua ="A";
		//	System.out.println(literaNoua);
	//	System.out.println(of_inel - of_rot);
		cod_litera = (codlitera(literaNoua) + of_rot - of_inel);
		
		if(cod_litera >=26)
			cod_litera = (codlitera(literaNoua) + of_rot - of_inel)% 26;
			if(cod_litera < 0)
			cod_litera +=26;
	//	System.out.println(cod_litera);
		literaNoua = literacod(cod_litera);
	//	System.out.println(literaNoua);
		return literaNoua;
		
	}

	
	String literacod1(int pozitie){
		if(pozitie > 0)
			return mapare.substring(pozitie - 1, pozitie);
		return mapare.substring(0, 1);
	}
	
	int codlitera1(String a){
		return mapare.indexOf(a) +1;
	}

	
	String literacod(int pozitie){
		if(pozitie > 0)
			return alfabet.substring(pozitie-1 , pozitie);
		return "A";
	}
	
	int codlitera(String a){
		return alfabet.indexOf(a) +1;
	}

	
	
	
	
}
