
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MecanismoOffset
     */
    public MecanismoOffset(int num)
    {
        super(num);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public int encripta(int numeroEncriptar)
    {
        int numero = -1;
        if (numeroEncriptar > 10)
        {
            numero = numeroEncriptar*getNumero();
        }
        return numero;
    }

    @Override
    public int desencripta(int numeroDesencriptar)
    {
        int numero = -1;
        if (numeroDesencriptar > 10)
        {
            numero = numeroDesencriptar/getNumero();
        }
        if (numero < 10)
        {
            numero = -1;
        }
        return numero;
    }
}
