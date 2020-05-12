# About

This is a hash table created using Java.  It is a data structure used to store key/value pairs which are indexed and created using a **node** class.  **Hashtable** and **Main** classes are also used.

# Class descriptions

classes and functions/methods are indicated in **bold**

variables and indeces are indicated in __italics__


**Node**

 *  Creates a Node object consisting of __first name__, __last name__, __phone number__, and __email address__ using **get()** and **set()** methods
 
**Hashtable**
 *  Instantiates an array to store hashed values
Insert()** - This method creates a new node, using the variable __name__ to create an index called __hashPosition__ using the Java **hashCode()** function
    Uses modulo 13, as the array is restricted to 13 values
    
**Lookup()** - finds where an entry is indexed

**Delete()** - deletes a node according to its position

**displayTable()** - displays node name according to position in index

**Main**
Calls **Insert()**, **Lookup()**, and **Delete()** methods from **Hashtable** class to add, find, and remove data with given parameters
   
