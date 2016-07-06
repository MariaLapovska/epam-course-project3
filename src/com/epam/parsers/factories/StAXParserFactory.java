package com.epam.parsers.factories;

import com.epam.parsers.Parser;
import com.epam.parsers.StAXParser;

/**
 * StAX parser factories class (factories method template)
 */
public class StAXParserFactory implements ParserFactory {

    @Override
    public Parser createParser() {
        return new StAXParser();
    }
}