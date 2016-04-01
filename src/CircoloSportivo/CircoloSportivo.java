package CircoloSportivo;


/**
 * Classe <strong>Circolo Sportivo</strong>
 * 
 * @author Ivan Di Benedetto
 *
 */
public class CircoloSportivo {
	
	/**
	 * Attributi di <strong>classe</strong>
	 */
	public String Nome;
	public Socio[] soci;
	
	/**
	 * Costruttore della classe <strong>CircoloSportivo</strong> esso crea l'oggetto CircoloSportivo nella classe di test.
	 * 
	 * @param n Stringa contenente il nome del circolo
	 */
	public CircoloSportivo(String n){
		Nome = n;
	}
	/**
	 * Metodo che stampa la lista degli iscritti dall'array Soci
	 * 
	 * @param soci
	 */
	public void ElencoIscritti(Socio soci){
		
	}
	/**
	 * Metodo che ritorna un elenco di iscritti per tale disciplina
	 * 
	 * @param disc Variabile che contiene la disciplina che frequenta tale Socio
	 * @return
	 */
	public String ElencoIscrittiPerDisciplina(String disc){
		return disc; 
	}
	
	
	

}
