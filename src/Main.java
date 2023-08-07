import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Notebook> set = new HashSet<>();
        Notebook notebook1 = new Notebook("Lenovo1", 8, 512, "Windows 10", "Black");
        Notebook notebook2 = new Notebook("Lenovo2", 12, 1024, "Windows 10", "White");
        Notebook notebook3 = new Notebook("MSI1", 16, 1024, "Windows 10", "Black");
        Notebook notebook4 = new Notebook("MSI2", 32, 2048, "Windows 10", "Red");
        Notebook notebook5 = new Notebook("HP1", 2, 128, "Windows 7", "White");
        Notebook notebook6 = new Notebook("HP2", 4, 256, "Windows 7", "Blue");
        set.add(notebook1);
        set.add(notebook2);
        set.add(notebook3);
        set.add(notebook4);
        set.add(notebook5);
        set.add(notebook6);
        String findColor = "a";
        String findOC = "a";
        int findOzu = 0;
        int findDisk = 0;
        int num = ask();
        Scanner scanner = new Scanner(System.in);
        while (num != 6) {
//
            if (num == 1) {
                System.out.print("Введите желаемое ОЗУ в гб от 2 до 32: ");
                findOzu = scanner.nextInt();
                num = ask();
            }
            if (num == 2) {
                System.out.print("Введите желаемый Объём в гб от 128 до 2048: ");
                findDisk = scanner.nextInt();
                num = ask();
            }
            if (num == 3) {
                System.out.print("""
                        Введите желаемую ОС :
                        7 - Windows 7
                        10 - Windows 10\s""");
                int answer = scanner.nextInt();
                if (answer == 7) {
                    findOC = "Windows 7";
                }
                if (answer == 10) {
                    findOC = "Windows 10";
                }
                num = ask();
            }
            if (num == 4) {
                System.out.print("""
                        Введите желаемый цвет:\s
                        1 - Black
                        2 - White
                        3 - Red
                        4 - Blue""");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    findColor = "Black";
                }
                if (answer == 2) {
                    findColor = "White";
                }
                if (answer == 3) {
                    findColor = "Red";
                }
                if (answer == 4) {
                    findColor = "Blue";
                }
                num = ask();
            }
            if (num == 5) {
                for (Notebook notebook : set) {
                    System.out.println(notebook);
                }
                num = ask();
            }

        }
        List<Notebook> res = new ArrayList<>();
        for (Notebook notebook : set) {
            if (((notebook.op.equals(findOC)|findOC.equals("a"))
                    && (notebook.disk >= findDisk)
                    && (notebook.ozu >= findOzu))
                    && (notebook.color.equals(findColor)|findColor.equals("a"))) {

                res.add(notebook);
            }

        }
        for (Notebook notebook : res) {
            System.out.println(notebook);
        }
    }




    private static Integer ask() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("""
                1 - ОЗУ
                2 - Объем ЖД
                3 - Операционная система
                4 - Цвет
                5 - Показать все ноутбуки
                6 - Показать подходящие ноубуки:\s
                Введите цифру, соответствующую необходимому критерию:""");
        return scanner.nextInt();
    }

}