public class Main {
    public static void main(String[] args) {
        // PRIMITIVES
        char c = 'A'; // whenever we create a char variable in the assignment, we have to use single quotes
        int quantity = 12; // an eve dozen
        double price = 1.23; // double precision floating point decimal


        // NON-PRIMITIVES (COMPLEX/OBJECTS/COLLECTIONS)
        String name = "Gaoussou";
        String last = "Doucoure";
        Integer age = 26; // Wrapped primitive is called a BOXED primitive;
        Double weight = 160.9;

        // Expressions are like equations that calculate a result to use.
        double total = quantity * price; // cal total multiple qty times price, int total will result to error bc we are multiplying int with double
        String full = last + ", " + name; // + means Concatenation operator chains together
        System.out.println(total); // typing sout is a shortcut to print system out
        System.out.println(full); // typing sout is a shortcut to print system out

        // double Vs float. double holds 2 bytes so it's heavier than float, reason why its output is longer
        double third = 1.0 / 3.0;
        System.out.println(third);
        float third2 = 1.0f / 3.0f; // demo floating point error (rounding)
        System.out.println(third2);

        float pi = 3.1415926535f; // float data type is too small so use double! otherwise if we print with float it will throw away some data and round up the last one
        System.out.println(pi);
        double pi2 = 3.1415926535; //we can see that everything gets printed using double
        System.out.println(pi2); // End of comparison of double Vs float

        int cost_in_pennies = 100;
        double totat_cost = (double) cost_in_pennies / 3; // (double) --this is to convert a variable into double
        System.out.println(totat_cost);
        System.out.println(c + ". " + "His age is " + age + " and weight is " + weight);
    } // end main method
} // end Main class