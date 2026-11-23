public class TaskOne {

    // НОД по алгоритму Евклида: gcd(a, 0) = a; gcd(a, b) = gcd(b, a % b)
    static int gcd(int a, int b) {
        if (a <= 0 || b < 0) {
            throw new IllegalArgumentException(
                    "Ошибка: должно быть a > 0 и b >= 0, получено a = " + a + ", b = " + b);
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("gcd(12, 8) = " + gcd(12, 8));   // 4
        System.out.println("gcd(17, 5) = " + gcd(17, 5));   // 1
        System.out.println("gcd(21, 7) = " + gcd(21, 7));   // 7
        System.out.println("gcd(9, 0) = " + gcd(9, 0));     // 9

        try {
            gcd(0, 5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
