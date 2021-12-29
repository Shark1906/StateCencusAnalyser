package com.bridgeit;

import java.io.IOException;
import java.util.Scanner;

import com.opencsv.exceptions.CsvValidationException;

public class StateCencusMain {

	public static void main(String[] args) throws IOException, CsvValidationException, StateCensusAnalyserException {
		
		Scanner sc = new Scanner(System.in);
		StateCensusAnalyser analyser = new StateCensusAnalyser();
		System.out.println("Enter File Name");
		String fileName = sc.nextLine();
		analyser.readCSV(fileName);
		
	}

}
