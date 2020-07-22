import java.util.Date;

// Abstract classes cannot be used to initiate objects
// SuperClass of ComputerMonitor and SmartTV
public abstract class Screen
{
    /** Variables*/
    private long id;
    private Date makeDate;
    private double salePrice;
    private String manufacturer;
    private String model;

    /** Public constructor*/
    Screen(long id, double salePrice, Date makeDate ,String manufacturer,String model)
    {
        this.id=id;
        this.salePrice=salePrice;
        this.makeDate=makeDate;
        this.manufacturer=manufacturer;
        this.model=model;
    }
    /* public abstract method
    Is a method declared without implementation
     */
    abstract String getType();
    abstract boolean equals(Screen Object); /** Im assuming the Object is Screen  */
    // where is the method described then?
    /** When an abstract class is subclassed,
     * the subclass usually provides implementations for all of the abstract methods
     * in its parents class
     *
     * If it does not subclass must also be declared abstract
     * */
    // This is for CRT objects
//    abstract double getGlassThickness();


    public String toString()
    {
        return id + " " + makeDate + " " + salePrice + " " +
                manufacturer + " " + model;
    }

    /** setters/getters */
    public long getid()
    {
        return id;
    }

    public void setId(long var_ID)
    {
        id=var_ID;
    }

    public double getSalePrice()
    {
        return salePrice;
    }

    public void setSalePrice(double tempSalePrice)
    {
        salePrice=tempSalePrice;
    }

    public void setMakeDate(Date tempDate)
    {
        makeDate=tempDate;
    }

    public Date getMakeDate()
    {
        return makeDate;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String tempManufacturer)
    {
        manufacturer=tempManufacturer;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String tempModel)
    {
        model=tempModel;
    }

}
