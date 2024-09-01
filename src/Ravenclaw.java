public class Ravenclaw extends Hogwarts {
    private short intelligence;
    private short wisdom;
    private short wit;
    private short creativity;

    @Override
    public void compareToHousemate(Hogwarts student) {
        compareWithHousemate((Ravenclaw) student);
    }

    public void compareWithHousemate(Ravenclaw student) {
        int thisStudentSum = this.intelligence + this.wisdom + this.wit + this.creativity;
        int otherStudentSum = student.intelligence + student.wisdom + student.wit + student.creativity;
        if (thisStudentSum > otherStudentSum) {
            System.out.println(String.join(" ", this.getName(), this.getSurname()) + " лучший когтевранец, чем " + String.join(" ", student.getName(), student.getSurname()));
        } else {
            System.out.println(String.join(" ", student.getName(), student.getSurname()) + " лучший когтевранец, чем " + String.join(" ", this.getName(), this.getSurname()));
        }
    }

    @Override
    public String toString() {
        return ".........Студент Когтеврана " + String.join(" ", getName(), getSurname()) + "........."
                + "\nМощь: " + getPower()
                + "\nРасстояние трансгрессии: " + getTDistance()
                + "\nУм: " + intelligence
                + "\nМудрость: " + wisdom
                + "\nОстроумие: " + wit
                + "\nКреативность: " + creativity;
    }

    public Ravenclaw(String name, String surname, short power, short tDistance,
                     short intelligence, short wisdom, short wit, short creativity) {
        super(name, surname, power, tDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public short getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(short intelligence) {
        this.intelligence = intelligence;
    }

    public short getWisdom() {
        return wisdom;
    }

    public void setWisdom(short wisdom) {
        this.wisdom = wisdom;
    }

    public short getWit() {
        return wit;
    }

    public void setWit(short wit) {
        this.wit = wit;
    }

    public short getCreativity() {
        return creativity;
    }

    public void setCreativity(short creativity) {
        this.creativity = creativity;
    }
}
