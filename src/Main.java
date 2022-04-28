public class Main {
    public static void main(String[] args) {

        // Задание 1
        int[] weight = new int[]{1, 2, 3};
        double[] t = {1.57, 7.654, 9.986};
        int[] u = {5, 473, 777, 55};

        //Задание 2
        for (int i = 0; i < weight.length; i++) {
            if (i < weight.length - 1) {
                System.out.print(weight[i] + ", ");
            } else {
                System.out.println(weight[i]);
            }
        }
        for (int j = 0; j < t.length; j++){
            if (j < t.length - 1) {
                System.out.print(t[j] + ", ");
            } else {
                System.out.println(t[j]);
            }
        }
        for (int k = 0; k < u.length; k++){
            if (k < u.length - 1) {
                System.out.print(u[k] + ", ");
            } else {
                System.out.println(u[k]);
            }
        }

        // Задание 3
        for (int l = weight.length; l > 0; l--) {
            if(l > 1) {
                System.out.print(weight[l - 1] + ", ");
            } else {
                System.out.println(weight[l - 1]);
            }
        }
        for (int v = t.length; v > 0; v--) {
            if(v > 1) {
                System.out.print(t[v - 1] + ", ");
            } else {
                System.out.println(t[v - 1]);
            }
        }
        for (int m = u.length; m > 0; m--) {
            if (m > 1) {
                System.out.print(u[m - 1] + ", ");
            } else {
                System.out.println(u[m - 1]);
            }
        }

        // Задание 4
        for (int e = 0; e < weight.length; e++) {
            if (weight[e] % 2 != 0) {
                System.out.println(weight[e] + 1);
            } else {
                System.out.println(weight[e]);
            }
        }
    }
}