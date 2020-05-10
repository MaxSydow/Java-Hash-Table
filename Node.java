import java.io.*;

/**
 *  creates a Node object
 *     instance vairables: Fname, Lname, phone, email, next
 * @author Max Sydow
 * @version.1 7/12/2018
 */

public class Node
    {  
        /** declaration of instance variables  */
        public String Fname;
        public String Lname;
        public String name;
        public String phone;
        public String email;
        public Node next;
        
        /**  Node constructor   */
       public Node(String newFname, String newLname, String newPhone, String newEmail, Node nextNode)
       {           
            Fname = newFname;
            Lname = newLname;
            phone = newPhone;
            email = newEmail;
            next = nextNode;            
       }
       /**  accessor and mutator methods including link to next node */
       public String getFname()
       {
           return Fname;        
       }
       public void setFname(String Fname)
       {
           this.Fname = Fname;
       }
       public String getLname()
       {
          return Lname;
       }
       public void setLname(String Lname)
       {
           this.Lname = Lname;
       }
       public String getPhone()
       {
           return phone;
       }
       public void setPhone(String Phone)
       {
           this.phone = Phone;
       }
       public String getEmail()
       {
           return email;
       }
       public void setEmail(String Email)
       {
           this.email = Email;
       }
       public Node getNextNode()
       {
           return next;
       }
       public void setNextNode(Node nextNode)
       {
           next = nextNode;
       }       
    }   