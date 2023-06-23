package BackTracking;


public class NthLarg {
    static int[] sorted(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
    static int getNthLar(int arr[],int num){
        arr = sorted(arr);
        return arr[(arr.length)-num];
    }
    public static void main(String[] args) {
        int arr[] = {1,8,13,9,2,7,10};
        System.out.println(getNthLar(arr, 4));
        System.out.println(getNthLar(arr, 5));

    }
}
