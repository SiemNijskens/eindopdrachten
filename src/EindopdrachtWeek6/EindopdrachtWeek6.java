package EindopdrachtWeek6;

import java.util.Arrays;

public class EindopdrachtWeek6 implements Queue {
    public int[] numbers = new int[6];

    public void add(int value) {
        for (int i = 0; i < (size() - 1); i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[size() - 1] = value;
    }

    // verwijder een item uit de FIFO queue
    public int remove(int index) {
        int removednumber = numbers[index];
        for (int i = index; i < (size() - 1); i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers = Arrays.copyOf(numbers, (numbers.length - 1));
        return removednumber;
    }

    // geef het eerste item in de FIFO queue terug, maar haal het er niet uit
    public int peek() {
        return (numbers[0]);
    }

    // geef aan of de FIFO queue leeg is
    public boolean isEmpty() {
        if ((numbers.length) < 1) {
            return true;
        } else {
            return false;
        }
    }

    // geef de lengte van de FIFO queue terug
    public int size() {
        return numbers.length;
    }

    // verwijder alle items uit de FIFO queue
    public void clear() {
        int[] numbers = new int[0];
    }

    // verwijder de eerste n items uit de FIFO queue
    public void clear(int n) {
        int[] numbers2 = new int[size() - n];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = numbers[i + n];
        }
        numbers = numbers2;
    }

    // print de inhoud van de FIFO queue in omgekeerde volgorde
    public void printReverse() {
        for (int i = size() - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }
        System.out.println(" ");
    }

    // plaats een element op een bepaalde positie in de FIFO queue
    public void jumpTheQueue(int n, int value) {
        int[] numbers2 = new int[size() + 1];
        for (int i = 0; i < n; i++) {
            numbers2[i] = numbers[i];
        }
        numbers2[n] = value;
        for (int i = n + 1; i < size() + 1; i++) {
            numbers2[i] = numbers[i - 1];
        }
        numbers = numbers2;
    }

    // Zet de FIFO queue om naar een String
    public String toString() {
        return Arrays.toString(numbers);
    }

    // Kijk of de FIFO queue gelijk is aan een andere FIFO queue
    public boolean equals(Queue q) {
        int check = 0;
        if (size() == q.size()) {
            for (int i = 0; i < size(); i++) {
                if (!(numbers[i] == q.valueOf(i))) {
                    check = 2;
                }
            }
            if (check == 0) {
                return true;
            } else return false;
        } else {

            return false;
        }
    }

    // Bepaal de index van een bepaalde waarde in de FIFO queue
    public int indexOf(int value) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (numbers[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    // bepaal de laatste index van een bepaalde waarde in de FIFO queue
    public int lastIndexOf(int value){
            int index = -1;
            for (int i = 0; i < size(); i++) {
                if (numbers[i] == value) {
                    index = i;
                }
            }
            return index;
    }

    public int valueOf(int index) {
        return numbers[index];
    }

    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.print(numbers[i]);
        }
        System.out.println();
    }
}