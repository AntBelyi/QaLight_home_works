package java_lecture_2;

public class LogicalOperators {

    public static void main(String[] args) {
        boolean firstResult = 7 > 3;
        boolean secondResult = 10 < 9;
        boolean thirdResult = 6 >= 6;
        boolean a = 7 < 7;
        boolean b = 10 == 11;

        boolean c = true && true;
        boolean d = true && false;
        boolean e = false && true;
        boolean f = 7 > 6 && 2 < 3;
        boolean g = 4 == 4 && 2 > 3;
        boolean h = 2 > 9 && 3 == 3;
        boolean i = 7 > 4 && 2 == 2 && 3 > 0 && false;

        boolean j = true || true;
        boolean k = false || false;
        boolean l = false || true;
        boolean p = 2 < 0 || 5 > 9 || 5 > 5 || 3 > 1;

        boolean q = !true;
        boolean z = !false;
        boolean m = 4 != 4;

        System.out.println(q);
        System.out.println(z);
        System.out.println(m);
    }

}
