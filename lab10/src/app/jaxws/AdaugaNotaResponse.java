
package app.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.2.8
 * Fri Jun 04 15:51:35 EEST 2010
 * Generated source version: 2.2.8
 */

@XmlRootElement(name = "adaugaNotaResponse", namespace = "http://lab10/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adaugaNotaResponse", namespace = "http://lab10/")

public class AdaugaNotaResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

