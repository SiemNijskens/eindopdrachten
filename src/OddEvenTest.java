public class OddEvenTest {

    public static void main(String[] args) {
        System.out.println(isOdd(3));
    }

    public static boolean isOdd(int getal){
        if (getal%2 == 0){
            return false;
        }else {return true;}
    }


/*    Opdracht:
    Schrijf een booleaanse methode met de naam isOdd() in een klasse met de naam OddEvenTest,
    die een int als invoer neemt en true retourneert als deze oneven is.
    */
}
