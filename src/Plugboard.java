
public class Plugboard {
		String codificari = new String();
	
	Plugboard(String lista){
		codificari = lista;
	}
	
	String codific(String a){
		String litera_noua = a;
		int pozitie;
		pozitie = codificari.indexOf(a);
		if(pozitie >=0)
		if(pozitie % 2 == 0)
			litera_noua = codificari.substring(pozitie+1, pozitie+2);
		else
			litera_noua = codificari.substring(pozitie-1, pozitie);
		
		return litera_noua;
	}
}
