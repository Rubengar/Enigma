/**
 * Abstract class Mecanismo - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Mecanismo
{
    // instance variables - replace the example below with your own
    private int numero;
    public Mecanismo(int num)
    {
        numero = num;
    }
    public int  getNumero()
    {
        return numero;
    }
    public abstract int encripta(int numeroEncriptar);
    
    public abstract int desencripta(int numeroEncriptar);
}
