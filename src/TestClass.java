public class TestClass {
    public void CalculateTripCost() {
        var calculator = new FuelCostCalculator();
        var cost = calculator.calculate(new MercedesBenz());
        System.out.println("Total cost: " + cost);
    }
}
