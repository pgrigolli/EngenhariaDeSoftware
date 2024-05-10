// Adapter Design Pattern

package StructuralPattern;

interface FahrenheitSensor {
    double getTemperature();
}

class CelsiusTemperatureSensor {
    double getTemperatureInCelsius() {
        return 25.0; // Exemplo
    }
}

class TemperatureAdapter implements FahrenheitSensor {
    private CelsiusTemperatureSensor celsiusSensor;

    TemperatureAdapter(CelsiusTemperatureSensor celsiusSensor) {
        this.celsiusSensor = celsiusSensor;
    }

    @Override
    public double getTemperature() {

        double celsiusTemp = celsiusSensor.getTemperatureInCelsius();

        double fahrenheitTemp = (celsiusTemp * 9/5) + 32; // Conversão de Celsius para Fahrenheit

        return fahrenheitTemp;

    }
}

public class Project {
    public static void main(String[] args) {

        CelsiusTemperatureSensor celsiusSensor = new CelsiusTemperatureSensor();

        FahrenheitSensor adapter = new TemperatureAdapter(celsiusSensor);

        double temperatureInFahrenheit = adapter.getTemperature();

        System.out.println("Temperature in Fahrenheit: " + temperatureInFahrenheit);

    }
}
