package CircoloSportivo;
/**
 * Classe <strong>Nuoto</strong> che <strong>estende</strong> la classe disciplina.
 * 
 * @author Ivan Di Benedetto
 *
 */
public class Nuoto extends Disciplina{
	
	/**
	 * Attributi di <strong>classe</strong>
	 */
	private String codiceCorso;
	public int corsia;
	/**
	 * Costruttore della classe <strong>Nuoto</strong> ereditato dalla classe <strong>Disciplina</strong>
	 * 
	 * @param m Parametro che contiene la retta mensile della disciplina
	 * @param a Parametro che contiene la retta annuale della disciplina
	 * @param n Parametro che contiene il nome della disciplina
	 * @param c Parametro che contiene il codice corso
	 * @param cor Parametro che contiene la corsia
	 */
	public Nuoto(float m, float a, String n, String c, int cor) {
		super(m, a, n);
		codiceCorso = c;
		corsia = cor;
	}
	/**
	 * Metodo che setta il codice del corso 
	 * 
	 * @param c Parametro che contiene il codice del corso
	 */
	public void setCodiceCorso(String c){
		codiceCorso = c;
	}
	/**
	 * Metodo che visualizza il codice del corso
	 * 
	 * @return Ritorna il codice del corso
	 */
	public String getCodiceCorso(){
		return codiceCorso;
	}

}
