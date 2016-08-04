
package eu.dataaccess.footballpool;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sPoule" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sPoule"
})
@XmlRootElement(name = "GroupCompetitors")
public class GroupCompetitors {

    @XmlElement(required = true)
    protected String sPoule;

    /**
     * Obtém o valor da propriedade sPoule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPoule() {
        return sPoule;
    }

    /**
     * Define o valor da propriedade sPoule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPoule(String value) {
        this.sPoule = value;
    }

}
