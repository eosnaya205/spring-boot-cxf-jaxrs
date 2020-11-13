
package io.fabric8.quickstarts.cxf.jaxrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;



@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "Line", propOrder = {
//    "orderLine"
//})
public class Line {

//    @XmlElement(name = "OrderLine", namespace = "", required = true)
    @XmlElement(name = "OrderLine")
    protected List<OrderLine> orderLine;


    public List<OrderLine> getOrderLine() {
        if (orderLine == null) {
            orderLine = new ArrayList<OrderLine>();
        }
        return this.orderLine;
    }

}
