public class Class_Object_Basics {
//    this is a method, it is void since it returns nothing
//      static keyword means that it is a method belonging to the class and not an obj

    static void myMethod(String fName) {
        System.out.println("hello " + fName);
// the number of parameters set here must equal the number of arguments passed when calling the method
    }

//    for a method to return a value, use primitive data type like int or String instead of the 'void' keyword

    static int addNums(int num1, int num2){
        return num1 + num2;
    }

//    method overloading is when a method can be used several times as long the arguments used are different
//    ver helpful when having several methods doing the same thing

//    the methods can only be called in the main function which runs the java file
    public static  void main(String[] args){
        myMethod("juju");
        System.out.println(addNums(44, 56));
    }

//    String [] args simply means that the function is expecting an array of string arguments
}
