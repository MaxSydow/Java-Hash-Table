import java.io.*;

/** calls methods Insert, Lookup, and Delete, Hashtable to 
 *       add, find, remove, Hashtable data with given parameters
 *
 * @author Max Sydow
 * @version.1 7/12/2018
 */

public class Main
{
/**  instantiate Hastable object  */   
    private static Hashtable Hash = new Hashtable();
    public static void main(String args[])
    {        
       Hash.Insert("Bob", "Smith", "555-235-1111", "bsmith@somewhere.com");        
       Hash.Insert("Jane", "Williams", "555-235-1112", "jw@something.com");
       Hash.Insert("Mohammed", "al-Salam", "555-235-1113", "mas@someplace.com");
       Hash.Insert("Pat", "Jones", "555-235-1114", "pjones@homesweethome.com");
       Hash.Insert("Billy", "Kidd", "555-235-1115", "billy_the_kid@nowhere.com");
       Hash.Insert("H.", "Houdini", "555-235-1116", "houdini@noplace.com");
       Hash.Insert("Jack", "Jones", "555-235-1117", "jjones@hill.com");
       Hash.Insert("Jill", "Jones", "555-235-1118", "jillj@hill.com");
       Hash.Insert("John", "Doe", "555-235-1119", "jdoe@somedomain.com");
       Hash.Insert("Jane", "Doe", "555-235-1120", "jdoe@somedomain.com");
       Hash.Lookup("Pat", "Jones");
       Hash.Lookup("Billy", "Kidd");
       Hash.Delete("John", "Doe");
       Hash.Insert("Test", "Case", "555-235-1121", "Test_Case@testcase.com");
       Hash.Insert("Nadezhda", "Kanachekhovskaya", "555-235-1122", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru");
       Hash.Insert("Jo", "Wu", "555-235-1123", "wu@h.com");
       Hash.Insert("Millard", "Fillmore", "555-235-1124", "millard@theactualwhitehouse.us");
       Hash.Insert("Bob", "vanDyke", "555-235-1125", "vandyke@nodomain.com");
       Hash.Insert("Upside", "Down", "555-235-1126", "upsidedown@rightsideup.com");
       Hash.Lookup("Jack", "Jones");
       Hash.Lookup("Nadezhda", "Kanachekhovskaya");
       Hash.Delete("Jill", "Jones");
       Hash.Delete("John", "Doe");
       Hash.Lookup("Jill", "Jones");
       Hash.Lookup("John", "Doe");
       Hash.displayTable();
    }
}
