public class HomeWork {
    public static double task1(List list) {
        int sum = 0;
        int listLength = 0;
        Node nodeTemp = list.getHead();

        while (nodeTemp != null) {
            sum += (int) nodeTemp.getValue();
            nodeTemp = nodeTemp.getNextNode();
            listLength ++;
        }
        return ((double) sum / listLength);
    }

    public static void task2(List list) {
        Node nodeTemp = list.getHead();

        while (nodeTemp.getNextNode() != null) {
            nodeTemp = nodeTemp.getNextNode();
        }
        list.push(nodeTemp.getValue(), 0);
        list.pop();
    }

    public static void task3(List list) {
        list.push(list.getHead().getValue());
        list.pop(0);
    }

    /*public static void task4(List list) {
        Node nodeTemp = list.getHead();
        Node nodeTemp1 = list.getHead();

        while (nodeTemp.getNextNode() != null) {
            nodeTemp = nodeTemp.getNextNode();
        }
        list.push(nodeTemp.getValue(), 0);
        list.pop(1);
        list.pop();
        list.push(nodeTemp1.getValue());
    }*/
    public static void task4 (List list) {
        Node nodeTmp = list.getHead();
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        list.push(nodeTmp.getValue(), 0);
        list.pop();
        list.push(list.getHead().getNextNode().getValue());
        list.pop(1);
    }

    public static int task5(List list) {
        Node nodeTemp = list.getHead();
        int counter = 0;
        while (nodeTemp != null) {
            if (Character.toLowerCase(nodeTemp.getValue().toString().charAt(0)) ==
                Character.toLowerCase(nodeTemp.getValue().toString().charAt(nodeTemp.getValue().toString().length() - 1))) {
                counter++;
            }
            nodeTemp = nodeTemp.getNextNode();
        }
        return counter;
    }

    public static boolean task6(List list) {
        Node nodeTmp = list.getHead();

        while (nodeTmp.getNextNode() != null) {
            if (Character.toLowerCase(nodeTmp.getValue().toString().charAt(nodeTmp.getValue().toString().length() - 1)) !=
                Character.toLowerCase(nodeTmp.getNextNode().getValue().toString().charAt(0))) {
                return false;
            }
            nodeTmp = nodeTmp.getNextNode();
        }
        return true;
    }

    public static int task7(List list, String value) {
            if (!value.equalsIgnoreCase("first") && !value.equalsIgnoreCase("last")) {
                return 0;
            }
            else {

            }
        return 0;
    }
}
