package org.example.demo;

import org.example.CSVParser;
import org.example.StackMarketDataParser;

public class StackMarketDataParserAdapter implements CSVParser {
    private StackMarketDataParser parser;
    public StackMarketDataParserAdapter(StackMarketDataParser parser) {
        this.parser = parser;
    }

    @Override
    public void handleCSVFile() {
        parser.handleXMLFormat();
    }
}
