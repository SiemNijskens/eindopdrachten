import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] woordarray = getInput("woord");

        int length = woordarray.length;
        for (int j = 0; j < 50; ++j) {
            System.out.println();
        }
        char[] blanco = new char[length];

        Arrays.fill(blanco, '#');

        int countdown = 0;

        do {
            char gokje = guessInput('g');
            int check = 0;

            //hij lust door de woordarray met het char van gokje om zo te checken of de letter erin zit. zo ja overschrijft
            //hij die plek van de array blanco met de char in gokje en zet ie de integer check op 1
            for (int i = 0; i <= length - 1; i++) {
                if (woordarray[i] == gokje) {
                    blanco[i] = gokje;
                    check = 1;
                }
            }
            // als de integer check hoger is dan 0 heb je goed geraden en gaat de countdown niet omhoog
            if (check > 0) {
                System.out.println("Goed geraden");
                System.out.println(blanco);
                // anders gaat de countdown wel omhoog en krijg je te zien hoevaar je nog mag gokken
            } else {
                System.out.println("helaas niet goed geraden");
                countdown++;

                System.out.println(blanco);
                System.out.println("Je mag nog " + (10 - countdown) + " keer gokken");
            }

        }
        while (!Arrays.equals(blanco, woordarray) && countdown < 10);

        if (Arrays.equals(blanco, woordarray)) {
            System.out.println("Gefeliciteerd je hebt gewonnen");
        } else if (countdown >= 10) {
            System.out.println("Helaas je hangt");
        }


        //}
        /*maak 2 arrays met chars erin
         * verglijk de raad array met de woord array
         * als een char het zelfde is overwrite de raad array met die char op dezelfde plek
         * geef ook een melding dat er goed geraden is
         * als er niet goed geraden is gaat er een counter omhoog
         * al geraden letters array maken
         *
         * */
    }


    static private char[] getInput(String naam) {
        System.out.println("Wat is het galgje woord?");
        Scanner scanner = new Scanner(System.in);
        String woord = scanner.nextLine();
        char[] woordarray = woord.toCharArray();
        return woordarray;
    }

    static private char guessInput(char naam) {
        System.out.println("Welke letter wil je gokken?");
        Scanner scanner = new Scanner(System.in);
        char gok = scanner.next().charAt(0);
        return gok;
    }
}