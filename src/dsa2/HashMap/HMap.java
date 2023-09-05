package dsa2.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HMap {

    public void maper(){
        Map <Integer,String> map=new HashMap<>();
        map.put(1,"Adith");
        map.put(2,"Vijay");
        map.put(3,"Asim");
        map.put(null,null);
        map.remove(1);
        String name=map.get(3);
        boolean containskey=map.containsKey(2);
        boolean containsValue=map.containsValue("Vijay");
        System.out.println(containskey+" "+containsValue);
        System.out.println(name);
        System.out.println(map);
        map.put(3,"Basil");




        for(var item: map.entrySet()){
            System.out.println(item);
        }

    }

    public char firstNonRepeatedChar(String value){

        char[] word=value.toCharArray();
        Map<Character,Integer> map=new HashMap<>();

        for(char ch: word){
            if(map.containsKey(ch)){
                Integer count=map.get(ch);
               map.put(ch,count+1);
            }else{
                map.put(ch,1);
            }
        }
        for(char ch : word){
            if(map.get(ch)==1){
                return ch;
            }
        }

     return Character.MIN_VALUE;
    }



}
