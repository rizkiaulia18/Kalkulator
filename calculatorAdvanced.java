
/**
 * Class calculator advanced
 *
 * @author rizki aulia
 * @version 0.1
 */
public class calculatorAdvanced extends Calculator
{
    /**
     * cara menghitung faktorial
     *
     * @param int opA
     * @return hasil merupakan faktorial opA
     */
    public int Faktorial(int opA)
    {

        int hasil = 1;
        for (int i=opA; i>0; i--){
            hasil *=i;
        }
        return hasil;
    }
}
