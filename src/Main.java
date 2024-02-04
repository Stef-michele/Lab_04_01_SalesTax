public class Main
{
    public static void main(String[] args)
    {   //declaring variables
        double purPrice = 555.00;
        double salTax = 0.05;
        double taxTotal = 0.0;
        double totPrice = 0.0;
        //calculating tax amount and total price
        taxTotal = purPrice * salTax;
        totPrice = purPrice + taxTotal;
        //output tax amount and total price
        System.out.println( "Your sales tax is $" + taxTotal + " and the total price including tax is $" + totPrice );

    }
}