package taskList;

import java.util.Scanner;

public class ArrayListTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        printOut();
        int indexTask = scanner.nextInt();

        while (indexTask != 0) {
            switch (indexTask) {
                case 1: //+
                    System.out.println("ДОБАВЛЕНИЕ ЗАДАЧИ В СПИСОК");
                    System.out.print("Добавить задачу: ");
                    scanner.nextLine();
                    String task = scanner.nextLine();
                    list.addToList(task);
                    System.out.print("Enter number [0-6]: ");
                    indexTask = scanner.nextInt();
                    break;

                case 2: //+- Можно добавить только в ту размерность списка которая у нас есть
                    System.out.println("ДОБАВЛЕНИЕ ЗАДАЧИ ПО ИНДЕКСУ");
                    System.out.print("Введите индекс задачи: ");
                    scanner.nextLine();
                    int i = scanner.nextInt();
                    System.out.print("Добавить задачу: ");
                    scanner.nextLine();
                    String task1 = scanner.nextLine();
                    list.addToListPosition(i, task1);
                    System.out.print("Enter number [0-6]: ");
                    indexTask = scanner.nextInt();
                    break;

                case 3://+
                    System.out.println("НА ДАННЫЙ МОМЕНТ ЭТО ВАШ СПИСОК ЗАДАЧ");
                    list.printToDoList();
                    System.out.print("Enter number [0-6]: ");
                    indexTask = scanner.nextInt();
                    break;

                case 4://+
                    System.out.println("ИЗМЕНЕНИЕ СТАРОЙ ЗАДАЧИ НА НОВУЮ ПО ИНДЕКСУ");
                    System.out.print("Введите индекс задачи: ");
                    scanner.nextLine();
                    int i1 = scanner.nextInt();
                    System.out.print("Новая задача: ");
                    scanner.nextLine();
                    String task2 = scanner.nextLine();
                    list.changeTask(i1, task2);
                    System.out.print("Enter number [0-6]: ");
                    indexTask = scanner.nextInt();
                    break;

                case 5://+ Отследить ошибку если пользовательв API вводит индекс а не саму задачу
                    System.out.println("УДАЛЕНИЕ ЗАДАЧИ ИЗ СПИСКА");
                    System.out.print("Введите задачу, которую хотите удалить: ");
                    scanner.nextLine();
                    String task3 = scanner.nextLine();
                    list.removeTask(task3);
                    System.out.print("Enter number [0-6]: ");
                    indexTask = scanner.nextInt();
                    break;

                case 6://+
                    System.out.println("СДЕЛАТЬ ЗАДАЧУ ПРИОРИТЕТНОЙ");
                    System.out.print("Какую задачу сделаем приоритетной: ");
                    scanner.nextLine();
                    String task4 = scanner.nextLine();
                    list.getTaskPriority(task4);
                    System.out.print("Enter number [0-6]: ");
                    indexTask = scanner.nextInt();
                    break;

                default:
                    printOut();
            }
        }

    }

    private static void printOut() {
        System.out.print("Please choose an action. Press:\n"
                + "1 - to add a new item into ToDoList (добавить новый элемент в ToDoList)\n"
                + "2 - to add a new item at specific position (чтобы добавить новый элемент в определенное место)\n"
                + "3 - to print out the list (распечатать список) \n"
                + "4 - to update an existing item (обновить существующий элемент)\n"
                + "5 - to remove an item form the list (удалить элемент из списка)"
                + "6 - to get task priority or number in the list (получить приоритет задачи или номер в списке)\n"
                + "press 0 for exit\n\n"
                + "AFTER CHOOSING AN OPTION PLEASE PRESS ENTER\n\n"
                + "Please press number [0-6]: ");
    }
}
