/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

/**
 * A class that creates different kinds of pizzas
 * depending on their type.
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 */
class PizzaFactory 
{
    /**
     * returns a concrete pizza object
     * @param type the type of pizza to return
     * @return 
     */
    public Pizza createPizza(String type)
    {
        Pizza pizza = null;
        if(type.equals("cheese"))
        {
            pizza = new CheesePizza();
        }
        else if (type.equals("pepperoni"))
        {
                pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
