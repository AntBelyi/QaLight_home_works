package java_lecture_7.default_methods_exampels;

public interface Calculatable {

    default int sum(int a, int b) {
        return sumAll(a, b);
    }

    default int sum(int a, int b, int c) {
        return sumAll(a, b, c);
    }

    private int sumAll(int... values) {
        int result = 0;
        for(int digit : values) {
            result += digit;
        }
        return result;
    }

}
