import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Hogwarts[] students = {
                new Gryffindor("Гарри", "Поттер", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Gryffindor("Гермиона", "Грейнджер", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Gryffindor("Рон", "Уизли", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Slytherin("Драко", "Малфой", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Slytherin("Грэхэм", "Монтегю", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Slytherin("Грегори", "Гойл", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Hufflepuff("Захария", "Смит", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Hufflepuff("Седрик", "Диггори", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Hufflepuff("Джастин", "Финч-Флетчли", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Ravenclaw("Чжоу", "Чанг", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Ravenclaw("Падма", "Патил", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
                new Ravenclaw("Маркус", "Белби", (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100), (short) rand.nextInt(100)),
        };

        for (Hogwarts student : students) {
            System.out.println();
            System.out.println(student);
            System.out.println();
        }

        students[0].compareToHogwartsStudent(students[1]);
        students[10].compareToHogwartsStudent(students[11]);
        students[0].compareToHousemate(students[1]);
        students[10].compareToHousemate(students[11]);

//        Gryffindor harry = (Gryffindor) students[0];
//        Gryffindor hermione = (Gryffindor) students[1];
//        Gryffindor ron = (Gryffindor) students[2];
//        Slytherin draco = (Slytherin) students[3];
//        Slytherin graham = (Slytherin) students[4];
//        Slytherin gregory = (Slytherin) students[5];
//        Hufflepuff zacharias = (Hufflepuff) students[6];
//        Hufflepuff cedric = (Hufflepuff) students[7];
//        Hufflepuff justin = (Hufflepuff) students[8];
//        Ravenclaw cho = (Ravenclaw) students[9];
//        Ravenclaw padma = (Ravenclaw) students[10];
//        Ravenclaw marcus = (Ravenclaw) students[11];
//
//        harry.compareWithHousemate(hermione);
//        draco.compareWithHousemate(graham);
//        zacharias.compareWithHousemate(cedric);
//        cho.compareWithHousemate(padma);
    }
}
