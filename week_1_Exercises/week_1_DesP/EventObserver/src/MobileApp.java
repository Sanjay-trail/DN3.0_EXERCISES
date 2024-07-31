public class MobileApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println("App: Stock price changed to Rs" + stockPrice);
    }
}

