public class midweekopdrachtweek3 {
    public static void main (String [] args) {


        int exponent = exponent(3, 3);
        System.out.println(exponent);


    /* Opdracht:
    Schrijf een methode genaamd exponent(int base, int exp)
    die een int waarde teruggeeft tot de macht van exp.





    Opdracht:
    Schrijf een booleaanse methode met de naam isOdd() in een klasse met de naam OddEvenTest,
    die een int als invoer neemt en true retourneert als deze oneven is.
    */
    }
    public static int exponent(int base, int exp){
        return (int) Math.pow(base, exp);
    }
}