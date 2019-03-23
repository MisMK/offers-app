class HelloWorld 
{ 
    // Your program begins with a call to main(). 
    // Prints "Hello, World" to the terminal window. 
    public static void main(String args[]) 
    { 
        System.out.println("Hello, World"); 
   }}
import java.util.Scanner;
 
class SwapNumbers
{
   public static void main(String args[])
   {
      int x, y, temp;
      System.out.println("Enter x and y");
      Scanner in = new Scanner(System.in);
     
      x = in.nextInt();
      y = in.nextInt();
     
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
     
      temp = x;
      x = y;
      y = temp;
     
      System.out.println("After Swapping\nx = "+x+"\ny = "+y);
   }
}

 
