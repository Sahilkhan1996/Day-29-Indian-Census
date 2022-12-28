package com.bridgelabz.opencsv.IndianCensus;
import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {
    @CsvBindByName
    private String State;
    @CsvBindByName(column = "Population", required = true)
    private String Population;
    @CsvBindByName(column = "AreaInSqKm")
    private String AreaInSqKm;
    @CsvBindByName
    private String DensityPerSqKm;

    @Override
    public String toString() {
        return "IndiaCensusCSV{" +
                "State='" + State + '\'' +
                ", Population='" + Population + '\'' +
                ", AreaInSqKm='" + AreaInSqKm + '\'' +
                ", DensityPerSqKm='" + DensityPerSqKm + '\'' +
                '}';
    }
}