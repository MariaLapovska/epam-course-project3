package com.epam.parsers.factories;

import com.epam.parsers.Parser;
import com.epam.parsers.SAXParser;

/**
 * SAX parser factories class (factories method template)
 */
public class SAXParserFactory implements ParserFactory {

    @Override
    public Parser createParser() {
        return new SAXParser();
    }
}
