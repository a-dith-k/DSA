package dsa2.MergeSort;

public class MergeSort1 {
    public void sort(int[] array){

        if(array.length<=1){
            return;
        }
         int middle=array.length/2;

         int[] left=new int[middle];
         int []right=new int[array.length-middle];

         for(int i=0; i<middle; i++){
             left[i]=array[i];
         }

         for(int i=middle; i<array.length; i++){
             right[i-middle]=array[i];
         }

         sort(left);
         sort(right);
         merge(left,right,array);
    }

    public void merge(int [] left,int [] right,int [] result){
        int leftIndex=0;
        int rightIndex=0;
        int resultIndex=0;

        while(leftIndex<left.length&&rightIndex<right.length){
            if(left[leftIndex]<=right[rightIndex]){
                result[resultIndex++]=left[leftIndex++];

            }else{
                result[resultIndex++]=right[rightIndex++];
            }
        }

        while(leftIndex<left.length){
            result[resultIndex++]=left[leftIndex++];
        }
        while(rightIndex<right.length){
            result[resultIndex++]=right[rightIndex++];
        }

    }
}
