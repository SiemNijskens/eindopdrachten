public class Reeks {
    private int aantal;
    private boolean validInput = false;
    int i0 = 2;
    int i1 = 1;

    public void setAantal(int aantal) {
        if (aantal < 1) {
            System.out.println("dit getal is negatief \ngeef een ander getal op");
            validInput = false;
            return;
        }

        if (aantal > 45) {
            System.out.println("dit getal is te groot \ngeef een ander getal op");
            validInput = false;
            return;
        }

        validInput = true;
        this.aantal = aantal;
    }

    public int getAantal() {
        return aantal;
    }

    public boolean getValid() {
        return validInput;
    }

    public void preformCalc(int aantal) {
        int[] lucasreeks = new int[aantal];
        lucasreeks[0] = i0;
        lucasreeks[1] = i1;
        for (int i = 2; i < aantal; i++) {
            lucasreeks[i] = lucasreeks[(i - 1)] + lucasreeks[(i - 2)];
        }

        for (int i = 0; i < aantal; i++) {
            System.out.print(lucasreeks[i] + " ");
        }
    }
}