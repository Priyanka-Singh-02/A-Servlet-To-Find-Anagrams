This is a Java web application that reads strings from a text file and finds pairs that are anagrams. It uses:
1) HTML front-end forms for user interaction
2) A Java Servlet (Insert.java) to read and process file content
3) Basic string comparison logic to detect anagrams

This project is useful for:
1) Detecting anagram pairs from a file (ex. word processing)
2) Demonstrating Java Servlets, file I/O, and basic web application development
3) Learning how to tokenize strings, sort characters, and compare arrays in Java

Recommended Setup:
   Tool	              Recommended Version
1) Java JDK	          Java 11 or later
2) Servlet container	Apache Tomcat 9 or later
3) An IDE of your choice (ex. IDE	IntelliJ IDEA / Eclipse )

Note:
1) Make sure c:/myfile.txt exists or change the file path in Insert.java:
   BufferedReader br = new BufferedReader(new FileReader("c:/myfile.txt"));
   The file should contain one or more words separated by a . (period), which is used as the delimiter.
