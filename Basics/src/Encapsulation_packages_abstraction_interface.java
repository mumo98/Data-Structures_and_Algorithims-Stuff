//public class Encapsulation_packages_abstraction_interface {
//
//            public static void main(String[] args) {
//                                   int[] myNumbers = {1, 2, 3};
//                    System.out.println(myNumbers[10]);
//
//            }
//        }
//
//


public class Encapsulation_packages_abstraction_interface {

    static int[] theSumAnswer(int[] array, int targetSum){

        int[] answer = new int[2];

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]+array[j] == targetSum){
                    answer[0]=i+1;
                    answer[1]=j+1;
                }
            }
        }
        return answer;
    }

    public static void main(String [] args){

        System.out.println(theSumAnswer(new int[]{2, 7, 12, 33}, 9));
    }
}