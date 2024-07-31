import java.util.Arrays;

public class SortDriver {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);
            quickSort(orders, pivotIndex + 1, high);
        }
    }


    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;


                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }



    public static void main(String[] args) {
        Order[] ordersB = {
                new Order(101, "Alice Smith", 250.75),
                new Order(102, "Bob Johnson", 150.50),
                new Order(103, "Charlie Brown", 350.00),
                new Order(104, "Daisy Miller", 100.25),
                new Order(105, "Eve Davis", 200.00)
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(ordersB));
        bubbleSort(ordersB);
        System.out.println("After Bubble Sorting:");
        System.out.println(Arrays.toString(ordersB));

        Order[] ordersQ = {
                new Order(101, "Alice Smith", 250.75),
                new Order(102, "Bob Johnson", 150.50),
                new Order(103, "Charlie Brown", 350.00),
                new Order(104, "Daisy Miller", 100.25),
                new Order(105, "Eve Davis", 200.00)
        };

        bubbleSort(ordersQ);
        System.out.println("After Quick Sorting:");
        System.out.println(Arrays.toString(ordersQ));

    }
}
