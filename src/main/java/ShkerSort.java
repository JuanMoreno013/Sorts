

public class ShkerSort {

    public static void main(String[] args) {
        ShkerSort shk = new ShkerSort();
        int array[]={4,8,6,5,7,9};

        shk.shaker(array);

        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");

    }

    public static int[] shaker(int[] arreglo){
        int intercambios = 0, comparaciones = 0;
        int i, izq, der, k, aux;
        izq = 1;
        der = arreglo.length-1;
        k= arreglo.length-1;
        while(izq <= der){
            for(i=der; i >=izq; i--){
                comparaciones++;
                if(arreglo[i-1] > arreglo[i]){
                    intercambios++;
                    aux = arreglo[i-1];
                    arreglo[i-1] = arreglo[i];
                    arreglo[i] = aux;
                    k = i;
                }
            }
            izq = k+1;
            for(i = izq; i<=der; i++){
                comparaciones++;
                if(arreglo[i-1] > arreglo[i]){
                    intercambios++;
                    aux = arreglo[i-1];
                    arreglo[i-1] = arreglo[i];
                    arreglo[i] = aux;
                    k = i;
                }
            }
            der = k-1;

        }
        System.out.println("Number swaps:"+intercambios);
        System.out.println("Number comparisons:"+comparaciones);

        return arreglo;
    }

}
