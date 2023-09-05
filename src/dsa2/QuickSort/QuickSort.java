package dsa2.QuickSort;

public class QuickSort {

    public void sort(int []array){
        sort(array,0,array.length-1);
    }

    public void sort(int [] array,int start, int end){

        if(start>end){
            return;
        }

        //boundary
        int boundary=partition(array,start,end);
        //left
        sort(array,start,boundary-1);
        //right
        sort(array,boundary+1,end);

    }

    public int partition(int []array,int start, int end){
        int boundary=start-1 ;
        int pivot=array[end];

        for(int i=start; i<= end; i++){
            if(array[i]<=pivot){
                boundary++;
                swap(array,i,boundary);
            }
        }
        return boundary;
    }

    private void  swap(int []array,int index1, int index2){

        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
}
