public class FuelCostCalculator {
    public double calculate(BaseCar car) {
        return car.getCostPerKM() * car.getTripKM();
    }
}
