public class Constructors {
//    constructors are simply methods that are used to initialize objects

//    first a class attribute is set as below
int  x;

//  then a class construction which is method is created to initialize the values
//  it has to take the same name of the class..and does not return a "void"

    public Constructors(int y){
// the attribute or data member is initialized [[given/assigned  a value]]]
//        it can also take any given number of parameters
//        x=17;
        x=y;
    }
 public static  void main(String[] args){
//        to call the constructor, you have create an object of the class
     Constructors myObj1 = new Constructors(89);
     System.out.println(myObj1.x);
 }


}
