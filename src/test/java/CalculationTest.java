import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    List twoOperandsList;
    char operator;
    Calculation calculation;

    @BeforeEach
    void setup() {
        twoOperandsList = new List();
        twoOperandsList.add(6);
        twoOperandsList.add(2);
    }

    @Test
    void givenTwoOperandsListAndAdditionOperator_WhenCallCalculateMethod_ThenSuccess(){
        operator = '+';
        calculation = new Calculation(twoOperandsList, operator);
        assertEquals(8, calculation.calculate());
    }

    @Test
    void givenTwoOperandsListAndSubtractionOperator_WhenCallCalculateMethod_ThenSuccess(){
        operator = '-';
        calculation = new Calculation(twoOperandsList, operator);
        assertEquals(4, calculation.calculate());
    }

    @Test
    void givenTwoOperandsListAndMultiplicationOperator_WhenCallCalculateMethod_ThenSuccess(){
        operator = '*';
        calculation = new Calculation(twoOperandsList, operator);
        assertEquals(12, calculation.calculate());
    }

    @Test
    void givenTwoOperandsListAndDivisionOperator_WhenCallCalculateMethod_ThenSuccess(){
        operator = '/';
        calculation = new Calculation(twoOperandsList, operator);
        assertEquals(3, calculation.calculate());
    }

}