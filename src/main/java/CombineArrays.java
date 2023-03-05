
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int array1 = arr1.length;
        int array2 = arr2.length;
        int both = array1 + array2;

        int[] a1a2 = new int[both];
        for( int i = 0; i < array1; i++){
            a1a2[i] = arr1[i];
        }
        for ( int i = 0; i < array2; i++){
            a1a2[array1+i] = arr2[i];
        }

        return a1a2;
    }
}
