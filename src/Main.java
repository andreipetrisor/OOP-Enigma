import java.util.ArrayList;

/**
 * <p>
 * This execution entry point class handles parsing and executing commands from the input
 * file.
 * </p>
 */
public class Main {

	/**
	 * <p>
	 * Execution entry point.
	 *</p>
	 *
	 * @param args the name of the file containing commands to be executed
	 */
	//public static void main(String[] args) {
	public static void main(String[] args) {	
	if (args.length != 1) {
			System.err.println("Usage: java -cp <classpath> Main <input file>");
			System.exit(1);
		}
	
	FileParser fisier = new FileParser(args[0]);
	fisier.open();
	

	ArrayList<String> masina = new ArrayList<String>();
	String alfabet = new String();
	String linie = new String();
	String plugboard = new String();
	String reflector = new String();
	String poz_inel = new String();
	String poz_rot = new String();
	String operatie = new String();
	String mesaj = new String();
	
	
	linie = fisier.parseNextLine();	
	alfabet = linie;
	masina.add(alfabet);
	
	linie = fisier.parseNextLine();
	//split spatii
	for(String retval: linie.split("\\s+")){
		plugboard += retval;
	}
	linie = plugboard;
	plugboard = "";
	//split (
	for(String retval: linie.split("[(]")){
		plugboard += retval;
	}
	linie = plugboard;
	plugboard = "";
	//split )
	for(String retval: linie.split("[)]")){
		plugboard += retval;
	}	
	masina.add(plugboard);
	
	linie = fisier.parseNextLine();
	//split spatii
	for(String retval: linie.split("\\s+")){
		reflector += retval;
	}
	masina.add(reflector);

	
	linie = fisier.parseNextLine();
	poz_inel = linie;
	masina.add(poz_inel);
	
	linie = fisier.parseNextLine();
	poz_rot = linie;
	masina.add(poz_rot);
	
	
	linie = fisier.parseNextLine();
	operatie = linie;
	masina.add(operatie);
	linie = fisier.parseNextLine();
	while(linie != null){
		mesaj += linie;
		linie = fisier.parseNextLine();

	}
	masina.add(mesaj);
	
//	System.out.println(masina.get(6));
	Masinarie enigma = new Masinarie(masina);	
	enigma.run(masina.get(6));
	
	
	fisier.close();
	}

}
