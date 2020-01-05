// This is extending the subBase Class

public class SumInheritance extends SumBase {

 

      public void add()

      {

            result = a+b;

      }

 

 

   public static void main(String args[])

      {

         SumInheritance b = new SumInheritance();

            b.setValue(6, 4);

            b.add();

            b.showResult();

      }

}