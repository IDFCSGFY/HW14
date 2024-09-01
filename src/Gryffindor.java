public class Gryffindor extends Hogwarts {
    private short nobility;
    private short honourability;
    private short bravery;

    @Override
    public void compareToHousemate(Hogwarts student) {
        compareWithHousemate((Gryffindor) student);
    }

    public void compareWithHousemate(Gryffindor student) {
        int thisStudentSum = this.nobility + this.honourability + this.bravery;
        int otherStudentSum = student.nobility + student.honourability + student.bravery;
        if (thisStudentSum > otherStudentSum) {
            System.out.println(String.join(" ", this.getName(), this.getSurname()) + " лучший гриффиндорец, чем " + String.join(" ", student.getName(), student.getSurname()));
        } else {
            System.out.println(String.join(" ", student.getName(), student.getSurname()) + " лучший гриффиндорец, чем " + String.join(" ", this.getName(), this.getSurname()));
        }
    }

    @Override
    public String toString() {
        return ".........Студент Гриффиндора " + String.join(" ", getName(), getSurname()) + "........."
                + "\nМощь: " + getPower()
                + "\nРасстояние трансгрессии: " + getTDistance()
                + "\nБлагородство: " + nobility
                + "\nЧесть: " + honourability
                + "\nХрабрость: " + bravery;
    }

    public Gryffindor(String name, String surname, short power, short tDistance,
                      short nobility, short honourability, short bravery) {
        super(name, surname, power, tDistance);
        this.nobility = nobility;
        this.honourability = honourability;
        this.bravery = bravery;
    }

    public short getNobility() {
        return nobility;
    }

    public void setNobility(short nobility) {
        this.nobility = nobility;
    }

    public short getHonourability() {
        return honourability;
    }

    public void setHonourability(short honourability) {
        this.honourability = honourability;
    }

    public short getBravery() {
        return bravery;
    }

    public void setBravery(short bravery) {
        this.bravery = bravery;
    }
}
