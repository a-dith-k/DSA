package dsa2.selectionsort;

public class SelectionSort1 {

     public void sort(int[] array){

          for(int i=0; i<array.length; i++){
               int minIndex=i;
               for(int j=i+1; j<array.length; j++){
                    if(array[minIndex]>array[j]){
                         minIndex=j;
                    }
               }
               int temp=array[i];
               array[i]=array[minIndex];
               array[minIndex]=temp;

          }

     }

     private void swap(int[] array, int i, int j) {

          int temp=array[i];
          array[i]=array[j];
          array[j]=temp;
     }
}
