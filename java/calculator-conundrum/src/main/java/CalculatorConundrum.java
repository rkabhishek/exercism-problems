class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        } else if (operation == "") {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        try {
            int result = calculateAnswer(operand1, operand2, operation);
            return String.format("%d %s %d = %d", operand1, operation, operand2, result);
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        } catch (Exception e) {
            throw e;
        }
    }

    private int calculateAnswer(int operand1, int operand2, String operation) {
        switch (operation) {
            case "+": return operand1 + operand2;
            case "*": return operand1 * operand2;
            case "/": return operand1 / operand2;
            default:
                throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        }
    }
}
