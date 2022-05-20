
public class Methods_Basics {
//    a class is basically a template for objects
//    vehicles can be a Class,
//    a bus can be an object
//    attributes is description such as color, weight, no of tyre
//    methods is simply the actions ie drive, brake, change gear

    String fName="Barrack";
    String lName ="Obama";


//    To create an object of MyClass, specify the class name, followed by the object name, and use the keyword new
public static void main(String[] args){
    Methods_Basics object1 = new Methods_Basics();
    Methods_Basics object2 = new Methods_Basics();

//      attributes can be modified after being accessed too
//    to void the modification/alteration of attributes the "final" keyword is very helpful

    System.out.println(object1.fName);
    System.out.println(object2.lName);
}

}
