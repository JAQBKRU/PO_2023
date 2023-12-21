public interface DataProcessor {
    public abstract String processData(String data);
    public abstract boolean isValid(String data);
}

class TextProcessor implements DataProcessor{
    @Override
    public String processData(String data) {
        return new StringBuilder(data).reverse().toString();
    }

    @Override
    public boolean isValid(String data) {
        return data != null && !data.isEmpty();
    }
}

class NumberProcessor implements DataProcessor{
    @Override
    public String processData(String data) {
        return "Processed: " + data;
    }

    @Override
    public boolean isValid(String data) {
        return data.matches("-?\\d+(\\.\\d+)?");
    }
}
