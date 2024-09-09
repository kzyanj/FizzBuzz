/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {// declare variable first and i increment 1 after loop
            i++;    // refractoring does not includes this code because 
                    // i++ is part of the while loop
            doFizzBuzz(i);
        }
    }

    public static void doFizzBuzz(int i) {
        //public: it can be used from outsiders, call this method: FizzBuzz.doFizzBuzz(method name)
        //void: the return type, currently, there is nothing we want to return
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}
