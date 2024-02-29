public class SalaryCalculator {

    private static final double BASE_SALARY = 1000.00;
    private static final double MAX_SALARY = 2000.00;
    private static final double MAX_LEAVES_ALLOWED_WITHOUT_SALARY_REDUCTION = 5;
    private static final double REDUCED_SALARY_MULTIPLIER = 0.85;
    private static final int PRODUCTS_FOR_BONUS = 20;
    private static final int REGULAR_BONUS_MULTIPLIER = 10;
    private static final int IMPROVED_BONUS_MULTIPLIER = 13;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < MAX_LEAVES_ALLOWED_WITHOUT_SALARY_REDUCTION ? 1.0 : REDUCED_SALARY_MULTIPLIER;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < PRODUCTS_FOR_BONUS ? REGULAR_BONUS_MULTIPLIER : IMPROVED_BONUS_MULTIPLIER;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return finalSalary > MAX_SALARY ? MAX_SALARY : finalSalary;
    }
}
