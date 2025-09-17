This is a Java web application that reads strings from a text file and finds pairs that are anagrams. It uses:
1) HTML front-end forms for user interaction
2) A Java Servlet (Insert.java) to read and process file content
3) Basic string comparison logic to detect anagrams

This project is useful for:
1) Detecting anagram pairs from a file (ex. word processing)
2) Demonstrating Java Servlets, file I/O, and basic web application development
3) Learning how to tokenize strings, sort characters, and compare arrays in Java

Recommended Setup:
1) Java JDK - Java 11 or later
2) Servlet container - Apache Tomcat 9 or later
3) IDE - NetBeans

Note:
1) Make sure c:/myfile.txt exists or change the file path in Insert.java:
   BufferedReader br = new BufferedReader(new FileReader("c:/myfile.txt"));
   The file name should contain one or more words separated by a . (period), which is used as the delimiter.
   This will read all the words that you have written in file line-by-line

Steps to Run:

1) Open the folder in NetBeans (Anagram\)__
   (Make sure your project has the below structure)__

<img width="499" height="284" alt="Screenshot 2025-09-17 182828" src="https://github.com/user-attachments/assets/17fba425-9a1c-444f-99d4-14259a0e4b18" />

  Note:__ 
  WEB-INF/web.xml: Tells Tomcat how to map URLs to servlets.__

2) Download Tomcat
   Link - https://tomcat.apache.org/download-90.cgi
   i) Extract the ZIP to a folder (e.g., C:\tomcat9)__
   ii) Start Tomcat__
                On Windows:__
                  Run bin/startup.bat__
                On Linux/Mac:__
                  Run bin/startup.sh__
   iii) Verify it's running
        Go to : http://localhost:8080/ (You should see the Tomcat welcome page)

4) Go to Run → Server and select Apache Tomcat__
   (If not available, click Add Server, and provide Tomcat path )

5) Right-click project → Run__
   NetBeans will:__
   i)Compile your .java files into .class__
   ii)Package everything__
   iii)Deploy it to Tomcat automatically__

6) Go to http://localhost:8080/Anagram/Insert or equivalent path

7) Input the file name from which we have to check anagrams ( myfile )

8) Click on Check Anagrams
   
All improvements — big or small — are welcome!
