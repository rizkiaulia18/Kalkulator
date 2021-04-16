
import java.lang.Math;

/**
 * class CalculatorTriDeg
 *
 * @author Rizki Aulia
 * @version 0.2
 */
public class CalculatorTriDeg extends CalculatorTrigonometri
{
   public void konversi(double deg)
   {
       super.op = Math.toRadians(deg);
   }
}
