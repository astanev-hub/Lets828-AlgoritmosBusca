import example.BubbleSort;

import javax.swing.*;
import java.util.Arrays;

public class OrdenacaoApplication {
    public static void main(String[] args) {

        int arr[] = {2,30,1,10,76,66};

        long start = System.currentTimeMillis();

        BubbleSort.bubbleSort(arr);
        long stop = System.currentTimeMillis();
        System.out.println("Tempo: " + (stop - start));


        int arr2[] = {2,30,1,10,76,66};
        long start2 = System.currentTimeMillis();
        BubbleSort.oyamaSort(arr2);

        long stop2 = System.currentTimeMillis();
        System.out.println("Tempo: " + (stop2 - start2));

        System.out.println(Arrays.toString(arr));
    }
}
