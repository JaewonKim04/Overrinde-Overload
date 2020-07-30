package test;
class A{
    public void c()
    {
        System.out.println("오버라이드실패");
    }
}
class B extends A{

    @Override
    public void c()
    {
        System.out.println("오버라이드성공");
    }

}

 class Main
 {
     public static void main(String[] args)
     {
         B c1=new B();
         c1.c();
     }


 }
