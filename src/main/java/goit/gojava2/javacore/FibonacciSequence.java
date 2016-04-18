package goit.gojava2.javacore;

import java.util.ArrayList;

public class FibonacciSequence {

//    public static void main(String[] args) {
//        FibonacciSequence fibSeq = new FibonacciSequence();
//        fibSeq.start();
//    }

//    public void start() {
//        int enteredInteger;
//        try {
//            enteredInteger = connectUser();
//            checkInteger(enteredInteger);
//            List<Integer> result = getFibSeq(enteredInteger);
//            System.out.println("Fibonacci sequence < " + enteredInteger + " = " + result);
//        } catch (InputMismatchException ime) {
//            System.out.println("[Error]: Entered data isn't integer.");
//        } catch (NegativeIntegerException nie) {
//            System.out.println("[Error]: Entered number is " + nie.getValue() + ". Number should " +
//                    "be" + " > 0.");
//        }
//    }

//    public int connectUser() throws InputMismatchException {
//        int enteredInteger;
//
//        try (Scanner in = new Scanner(System.in)) {
//            System.out.println("\t FIBONACCI SEQUENCE \t");
//            System.out.println("Enter positive integer");
//            if (!in.hasNextInt()) {
//                throw new InputMismatchException();
//            }
//            enteredInteger = in.nextInt();
//        }
//
//        return enteredInteger;
//    }

    public void checkInteger(int enteredInteger) throws NegativeIntegerException {
        if (enteredInteger < 1) {
            throw new NegativeIntegerException(enteredInteger);
        }
    }

    public ArrayList<Integer> getFibSeq(int limit) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(1);
        for (int i = 2; sequence.get(i - 1) + sequence.get(i - 2) < limit; i++) {
            sequence.add(i, sequence.get(i - 1) + sequence.get(i - 2));
        }
        return sequence;

    }
}


