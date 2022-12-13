public class QuickSort implements ISort {

    public void sort(int[] arr, String str) {
        if (str.equals("mergesort")) {
            quicksort(arr, 0, arr.length - 1);
        }
    }
    public void quicksort(int arr[], int low, int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }
    }
    public int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for(int j=low; j<high; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    
}
