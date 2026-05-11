package delivery;

// Concrete Strategies
class StandardDelivery implements DeliveryStrategy {
    public void deliver() {
        System.out.println("Standard Delivery Selected");
    }
}
class ExpressDelivery implements DeliveryStrategy {
    public void deliver() {
        System.out.println("Express Delivery Selected");
    }
}
class OvernightDelivery implements DeliveryStrategy {
    public void deliver() {
        System.out.println("Overnight Delivery Selected");
    }
}
// Context
class Order {
    private DeliveryStrategy strategy;
    public void setDeliveryStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }
    public void processOrder() {
        strategy.deliver();
    }
}
// Client