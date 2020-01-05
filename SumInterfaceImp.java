//A simple interface

interface In1

{

      int defaultval = 10;

  // public and abstract 

 int sum(int a , int b);

}

 

//A class that implements the interface.

class SumInterfaceImp implements In1

{

 // Implementing the capabilities of

 // interface.

 public int sum(int a , int b)

 {

      return a+b;

 }

 

// Driver Code

 public static void main(String[] args)

 {

       SumInterfaceImp t = new SumInterfaceImp();

     int a = t.sum(3,4);

    

     System.out.println(a);

     

     System.out.println(t.defaultval);

}

 

}

 