import java.io.*;

/**
 *  creates a Hashtable object using an array of Node objects with size 13
 *     instantiates Node object firstNode and instance variable name
 * @author Max Sydow
 * @version.1 7/12/2018
 */

public class Hashtable
{
    /**  array to store hashed values  */
    private static Node[] nodeList = new Node[13]; 
    /** another node in case index already used   */
    private Node firstNode;
    /** variable for concatenated first and last name   */
    public String name;
          
    /** Insert method to add name, phone number, and email to hashed array
     * @param Fname, @param Lname, @param Phone, @param Email
     * This method will create a new node, use the variable "name" to create 
     * the index called hashPosition using the Java hashCode() function
     * using modulo 13, since there are 13 values in the array.  
     */
    public void Insert(String Fname, String Lname, String Phone, String Email)
    {  
       
        Node newNode = new Node(Fname, Lname, Phone, Email, null);
        String name = Fname.concat(Lname);       
        int hashPosition = Math.abs(name.toUpperCase().hashCode()%13);
        /** if the indexed value is empty, add it at it's index  */
        if(nodeList[hashPosition] == null)
        {
        nodeList[hashPosition] = newNode;
        }
        /** if index is being used, add new node to point to next in list  */
        else
        {
            newNode.setNextNode(firstNode);
            firstNode = newNode;            
        }
            
        System.out.println(Fname + " " + Lname + " has been added at index " + hashPosition);
                                
    } 
    
    /** Lookup method to find where an entry is indexed
     * @param Fname, @param Lname
     */
    public void Lookup(String Fname, String Lname)
    {
        
        String name = Fname.concat(Lname);
        int hashPosition = Math.abs(name.toUpperCase().hashCode()%13);
        /** if entry has not been deleted the method looks it up  */
        if(nodeList[hashPosition] != null){                            
            String lookupFname = nodeList[hashPosition].getFname();            
            String lookupLname = nodeList[hashPosition].getLname();            
            System.out.println(lookupFname + " " + lookupLname + " is at index " + hashPosition);
        }
        /** if entry has been deleted, print a statement  */
        else {
            System.out.println(Fname + " " + Lname + " not found");
        }                            
    }      
    
    /**  Delete method to delete a node according to it's position
     * @param Fname, @param Lname
     */
    public void Delete(String Fname, String Lname)
    {        
        String name = Fname.concat(Lname);
        int hashPosition = Math.abs(name.toUpperCase().hashCode()%13);
        String lookupFname = nodeList[hashPosition].getFname();
        String lookupLname = nodeList[hashPosition].getLname();
        System.out.println(lookupFname + " " + lookupLname + " has been removed.");
        nodeList[hashPosition] = null;
                       
    }
    
    /** displayTable method to display node name data according to 
     * position including index
     */
    public void displayTable()
    {
        for(int i = 0; i < 13; i++){
            System.out.print(i + ":");
            Node newNode = nodeList[i];
            while(newNode != null){
                System.out.print(newNode.getFname() + " " + newNode.getLname() + "->" + " ");
                newNode = newNode.getNextNode();
            }            
            System.out.println();
        }
    }
}
