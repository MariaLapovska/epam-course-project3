//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.05 at 08:37:55 PM EEST 
//


package com.epam.tariff;

import com.epam.tariff.Tariff.Plan;
import com.epam.tariff.Tariff.Plan.CallPrices;
import com.epam.tariff.Tariff.Plan.Parameters;
import com.epam.tariff.Tariff.Plan.Parameters.FavouriteNumber;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factories methods for each
 * Java content interface and Java element interface 
 * generated in the com.epam.tariff package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epam.tariff
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tariff }
     * 
     */
    public Tariff createTariff() {
        return new Tariff();
    }

    /**
     * Create an instance of {@link Tariff.Plan }
     * 
     */
    public Plan createPlan() {
        return new Plan();
    }

    /**
     * Create an instance of {@link Tariff.Plan.Parameters }
     * 
     */
    public Parameters createPlanParameters() {
        return new Parameters();
    }

    /**
     * Create an instance of {@link Tariff.Plan.CallPrices }
     * 
     */
    public CallPrices createPlanCallPrices() {
        return new CallPrices();
    }

    /**
     * Create an instance of {@link Tariff.Plan.Parameters.FavouriteNumber }
     * 
     */
    public FavouriteNumber createPlanParametersFavouriteNumber() {
        return new FavouriteNumber();
    }
}