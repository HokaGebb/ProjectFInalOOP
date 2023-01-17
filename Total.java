
package fastfoodinformationsystem;

//For Inheritance with Method Overloading and Constructor
public class Total extends MainFrame implements IOperations{
    
    private double Tprice;
    
    public Total(){
        Tprice = 0;
    }
    
    @Override
    public void multiplyPrice(double num1, double num2) {
        Tprice = num1 * num2;
    }
    
    public double getTprice() {
        return Tprice;
    }

    @Override
    public void addtotalPrice(double num1, double num2) {
        Tprice = num1 + num2;
    }
}
