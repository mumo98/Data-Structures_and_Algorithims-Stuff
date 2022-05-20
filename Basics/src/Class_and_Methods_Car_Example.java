public class Class_and_Methods_Car_Example {
//    Example explained
//            1) We created a custom Car class with the class keyword.
//
//            2) We created the fullThrottle() and speed() methods in the Car class.
//
//            3) The fullThrottle() method and the speed() method will print out some text, when they are called.
//
//             4) The speed() method accepts an int parameter called maxSpeed - we will use this in 8).
//
//            5) In order to use the Car class and its methods, we need to create an object of the Car Class.
//
//            6) Then, go to the main() method, which you know by now is a built-in Java method that runs your program (any code inside main is executed).
//
//            7) By using the new keyword we created a Car object with the name myCar.
//
//            8) Then, we call the fullThrottle() and speed() methods on the myCar object, and run the program using the name of the object (myCar), followed by a dot (.), followed by the name of the method (fullThrottle(); and speed(200);). Notice that we add an int parameter of 200 inside the speed() method.

    public void fullThrottle(){
        System.out.println("the car is at Max speed");
    }

    public void speed(int velocity){
        System.out.println("it is moving at " + velocity + "miles per hour!!" );
    }

    public static void main(String[] args){
        Class_and_Methods_Car_Example objThrottle = new Class_and_Methods_Car_Example();

        objThrottle.fullThrottle();
        objThrottle.speed(279);

    }


}
