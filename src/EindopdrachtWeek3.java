import java.util.Scanner;

public class EindopdrachtWeek3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Reeks Lucas = new Reeks();

        System.out.println("geef een natuurlijk getal op");
        do {Lucas.setAantal(scanner.nextInt());
        }
        while (!(Lucas.getValid()));

        Lucas.preformCalc(Lucas.getAantal());
    }
}
