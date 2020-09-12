package Sergo.Lisens.AllVideo;

public class Multidimension_Arrays {
    public static void main(String[] args) {
        int[][] i = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        for (int j = 0; j < i.length; j++) {
            for (int k = 0; k < i[j].length ; k++) {
                System.out.print(i[j][k] + " ");
            }
            System.out.println();
        }
    }
}
