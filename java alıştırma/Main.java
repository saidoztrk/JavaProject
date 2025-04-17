public class Main {
    public static void main(String[] args) {
        // Hesaplanacak postfix ifadeleri
        String[] expressions = {
                "3_4_*_5_+",
                "10_5_/",
                "2_3_+_4_*",
                "5_2_-_3_/" // Sıfıra bölme hatası örneği
        };

        for (String expression : expressions) {
            try {
                double result = PostfixEvaluator.calculatePostfix(expression);
                System.out.println("Postfix ifade: " + expression);
                System.out.println("Sonuç: " + result);
            } catch (Exception ex) {
                System.out.println("Hata: " + ex.getMessage());
            }
        }
    }
}