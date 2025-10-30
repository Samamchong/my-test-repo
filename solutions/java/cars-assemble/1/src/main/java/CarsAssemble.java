public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate;

        if (speed >= 1 && speed <= 4) {
            successRate = 1.0; // 100%
        } else if (speed <= 8) {
            successRate = 0.9; // 90%
        } else if (speed == 9) {
            successRate = 0.8; // 80%
        } else if (speed == 10) {
            successRate = 0.77; // 77%
        } else {
            successRate = 0.0; // invalid speed
        }

        // Each car factory produces 221 cars per hour per speed unit
        return speed * 221 * successRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}