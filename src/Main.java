
public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double weight = 79; // вес в килограммах
        double height = 1.75; // рост в метрах
        double bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела равен (BMI): " + bmi);

    }
}