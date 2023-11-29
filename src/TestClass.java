import Cars.MercedesBenz;
import Driver.DriverInfo;

public class TestClass {
    public void CalculateTripCost() {
        var calculator = new FuelCostCalculator();
        var cost = calculator.calculate(new MercedesBenz());
        System.out.println("Total cost: " + cost);
    }

    public void runCars() {
        try {
            var car = new MercedesBenz();
            car.go();
            car.stop();
            car.sendTripInfoMailToDriver(new DriverInfo("John", "555-555-5555", "email@email.com"));
        } catch (EngineStartException e) {
            new TripInfoLogger(new GermanyLogger()).log("Engine start failed");
        } catch (AirPressionException e) {
            new TripInfoLogger(new LocalStorageLogger()).log("Air pression failed");
        } catch (Exception e) {
            new TripInfoLogger(new LocalServerLogger()).log("Unknown error");
        }
    }
}
