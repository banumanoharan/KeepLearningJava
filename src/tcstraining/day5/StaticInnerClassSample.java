package tcstraining.day5;

public class StaticInnerClassSample {

    public static void main(String args[])
    {
        new StaticOuter().outerShow();
        StaticOuter.StaticClass1.scShow();

    }
}

class StaticOuter {

    public void outerShow()
    {
        System.out.println("From the outer class public method");
    }

    static class StaticClass1
    {
        static public void scShow()
        {
            System.out.println("From the static class  static show method");
        }
    }
}