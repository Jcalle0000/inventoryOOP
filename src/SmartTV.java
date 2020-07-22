import java.util.Date;

public class SmartTV extends Screen
{
    private String operatingSystem;

    // Constructer inheriting from Screen
    SmartTV(String operatingSystem, long id, double salePrice, Date makeDate, String manufacturer, String model)
    {
        super(id, salePrice, makeDate, manufacturer, model);
        this.operatingSystem=operatingSystem;
    }

    public void setOperatingSystem(String tempOperatingSystem)
    {
        this.operatingSystem=tempOperatingSystem;
    }

    public String getOperatingSystem()
    {
        return operatingSystem;
    }


    @Override
    String getType()
    {
        return "Smart";
    }

    @Override
    boolean equals(Screen object)
    {
//        if(object == null)
//            return false;
//
//        if(object instanceof SmartTV)
//        {
//            return this.s
//        }
        return false;
    }
}
