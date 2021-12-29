package com.bridgeit;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class StateCensusAnalyser {
	
	private static final String Location = "D:\\project\\training\\bridgelabz_rpf\\StateCencusAnalyser\\src\\Data";
	
	public int readCSV(String name) throws IOException, StateCensusAnalyserException, CsvValidationException {
		int i=0;
		try {
			
			String fileName = Location+"\\" + name + ".csv";
	        CSVReader csvReader = new CSVReader(new FileReader(fileName));
	        String[] nextRecord;
	        String[] header = csvReader.readNext();
	        
	        if(header[0].length() != 5 && header[1].length() != 11) {
	        	throw new StateCensusAnalyserException("Incorrect file");
	        }
	        while ((nextRecord = csvReader.readNext()) != null) { 
	        	 for (String cell : nextRecord) {
	                 System.out.print(cell + ", ");
	             }
	             System.out.println();
	             i++;
	        }
	        System.out.println("Number of Records in csv : "+i);
	    }
	    catch (FileNotFoundException e) {
	    	try {
			throw new StateCensusAnalyserException("No file found");
	    	}catch(StateCensusAnalyserException ex) {
	    		System.out.println(ex);
	    	}
		}
		catch (NullPointerException e) {
			try {
			throw new StateCensusAnalyserException("Incorrect file");
			}catch(StateCensusAnalyserException ex) {
				System.out.println(ex);
			}
		}
		catch(StateCensusAnalyserException ex) {
			System.out.println(ex);
		}
		
		return i;
	}
}
