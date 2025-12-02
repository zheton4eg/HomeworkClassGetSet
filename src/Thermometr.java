public class Thermometr {
    private double temperature;

    void setTemperature(double temperature) {
        if (temperature < -50 || temperature > 50) {
            System.out.println("Температура вне допустимого диапазона");
        } else {
            this.temperature = temperature;
        }
    }

    double getTemperature() {
        return temperature;
    }

    void print() {
        System.out.println(temperature);
    }
}