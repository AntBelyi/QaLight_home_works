package java_lecture_8;

public class Student extends Person {

    private int cardId;

    public Student(String name, String surname, int cardId) {
        super(name, surname);
        this.cardId = cardId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cardId=" + cardId +
                '}';
    }
}
