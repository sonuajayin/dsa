public class BubbleSort {
 //A Quadratic Algorithm O(n^2)
   public static void main(String[] args) {
       int[] arr={5,4,8,1,7,3,-5,9,0};
       System.out.println(arr);
       int unsortedPartitionIndex=arr.length-1;
       while(unsortedPartitionIndex>0){
           for(int i=0;i<unsortedPartitionIndex;i++){
               if(arr[i]>arr[i+1]){
                   swap(arr,i,i+1);
               }               
           }
           unsortedPartitionIndex--;
       }
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
   }

   private static void swap(int[] arr, int i,int j){
       if(i==j){
           return;
       }

       int temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
   }
}
