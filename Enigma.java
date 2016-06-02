
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    // instance variables - replace the example below with your own


    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int encripta(Mecanismo mecanismo,int numero)
    {
        return mecanismo.encripta(numero);
    }
    public int desencripta(Mecanismo mecanismo,int numero)
    {
        return mecanismo.desencripta(numero);
    }
}
