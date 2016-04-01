package CircoloSportivo;

/**
 * Classe <strong>Body Building</strong> che <strong>estende</strong> la classe disciplina.
 * 
 * @author Ivan Di Benedetto
 *
 */
public class BodyBuilding  extends Disciplina{

	/**
	 * Attributi di <strong>classe</strong>
	 */
	private String peso;
	/**
	 * Costruttore della classe <strong>Body Building</strong> ereditato dalla classe <strong>Disciplina</strong>
	 * 
	 * @param m Parametro che contiene la retta mensile
	 * @param a Parametro che contiene la retta annuale
	 * @param n Parametro che contiene il nome della disciplina
	 * @param p Parametro che contiene il peso del socio
	 */
	public BodyBuilding(float m, float a, String n, String p) {
		super(m, a, n);
		peso = p;
	}
	/**
	 * Metodo che setta il peso del socio
	 * 
	 * @param p Contiene il peso del socio
	 */
	public void setPeso(String p){
		peso = p;
	}
	/**
	 * Metodo che visualizza il peso del socio
	 * 
	 * @return Ritorna il peso del socio
	 */
	public String getPeso(){
		return peso;
	}

}
