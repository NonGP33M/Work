public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public void setSymName(String newSymbol, String newName) {
        symbol = newSymbol;
        name = newName;
    }

    public void getChangePercent() {
        double changePercent = (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
        System.out.println("Price Change: " + changePercent + "%");
    }

    public void displayObject() {
        System.out.println("Symbol: " + symbol);
        System.out.println("Name: " + name);
        System.out.println("Previous Closing Price: " + previousClosingPrice);
        System.out.println("Current Price: " + currentPrice);
    }
}
