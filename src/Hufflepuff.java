public class Hufflepuff extends Hogwarts {

    private final int hardWork; // трудолюбие
    private final int loyalty; // верность
    private final int honesty; // честность

    public Hufflepuff(String name, int powerMagic, int powerTrangress, int hardWork, int loyalty, int honesty) {
        super(name, powerMagic, powerTrangress);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    public void compareStident(Hufflepuff other) {
        if (this.sumPoints() < other.sumPoints()) {
            System.out.println("Сильнее студент " + other.getName());
        } else if (this.sumPoints() > other.sumPoints()) {
            System.out.println("Сильнее студент " + this.getName());
        } else System.out.printf("Студенты %s и %s равны по силе%n", getName(), other.getName());

    }

    public int sumPoints() {
        return hardWork + loyalty + honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;

    }
}
