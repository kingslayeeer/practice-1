public class TaskTwo {

    // a(0) = 1, a(1) = 2, a(n) = 3 * a(n - 1) - a(n - 2) для n >= 2
    static long a(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Ошибка: n должно быть >= 0, получено n = " + n);
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        return 3 * a(n - 1) - a(n - 2);
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 4; n++) {
            System.out.println("a(" + n + ") = " + a(n));  // 1, 2, 5, 13, 34
        }
    }
}
