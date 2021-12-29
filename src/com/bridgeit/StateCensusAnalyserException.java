package com.bridgeit;

public class StateCensusAnalyserException extends Exception {

	private static final long serialVersionUID = 1L;
	
	String error;
	
	public StateCensusAnalyserException(String string) {
		if(string == "Incorrect file") {
			error = string;
		}
		if(string == "No file found") {
			error = string;
		}
	}

	@Override
	public String toString() {
		return "StateCensusAnalyserException : " + error;
	}

}
