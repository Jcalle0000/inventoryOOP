//public class Main
//{
//    public static void main (String [] args)
//    {
////        System.out.printf("%s","Hello World");
//
//
//    }
//}


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static final SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
    Inventory inventoryList = new Inventory(); //InventoryList is created through Inventory class created

    public static void main(String[] args) throws Exception
    {

        Inventory inventoryList = new Inventory();

        Scanner scanner = new Scanner(new File("Inventory.dat"));

        // skip file's header
        String line = scanner.nextLine();

        while (scanner.hasNextLine())
        {
            boolean result = false; // result is intialized to false
            line = scanner.nextLine();
            String[] arrLine = line.split(","); // returns an array of seperate words // array of strings
            Screen screen = null; // Screen Object is created
            // Here we are assigning our Screen object
            try
            {
                /** subclass objects are created */
                if (arrLine.length == 6)
                    screen = new CRT(Double.parseDouble(arrLine[5]), Long.parseLong(arrLine[0]), Double.parseDouble(arrLine[1]), formatter.parse(arrLine[2]), arrLine[3], arrLine[4]);
                else if (arrLine.length == 7)
                    screen = new SmartTV(arrLine[6], Long.parseLong(arrLine[0]), Double.parseDouble(arrLine[1]), formatter.parse(arrLine[2]), arrLine[3], arrLine[4]);
                else
                    screen = new LED(Long.parseLong(arrLine[0]), Double.parseDouble(arrLine[1]), formatter.parse(arrLine[2]), arrLine[3], arrLine[4]);

                // IF Oobject was created add the object into Inventory
                if (screen != null)
                {
                    result = inventoryList.addToInventory(screen); // if added to the list, make result TRUE?
                    if (!result) // If false - skip the object and dont add to inventory? - meaning if no object could be created from the data
                        System.err.println(String.format("Failed to add to inventory, skipping: %s", line));
                }
            }
            // parse returns the string format to either a double
            catch (Exception ex)
            {
                /** UNCOMMENT FOR DEBUGGING */
                // Uncomment this line when debugging your code to see the full stack trace
                 ex.printStackTrace();
                System.err.println("Duplicate inventory, skipping: " + line);
            }
        }

        System.out.printf("There are %d Screens in the inventory%n", inventoryList.inventoryCount());
        // Inventory Count is a function of InventoryList

//        inventoryList.print();
        ArrayList<ComputerMonitor> listComputerMonitor = inventoryList.listComputerMonitor();
        //ArrayList of ComputerMonitor is created
        // ListComputerMonitor returns this arrayList
        // Since listComputerMonitor is an an arrayList, it has the default function size
        System.out.printf("There are %d Computer Monitors%n", listComputerMonitor.size());

//
        ArrayList<SmartTV> listSmartTV = inventoryList.listSmartTV();
        System.out.printf("There are %d Smart TVs%n", listSmartTV.size());
//
        inventoryList.printInventory();
//
        scanner.close();
    }
}