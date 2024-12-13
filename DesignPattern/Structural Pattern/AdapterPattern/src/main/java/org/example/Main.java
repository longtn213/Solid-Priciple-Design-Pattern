package org.example;

import org.example.demo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Vehicle bus = new Bus();
//        Vehicle car = new Car();
//        Vehicle bicycle = new BicycleAdapter(new Bicycle());
//
//        bus.accelerate();
//        car.accelerate();
//        bicycle.accelerate();

//        CSVParser realEstateDataParser = new RealEstateDataParser();
//        CSVParser machineLearningDataParser = new MachineLearningDataParser();
//        CSVParser stackMarketDataParser = new StackMarketDataParserAdapter(new StackMarketDataParser());
//
//        realEstateDataParser.handleCSVFile();
//        machineLearningDataParser.handleCSVFile();
//        stackMarketDataParser.handleCSVFile();

        //Adapter in Java language
        String[] names = {"Adam","Kevin","Ana","Joe"};
        List<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));

    }
}