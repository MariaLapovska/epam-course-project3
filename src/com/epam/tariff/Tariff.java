//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.05 at 08:37:55 PM EEST 
//


package com.epam.tariff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plan" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operator-name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Life"/>
 *                         &lt;enumeration value="Kievstar"/>
 *                         &lt;enumeration value="Vodafone"/>
 *                         &lt;enumeration value="Beeline"/>
 *                         &lt;enumeration value="Utel"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="payroll" type="{}priceType"/>
 *                   &lt;element name="call-prices">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="inside-net-calls" type="{}priceType"/>
 *                             &lt;element name="outside-net-calls" type="{}priceType"/>
 *                             &lt;element name="stationary-phone-calls" type="{}priceType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="sms-price" type="{}priceType"/>
 *                   &lt;element name="parameters">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="favourite-number" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;>priceType">
 *                                     &lt;attribute name="numbers-amount" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           &lt;minInclusive value="0"/>
 *                                           &lt;maxInclusive value="10"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="billing">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="12-second"/>
 *                                   &lt;enumeration value="Minute"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="activation-price" type="{}priceType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="planID" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                       &lt;pattern value="[0-9]{8}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "plan"
})
@XmlRootElement(name = "tariff")
public class Tariff {

    protected List<Plan> plan = new ArrayList<>();

    /**
     * Gets the value of the plan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tariff.Plan }
     * 
     * 
     */
    public List<Plan> getPlan() {
        if (plan == null) {
            plan = new ArrayList<>();
        }

        return this.plan;
    }

    @Override
    public String toString() {

        Collections.sort(plan, new TariffComparator());
        StringBuilder stringBuilder = new StringBuilder();

        for (Tariff.Plan p : plan) {
            stringBuilder.append(p + "\n------\n");
        }

        return "Tariff:\n------\n" + stringBuilder;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="operator-name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Life"/>
     *               &lt;enumeration value="Kievstar"/>
     *               &lt;enumeration value="Vodafone"/>
     *               &lt;enumeration value="Beeline"/>
     *               &lt;enumeration value="Utel"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="payroll" type="{}priceType"/>
     *         &lt;element name="call-prices">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="inside-net-calls" type="{}priceType"/>
     *                   &lt;element name="outside-net-calls" type="{}priceType"/>
     *                   &lt;element name="stationary-phone-calls" type="{}priceType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="sms-price" type="{}priceType"/>
     *         &lt;element name="parameters">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="favourite-number" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;>priceType">
     *                           &lt;attribute name="numbers-amount" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 &lt;minInclusive value="0"/>
     *                                 &lt;maxInclusive value="10"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="billing">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="12-second"/>
     *                         &lt;enumeration value="Minute"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="activation-price" type="{}priceType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="planID" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *             &lt;pattern value="[0-9]{8}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operatorName",
        "payroll",
        "callPrices",
        "smsPrice",
        "parameters"
    })
    public static class Plan {

        @XmlElement(name = "operator-name", required = true)
        protected String operatorName;

        @XmlElement(name = "payroll", required = true)
        protected int payroll;

        @XmlElement(name = "call-prices", required = true)
        protected CallPrices callPrices = new CallPrices();

        @XmlElement(name = "sms-price", required = true)
        protected int smsPrice;

        @XmlElement(name = "parameters", required = true)
        protected Parameters parameters = new Parameters();

        @XmlAttribute(name = "name", required = true)
        protected String name;

        @XmlAttribute(name = "planID", required = true)
        protected int planID;

        /**
         * Gets the value of the operatorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperatorName() {
            return operatorName;
        }

        /**
         * Sets the value of the operatorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperatorName(String value) {
            this.operatorName = value;
        }

        /**
         * Gets the value of the payroll property.
         * 
         */
        public int getPayroll() {
            return payroll;
        }

        /**
         * Sets the value of the payroll property.
         * 
         */
        public void setPayroll(int value) {
            this.payroll = value;
        }

        /**
         * Gets the value of the callPrices property.
         * 
         * @return
         *     possible object is
         *     {@link Tariff.Plan.CallPrices }
         *     
         */
        public CallPrices getCallPrices() {
            return callPrices;
        }

        /**
         * Sets the value of the callPrices property.
         * 
         * @param value
         *     allowed object is
         *     {@link Tariff.Plan.CallPrices }
         *     
         */
        public void setCallPrices(CallPrices value) {
            this.callPrices = value;
        }

        /**
         * Gets the value of the smsPrice property.
         * 
         */
        public int getSmsPrice() {
            return smsPrice;
        }

        /**
         * Sets the value of the smsPrice property.
         * 
         */
        public void setSmsPrice(int value) {
            this.smsPrice = value;
        }

        /**
         * Gets the value of the parameters property.
         * 
         * @return
         *     possible object is
         *     {@link Tariff.Plan.Parameters }
         *     
         */
        public Parameters getParameters() {
            return parameters;
        }

        /**
         * Sets the value of the parameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link Tariff.Plan.Parameters }
         *     
         */
        public void setParameters(Parameters value) {
            this.parameters = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the planID property.
         * 
         */
        public int getPlanID() {
            return planID;
        }

        /**
         * Sets the value of the planID property.
         * 
         */
        public void setPlanID(int value) {
            this.planID = value;
        }

        @Override
        public String toString() {
            return "Plan\n" +
                    "Name: " + name +
                    ", ID: " + planID +
                    ", Operator: " + operatorName +
                    ", Payroll: " + payroll +
                    ", SMS price: " + smsPrice +
                    '\n' + callPrices +
                    '\n' + parameters;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="inside-net-calls" type="{}priceType"/>
         *         &lt;element name="outside-net-calls" type="{}priceType"/>
         *         &lt;element name="stationary-phone-calls" type="{}priceType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "insideNetCalls",
            "outsideNetCalls",
            "stationaryPhoneCalls"
        })
        public static class CallPrices {

            @XmlElement(name = "inside-net-calls", required = true)
            protected int insideNetCalls;

            @XmlElement(name = "outside-net-calls", required = true)
            protected int outsideNetCalls;

            @XmlElement(name = "stationary-phone-calls", required = true)
            protected int stationaryPhoneCalls;

            /**
             * Gets the value of the insideNetCalls property.
             * 
             */
            public int getInsideNetCalls() {
                return insideNetCalls;
            }

            /**
             * Sets the value of the insideNetCalls property.
             * 
             */
            public void setInsideNetCalls(int value) {
                this.insideNetCalls = value;
            }

            /**
             * Gets the value of the outsideNetCalls property.
             * 
             */
            public int getOutsideNetCalls() {
                return outsideNetCalls;
            }

            /**
             * Sets the value of the outsideNetCalls property.
             * 
             */
            public void setOutsideNetCalls(int value) {
                this.outsideNetCalls = value;
            }

            /**
             * Gets the value of the stationaryPhoneCalls property.
             * 
             */
            public int getStationaryPhoneCalls() {
                return stationaryPhoneCalls;
            }

            /**
             * Sets the value of the stationaryPhoneCalls property.
             * 
             */
            public void setStationaryPhoneCalls(int value) {
                this.stationaryPhoneCalls = value;
            }

            @Override
            public String toString() {
                return "Call prices:" +
                        "\n\t-calls inside net: " + insideNetCalls +
                        "\n\t-calls outside net: " + outsideNetCalls +
                        "\n\t-calls to stationary phones: " + stationaryPhoneCalls;
            }
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="favourite-number" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;>priceType">
         *                 &lt;attribute name="numbers-amount" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       &lt;minInclusive value="0"/>
         *                       &lt;maxInclusive value="10"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="billing">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="12-second"/>
         *               &lt;enumeration value="Minute"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="activation-price" type="{}priceType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "favouriteNumber",
            "billing",
            "activationPrice"
        })
        public static class Parameters {

            @XmlElement(name = "favourite-number")
            protected FavouriteNumber favouriteNumber = new FavouriteNumber();

            @XmlElement(name = "billing", required = true)
            protected String billing;

            @XmlElement(name = "activation-price", required = true)
            protected int activationPrice;

            /**
             * Gets the value of the favouriteNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Tariff.Plan.Parameters.FavouriteNumber }
             *     
             */
            public FavouriteNumber getFavouriteNumber() {
                return favouriteNumber;
            }

            /**
             * Sets the value of the favouriteNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Tariff.Plan.Parameters.FavouriteNumber }
             *     
             */
            public void setFavouriteNumber(FavouriteNumber value) {
                this.favouriteNumber = value;
            }

            /**
             * Gets the value of the billing property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBilling() {
                return billing;
            }

            /**
             * Sets the value of the billing property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBilling(String value) {
                this.billing = value;
            }

            /**
             * Gets the value of the activationPrice property.
             * 
             */
            public int getActivationPrice() {
                return activationPrice;
            }

            /**
             * Sets the value of the activationPrice property.
             * 
             */
            public void setActivationPrice(int value) {
                this.activationPrice = value;
            }

            @Override
            public String toString() {
                return "Parameters:" +
                        "\n\t-" + favouriteNumber +
                        "\n\t-billing: " + billing +
                        "\n\t-activation price: " + activationPrice;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;>priceType">
             *       &lt;attribute name="numbers-amount" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             &lt;minInclusive value="0"/>
             *             &lt;maxInclusive value="10"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                    "value"
            })
            public static class FavouriteNumber {

                @XmlValue
                protected int value;

                @XmlAttribute(name = "numbers-amount", required = true)
                protected int numbersAmount;

                /**
                 * Gets the value of the value property.
                 * 
                 */
                public int getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 */
                public void setValue(int value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the numbersAmount property.
                 * 
                 */
                public int getNumbersAmount() {
                    return numbersAmount;
                }

                /**
                 * Sets the value of the numbersAmount property.
                 * 
                 */
                public void setNumbersAmount(int value) {
                    this.numbersAmount = value;
                }

                @Override
                public String toString() {
                    return "favourite number service (" +
                            "price: " + value +
                            ", numbers amount: " + numbersAmount + ")";
                }
            }
        }
    }
}
