public class TaskThree {

    static void generateBrackets(
            String current, // текущая строка
            int opened,     // количество открытых скобок
            int closed,     // количество закрытых скобок
            int n           // количество пар
    ) {
        // Последовательность готова
        if (current.length() == 2 * n) {
            System.out.println(current);
            return;
        }
        // Открывающую можно добавить, если их ещё меньше n
        if (opened < n) {
            generateBrackets(current + "(", opened + 1, closed, n);
        }
        // Закрывающую — только если открытых больше, чем закрытых
        if (closed < opened) {
            generateBrackets(current + ")", opened, closed + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generateBrackets("", 0, 0, n);
    }
}
