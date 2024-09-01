public class Hufflepuff extends Hogwarts {
    private short hardWorking;
    private short loyalty;
    private short honesty;

    @Override
    public void compareToHousemate(Hogwarts student) {
        compareWithHousemate((Hufflepuff) student);
    }

    public void compareWithHousemate(Hufflepuff student) {
        int thisStudentSum = this.hardWorking + this.loyalty + this.honesty;
        int otherStudentSum = student.hardWorking + student.loyalty + student.honesty;
        if (thisStudentSum > otherStudentSum) {
            System.out.println(String.join(" ", this.getName(), this.getSurname()) + " лучший пуффендуец, чем " + String.join(" ", student.getName(), student.getSurname()));
        } else {
            System.out.println(String.join(" ", student.getName(), student.getSurname()) + " лучший пуффендуец, чем " + String.join(" ", this.getName(), this.getSurname()));
        }
    }

    @Override
    public String toString() {
        return ".........Студент Пуффендуя " + String.join(" ", getName(), getSurname()) + "........."
                + "\nМощь: " + getPower()
                + "\nРасстояние трансгрессии: " + getTDistance()
                + "\nТрудолюбие: " + hardWorking
                + "\nВерность: " + loyalty
                + "\nЧестность: " + honesty;
    }

    public Hufflepuff(String name, String surname, short power, short tDistance,
                      short hardWorking, short loyalty, short honesty) {
        super(name, surname, power, tDistance);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public short getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(short hardWorking) {
        this.hardWorking = hardWorking;
    }

    public short getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(short loyalty) {
        this.loyalty = loyalty;
    }

    public short getHonesty() {
        return honesty;
    }

    public void setHonesty(short honesty) {
        this.honesty = honesty;
    }
}
