public class HomeWork {
    public static double task1(List list) {
        int sum = 0;
        int listLength = 0;
        Node nodeTmp = list.getHead();

        while (nodeTmp != null) {
            sum += (int) nodeTmp.getValue();
            nodeTmp = nodeTmp.getNextNode();
            listLength ++;
        }

        return ((double) sum / listLength);
    }

    public static List task4(List list) {
        Node nodeTmp = list.getHead();
        Node nodeTmp1 = list.getHead();
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        list.push(nodeTmp.getValue(), 0);
        list.pop(1);
        list.pop();
        list.push(nodeTmp1.getValue());

        return list;
    }

    public static int task5(List list) {
        Node tmp = list.getHead();
        int counter = 0;
        while (tmp != null) {
            if (tmp.getValue().toString().charAt(0) ==
                    tmp.getValue().toString().charAt(tmp.getValue().toString().length() - 1)) {
                counter++;
            }
            tmp = tmp.getNextNode();
        }
        return counter;
    }
}
