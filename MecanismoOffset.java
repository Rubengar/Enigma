
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
        String cadena = String.valueOf(numeroEncriptar);
        String[] cadenaNumeros = cadena.split("");
        int[] numeros = new int[cadenaNumeros.length];
        int i = 0;
        for(String str:cadenaNumeros){
            numeros[i]=Integer.parseInt(str);//Exception in this line
            i++;
        }
        for (int a = 1; a < numeros.length; a++)
        {
            numeros[a] += getNumero();
            if (numeros[a] >= 10)
            {
                numeros[a] -= 10;
            }
        }
        StringBuilder strNum = new StringBuilder();
        for (int num : numeros) 
        {
            strNum.append(num);
        }
        int numeroFinal = Integer.parseInt(strNum.toString());
        return numeroFinal;
    }

    @Override
    public int desencripta(int numeroDesencriptar)
    {
        String cadena = String.valueOf(numeroDesencriptar);
        String[] cadenaNumeros = cadena.split("");
        int[] numeros = new int[cadenaNumeros.length];
        int i = 0;
        for(String str:cadenaNumeros){
            numeros[i]=Integer.parseInt(str);//Exception in this line
            i++;
        }
        for (int a = 1; a < numeros.length; a++)
        {
            numeros[a] -= getNumero();
            if (numeros[a]<0)
            {
                numeros[a]=  10 + numeros[a];
            }
        }
        StringBuilder strNum = new StringBuilder();

        for (int num : numeros) 
        {
            strNum.append(num);
        }
        int numeroFinal = Integer.parseInt(strNum.toString());
        return numeroFinal;
    }
}
