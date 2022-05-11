public class Calculation {

    private final List twoElementsList;
    private final char operation;

    public Calculation(List twoElementsList, char operation) {
        this.twoElementsList = twoElementsList;
        this.operation = operation;
    }

    public double calculate(){

        double firstOperand = twoElementsList.element(0);
        double secondOperand = twoElementsList.element(1);

        return switch (operation) {
            case '+' -> firstOperand + secondOperand;
            case '-' -> firstOperand - secondOperand;
            case '*' -> firstOperand * secondOperand;
            case '/' -> firstOperand / secondOperand;
            default -> 0;
        };

    }
}
