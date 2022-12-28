package com.bridgelabz.opencsv.IndianCensus;

import com.opencsv.bean.CsvBindByName;

public class IndiaStateCSV {
    @CsvBindByName(column = "State Name", required = true)
    private String state;
    @CsvBindByName(column = "StateCode", required = true)
    private String stateCode;

    @Override
    public String toString() {
        return "IndiaStateCSV{" +
                "state='" + state + '\'' +
                ", stateCode='" + stateCode + '\'' +
                '}';
    }
}