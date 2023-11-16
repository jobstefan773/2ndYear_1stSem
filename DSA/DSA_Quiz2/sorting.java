public class sorting {
    public static void main (String[] args) {

        int[] data = {6, 99, 15, 86, 29, 76, 31, 69, 45, 58};

        display(data);
        bubble(data);
        display(data);

    }

    public static void insertion (int data[]) {
        int a, b, temp;

        for (a = 1; a < data.length; a++) {
            temp = data[a];

            for (b = a - 1; b >= 0; b--) {
                if (data[b] > temp) {
                    data[b + 1] = data[b];
                } else {
                    break;
                }
            }

            data [b + 1] = temp;
        }
    }

    public static void selection (int data[]) {
        int a, b, index_of_smallest, temp;

        for (a = 0; a < data.length - 1; a++) {
            index_of_smallest = a;
            for (b = a + 1; b < data.length; b++) {
                if (data[b] < data[index_of_smallest]) {
                    index_of_smallest = b;
                }
            }
            

            temp = data[a];
            data[a] = data[index_of_smallest];
            data[index_of_smallest] = temp;
        }
    }

    public static void bubble (int data[]) {
        int a, b, temp;

        for (a = 0; a < data.length - 1; a++) {
            for (b = data.length - 1; b > a; b--) {
                if (data[b - 1] > data[b]) {
                    temp = data[b];
                    data[b] = data[b-1];
                    data[b-1] = temp;
                }
            }
        }
    }

    public static void display (int data[]) {
        
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }

        System.out.println();
    }
}