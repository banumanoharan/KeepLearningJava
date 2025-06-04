package tcstraining.day5;

public class AnonymousInnerClassSample {
    static Demo d = new Demo() {
        void show()
        {
            // Calling method show() via super keyword
            // which refers to parent class
            super.show();
            // Print statement
            System.out.println("In AnonymousInnerClassSample class");
        }
    };
    public static void main(String[] args) {
        d.show();
    }
}
class Demo {
    void show()
    {
        System.out.println("I am in show method of super class");
    }
}
