public interface Converter {
    public abstract double convertToEuro(double amount);
    public abstract double convertToUSD(double amount);
    public abstract double getConversionRate(String currency);
}

class CurrencyConverter implements Converter{
    @Override
    public double convertToUSD(double amount) {
        return amount * getConversionRate("USD");
    }

    @Override
    public double convertToEuro(double amount) {
        return amount * getConversionRate("Euro");
    }

    @Override
    public double getConversionRate(String currency) {
        if (currency.equals("USD")) {
            return 3.95;
        } else if (currency.equals("Euro")) {
            return 4.31;
        } else {
            return 0;
        }
    }
}

class UnitConverter implements Converter{
    @Override
    public double convertToUSD(double amount) {
        return amount * getConversionRate("USD");
    }

    @Override
    public double convertToEuro(double amount) {
        return amount * getConversionRate("Euro");
    }

    @Override
    public double getConversionRate(String currency) {
        if (currency.equals("USD")) {
            return 0.01;
        } else if (currency.equals("Euro")) {
            return 0.012;
        } else {
            return 0;
        }
    }
}
