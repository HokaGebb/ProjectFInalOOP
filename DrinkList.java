
package fastfoodinformationsystem;

public class DrinkList extends MainFrame{
    
    //For Encapsulation
    private double priceSoftdrink;
    private double priceIcedTea;
    private double priceBukoJuice;
    private double priceLemonnade;
    private double priceZesto;
    
    /* Softdrink = 15.00
    Iced Tea = 10.00
    Buko Juice = 5.00
    Lemonade = 10.00
    Zesto = 8.00
    */

    public double getPriceSoftdrink() {
        return priceSoftdrink;
    }

    public void setPriceSoftdrink(double Softdrink) {
        this.priceSoftdrink = Softdrink;
    }


    public double getPriceIcedTea() {
        return priceIcedTea;
    }

    public void setPriceIcedTea(double IcedTea) {
        this.priceIcedTea = IcedTea;
    }

    public double getPriceBukoJuice() {
        return priceBukoJuice;
    }

    public void setPriceBukoJuice(double BukoJuice) {
        this.priceBukoJuice = BukoJuice;
    }

    public double getPriceLemonnade() {
        return priceLemonnade;
    }

    public void setPriceLemonnade(double Lemonnade) {
        this.priceLemonnade = Lemonnade;
    }

    public double getPriceZesto() {
        return priceZesto;
    }

    public void setPriceZesto(double Zesto) {
        this.priceZesto = Zesto;
    }
}
