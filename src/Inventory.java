import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Inventory
{
    private static final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    final ArrayList<Screen> listInventory = new ArrayList<>(); // Holds objects of Screen type
    private static final String DASHES7= "-------";
    private static final String DASHES13="-------------";

    /**
     * public constructor
     */
    Inventory()
    {
    }

    int inventoryCount()
    {
        return listInventory.size();
    }

    /* checking if similar instance is already stored in the list // If there is one, we throw an exception of type EXceptions
    Message: "The inventory contains a similar Screen Object */
    boolean addToInventory(Screen Object) {
        boolean contain = listInventory.contains(Object); // check if object is inside the arrayList
        // maybe we can check how the contains algorithm wirjs
        boolean ans = false;// by default so we dont add?
        try {
            //  if listInventory contains the Screen it will return true */
            /** Contains methods requires that each subclass to implement the methods equals?????*/
            if (contain == true) // this can be simplified to 'contain'
            {
                throw new Exception();
            }
            //If contain is false, we can add the element // we would always want to return true that were addingToInventory
            else {
                listInventory.add(Object);
//                System.out.printf("%s %n",Object.getid() );
                ans = true;// we added so we want to return true
            }
        } catch (Exception exception) {
            System.out.printf("%s", "The Inventory contains a similar Screen object");
            // and then does this skip the object?
        }
        return ans;
    }


    public ArrayList<ComputerMonitor> listComputerMonitor() /** Is public needed to be used in another function (print Inventory? */
    {
        ArrayList<ComputerMonitor> monitorList = new ArrayList<ComputerMonitor>();
//        Screen currentScreen;
        for (Screen currentScreen:listInventory)
        {
//            currentScreen = listInventory.get(i);
            if (currentScreen instanceof LED)
            {
                // We downcast our currentScreen to LED
                LED newLED = (LED) currentScreen;
//                System.out.printf("%s %n",newLED.getid() );
                monitorList.add(newLED); /** We add out newLED object into the list */
            }
            else if (currentScreen instanceof CRT)
            {
                CRT newCRT = (CRT) currentScreen;
//                System.out.printf("%s %n",newCRT.getid() );
                 monitorList.add(newCRT);
            }
//            i++;
        }
        return monitorList;
    }

    public ArrayList<SmartTV> listSmartTV()
    {
        ArrayList<SmartTV> tvList=new ArrayList<SmartTV>();
       // Screen currentScreen;
        /** Probably should have made this a world variable since its used in both functions */
        for(Screen currentScreen:listInventory) // this way we dont need i++
        {
            if(currentScreen instanceof SmartTV)
            {
                // DownCasting
                SmartTV newSmartTv=(SmartTV) currentScreen;
                tvList.add(newSmartTv);
            }
        }
        return tvList;
    }



    void printInventory()
    {
        LED currentLED;
        CRT currentCRT;
        SmartTV currentSmartTV;
        Date date;
        int month,day, year;
        Calendar cal= Calendar.getInstance();


        System.out.printf("%s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %n"
                                    ,"+",DASHES7, "+",DASHES13,"+",DASHES13,
                                     "+",DASHES13,"+",DASHES13, "+",DASHES7, "+",DASHES13,"+",DASHES13,"+");
        System.out.printf("%s %5s %3s %7s %7s %8s %6s %11s %3s %2s %2s %6s %2s %8s %6s %8s %6s %n",
                   "|", "Type", "|" ,"ID", "|" ,"Price", "|" , " Make Date", "|" ,"Manufacturer", "|" , "Model", "|" ,"Glass", "|" ,"OS", "|");

        System.out.printf("%s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %n"
                ,"+",DASHES7, "+",DASHES13,"+",DASHES13,
                "+",DASHES13,"+",DASHES13, "+",DASHES7, "+",DASHES13,"+",DASHES13,"+");

        int i =0;
        for(Screen currentScreen:listInventory )
        {

            if(currentScreen instanceof LED)
            {
                i++;
                currentLED=(LED) currentScreen; // Donwncasting
                date=currentLED.getMakeDate();
                cal.setTime((date));
                day=cal.get(Calendar.DAY_OF_MONTH);
                month=cal.get(Calendar.MONTH);
                year=cal.get(Calendar.YEAR);
                String strDate=month+"/"+day+"/"+year;


                System.out.printf("%s %5s %3s %12s %2s %10s %4s %11s %3s %10s %4s %8s %1s %7s %6s %12s %2s %n",
                        "|", currentLED.getType(), "|" , currentLED.getid() , "|" ,currentLED.getSalePrice(),
                        "|" , strDate, "|" ,currentLED.getManufacturer(), "|" , currentLED.getModel(), "|" ," ", "|" ," ", "|");
            }

            else if(currentScreen instanceof CRT)
            {
                i++;
                currentCRT=(CRT) currentScreen;
                date=currentCRT.getMakeDate();
                cal.setTime(date);
                day=cal.get(Calendar.DAY_OF_MONTH);
                month=cal.get(Calendar.MONTH);
                year=cal.get(Calendar.YEAR);
                String strDate=month+"/"+day+"/"+year;

                System.out.printf("%s %5s %3s %12s %2s %10s %4s %11s %3s %10s %4s %8s %1s %7s %6s %12s %2s %n",
                        "|", currentCRT.getType(), "|" , currentCRT.getid() , "|" ,currentCRT.getSalePrice(),
                        "|" , strDate, "|" ,currentCRT.getManufacturer(), "|" , currentCRT.getModel(), "|" , currentCRT.getGlassThickness(), "|" , " ", "|");
            }

            else if (currentScreen instanceof SmartTV)
            {
                i++;
                currentSmartTV=(SmartTV) currentScreen;
                date=currentSmartTV.getMakeDate();
                cal.setTime(date);
                day=cal.get(Calendar.DAY_OF_MONTH);
                month=cal.get(Calendar.MONTH);
                year=cal.get(Calendar.YEAR);
                String strDate=month+"/"+day+"/"+year;

                System.out.printf("%s %5s %3s %12s %2s %10s %4s %11s %3s %10s %4s %8s %1s %7s %6s %12s %2s %n",
                        "|", currentSmartTV.getType(), "|" , currentSmartTV.getid() , "|" ,currentSmartTV.getSalePrice(),
                        "|" , strDate, "|" ,currentSmartTV.getManufacturer(), "|" , currentSmartTV.getModel(), "|" , " ", "|" , currentSmartTV.getOperatingSystem(), "|");
            }


        }
        System.out.printf("%s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %n"
            ,"+",DASHES7, "+",DASHES13,"+",DASHES13,
            "+",DASHES13,"+",DASHES13, "+",DASHES7, "+",DASHES13,"+",DASHES13,"+");

//        System.out.printf("%s", i);

    }

}