
package io.fabric8.quickstarts.cxf.jaxrs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderLine complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderLine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="MaterialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="OrderQuantity" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="PA_PE_SalesDeal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ExpectedPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ExpectedCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ExpectedUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="SalesUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="NetPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="ReturnMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element name="Plant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/&gt;
 *         &lt;element ref="{urn:soap.jameshardie.com}BalanceItem" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:soap.jameshardie.com}Margin" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderLine", propOrder = {
    "itemNumber",
    "materialNumber",
    "orderQuantity",
    "papeSalesDeal",
    "expectedPrice",
    "expectedCurrency",
    "expectedUnit",
    "salesUnit",
    "currency",
    "price",
    "discount",
    "netPrice",
    "returnMessage",
    "plant",
    "balanceItem",
    "margin"
})
public class OrderLine {

    @XmlElement(name = "ItemNumber")
    protected String itemNumber;
    @XmlElement(name = "MaterialNumber")
    protected String materialNumber;
    @XmlElement(name = "OrderQuantity")
    protected Double orderQuantity;
    @XmlElement(name = "PA_PE_SalesDeal")
    protected String papeSalesDeal;
    @XmlElement(name = "ExpectedPrice")
    protected Double expectedPrice;
    @XmlElement(name = "ExpectedCurrency")
    protected String expectedCurrency;
    @XmlElement(name = "ExpectedUnit")
    protected String expectedUnit;
    @XmlElement(name = "SalesUnit")
    protected String salesUnit;
    @XmlElement(name = "Currency")
    protected String currency;
    @XmlElement(name = "Price")
    protected Double price;
    @XmlElement(name = "Discount")
    protected Double discount;
    @XmlElement(name = "NetPrice")
    protected Double netPrice;
    @XmlElement(name = "ReturnMessage")
    protected String returnMessage;
    @XmlElement(name = "Plant")
    protected String plant;
    @XmlElement(name = "BalanceItem", nillable = true)
    protected String balanceItem;
    @XmlElement(name = "Margin")
    protected BigDecimal margin;

    /**
     * Obtiene el valor de la propiedad itemNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Define el valor de la propiedad itemNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad materialNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialNumber() {
        return materialNumber;
    }

    /**
     * Define el valor de la propiedad materialNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialNumber(String value) {
        this.materialNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad orderQuantity.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Define el valor de la propiedad orderQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOrderQuantity(Double value) {
        this.orderQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad papeSalesDeal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAPESalesDeal() {
        return papeSalesDeal;
    }

    /**
     * Define el valor de la propiedad papeSalesDeal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAPESalesDeal(String value) {
        this.papeSalesDeal = value;
    }

    /**
     * Obtiene el valor de la propiedad expectedPrice.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExpectedPrice() {
        return expectedPrice;
    }

    /**
     * Define el valor de la propiedad expectedPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExpectedPrice(Double value) {
        this.expectedPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad expectedCurrency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedCurrency() {
        return expectedCurrency;
    }

    /**
     * Define el valor de la propiedad expectedCurrency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedCurrency(String value) {
        this.expectedCurrency = value;
    }

    /**
     * Obtiene el valor de la propiedad expectedUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedUnit() {
        return expectedUnit;
    }

    /**
     * Define el valor de la propiedad expectedUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedUnit(String value) {
        this.expectedUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad salesUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesUnit() {
        return salesUnit;
    }

    /**
     * Define el valor de la propiedad salesUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesUnit(String value) {
        this.salesUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrice(Double value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad discount.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * Define el valor de la propiedad discount.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscount(Double value) {
        this.discount = value;
    }

    /**
     * Obtiene el valor de la propiedad netPrice.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetPrice() {
        return netPrice;
    }

    /**
     * Define el valor de la propiedad netPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetPrice(Double value) {
        this.netPrice = value;
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
     * Obtiene el valor de la propiedad plant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlant() {
        return plant;
    }

    /**
     * Define el valor de la propiedad plant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlant(String value) {
        this.plant = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceItem() {
        return balanceItem;
    }

    /**
     * Define el valor de la propiedad balanceItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceItem(String value) {
        this.balanceItem = value;
    }

    /**
     * Obtiene el valor de la propiedad margin.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMargin() {
        return margin;
    }

    /**
     * Define el valor de la propiedad margin.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMargin(BigDecimal value) {
        this.margin = value;
    }

}
