# Inventory Project 
Utilized inheritance capabilties and built a heirachy of classes using Interfaces and Abstract classes.

-- Comments can be found through the java files for through explanation

Main Abstract Class: Screen

Classes built from Screen
  1. ComputerMonitor
                  1. CRT 
                  2. LED
  2. SmartTv
  
 -- Inventory devices were built from input data 

Inventory Class holds all screen devices/objects 
Methods
        1. Boolean addToInventory()
        2. listComputerMonitor() - returns an arraylist of supertype Computer Monitor
        3. listSmartTv() 

Input/Testing Data can be found under "Inventory.dat"
- contains duplicate data
- holds data necessary to create screen devices



<img src="Class Diagram.png">
<img src="Output.png">
-- Output should mention duplicate date skipped and inventory count for
  1. Screens
  2. Computer Monitors 
  3. Smart tvs
