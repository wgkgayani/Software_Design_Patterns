package cake;

class Cream extends CakeDecorator {

    public Cream(Cake cake) {
        super(cake);
    }

    public String getDescription() {
        return cake.getDescription() + " + Cream";
    }
}
