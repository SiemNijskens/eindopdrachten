import java.util.Scanner;

public class EindopdrachtWeek5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your word or sentence");
        String sentence = scanner.nextLine();
        boolean isPalindrome = palindromeChecker(sentence);
        String textZonderSpatie = sentence.replaceAll("\\s", "");
        int aantalKarakters = textZonderSpatie.length();
        int aantalKlinkers =klinkerChecker(sentence);
        int aantalWoorden = woordenChecker(sentence);

        System.out.println("het aantal karakters is " + aantalKarakters);
        System.out.println("het aantal woorden is " + aantalWoorden);
        System.out.println("het aantal klinkers is " + aantalKlinkers);
        System.out.println("zou het een palindroom zijn " + isPalindrome);

        karakterTeller(sentence);

/*      v Print het aantal karakters
        Print het aantal woorden dat in de invoer zat
        v Print het aantal klinkers (a, e, i, o, u, y)

        v Bepaal of de invoer een palindroom is
        Maak een staafdiagram dat weergeeft hoe vaak een bepaalde karakters gezien zijn.*/

    }

    public static boolean palindromeChecker(String text) {
        String textZonderSpatie = text.replaceAll("\\s", "");
        boolean isPalindrome = false;
        String textZonderSpatieOmgedraaid = "";
        for (int i = 0; i < textZonderSpatie.length(); i++) {
            textZonderSpatieOmgedraaid += textZonderSpatie.charAt((textZonderSpatie.length() - i) - 1);
        }

        if (textZonderSpatieOmgedraaid.equalsIgnoreCase(textZonderSpatie)) {
            // System.out.println("het is een palindroom");
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static int klinkerChecker(String text) {
        String lowercaseText = text.toLowerCase();
        String klinkers = "aeiouy";
        int count=0;
        for (int i = 0; i < lowercaseText.length(); i++) {
            if (klinkers.contains("" + lowercaseText.charAt(i)))
            {
                count+=1;
            }
        }
        return count;

    }
    public static int woordenChecker(String text){
        int count = text.length() - text.replaceAll(" ", "").length();
        return (count +1);

    }
    public static void karakterTeller (String text){
        int length = text.length();
        String alfabet = "abcdeftghijklmnopqrstuvwxyz 0123456789";
        int lengthref = alfabet.length();

        for (int i = 0 ; i<lengthref; i++){
            System.out.print(alfabet.charAt(i) + " | ");
            for (int j = 0 ; j<length ; j++){
                if (text.charAt(j) == alfabet.charAt(i)){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}