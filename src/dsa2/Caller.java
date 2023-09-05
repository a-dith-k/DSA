package dsa2;


import dsa2.HashMap.Hashset;
import dsa2.MergeSort.MergeSort2;
import dsa2.Queue.LQueue;
import dsa2.Queue.Queue;
import dsa2.HashMap.HMap;
import dsa2.QuickSort.QuickSort;
import dsa2.QuickSort.QuickSort2;
import dsa2.stack.DStack;
import dsa2.stack.Stack;

public class Caller {
    public static void main(String[] ar) {
        int[] array1 = {12, 10, 3, 8, 0, 6, 4};
        int[] array2 = {12, 10, 3, 7,7, 6, 0};
        int[] array3 = {8,7,6,5,4,3,2,1,0};

//        System.out.println("---------------------------bubbleSortProgram1-------------------------");
//        BubbleSort1 bSorter1 = new BubbleSort1();
//        bSorter1.sort(array1);
//        for (int i : array1) {
//            System.out.print(i+"  ");
//        }
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------");
//
//
//
//
//        System.out.println("---------------------------bubbleSortProgram2-------------------------");
//        BubbleSort2 bSorter2 = new BubbleSort2();
//        bSorter2.recSort(array2);
//        for (int i : array2) {
//            System.out.print(i+"  ");
//        }
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------");
//
//
//
//
//        System.out.println("---------------------------bubbleSortProgram3-------------------------");
//        BubbleSort3 bSorter3 = new BubbleSort3();
//        bSorter3.sort(array3);
//        for (int i : array3) {
//            System.out.print(i+"  ");
//        }
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------");


//        System.out.println("---------------------------insertionSortProgram1-------------------------");
//        InsertionSort1 iSorter1 = new InsertionSort1();
//        iSorter1.sort(array1);
//        show(array1);
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------");

//        System.out.println("---------------------------insertionSortProgram2-------------------------");
//        InsertionSort2 isorter2=new InsertionSort2();
//        isorter2.recurSort(array2,array2.length);
//        show(array2);
//        System.out.println();
//
//        System.out.println("------------------------------------------------------------------------");
//
//
//        System.out.println("---------------------------insertionSortProgram3-------------------------");
//        InsertionSort3 isorter3=new InsertionSort3();
//        isorter3.sort(array3);
//        show(array3);
//        System.out.println();
//
////        System.out.println("------------------------------------------------------------------------");
//
//        System.out.println("---------------------------selectionSortProgram1-------------------------");
//        SelectionSort1 ssorter1=new SelectionSort1();
//        ssorter1.sort(array1);
//        show(array1);
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------");





//        System.out.println("---------------------------MergeSortProgram1-------------------------");
//        MergeSort1 sorter=new MergeSort1();
//        sorter.sort(array2);
//        show(array2);
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------");



//        System.out.println("---------------------------MergeSortProgram2-------------------------");
//        MergeSort2 sorter2=new MergeSort2();
//        sorter2.sort(array2);
//        show(array2);
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------");



//        System.out.println("---------------------------QuickSortProgram2-------------------------");
//        QuickSort2 sorter2=new QuickSort2();
//        sorter2.sort(array2);
//        show(array2);
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------");

//        LQueue queue=new LQueue();
//        queue.enQueue(23);
//        queue.enQueue(24);
//        queue.enQueue(25);
//        queue.enQueue(26);
//        queue.show();
//        queue.deQueue();
//        System.out.println();
//        queue.show();



        //Stack using array
//        Stack numbers=new Stack();
//        numbers.push(20);
//        numbers.push(22);
//
//        System.out.println(numbers.pop());
//        System.out.println(numbers.pop());
//        System.out.println(numbers.isEmpty());
//        System.out.println(numbers.size());
//
//        //stack using arraylist
//        DStack stack =new DStack();
//        stack.push(11);
//        stack.push(12);
//        stack.push(13);
//        stack.push(14);
//        stack.push(15);
//
//        stack.show();
//
//        stack.pop();
//
//        stack.show();
//
//
//        //<------------------------------------------------------------------------------------------->
//        //dsa2.Queue using array
//        Queue que=new Queue();
//        que.enQueue(10);
//        que.enQueue(11);
//        que.enQueue(12);
//        que.enQueue(13);
//        que.show();
//        que.deQueue();
//        que.deQueue();
//        que.deQueue();
//        que.deQueue();
//
//        que.show();
//        System.out.println(que.isEmpty());
//        System.out.println(que.size());
//        //<------------------------------------------------------------------------------------------->
//
//
//
//
//        HMap objmap=new HMap();
////        map.maper();
//        char result=objmap.firstNonRepeatedChar("haaii evverryyonne hello");
//        System.out.println(result);

        Hashset set=new Hashset();
        set.hash();


    }

//--end of main method
    public static void show(int [] array) {

        for (int i : array) {
            System.out.print(i+" ");
        }

    }
}
