public class QckSort {

    public static void main(String[] args) {

        QckSort qck = new QckSort();
        int array[]={4,8,6,5,7,9};

        int n = array.length;
       qck.quickSort(array,0, n-1 );

        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
    }
    //Worst= O(n^2)
//Super linear functions = f(n) = n lg n
    //T(n) = T(k) + T(n-k-1) + O(n)
    /*
        The first two terms are for two recursive calls, the last term is for the partition process.
        k is the number of elements which are smaller than pivot.
        The time taken by QuickSort depends upon the input array and partition strategy.
     */


    /* This function takes last element as pivot, places the pivot element at its correct position in sorted
   array, and places all smaller (smaller than pivot) to left of pivot and all greater elements to right
   of pivot */

    static int qckSort(int arr[], int start, int fin){

        int pivot= arr[fin]; //select the last element as pivot

        // Index of smaller element and indicates the right position of pivot found so far
        int i = (start - 1);

        for (int j =0; j <= fin - 1; j++) {

                if (arr[j] < pivot) {  //swap two elements if the element is less than pivot
                    i++;
                    //int temp = arr[co];
                    //arr[co] = arr[i];
                    //arr[i] = temp;
                    swap(arr, i, j);
                }
                                        //swap if the element is greater
        }
        swap(arr, i+1, fin);

        return (i + 1);
    }
    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int start, int fin)
    {
        if (start < fin)
        {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = qckSort(arr, start, fin);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, fin);
        }
    }
    //Time Complexity: O(N^2)
    //Total number of swaps = Total number of comparison
    //Total number of comparison (Worst case) = n(n-1)/2
    //Total number of swaps (Worst case) = n(n-1)/2

}
