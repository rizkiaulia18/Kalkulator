
/**
 * Class Main
 *
 * @author rizki aulia
 * @version 0.1
 */
public class main
{
   public static void main(String args[])
   {
      int hasil ;
      
    
   Calculator calculator1 = new Calculator();
   System.out.println(calculator1.opA);
   System.out.println(calculator1.opB);
   System.out.println(calculator1.info);
   System.out.println("\n");
   
   Calculator calculator2 = new Calculator(4,5);
   System.out.println(calculator2.info);
   System.out.println(calculator2.opA);
   System.out.println(calculator2.opB);
   System.out.println(calculator2.pengurangan(3,2));
    System.out.println(calculator2.penjumlahan(3,2));
    System.out.println(calculator2.Perkalian(3,2));
    System.out.println(calculator2.pembagian(3,2));
    System.out.println("\n");
    
    
    //CalculatorAdvanced
    calculatorAdvanced calculator3 = new calculatorAdvanced();
    System.out.println(calculator3.info);
    System.out.println(calculator3.opA);
    System.out.println(calculator3.opB);
    System.out.println(calculator3.pengurangan(3,2));
    System.out.println(calculator3.penjumlahan(3,2));
    System.out.println(calculator3.Perkalian(3,2));
    System.out.println(calculator3.pembagian(3,2));
    hasil= calculator3.Faktorial(5);
    System.out.println("Faktorial dari 5 adalah : "+hasil);
    System.out.println("Faktorial dari 4 adalah : "+calculator3.Faktorial(4));
    System.out.println("\n");
    
    //CalculatorProgrammer
    calculatorProgrammer calculator4 = new calculatorProgrammer();
    hasil= calculator4.Konversi(13);
    hasil= calculator4.Konversi(1115);//Menampilkan hasil konversi desimal ke biner dan hexa
    //System.out.println(calculator4.Konversi(10));

    
    //CalculatorTrigonometri
   System.out.println();
   
        double hasilSin = 0;
        double hasilCos = 0;
        double hasilTan = 0;
        int hasiljumlah=0;
        double der = 30;
        double rad = 0.5235987755982988;
        
        CalculatorTrigonometri ct1 = new CalculatorTriDeg();
        //CalculatorTrigonometri ct1 = new CalculatorTrigonometri();
        hasiljumlah = ct1.penjumlahan(3,4);
        System.out.println("Nilai op awal = "+ct1.op);
        ct1.konversi(der);
        System.out.println("Nilai derajat = "+der+ " setelah konversi = "+ ct1.op);
        hasilSin = ct1.menghitungSin();
        System.out.println("Nilai sin = "+der+ " derajat adalah = "+ hasilSin);
        hasilCos = ct1.menghitungCos();
        System.out.println("Nilai cos = "+der+ " derajat adalah = "+ hasilCos);
        hasilTan = ct1.menghitungTan();
        System.out.println("Nilai tan = "+der+ " derajat adalah = "+ hasilTan);
        
        System.out.println("");
        System.out.println("");
        
        CalculatorTrigonometri ct2 = new CalculatorTriRad();
        //CalculatorTrigonometri ct1 = new CalculatorTrigonometri();
        hasiljumlah = ct2.penjumlahan(3,4);
        System.out.println("Nilai op awal = "+ct2.op);
        ct2.konversi(rad);
        System.out.println("Nilai rad = "+rad+ " setelah konversi = "+ ct2.op);
        hasilSin = ct2.menghitungSin();
        System.out.println("Nilai sin = "+rad+ " radian  adalah = "+ hasilSin);
        hasilCos = ct2.menghitungCos();
        System.out.println("Nilai cos = "+rad+ " radian  adalah = "+ hasilCos);
        hasilTan = ct2.menghitungTan();
        System.out.println("Nilai tan = "+rad+ " radian  adalah = "+ hasilTan);
    }
}
