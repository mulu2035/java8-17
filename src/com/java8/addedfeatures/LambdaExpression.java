package com.java8.addedfeatures;
/*Under this section we will see different cases about anonymous class and lambda expression.
* We will see the nested class
* If the nested class is inner it can have access to the members of the outer class.
* To instantiate the inner class first we have to instantiate the outer class .
* then , create the inner object with in the outer object the syntax
* outerclass outerobject =new outer class()
* Outer class.Inner class innerObject = outerObject.new InnerClass()
* To access the members of the static nested class have to instantiated the static nested class
* this can be done the outer class.inner class name = new outer class.inner cass
* then to access the members name.members
 */
public class LambdaExpression {
    private String name;
    private String gender;
    String outerfeild  ="outerField";
    static String staticOuterField = "static outer field";
    int age;
    public int x =0;

    public class Inner{
        int x=1;// when ever we want to call x=0 we have to use LambdaExpression.this.x this is because of shadowing
        public void innerMethod(int x){
            System.out.println("x="+x);// the method variable
            System.out.println("this.x="+ this.x);// this is the inner class variable.
            System.out.println("LambdaExpression.this.x=" +LambdaExpression.this.x);// calling the outer class member

            System.out.println("nmae and gender"+name + gender);
            System.out.println(outerfeild);
            System.out.println(staticOuterField);

        }

    }
    static class StaticNestedClass {
        void accessMembers() {
            //compiler error can not make a static reference to the non -static
            //System.out.println();
            //Systemy.out.println()
            System.out.println(staticOuterField);
            System.out.println(staticOuterField);
            System.out.println();
        }
    }
        interface IntegerMath{//the integerMath interface
            int operation(int a,int b);//interface method that takes integer values.
        }
        public int operationBinary(int a,int b,IntegerMath op){//the method operation binary takes two integer and
        //the integer math operation
            return op.operation(a,b);// this show s it is return type
    }
    interface StringStuff {// this is interface StringStuff
        String update(String value);// the interface method
    }
    void someMethod() {// this is the class method
        StringStuff excite = (happy) -> happy + "!";//this lambda expression
        StringStuff question = (what) -> what + "?";// lambda expression
        someFormat("Java is cool", excite);// this is the argument that takes the lambda expression and string
        someFormat("Java is cool", question);//this is an argument that takes the lambda expression and string
    }
    void  someFormat(String val, StringStuff format) {// the class method that takes string val and the interface format.
        String end = format.update(val);//when we call some method it calls some method and returns java is cool and
        // java is cool?
        System.out.println(end);
    }
    interface PythagoreanTheorem{// This is an interface about pythagorean Theorem
        double hypotenus(double a,double b);
    }
    public double calculation(double a,double b,PythagoreanTheorem cal){
        return cal.hypotenus(a,b);
    }
    interface Calculation2{
        double conversion(double number);
    }
    public double feetToInch(double a,Calculation2 feet) {
        return feet.conversion(a);

    }
    public double inchToFeet(double b,Calculation2 inch){
        return inch.conversion(b);
    }



}





