package challenges.week_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayMerge {
    private int[] array1;
    private int[] array2;
    private int[] arrayCombined;

    public ArrayMerge(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public int[] CombinedArray(){

        int lengthOfArray = array1.length + array2.length;
        this.arrayCombined = new int[lengthOfArray];
        for (int i = 0; i < array1.length; i++) {
            arrayCombined[i] = array1[i];
        }
        for (int i = array1.length; i < array1.length + array2.length; i++) {
            arrayCombined[i] = array2[i - array2.length];
        }
        return arrayCombined;
    }
    public int[] AccendingOrder(){
        int temporaryHolder;

        for (int j = 0; j < arrayCombined.length - 1; j++) {
            for (int i = 0; i < arrayCombined.length - 1; i++) {
                if (arrayCombined[i] > arrayCombined[i + 1]) {
                    temporaryHolder = arrayCombined[i] ;
                    arrayCombined[i] = arrayCombined[i+1];
                    arrayCombined[i+1] = temporaryHolder;
                }
            }
        }
        return arrayCombined;
    }
    public int[] DescendingOrder(){
        int temporaryHolder;

        for (int j = 0; j < arrayCombined.length - 1; j++) {
            for (int i = 0; i < arrayCombined.length - 1; i++) {
                if (arrayCombined[i] < arrayCombined[i + 1]) {
                    temporaryHolder = arrayCombined[i] ;
                    arrayCombined[i] = arrayCombined[i+1];
                    arrayCombined[i+1] = temporaryHolder;
                }
            }
        }
        return arrayCombined;
    }
    public int[] DuplicateRemover(){
        HashSet<Integer> remover = new HashSet<>();
        for (int i = 0; i <arrayCombined.length; i++) {
            remover.add(arrayCombined[i]);
        }
        int[] arrayCombinedNoDuplicates =  new int[remover.size()];
        Iterator<Integer> transfer = remover.iterator();
        int next = 0;
        while (transfer.hasNext()){
            arrayCombinedNoDuplicates[next] = transfer.next();
            next++;
        }
        return arrayCombinedNoDuplicates;

    }

    public static void main(String[] args) {
        ArrayMerge arrayMerge = new ArrayMerge(new int[]{2,334,35},new int[]{23,334,62});
        System.out.println(Arrays.toString(arrayMerge.CombinedArray()));
        System.out.println(Arrays.toString(arrayMerge.AccendingOrder()));
        System.out.println(Arrays.toString(arrayMerge.DescendingOrder()));
        System.out.println(Arrays.toString(arrayMerge.DuplicateRemover()));
    }

}
