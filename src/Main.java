public class Main {
    public static void main(String[] args) {

        Griffindor potter = new Griffindor("Гарри Поттер", 12, 5, 11, 9, 8);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 10, 6, 8, 4, 7);

        Slytherin malko = new Slytherin("Драго Малфой", 9, 3, 8, 4, 10, 5, 9);
        Slytherin gremm = new Slytherin("Грэхэм Монтегю", 5, 5, 7, 3, 6, 3, 4);

        Hufflepuff sedric = new Hufflepuff("Седрик Диггори",8,6,10,9,12);

        System.out.println(potter);
        potter.compare_Hogwarts_Student(malko);
    }

}