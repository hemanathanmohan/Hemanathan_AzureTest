package com.perfecto.sampleproject;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileMove {
	static String name ="";

	public static void main(String[] args) throws Throwable {
		file();
		movefile();
	}
	public static void movefile() throws Throwable {
		Path temp = Files.move
				(Paths.get("C:\\Users\\HemanathanHemanathan\\Desktop\\Test\\"+name), 
						Paths.get("C:\\Users\\HemanathanHemanathan\\Desktop\\Test1\\Dummytest.txt"));

		if(temp != null)
		{
			System.out.println("File renamed and moved successfully");
		}
		else
		{
			System.out.println("Failed to move the file");
		}

	}

	public static void file() {

		File folder = new File("C:\\Users\\HemanathanHemanathan\\Desktop\\Test");
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				//System.out.println("File " + listOfFiles[i].getName());
				name = listOfFiles[i].getName();
				System.out.println("name of file"+name);
			} else if (listOfFiles[i].isDirectory()) {
				System.out.println("Directory " + listOfFiles[i].getName());
				
			}
		}
	}
	
}
