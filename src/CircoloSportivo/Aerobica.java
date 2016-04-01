package CircoloSportivo;
/**
 * Classe <strong>Aerobica</strong> che <strong>estende</strong> la classe disciplina.
 * 
 * @author Ivan Di Benedetto
 *
 */
public class Aerobica extends Disciplina{
	
	/**
	 * Attributi di classe
	 */
	private String codiceCorso;
	/**
	 * Costruttore della classe <strong>Aerobica</strong> ereditato dalla classe <strong>Disciplina</strong>
	 * 
	 * @param m Parametro che contiene la retta mensile della disciplina
	 * @param a Parametro che contiene la retta annuale della disciplina
	 * @param n Parametro che contiene il nome della disciplina
	 * @param c Parametro che contiene il codice corso
	 */
	public Aerobica(float m, float a, String n, String c) {
		super(m, a, n);
		codiceCorso = c;

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
