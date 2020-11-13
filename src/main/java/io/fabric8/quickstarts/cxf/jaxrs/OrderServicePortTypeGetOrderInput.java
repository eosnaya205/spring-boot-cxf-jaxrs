
package io.fabric8.quickstarts.cxf.jaxrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "OrderService_PortType_getOrder_Input")
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "OrderService_PortType_getOrder_Input", propOrder = {
//    "order"
//})
public class OrderServicePortTypeGetOrderInput {

    @XmlElement(name = "Order", nillable = true)
    protected Order order;

    /**
     * Obtiene el valor de la propiedad order.
     * 
     * @return
     *     possible object is
     *     {@link Order }
     *     
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Define el valor de la propiedad order.
     * 
     * @param value
     *     allowed object is
     *     {@link Order }
     *     
     */
    public void setOrder(Order value) {
        this.order = value;
    }

}
