import java.util.Date;

// Abstract class because we never tend to make objects of this class?

abstract class ComputerMonitor extends Screen
{
    /** (extend keywords) Inherents from Screen Class */


    // public constructor is needed as
    // constructor from Screen class in not inherited
    public ComputerMonitor(long id, double salePrice, Date makeDate, String manufacturer, String model )
    {
        // explicit call to SuperClass Screen
        super(id, salePrice, makeDate, manufacturer, model);
    }

//    abstract
}
