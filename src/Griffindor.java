public class Griffindor extends Hogwarts {
    private final int nobility; // поле благородство
    private final int honor; // честь
    private final int bravery; // храбрость


    public Griffindor(String name, int powerMagic, int powerTrangress, int nobility, int honor, int bravery) {
        super(name, powerMagic, powerTrangress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void compareStident(Griffindor other) {
        if (this.sumPoints() < other.sumPoints()) {
            System.out.println("Сильнее студент " + other.getName());
        } else if (this.sumPoints() > other.sumPoints()) {
            System.out.println("Сильнее студент " + this.getName());
        } else System.out.printf("Студенты %s и %s равны по силе%n", getName(), other.getName());

    }
    public int sumPoints() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;

    }
}

