public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyWeight = 55.5;
        double height = 1.70;
        double bodyMassIndex = service.calculate(bodyWeight, height);
        System.out.println(bodyMassIndex);

    }
}
