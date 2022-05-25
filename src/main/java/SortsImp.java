
public class SortsImp {

    public static void main(String[] args) {

        SortsImp bub = new SortsImp();
        int array[]={4,8,6,5,7,9};
                //4,8,6,5,7,9
                //4,6,8,5,7,9
                //4,6,5,8,7,9
                //4,6,5,7,8,9
                //4,6,5,7,8,9
                //4,6,5,7,8,9
                //4,5,6,7,8,9
                //
        bub.bublSort(array);
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");

        float wc = (n*(n-1))/2;

        System.out.println(" \n Total number of comparison (Worst case) =" + wc );
        //Worst= O(n^2)

    }

    void bublSort(int arr[]){

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    //Time Complexity: O(N^2)
    //Total number of swaps = Total number of comparison
    //Total number of comparison (Worst case) = n(n-1)/2
    //Total number of swaps (Worst case) = n(n-1)/2

}
