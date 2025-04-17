// PostfixEvaluator.java
public class PostfixEvaluator {

    public static double calculatePostfix(String expression) throws Exception {
        GenericStack<Double> stack = new GenericStack<>();
        String[] tokens = expression.split("_"); // `_` ile ayırarak işaret ve sayıları alıyoruz

        for (String token : tokens) {
            if (isNumeric(token)) {
                // Sayıyı yığına ekle
                stack.push(Double.valueOf(token));
            } else if (token.length() == 1 && "+-*/".contains(token)) {
                // Operatör için işlem
                if (stack.isEmpty()) throw new Exception("Hata: Yetersiz operand sayısı.");

                double operand2 = stack.pop();
                if (stack.isEmpty()) throw new Exception("Hata: Yetersiz operand sayısı.");

                double operand1 = stack.pop();
                double result = applyOperation(token.charAt(0), operand1, operand2);
                stack.push(result);
            } else {
                throw new Exception("Geçersiz ifade veya operatör: " + token);
            }
        }

        // Sonucun tek bir eleman olarak kalması gerekli
        if (stack.isEmpty()) throw new Exception("Hata: Yetersiz operand.");
        double finalResult = stack.pop();

        if (!stack.isEmpty()) throw new Exception("Hata: Fazladan operand mevcut.");

        return finalResult;
    }

    // Verilen string'in sayısal bir değer olup olmadığını kontrol eder
    private static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Operatörü kullanarak iki operand arasında işlem yapar
    private static double applyOperation(char operator, double operand1, double operand2) throws Exception {
        switch (operator) {
            case '+': return operand1 + operand2;
            case '-': return operand1 - operand2;
            case '*': return operand1 * operand2;
            case '/':
                if (operand2 == 0) throw new ArithmeticException("Sıfıra bölme hatası");
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Geçersiz operatör: " + operator);
        }
    }


}
