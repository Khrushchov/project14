package goit.gojava2.javacore;

public class Factorial {
//    public static void main(String[] args) {
//        Factorial item = new Factorial();
////        item.start();
//    }

//    public void start(int enteredInteger){
////        int enteredInteger;
//        long result;
//        try {
////            enteredInteger = connectUser();
//            checkInteger(enteredInteger);
//            result = getFactorial(enteredInteger);
//            System.out.println("Factorial of " + enteredInteger + " = " + result);
//        }
////        catch (InputMismatchException ime){
////            System.out.println("[Error]: Entered data isn't integer.");
////        }
//        catch (NegativeIntegerException nie){
//            System.out.println("[Error]: Entered number is " + nie.getValue() + ". Number should " +
//                    "be > 0.");
//        } catch (UpperLimitException ule){
//            System.out.println("[Error]: Entered number is " + ule.getValue() + ". Number should" +
//                    " " +
//                    "be <= 20.");
//        }
//    }

//    private int connectUser()throws InputMismatchException {
//
//        int enteredInteger;
//        try(Scanner in = new Scanner(System.in)){
//            System.out.println("\t FACTORIAL \t");
//            System.out.println("Enter positive integer <= 20");
//            if(!in.hasNextInt()){
//                throw new InputMismatchException();
//            }
//            enteredInteger = in.nextInt();
//        }
//        return enteredInteger;
//    }

    public void checkInteger(int enteredInteger)throws NegativeIntegerException, UpperLimitException {
        if (enteredInteger < 1){
            throw new NegativeIntegerException(enteredInteger);
        }

        if (enteredInteger > 170){
            throw new UpperLimitException(enteredInteger);
        }
    }

    public double getFactorial(int positiveInteger){
        double result = 1;
        for (int i = 1; i <=positiveInteger ; i++) {
            result *= i;
        }
        return result;
    }
}
