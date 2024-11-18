import java.util.Scanner;

public class EindopdrachtWeek2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal;
        do {
            System.out.println("Geef een geheel positief getal");
            getal = scanner.nextInt();
        } while (getal < 1);

        int somEvenGetallen = 0;
        int somOnevenGetallen = 0;

        for (int i = 0; i <= (getal); i = i + 2) {
            somEvenGetallen += i;
        }
        for (int j = 1; j <= (getal); j = j + 2) {
            somOnevenGetallen += j;
        }

        System.out.println("De som van de even getallen tot en met " + getal + " is " + somEvenGetallen);
        System.out.println("De som van de oneven getallen tot en met " + getal + " is " + somOnevenGetallen);

        System.out.println("het verschil tussen de twee sommen is " + (somEvenGetallen - somOnevenGetallen));
    }
}