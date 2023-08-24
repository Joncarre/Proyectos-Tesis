package main;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import data.CustomReadFile;
import data.CustomWriteFile;

public class Main {

	/**
	 * @author J. Carrero
	 * @param args
	 */
    public static void main(String[] args) {
		try {
			Engine engine = new Engine();
			engine.start();
		} catch (IOException e) {
			System.out.println("Error - Main: " + e.getMessage());
		}
    }
}





