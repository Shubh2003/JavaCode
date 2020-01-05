//A class that implements the interface.

class AbstractImp extends abstractBase 

{

// Implementing the capabilities of

// interface.

public int sum(int a , int b)

{

      return a+b;

}

 

int sum (int a, int b, int c)

      {

            return (a+b+c);

      }

 

 

// Driver Code

public static void main(String[] args)

{

      AbstractImp t = new AbstractImp();

   int a = t.sum(3,4);

  

   System.out.println(a);

   

}

}