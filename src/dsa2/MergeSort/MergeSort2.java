package dsa2.MergeSort;

public class MergeSort2 {

    public void sort(int[] array){
        divide(array,0,array.length-1);
    }

    public static void divide(int []array,int startIndex, int endIndex){

        if(startIndex>=endIndex){
            return;
        }
        int midIndex=startIndex+(endIndex-startIndex)/2;

        divide(array,startIndex,midIndex);
        divide(array,midIndex+1,endIndex);
        conquer(array,startIndex,midIndex,endIndex);
    }

    public static void conquer(int[] array,int startIndex,int midIndex,int endIndex){

        int [] tempArray=new int[endIndex-startIndex+1];
        int firstHalfIndex=startIndex;
        int secondHalfIndex=midIndex+1;
        int tempArrayIndex=0;

        while(firstHalfIndex<=midIndex&&secondHalfIndex<=endIndex){
            if(array[firstHalfIndex]<=array[secondHalfIndex]){
                tempArray[tempArrayIndex++]=array[firstHalfIndex++];
            }else{
                tempArray[tempArrayIndex++]=array[secondHalfIndex++];
            }
        }

        while(firstHalfIndex<=midIndex){
            tempArray[tempArrayIndex++]=array[firstHalfIndex++];
        }

        while(secondHalfIndex<=endIndex){
            tempArray[tempArrayIndex++]=array[secondHalfIndex++];
        }

        for(int i=0,j=startIndex; i<tempArray.length; i++,j++){
           array[j]= tempArray[i];
        }
    }
}
