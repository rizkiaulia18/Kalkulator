
/**
 * Class calculator programmer
 *
 * @author rizki aulia
 * @version 0.1
 */
public class calculatorProgrammer extends Calculator
{
    

    /**
     * cara konversi desimal ke biner dan  hexa
     *
     * @param int opA
     * @return hasil merupakan biner dari desimal opA
     */
    public int Konversi(int opA)
    {
        int hasil;
        int dec = opA;
        System.out.println(Integer.toBinaryString(opA)+" adalah biner dari desimal "+opA);
        System.out.println(Integer.toHexString(dec)+" adalah hexa dari desimal "+opA);
        hasil = opA;
        return hasil;
      
    }
    
       /*public int Hexa(des) {
       System.out.println(Integer.toHexString(des));
       return des;
       } */
    
     // konversi hexa belom bisa
}



