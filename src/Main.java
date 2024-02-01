public class Main
{
    public static void main(String[] args)
    {   double purPrice = 555.00;
        double salTax = 0.05;
        double taxTotal = purPrice * salTax;
        double totPrice = purPrice + taxTotal;
        System.out.println( "Your sales tax is $" + taxTotal + " and the total price including tax is $" + totPrice );

    }
}