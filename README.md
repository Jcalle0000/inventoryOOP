# Inventory Project 
Utilized inheritance capabilties and built a heirachy of classes using Interfaces and Abstract classes.

-- Comments can be found through the java files for through explanation
-- Getters and setters are made for all objects 

Main code can be found in the src folder

Main Abstract Class: <b> Screen </b>

Classes built from Screen
  1. ComputerMonitor <br>
                  1. CRT <br>
                  2. LED
  2. SmartTv
  
 -- Inventory devices were built from input data 

Inventory Class holds all screen objects <br>
Methods <br>
        1. Boolean addToInventory() <br>
        2. listComputerMonitor() - returns an arraylist of supertype Computer Monitor <br>
        3. listSmartTv() <br>

ArrayList for <b>Screen Devices</b> <br>
  -- ArrayLists were used in order to improve code efficiency and increase use of methods provided  by the data structure <br>
  -- devices are inserted into into the list in O(n) <br>
  -- try/catch statements are used in order to show messages of duplicate data when encountered <br>

ArrayList for <b>ComputerMonitors</b><br>
-- as we iterate through the list of <i>Screen Devices</i> we further categorize objects based on their data input creating a new array list called computerMonitors containing objects of CRT and LED 

Arraylist for SmartTv
-- the process is the same for listSmartTv

-- Data was formated by iterating through the listInventory 

Input/Testing Data can be found under "Inventory.dat"
- contains duplicate data
- holds data necessary to create screen devices

Output should mention duplicate date skipped and inventory count for
  1. Screens
  2. Computer Monitors 
  3. Smart tvs



<img src="Class Diagram.png">
<img src="Output.png">

