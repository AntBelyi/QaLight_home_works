package java_lecture_7.first_examples;

public class SecondChildBook extends Book {

    public SecondChildBook(String name, String author) {
        super(name, author);
    }

    @Override
    public void read() {
        System.out.println("History of Ukraine is reading...");
    }

    @Override
    public void print() {
        System.out.println("Some data from book is printing...");
    }

}
