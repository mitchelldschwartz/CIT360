import java.util.*;

public class CollectionsListTest {

   public static void main(String[] args) {
      List first = new ArrayList();
      first.add("Ryan");
      first.add("Julie");
      first.add("Matthew");
      System.out.println(" ArrayList Elements");
      System.out.print("\t" + first);

      List second = new LinkedList();
      second.add("Ryan");
      second.add("Julie");
      second.add("Matthew");
      System.out.println();
      System.out.println(" LinkedList Elements");
      System.out.print("\t" + second);
   }
}