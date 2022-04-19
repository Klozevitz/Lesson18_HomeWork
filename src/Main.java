public class Main {
    public static void main(String[] args) {
        Object[] arrayTask1234 = new Object[] {12, 43, 100, 4, 24, 6, 63};
        String[] arrayOfStringsTask5 = {"tube", "youtube", "alabama", "africa",
                "antarctica", "arctica", "rambler"};

        System.out.println("Task1");
        List list1 = new List(arrayTask1234);                                   //Task1
        System.out.print("Среднее арифметическое элементов списка ");
        list1.printList();
        System.out.println(" - " + HomeWork.task1(list1) + "\n");

        System.out.println("Task2");
        List list2 = new List(arrayTask1234);                                   //Task2
        list2.printList();
        System.out.println();
        HomeWork.task2(list2);
        list2.printList();
        System.out.println("\n");

        System.out.println("Task3");
        List list3 = new List(arrayTask1234);                                   //Task3
        list3.printList();
        System.out.println();
        HomeWork.task3(list3);
        list3.printList();
        System.out.println("\n");

        System.out.println("Task4");
        List list4 = new List(arrayTask1234);                                   //Task4
        list4.printList();
        System.out.println();
        HomeWork.task4(list4);
        list4.printList();
        System.out.println("\n");

        System.out.println("Task5");                                            //Task5
        List list5 = new List(arrayOfStringsTask5);
        System.out.print("В массиве ");
        list5.printList();
        System.out.println(" " + HomeWork.task5(list5) + " слов начинаются и заканчиваются на одну букву.");

    }
}
