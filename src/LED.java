import java.util.Date;

// indicating inheritance from ComputerMonitor
public class LED extends ComputerMonitor
{
    LED(long id, double salePrice, Date makeDate, String manufacturer, String model )
    {
       super(id, salePrice, makeDate,manufacturer,model);
    }

    // This made my intelJ
    @Override
    String getType()
    {
        return "LED";
    }

    // What objects are we comparing?
    @Override
    boolean equals(Screen Object) {
        return false;
    }
}
