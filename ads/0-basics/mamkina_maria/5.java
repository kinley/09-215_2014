


public class Factorial
{
    static double factorial(int x){
     if (x == 1) 
		return 0;
	else	
		return Math.log(x)+factorial(x-1);
    }

  public static void main(String []args){
    System.out.println(factorial(2));
    
	}
}