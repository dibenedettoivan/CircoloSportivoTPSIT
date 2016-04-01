package CircoloSportivo;

/**
 * Classe <strong>Disciplina</strong> classe <strong>astratta</strong>
 * 
 * @author Ivan Di Benedetto
 *
 */
public abstract class Disciplina {
	
	/**
	 * Attributi di <strong>classe</strong>
	 */
	private float mensile;
	private float annuale;
	public String nome;	
	public Socio[] soci;
	
	/**
	 * Costruttore della classe <strong>Disciplina</strong> esso crea l'oggetto Disciplina nella classe di test.
	 * 
	 * @param m Parametro contenente la retta mensile
	 * @param a Parametro contenente la retta annuale
	 * @param n Parametro contenente il nome della disciplina
	 */
	public Disciplina(float m, float a, String n){
		mensile = m;
		annuale = a;
		nome = n;
	}
	/**
	 * Metodo per settare la retta mensile della disciplina.
	 * 
	 * @param m Parametro contenente la retta mensile
	 */
	public void setMensile(float m){
		mensile = m;
	}
	/**
	 * Metodo per visualizzare la retta mensile della disciplina
	 * 
	 * @return Ritorna un float contenente il prezzo della retta
	 */
	public float getMensile(){
		return mensile;
	}
	/**
	 * Metodo per settare il prezzo annuale della disciplina
	 * 
	 * @param a Parametro contenente il prezzo della retta annuale
	 */
	public void setAnnuale(float a){
		annuale = a;
	}
	/**
	 * Metodo per visualizzare il prezzo annuale della disciplina
	 * 
	 * @return Resituisce il prezzo annuale per l'iscrizione alla disciplina
	 */
	public float getAnnuale(){
		return annuale;
	}

}
