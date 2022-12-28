package com.bridgelabz.opencsv.IndianCensus;

public class CensusAnalyserException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	enum ExceptionType {
        CENSUS_FILE_PROBLEM, UNABLE_TO_PARSE, INCORRECT_HEADER_OR_DELIMITER
    }

    ExceptionType type;

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public CensusAnalyserException(String message, ExceptionType type, Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}