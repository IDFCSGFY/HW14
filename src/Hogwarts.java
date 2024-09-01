public abstract class Hogwarts {
    private String name;
    private String surname;
    private short power;
    private short tDistance;

    public void compareToHogwartsStudent(Hogwarts student) {
        if (this.power > student.power) {
            System.out.println(String.join(" ", this.name, this.surname) + " обладает большей мощью, чем " + String.join(" ", student.name, student.surname));
        } else {
            System.out.println(String.join(" ", student.name, student.surname) + " обладает большей мощью, чем " + String.join(" ", this.name, this.surname));
        }
        if (this.tDistance > student.tDistance) {
            System.out.println(String.join(" ", this.name, this.surname) + " обладает большим расстоянием трансгрессии, чем " + String.join(" ", student.name, student.surname));
        } else {
            System.out.println(String.join(" ", student.name, student.surname) + " обладает большим расстояние трансгрессии, чем " + String.join(" ", this.name, this.surname));
        }
    }

    //абстракция в классе Хогвартс нужна для сравнения учеников по факультативным характеристикам не вытаскивая их из массива типа Хогвартс в main'е
    public abstract void compareToHousemate(Hogwarts student);

    public Hogwarts(String name, String surname, short power, short tDistance) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.tDistance = tDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getPower() {
        return power;
    }

    public void setPower(short power) {
        this.power = power;
    }

    public short getTDistance() {
        return tDistance;
    }

    public void settDistance(short tDistance) {
        this.tDistance = tDistance;
    }
}
