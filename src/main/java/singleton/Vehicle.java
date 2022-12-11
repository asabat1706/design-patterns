package singleton;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vehicle{
    private String vehicleName;
  public Vehicle(){
      System.out.println("0args ctor");
  }
    public Vehicle(String name){
       this.vehicleName = name;
        System.out.println("parameterized ctor");
    }

    public static void main(String[] args){
       Vehicle audi = new Vehicle();
       Vehicle scorpio = new Vehicle("Scorpio");

       List<Integer> input = new ArrayList<>();
       input.add(1); input.add(2); input.add(2);input.add(1);input.add(3);
//       count the frequency of each element
       Map<Integer, Integer> map = new HashMap<>();
       for(Integer i: input){
           if(!map.containsKey(i)){
               map.put(i,1);
           }
           else{
               map.put(i, map.get(i)+1);
           }
       }
        System.out.println(map);
    }
}
