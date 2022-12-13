
public class Sort {
    public Sort(int arr[], String sort){
        if(sort.equals("mergesort")){
            System.out.println("Mergesort : ");
            MergeSort m = new MergeSort();
            m.sort(arr, sort);
            printArray(arr);
        }
        else if(sort.equals("quicksort")){
            System.out.println("Quicksort : ");
            QuickSort q = new QuickSort();
            q.sort(arr, sort);
            printArray(arr);
        }
        else if(sort.equals("heapsort")){
            System.out.println("Heapsort : ");
            HeapSort h = new HeapSort();
            h.sort(arr, sort);
            printArray(arr);
        }
        else{
            System.out.println("Invalid sort");
        }
    }
    
    public void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }  
}
