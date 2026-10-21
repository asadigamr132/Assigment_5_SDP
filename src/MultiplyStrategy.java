public class MultiplyStrategy implements AddStrategy{

    @Override
    public double calculate(double a, double b) {
        return a*b;
    }
}
