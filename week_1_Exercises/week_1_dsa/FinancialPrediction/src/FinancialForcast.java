public class FinancialForcast {

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 100;
        double growthRate = 0.5;
        int years = 10;

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value after"+years+ "years:"+futureValue);
    }
}
