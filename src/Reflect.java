
public class Reflect {
	
	String reflector = new String();
	
	Reflect(char tip){
		switch(tip){
			case 'B': {
				reflector = "AYBRCUDHEQFSGLIPJXKNMOTZVW";
				break;
			}
			case 'C': {
				reflector = "AFBVCPDJEIGOHYKRLZMXNWTQSU";
				break;
			}
		}
	}
	
	String codific(String a){
		String litera_noua = new String();
		int pozitie;
		//System.out.println(a);
		
		
	//	System.out.println(reflector.indexOf('B'));
		pozitie = reflector.indexOf(a);
		if(pozitie % 2 == 0)
			litera_noua = reflector.substring(pozitie+1, pozitie+2);
		else
			litera_noua = reflector.substring(pozitie-1, pozitie);
		
		return litera_noua;
	}

}