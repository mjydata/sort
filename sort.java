public class sort {

    //交换类排序（冒泡，快速）
    //快速排序  O(㏒n)  当n较大时使用快排比较好，当序列基本有序时用快排反而不好。

    public static void quicksort(int[] arr,int low,int high){
        if(low< high){
            int middle = sort(arr,low,high);
            quicksort(arr,0,middle-1);
            quicksort(arr,middle+1,high);
        }
    }
    public static int sort(int[] arr,int low ,int high){
         int privot=arr[low];
        while(low < high){
             while (low < high && privot<=arr[high]){
                 --high;
             }
             arr[low]=arr[high];
             while (low <high && privot>=arr[low]){
                 ++low ;
             }
             arr[high]=arr[low];
         }
         arr[low]=privot;
        return low;
    }
    public  static void quickSort(int[] arr){
        quicksort(arr, 0, arr.length-1);
    }

    //冒泡排序  o(n^2)
    public static void bubbleSort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

    }
    //插入类排序（直接插入，希尔排序）
    //直接插入排序    O(n2)
    public static void insertSort(int[] arr ){
        int len=arr.length;
        for(int i=1 ;i<len-1;i++){
            int j;
            int temp = arr[i];
            for( j=i-1;j>=0;j--){
                if(temp<arr[j]){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }

            }
            arr[j+1]=temp;
        }


    }




    public static void main(String[] args){
        int[] arr={6,1,9,3,10,29,34,23,23,4,543,3432};
        insertSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
