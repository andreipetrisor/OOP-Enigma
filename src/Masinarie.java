import java.util.ArrayList;

public class Masinarie {

	String alfabet = new String();
	Plugboard plugboard;
	Reflect reflector;
	Totor rotor1;
	Totor rotor2;
	Totor rotor3;
	
	Masinarie(ArrayList<String> componente){
		alfabet = componente.get(0);
		plugboard = new Plugboard(componente.get(1));
		char[] ajutor = componente.get(2).toCharArray();
		reflector = new Reflect(ajutor[0]);
		char[] inel = componente.get(3).toCharArray();
		char[] nucleu = componente.get(4).toCharArray();
		int  i = 0;
	/*	while(i < inel.length){
			System.out.println(ajutor[i+1] + " " + this.cod(inel[i]) +this.cod(nucleu[i]));
			rotor[i] = new Rotor(ajutor[i+1],this.cod(inel[i]), this.cod(nucleu[i]));
			i++;
		}*/
		rotor1 = new Totor(ajutor[1],this.cod(inel[0]), this.cod(nucleu[0]));
		rotor2 = new Totor(ajutor[2],this.cod(inel[1]), this.cod(nucleu[1]));
		rotor3 = new Totor(ajutor[3],this.cod(inel[2]), this.cod(nucleu[2]));
	}


	private int cod(char a){
		return alfabet.indexOf(a);
	}

	void run(String mesaj){
		String fin = new String();
		int i =0;
//		System.out.println(rotor1.of_rot);
		if (mesaj != null)
		while(i < mesaj.length()){
		
		fin = (mesaj.substring(i,i+1));
		fin = plugboard.codific(fin);
			rotor3.of_rot ++;
			if(rotor3.of_rot >= 26)
				rotor3.of_rot -= 26; 
		//	System.out.println("Rotor 2 " + rotor2.notch[0] + "of_rot2 " + rotor2.of_rot+1 +  " rotor 3 " + rotor3.of_rot + " " + rotor3.notch[0] );
			
			
			if((rotor2.notch[0] == rotor2.of_rot +1 || rotor2.notch[1] == rotor2.of_rot +1) && rotor3.notch[0]  == rotor3.of_rot -1 ){
				rotor2.of_rot++;
				rotor1.of_rot++;
			}
			else if( rotor3.notch[0]  == rotor3.of_rot  || rotor3.notch[1]  == rotor3.of_rot  )
				rotor2.of_rot++;
		/*	if(rotor2.notch[0]  == rotor2.of_rot -1 || rotor2.notch[1]  == rotor2.of_rot -1)
				rotor1.of_rot++;
//			System.out.println(rotor2.of_rot + " " + rotor3.of_rot + "  3" + " " +rotor3.notch[0]);
*/			if(rotor1.of_rot >= 26)
				rotor1.of_rot -= 26; 
			if(rotor2.of_rot >= 26)
				rotor2.of_rot -= 26; 
			if(rotor3.of_rot >= 26)
				rotor3.of_rot -= 26; 

	//		System.out.println(rotor1.of_rot + " " + rotor2.of_rot + " " + rotor3.of_rot);
			
		fin = rotor3.run(fin);
		fin = rotor2.run(fin);
		fin = rotor1.run(fin);
		
		fin = reflector.codific(fin);
		fin = rotor1.runAgain(fin);
		
		fin = rotor2.runAgain(fin);
		fin = rotor3.runAgain(fin);
		fin = plugboard.codific(fin);
//		System.out.println("liTERA CARE IESE: " + fin);/**/
		System.out.print(fin);
		i++;
		}
	
	}
	
}


	