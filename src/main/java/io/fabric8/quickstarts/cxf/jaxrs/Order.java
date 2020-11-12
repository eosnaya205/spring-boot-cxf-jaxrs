
package io.fabric8.quickstarts.cxf.jaxrs;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Order complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:soap.jameshardie.com}OrderType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:soap.jameshardie.com}SoldToParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:soap.jameshardie.com}CustomerPO" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:soap.jameshardie.com}ContractNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:soap.jameshardie.com}ProgramID" minOccurs="0"/&gt;
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryDate" type="{urn:soap.jameshardie.com}date" minOccurs="0"/&gt;
 *         &lt;element name="RunMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnCode" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ReturnMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistributionChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryPO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncoTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SCPNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pooling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ediEdited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pricingPartnerShippingID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DoNotShipBeforeDate" type="{urn:soap.jameshardie.com}date" minOccurs="0"/&gt;
 *         &lt;element name="ShippingInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:soap.jameshardie.com}OrderLines"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "orderType",
    "soldToParty",
    "customerPO",
    "contractNumber",
    "programID",
    "transactionId",
    "requestedDeliveryDate",
    "runMode",
    "returnCode",
    "returnMessage",
    "salesOrganization",
    "distributionChannel",
    "division",
    "poMethod",
    "deliveryPO",
    "shippingType",
    "incoTerms",
    "contact",
    "scpNumber",
    "shippingCharges",
    "pooling",
    "customerNotes",
    "ediEdited",
    "pricingPartnerShippingID",
    "doNotShipBeforeDate",
    "shippingInstruction",
    "orderLines"
})
public class Order {

    @XmlElement(name = "OrderType", namespace = "urn:soap.jameshardie.com")
    protected String orderType;
    @XmlElement(name = "SoldToParty", namespace = "urn:soap.jameshardie.com")
    protected String soldToParty;
    @XmlElement(name = "CustomerPO", namespace = "urn:soap.jameshardie.com")
    protected String customerPO;
    @XmlElement(name = "ContractNumber", namespace = "urn:soap.jameshardie.com")
    protected String contractNumber;
    @XmlElement(name = "ProgramID", namespace = "urn:soap.jameshardie.com")
    protected String programID;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "RequestedDeliveryDate")
    protected String requestedDeliveryDate;
    @XmlElement(name = "RunMode")
    protected String runMode;
    @XmlElement(name = "ReturnCode")
    protected BigInteger returnCode;
    @XmlElement(name = "ReturnMessage")
    protected String returnMessage;
    @XmlElement(name = "SalesOrganization")
    protected String salesOrganization;
    @XmlElement(name = "DistributionChannel")
    protected String distributionChannel;
    @XmlElement(name = "Division")
    protected String division;
    @XmlElement(name = "POMethod")
    protected String poMethod;
    @XmlElement(name = "DeliveryPO")
    protected String deliveryPO;
    @XmlElement(name = "ShippingType")
    protected String shippingType;
    @XmlElement(name = "IncoTerms")
    protected String incoTerms;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "SCPNumber")
    protected String scpNumber;
    @XmlElement(name = "ShippingCharges")
    protected String shippingCharges;
    @XmlElement(name = "Pooling")
    protected String pooling;
    @XmlElement(name = "CustomerNotes")
    protected String customerNotes;
    protected String ediEdited;
    protected String pricingPartnerShippingID;
    @XmlElement(name = "DoNotShipBeforeDate")
    protected String doNotShipBeforeDate;
    @XmlElement(name = "ShippingInstruction")
    protected String shippingInstruction;
//    @XmlElement(name = "OrderLines", namespace = "urn:soap.jameshardie.com", required = true)
    @XmlElement(name = "OrderLines")
    protected Line orderLines;

    /**
     * Obtiene el valor de la propiedad orderType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Define el valor de la propiedad orderType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Obtiene el valor de la propiedad soldToParty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldToParty() {
        return soldToParty;
    }

    /**
     * Define el valor de la propiedad soldToParty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldToParty(String value) {
        this.soldToParty = value;
    }

    /**
     * Obtiene el valor de la propiedad customerPO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerPO() {
        return customerPO;
    }

    /**
     * Define el valor de la propiedad customerPO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerPO(String value) {
        this.customerPO = value;
    }

    /**
     * Obtiene el valor de la propiedad contractNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Define el valor de la propiedad contractNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad programID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramID() {
        return programID;
    }

    /**
     * Define el valor de la propiedad programID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramID(String value) {
        this.programID = value;
    }

    /**
     * Obtiene el valor de la propiedad transactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Obtiene el valor de la propiedad requestedDeliveryDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedDeliveryDate() {
        return requestedDeliveryDate;
    }

    /**
     * Define el valor de la propiedad requestedDeliveryDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedDeliveryDate(String value) {
        this.requestedDeliveryDate = value;
    }

    /**
     * Obtiene el valor de la propiedad runMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunMode() {
        return runMode;
    }

    /**
     * Define el valor de la propiedad runMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunMode(String value) {
        this.runMode = value;
    }

    /**
     * Obtiene el valor de la propiedad returnCode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReturnCode() {
        return returnCode;
    }

    /**
     * Define el valor de la propiedad returnCode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReturnCode(BigInteger value) {
        this.returnCode = value;
    }

    /**
     * Obtiene el valor de la propiedad returnMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnMessage() {
        return returnMessage;
    }

    /**
     * Define el valor de la propiedad returnMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnMessage(String value) {
        this.returnMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOrganization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrganization() {
        return salesOrganization;
    }

    /**
     * Define el valor de la propiedad salesOrganization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrganization(String value) {
        this.salesOrganization = value;
    }

    /**
     * Obtiene el valor de la propiedad distributionChannel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionChannel() {
        return distributionChannel;
    }

    /**
     * Define el valor de la propiedad distributionChannel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionChannel(String value) {
        this.distributionChannel = value;
    }

    /**
     * Obtiene el valor de la propiedad division.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Define el valor de la propiedad division.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Obtiene el valor de la propiedad poMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOMethod() {
        return poMethod;
    }

    /**
     * Define el valor de la propiedad poMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOMethod(String value) {
        this.poMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad deliveryPO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPO() {
        return deliveryPO;
    }

    /**
     * Define el valor de la propiedad deliveryPO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPO(String value) {
        this.deliveryPO = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingType() {
        return shippingType;
    }

    /**
     * Define el valor de la propiedad shippingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingType(String value) {
        this.shippingType = value;
    }

    /**
     * Obtiene el valor de la propiedad incoTerms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoTerms() {
        return incoTerms;
    }

    /**
     * Define el valor de la propiedad incoTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoTerms(String value) {
        this.incoTerms = value;
    }

    /**
     * Obtiene el valor de la propiedad contact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Define el valor de la propiedad contact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Obtiene el valor de la propiedad scpNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCPNumber() {
        return scpNumber;
    }

    /**
     * Define el valor de la propiedad scpNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCPNumber(String value) {
        this.scpNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingCharges.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCharges() {
        return shippingCharges;
    }

    /**
     * Define el valor de la propiedad shippingCharges.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCharges(String value) {
        this.shippingCharges = value;
    }

    /**
     * Obtiene el valor de la propiedad pooling.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPooling() {
        return pooling;
    }

    /**
     * Define el valor de la propiedad pooling.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPooling(String value) {
        this.pooling = value;
    }

    /**
     * Obtiene el valor de la propiedad customerNotes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNotes() {
        return customerNotes;
    }

    /**
     * Define el valor de la propiedad customerNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerNotes(String value) {
        this.customerNotes = value;
    }

    /**
     * Obtiene el valor de la propiedad ediEdited.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdiEdited() {
        return ediEdited;
    }

    /**
     * Define el valor de la propiedad ediEdited.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdiEdited(String value) {
        this.ediEdited = value;
    }

    /**
     * Obtiene el valor de la propiedad pricingPartnerShippingID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingPartnerShippingID() {
        return pricingPartnerShippingID;
    }

    /**
     * Define el valor de la propiedad pricingPartnerShippingID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingPartnerShippingID(String value) {
        this.pricingPartnerShippingID = value;
    }

    /**
     * Obtiene el valor de la propiedad doNotShipBeforeDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoNotShipBeforeDate() {
        return doNotShipBeforeDate;
    }

    /**
     * Define el valor de la propiedad doNotShipBeforeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoNotShipBeforeDate(String value) {
        this.doNotShipBeforeDate = value;
    }

    /**
     * Obtiene el valor de la propiedad shippingInstruction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingInstruction() {
        return shippingInstruction;
    }

    /**
     * Define el valor de la propiedad shippingInstruction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingInstruction(String value) {
        this.shippingInstruction = value;
    }

    /**
     * Obtiene el valor de la propiedad orderLines.
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getOrderLines() {
        return orderLines;
    }

    /**
     * Define el valor de la propiedad orderLines.
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setOrderLines(Line value) {
        this.orderLines = value;
    }

}
