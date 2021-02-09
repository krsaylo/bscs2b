
package calculator;

public class Calculator {
    public static void main(String[] args) {
        CalculatorView calView = new CalculatorView();
        new CalculatorController(calView);
    }
    
}
