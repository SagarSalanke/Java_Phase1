package com.filehandling;

import java.io.*;


public class FileHandling {
	public static void main(String[] args){
		 //Writing in the file

		 try
		 {
		FileWriter f = new FileWriter("C:\\Users\\DELL\\Desktop\\File Handling\\Demo.txt");
		 try
		 {
		 f.write("Sumit is the employee of Mphasis limited..!!");
		 }
		 finally
		 {
		 f.close();
		 }
		 System.out.println("Successfully Written..!! ");
		 }
		 catch(IOException i)
		 {
		 System.out.println(i);
		 }

		 }

}
