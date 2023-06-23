package BackTracking;

public class Largest {
    static int geThirdLar(int[] arr){
        int lar1 = arr[0];
        int lar2 = -1;
        int lar3 = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar1){
                lar3 = lar2;
                lar2 = lar1;
                lar1=arr[i];
            }else if(arr[i]>lar2){
                lar3 = lar2;
                lar2 = arr[i];
            }
        }
        return lar3;
    }
    public static void main(String[] args) { 
        int arr[] = {1,3,2,6,8,9,10,13};
        int nums [] = {40,20,70,25,39,30,45};
        System.out.println(geThirdLar(arr));
        System.out.println(geThirdLar(nums));
    }
}
