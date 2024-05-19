public class Slytherin extends Hogwarts {
    private final int cunning; //хитрость
    private final int determination; //решительность
    private final int ambition; // амбициозность
    private final int resourcefulness; // находчивость
    private final int thirstPower; // жажда власти

    public Slytherin(String name, int powerMagic,
                     int powerTrangress, int cunning, int determination,
                     int ambition, int resourcefulness, int thirstPower) {
        super(name, powerMagic, powerTrangress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }
    public void compasionStident(Griffindor other) {
        if (this.sumPoints() < other.sumPoints()) {
            System.out.println("Сильнее студент " + other.getName());
        } else if (this.sumPoints() > other.sumPoints()) {
            System.out.println("Сильнее студент " + this.getName());
        } else System.out.printf("Студенты %s и %s равны по силе%n", getName(), other.getName());

    }

    public int sumPoints() {
        return cunning + determination + ambition + resourcefulness + thirstPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstPower=" + thirstPower;
    }
}

