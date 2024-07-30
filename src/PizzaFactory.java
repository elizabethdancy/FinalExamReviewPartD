public abstract class Pizza {
    public abstract void prepare();
}

public class MargheritaPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Margherita Pizza");
    }
}

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza");
    }
}

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        switch (type) {
            case "Margherita":
                return new MargheritaPizza();
            case "Pepperoni":
                return new PepperoniPizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type");
        }
    }
}
