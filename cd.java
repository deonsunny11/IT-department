import java.util.*;
class media
{
  String title;
  String pub;
  void read()
  {
    Scanner c = new Scanner(System.in);
	System.out.println("enter the title");
	title=c.nextLine();
	System.out.println("enter the publication");
    pub=c.nextLine();
  }
  void dis()
  {
    System.out.println("title="+title);
    System.out.println("publication="+pub);
  }	
}
class book extends media
{
   int pages;
   void read1()
   {
     super.read();
     Scanner c = new Scanner(System.in);
     System.out.println("enter the pages");
     pages=c.nextInt();	 
   }
   void disp()
   {
     super.dis();
	 System.out.println("pages="+pages);
   }
}
class tape extends media
{
  int time;
  void read2()
   {
     super.read();
     Scanner c = new Scanner(System.in);
     System.out.println("enter the time"+time);
	 time=c.nextInt();
   }
  void display()
   {
     super.dis();
	 System.out.println("time="+time);
   }
}   
class cd
{
  public static void main(String args[])
  {
    book b = new book();
	b.read1();
	b.disp();
	tape t = new tape();
	t.read2();
	t.display();
  }
}