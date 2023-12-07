package com.logic.collections;
import java.io.*;  
import java.util.*;  
 class ArrayListEx {  
  
        public static void main(String [] args)  
        {  
          ArrayList<String> al=new ArrayList<String>();  
          al.add("Ismail");    
          al.add("Vijay");    
          al.add("Tushar");    
            
          try  
          {  
              //Serialization  
              FileOutputStream fos=new FileOutputStream("file");  
              ObjectOutputStream oos=new ObjectOutputStream(fos);  
              oos.writeObject(al);  
              fos.close();  
              oos.close();  
              //Deserialization  
              FileInputStream fis=new FileInputStream("file");  
              ObjectInputStream ois=new ObjectInputStream(fis);  
            ArrayListEx  list=(ArrayListEx)ois.readObject();  
            System.out.println(list);    
          }catch(Exception e)  
          {  
              System.out.println(e);  
          }  
       }  
    }  