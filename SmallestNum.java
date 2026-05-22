public class SmallestNum{
    public static void main(String[]args){
        int[] arr={4,6,8,9,0,2,3};
        int smallest=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("SMALLEST:" +smallest);
    }
}