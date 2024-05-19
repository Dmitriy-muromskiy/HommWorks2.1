public abstract class Hogwarts {
    private final String name;
    private final int powerMagic;
    private final int powerTrangress;

    public Hogwarts(String name, int powerMagic, int powerTrangress) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.powerTrangress = powerTrangress;
    }

    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getPowerTrangress() {
        return powerTrangress;
    }
    public void compare_Hogwarts_Student(Hogwarts other) {
        if (this.sumPoints() < other.sumPoints()) {
            System.out.println("Сильнее студент " + other.getName());
        } else if (this.sumPoints() > other.sumPoints()) {
            System.out.println("Сильнее студент " + this.getName());
        } else {
            System.out.printf("Студенты %s и %s равны по силе%n", getName(), other.getName());
        }

    }

    private int sumPoints() {
        return powerMagic + powerTrangress;

    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", powerMagic=" + powerMagic +
                ", powerTrangress=" + powerTrangress;
    }
}
