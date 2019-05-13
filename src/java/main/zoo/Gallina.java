package zoo;

/**
 *
 * @author usuario
 */
public class Gallina extends Ave {
 
    private String cacareo = "KOKOKO";
    
    /**
     *Metodo constructor sin atributos.
     */
    public Gallina () {}
    
    /**
     *Metodo constructor con todos los atributos.
     * @param habitat habitat es un Habitat
     * @param comida comida es un String
     * @param longevidad longevidad es un int
     * @param periodoIncubacion periodoIncubacion es un int
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     *
     * @param cacareo cacareo es un String
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     *
     * @return retorna un string.
     * Hace una llamada a un metodo.
     */
    public String getCacareo () { return cacareo; }
    
    /**
     *Metodo cacarear
     * no retorna nada.
     * Imprime el atributo cacareo.
     */
    public void cacarear () { System.out.println(cacareo); }
    
    /**
     *Metodo comer
     * no retorna nada.
     * Imprime Estoy comiendo seguido del atributo comida.
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     *Metodo desplazar
     * no retorna nada.
     * Imprime Estoy volando con mucha dificultad.
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
