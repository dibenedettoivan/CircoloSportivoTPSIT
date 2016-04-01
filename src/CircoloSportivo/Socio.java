package CircoloSportivo;

/**
 * Classe <strong>Socio</strong>
 * 
 * @author Ivan Di Benedetto
 *
 */
public class Socio {
	
	/**
	 * Attributi di <strong>classe</strong>
	 */
	private String nome;
	private String cognome;
	private String cf;
	public Disciplina[] disciplina;
	
	/**
	 * Costruttore della classe <strong>Socio</strong> esso crea l'oggetto Socio nella classe di test.
	 * 
	 * @param n Parametro che contiene il nome del socio
	 * @param c Parametro che contiene il cognome del socio
	 * @param cf Parametro che contiene il codice fiscale del socio
	 * @param di Parametro che contiene il numero di soci contenuti nell'array disciplina
	 */
	public Socio(String n, String c, String cf, int di){
		nome = n;
		cognome = c;
		this.cf = cf;
		disciplina = new Disciplina[di];
	}
	
	/**
	 * Metodo per calcolare la <strong>retta</strong> annuale
	 * 
	 * @param isAnnuale Numero float contenente la retta annuale da pagare per un qualsiasi corso
	 * @return  Ritorna il prezzo della retta
	 */
	public float calcoloRetta(float isAnnuale){
		return isAnnuale;
	}
	/**
	 * Questo metodo serve per modificare il nome del socio
	 * 
	 * @param n Stringa contenente il nome del socio
	 */
	public void setNome(String n){
		nome = n;
	}
	/**
	 * Questo metodo ritorna il nome del socio
	 * 
	 * @return ritorna un nome in formato String
	 */
	public String getNome(){
		return nome;
	}
	/**
	 * Metodo che serve per settare il cognome del socio
	 * 
	 * @param c Stringa contenente il cognome del socio
	 */
	public void setCognome(String c){
		cognome = c;
	}
	/**
	 * Metodo che serve per visualizzare il cognome del socio
	 * 
	 * @return Ritorna una Stringa contenente il cognome del socio
	 */
	public String getCognome(){
		return cognome;
	}
	/**
	 * Metodo che setta, setta il codice fiscale del socio
	 * 
	 * @param c Parametro contenente il codice fiscale del socio
	 */
	public void setCf(String c){
		cf = c;
	}
	/**
	 * Metodo che serve a visualizzare il codice fiscale del socio
	 * 
	 * @return Ritorna una stringa con il codice fiscale del socio
	 */
	public String getCf(){
		return cf;
	}
}
