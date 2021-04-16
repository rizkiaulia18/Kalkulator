
import java.lang.Math;
/**
 * Abstract class CalculatorTrigonometri
 *
 * @author Rizki Aulia
 * @version 0.2
 */
public abstract class CalculatorTrigonometri extends Calculator
{
    public double op=0;
    public abstract void konversi(double op);
    public double menghitungSin()
    {
        return Math.sin(this.op);
    }
    public double menghitungCos()
    {
        return Math.cos(this.op);
    }
     public double menghitungTan()
    {
        return Math.tan(this.op);
    }

}