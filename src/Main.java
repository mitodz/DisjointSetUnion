import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("5 5\n" +
                "1 1 1 1 1\n" +
                "3 5\n" +
                "2 4\n" +
                "1 4\n" +
                "5 4\n" +
                "5 3");
        int n = scanner.nextInt(); //количество таблиц
        int m = scanner.nextInt(); //количество запросов
        Table t = new Table();
        for (int i = 0; i < n; i++) {
           t.makeSet(scanner.nextInt());
        }
        System.out.println();
    }
}
