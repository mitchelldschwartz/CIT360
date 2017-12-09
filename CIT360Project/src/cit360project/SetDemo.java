import java.util.*;

public class SetDemo {

  public static void main(String args[]) { 
     int count[] = {40,20,10,50,30,20};
     Set<Integer> set = new HashSet<Integer>();
     try{
        for(int i = 0; i<5; i++){
           set.add(count[i]);
        }
  
        TreeSet sortedSet = new TreeSet<Integer>(set);
        System.out.println("The sorted list is:");
        System.out.println(sortedSet);

        System.out.println("The First element of the set is: "+
                          (Integer)sortedSet.first());
        System.out.println("The last element of the set is: "+
                        (Integer)sortedSet.last());
     }
     catch(Exception e){}
  }
} 