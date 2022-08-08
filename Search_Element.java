public class Search_Element {
    public static int search(int[] arr, int target, int index) {

        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return search(arr,target,index+1) ;
        }

    }
    public static void main(String[] args) {
        int[] arr={3,4,6,20,8,3,24,5};
        System.out.println(search(arr,20,0));
    }


}
