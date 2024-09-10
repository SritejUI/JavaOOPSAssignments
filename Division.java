package division;

import operation.Operation;

public class Division extends Operation {
    public double divide(double a, double b) {
        if (b == 0) {
            printError("Division by zero is not allowed.");
            return 0; // Return a default value
        }
        return a / b;
    }
}