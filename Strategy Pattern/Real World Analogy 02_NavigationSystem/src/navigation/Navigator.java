package navigation;

class Navigator {

    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate() {
        strategy.buildRoute();
    }
}