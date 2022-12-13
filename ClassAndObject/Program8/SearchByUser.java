// Write a program to search for a user defined number in array of 20 numbers using linear search
// and binary search using class and object? Allow user to choose searching method.
class SearchByUser{
    int[] arr = new int[20];
    int num;
    public SearchByUser(int[] arr, int num){
        this.arr = arr;
        this.num = num;
    }
    public void linearSearch(){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == num){
                System.out.println("Number found at index " + i);
                return;
            }
        }
        System.out.println("Number not found");
    }
    public void binarySearch(){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == num){
                System.out.println("Number found at index " + mid);
                return;
            }
            else if(arr[mid] > num){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println("Number not found");
    }
}