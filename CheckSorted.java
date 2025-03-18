public class CheckSorted{
    public static void main(String []args){
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(isSorted(arr,0));
        System.out.println(search(arr,9,0));
    }
    // public static boolean isSorted(int []arr,int idx){
    //     if(idx==arr.length-1){
    //         return true;
    //     }
    //     return (arr[idx]<arr[idx+1])&&isSorted(arr,idx+1); 
    // }
    public static int search(int[]arr,int target,int idx){
        if(arr[idx]==target){
            return idx;
        }
        if(arr.length-1==idx){
            return -1;
        }
        return search(arr,target,idx+1);
    }
}
