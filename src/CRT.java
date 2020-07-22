import java.util.Date;

public class CRT extends ComputerMonitor
{
    // New variable is set in the constructor
    private double glassThickness;

    CRT(double glassThickness, long id, double salePrice, Date makeDate, String manufacturer, String model)
    {
        // Inherited from Computer Monitor
        super(id,salePrice, makeDate, manufacturer,model);

        this.glassThickness=glassThickness;
    }


    public double getGlassThickness()
    {
        return glassThickness;
    }

    public void setGlassThickness(double tempGlassThickness)
    {
        glassThickness=tempGlassThickness;
    }


    /** Essentially adding more functions? */
    @Override
    String getType()
    {
        return "CRT";
    }

    //What objects are we comparing?
    @Override
    boolean equals(Screen Object)
    {
//        if(Object.getid()==)
        return false;
    }
}
