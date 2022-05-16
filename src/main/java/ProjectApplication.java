import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ProjectApplication {
    public static void main(String[] args) throws IOException {
        ArrayList<String> expression = new ArrayList<>();
        Collections.addAll(expression, "4", "/", "2", "-", "10", "+", "2", "*", "3");
        double result = Double.parseDouble(expression.get(0));

        for (int i = 1; i < expression.size() - 1; i = i + 2) {
            List operands = new List();
            operands.add(result);
            String operator = expression.get(i);
            operands.add(Integer.parseInt(expression.get(i + 1)));

            Calculation calculation = new Calculation(operands, operator.charAt(0));

            result = calculation.calculate();
        }

        File outputFile = new File("src/main/resources/output.txt");
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            fileWriter.write(expression + " = " + result);
        }

    }
}
