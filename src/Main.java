import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("6 5\n" +
                "1 1 1 1 1 1\n" +
                "2 4\n" +
                "5 2\n" +
                "3 1\n" +
                "2 3\n" +
                "2 6");
        int n = scanner.nextInt(); //количество таблиц
        int m = scanner.nextInt(); //количество запросов
        Table t = new Table(n);
        for (int i = 1; i <= n; i++) {
            int temp = scanner.nextInt();
            if (temp > t.getMaxTable()) {
                t.setMaxTable(temp);
            }
            t.setRank(i,temp);
        }
        for (int j = 0; j < m; j++) {
            t.union(scanner.nextInt(),scanner.nextInt());
            System.out.println(t.getMaxTable());
        }
    }
}
