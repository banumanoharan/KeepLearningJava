package tcstraining.day5;

public class NestedInnerClassSample {
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        outer.outerShow();
        Outer.Inner inner = new Outer().new Inner();
        inner.innerShow();
    }
}

class Outer {

    public void outerShow()
    {
        System.out.println("From the outer class public method");
    }

    private void outerPrivateMethod()
    {
        System.out.println("From the outer class private method");
    }

    class Inner {

        public void innerShow()
        {
            System.out.println("From the inner class public method");
            outerShow();
            outerPrivateMethod();
        }
    }
}

