package EindopdrachtWeek6;

public class Queueclass {
    public static void main(String[] args) {
        EindopdrachtWeek6 wachtrij = new EindopdrachtWeek6();

        wachtrij.numbers[0] = 1;
        wachtrij.numbers[1] = 2;
        wachtrij.numbers[2] = 3;
        wachtrij.numbers[3] = 4;
        wachtrij.numbers[4] = 2;
        wachtrij.numbers[5] = 6;

        EindopdrachtWeek6 wachtrij2 = new EindopdrachtWeek6();

        wachtrij2.numbers[0] = 1;
        wachtrij2.numbers[1] = 2;
        wachtrij2.numbers[2] = 3;
        wachtrij2.numbers[3] = 4;
        wachtrij2.numbers[4] = 2;
        wachtrij2.numbers[5] = 6;

        //wachtrij.print();


        wachtrij.add(7);

        //System.out.println();
        wachtrij.print();

        //wachtrij.clear(3);
        //wachtrij.remove(2);

        //System.out.println();
        //wachtrij.print();

        //wachtrij.printReverse();
        //wachtrij.jumpTheQueue(3,8);

        System.out.println(wachtrij2.equals(wachtrij));

        System.out.println(wachtrij.indexOf(2));

        System.out.println();

        System.out.println(wachtrij.lastIndexOf(2));

        System.out.println();

        wachtrij.print();


        //System.out.println(wachtrij.numbers.length);
        //System.out.println(wachtrij.isEmpty());

    }
}
