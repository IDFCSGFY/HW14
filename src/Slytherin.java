public class Slytherin extends Hogwarts {
    private short slyness;
    private short determination;
    private short ambitions;
    private short lustForPower;

    @Override
    public void compareToHousemate(Hogwarts student) {
        compareWithHousemate((Slytherin) student);
    }

    public void compareWithHousemate(Slytherin student) {
        int thisStudentSum = this.slyness + this.determination + this.ambitions + this.lustForPower;
        int otherStudentSum = student.slyness + student.determination + student.ambitions + student.lustForPower;
        if (thisStudentSum > otherStudentSum) {
            System.out.println(String.join(" ", this.getName(), this.getSurname()) + " лучший слизеринец, чем " + String.join(" ", student.getName(), student.getSurname()));
        } else {
            System.out.println(String.join(" ", student.getName(), student.getSurname()) + " лучший слизеринец, чем " + String.join(" ", this.getName(), this.getSurname()));
        }
    }

    @Override
    public String toString() {
        return ".........Студент Слизерина " + String.join(" ", getName(), getSurname()) + "........."
                + "\nМощь: " + getPower()
                + "\nРасстояние трансгрессии: " + getTDistance()
                + "\nХитрость: " + slyness
                + "\nРешительность: " + determination
                + "\nАмбициозность: " + ambitions
                + "\nЖажда власти: " + lustForPower;
    }

    public Slytherin(String name, String surname, short power, short tDistance,
                     short slyness, short determination, short ambitions, short lustForPower) {
        super(name, surname, power, tDistance);
        this.slyness = slyness;
        this.determination = determination;
        this.ambitions = ambitions;
        this.lustForPower = lustForPower;
    }

    public short getSlyness() {
        return slyness;
    }

    public void setSlyness(short slyness) {
        this.slyness = slyness;
    }

    public short getDetermination() {
        return determination;
    }

    public void setDetermination(short determination) {
        this.determination = determination;
    }

    public short getAmbitions() {
        return ambitions;
    }

    public void setAmbitions(short ambitions) {
        this.ambitions = ambitions;
    }

    public short getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(short lustForPower) {
        this.lustForPower = lustForPower;
    }
}
