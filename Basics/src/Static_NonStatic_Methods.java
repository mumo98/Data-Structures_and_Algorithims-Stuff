public class Static_NonStatic_Methods {
//    Static methods can be called without creating objects
//    Public methods must be called by creating objects

    static void myStaticMethod(){
        System.out.println("Not a must to Create Object to call it");
    }

    public void myPublicMethod(){
        System.out.println("must, MUST create an object to call it");
    }

    public static void main(String[] args){
//        won't return an error
        myStaticMethod();
//        this would return an error hence its commeneted
//        myPublicMethod();
//        this is because the method is directly associated with the class and not an instance or object of that class hence u have to create a new class

//        therefore to call it you create an object of the class and then use the object to call it👇👇👇👇
        Static_NonStatic_Methods myObject1 = new Static_NonStatic_Methods();
        myObject1.myPublicMethod();
//        calling it by use of a new object created works magic

    }

}
