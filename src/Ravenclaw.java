public class Ravenclaw extends Hogwarts {

    private final int intelegi; // ум
    private final int wisdom; // мужрость
    private final int wit; // остроумие
    private final int creativity; //полны творчество

    public Ravenclaw(String name, int powerMagic, int powerTrangress,
                     int intelegi, int wisdom, int wit, int creativity) {
        super(name, powerMagic, powerTrangress);
        this.intelegi = intelegi;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelegi() {
        return intelegi;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getFullCreativity() {
        return creativity;
    }

    public void compareStident(Griffindor other) {
        if (this.sumPoints() < other.sumPoints()) {
            System.out.println("Сильнее студент " + other.getName());
        } else if (this.sumPoints() > other.sumPoints()) {
            System.out.println("Сильнее студент " + this.getName());
        } else System.out.printf("Студенты %s и %s равны по силе%n", getName(), other.getName());

    }

    public int sumPoints() {
        return intelegi + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return super.toString() + ", intelegi=" + intelegi +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
}
