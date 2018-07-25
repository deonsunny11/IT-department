class demo
{
  public static void main(String args[])
  {
    try
	{  
	  int a=42;
	  int b=42/0;
	  System.out.println(b);
	}
	catch(ArithmeticException e)
	{
	  System.out.println("division by zero");
	}
  }
}