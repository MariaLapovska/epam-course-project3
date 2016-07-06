package com.epam.parsers.factories;

import com.epam.parsers.Parser;

/**
 * Parser factories interface (factories method template)
 */
public interface ParserFactory {
    Parser createParser();
}