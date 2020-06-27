
 
   package Ancontroller;


import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;
import javax.servlet.annotation.WebServlet;
 @WebServlet(urlPatterns = {"/Insert"})
public class Insert extends HttpServlet   
{
@Override
  public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException  
  {
    res.setContentType("text/html");
    PrintWriter pw = res.getWriter();

    BufferedReader br = new BufferedReader(new FileReader("c:/myfile.txt"));

   String str;
 
   StringBuilder sb = new StringBuilder();

    while( (str = br.readLine()) != null )
    {
    
   sb.append(str+"." + "<br>");
    }
   str= sb.toString();
 
   String mydelim = "."; 
  StringTokenizer o = new StringTokenizer(str,mydelim);
     
        List<String> elements = new ArrayList<String>();
 
       
        while(o.hasMoreTokens()) {
 
            
            elements.add(o.nextToken());
        }
 int size= elements.size();
 pw.println(size +"=Size of arraylist"+ "<BR>"+"<br>");
       
        pw.println("Original String :"+ str + "<br>");
        pw.println("Printing elements in ArrayList :"+ "<br> " );
        
        for(String element : elements) 
        {
            pw.println(element+" ");
        }
        for (int i = 0; i < elements.size()-1;i++) 
	      { 		      
	        String s1=elements.get(i);
	        for( int j =i+1; j <elements.size();j++)
                {
                  String s2= elements.get(j);
            
                  if(s1.length() != s2.length())
                        {
                         pw.println(" ");
                        }
                        else
                        {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
           
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            if ((Arrays.equals(arr1,arr2)))
            {
                pw.println(s1+"  "+"they are anagrams"+"  "+ s2 + "<br>");
            }
               else
            {
                pw.println(""+"<br>");
            }
        
               
                    }
                }
              }
 }
 }
  

                
 