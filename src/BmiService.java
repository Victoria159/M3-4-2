public class BmiService {
    public double calculate(double bodyWeight, double height){

        double bodyMassIndex = bodyWeight / Math.pow(height,2);

      return bodyMassIndex;
    }
}
