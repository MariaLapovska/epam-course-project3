package com.epam.runners;

import com.epam.parsers.*;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.epam.parsers.factories.DOMParserFactory;
import com.epam.parsers.factories.ParserFactory;
import com.epam.parsers.factories.SAXParserFactory;
import com.epam.parsers.factories.StAXParserFactory;
import com.epam.tariff.Tariff;
import com.epam.GlobalConstants;
import com.epam.GlobalConstants.ParserType;

import org.xml.sax.SAXException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

/**
 * Runner class
 */
public class Runner {

    public static void main(String[] args) throws Exception {

        ParserFactory parserFactory = getParserFactory(ParserType.DOM);
        Parser parser = parserFactory.createParser();

        // Parsers
        runParser(parser, GlobalConstants.SOURCE_XML);

        // Validator
        validate(GlobalConstants.SOURCE_XML, GlobalConstants.SOURCE_XSD);

        System.out.println("\n------\n");

        // JAXB
        jaxb(GlobalConstants.SOURCE_XML);
    }

    private static void runParser(Parser parser, String fileName) {
        try {
            parser.parse(new FileInputStream(fileName));
        } catch (Exception ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void validate(String xml, String xsd) {
        try {
            Source schemaFile = new StreamSource(new File(xsd));
            Source xmlFile = new StreamSource(new File(xml));
            SchemaFactory schemaFactory = SchemaFactory
                    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = schemaFactory.newSchema(schemaFile);
            Validator validator = schema.newValidator();

            validator.validate(xmlFile);
            System.out.println(xml + " is valid");
        } catch (SAXException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, xml + " is NOT valid", ex);
        } catch (IOException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void jaxb(String fileName) {
        try {
            JAXBContext context = JAXBContext.newInstance(Tariff.class);
            Unmarshaller unm = context.createUnmarshaller();
            Object tariff =  unm.unmarshal(new File(fileName));
            System.out.println(tariff);
        } catch (JAXBException ex) {
            Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static ParserFactory getParserFactory(ParserType parserType) {
        if (parserType == ParserType.DOM) {
            return new DOMParserFactory();
        } else if (parserType == ParserType.SAX) {
            return new SAXParserFactory();
        } else if (parserType == ParserType.STAX) {
            return new StAXParserFactory();
        } else {
            return null;
        }
    }
}