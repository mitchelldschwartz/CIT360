import java.util.Iterator;
import java.util.ArrayList;
 
public class CollectionsIteratorExample {
 
  public static void main(String[] args) {
   
    ArrayList myList = new ArrayList();
   
    myList.add("1");
    myList.add("2");
    myList.add("3");
    myList.add("4");
    myList.add("5");
   
    System.out.println("ArrayList before removal : ");
    for(int i=0; i< myList.size(); i++)
      System.out.println(myList.get(i));
     
    Iterator itr = myList.iterator();
   
    String strElement = "";
    while(itr.hasNext()){
  
      strElement = (String)itr.next();
      if(strElement.equals("3"))
      {
        itr.remove();
        break;
      }
    }
   
    System.out.println("ArrayList after removal : ");
    for(int i=0; i< myList.size(); i++)
      System.out.println(myList.get(i));
  }
}
