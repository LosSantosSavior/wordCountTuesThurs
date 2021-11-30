package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    var fileLoc = Paths.get("warAndPeace.txt");
	    List<String> allLines = null;
	    try {
	        allLines = Files.readAllLines(fileLoc);
        } catch (IOException e)  {
            System.out.println("Error reading file...");
        }
	    if (allLines == null)
            System.exit(-1);
    }
}
