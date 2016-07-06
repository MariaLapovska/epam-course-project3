package com.epam.parsers.factories;

import com.epam.parsers.Parser;
import com.epam.parsers.DOMParser;

/**
 * DOM parser factories class (factories method template)
 */
public class DOMParserFactory implements ParserFactory {

    @Override
    public Parser createParser() {
        return new DOMParser();
    }
}
