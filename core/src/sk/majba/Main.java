package sk.majba;

public class Main {
    public static void main(String[] args) {
        Hrac fero = new Hrac("Fero", 1, new Atributy(5, 5, 1, 1, 1, 1));
        System.out.println(fero.toString());
        fero.levelUp(new Atributy(5, 5, 5, 1, 1, 1));
        System.out.println(fero.toString());

    }
}
