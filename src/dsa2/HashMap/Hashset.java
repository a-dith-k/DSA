package dsa2.HashMap;

import java.util.*;


public class Hashset {

    public void hash(){
        HashSet<Integer> set=new HashSet<>();
        set.add(20);
        set.add(21);
        set.add(22);
        set.add(23);
        set.add(23);
        set.remove(20);
//        if(set.contains(23)){
//            System.out.println("have 23");
//        }
        System.out.println(set);
        System.out.println(set.size());

        Iterator it =set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        HashMap<Integer,String>studentInfo=new HashMap<>();
        studentInfo.put(4,"Adith");
        studentInfo.put(3,"Amal");
        studentInfo.put(2,"Albert");
        System.out.println(studentInfo);
        System.out.println(studentInfo.containsKey(1));
        System.out.println(studentInfo.get(4));

        for(Map.Entry<Integer,String> e: studentInfo.entrySet()){
            System.out.println(e.getKey()+
            e.getValue());
        }

        Set<Integer> key=studentInfo.keySet();
        for(Integer ke: key){
            System.out.println(studentInfo.get(ke));
        }





    }
}
