
package pizzashop;

/**
 * A class to model pizzas that only have cheese on them
 * Note that the following source was used as a reference in 
 * creating this example:
 * Freeman, E.Freeman, E., Sierra, K., & Bates, B. (2004). Head First Design patterns. Sebastopol, CA: O'Reilly.
 * @author dancye
 */
public class CheesePizza extends Pizza
{
    public CheesePizza()
    {
        super();
        super.addTopping("cheese");
    }
    public void bake(int temp)
    {
        super.bakeTemp = temp;
        //do some baking here, code not implemented yet
        //not necessary for the review
    }
}
