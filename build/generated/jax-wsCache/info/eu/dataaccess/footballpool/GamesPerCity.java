
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
 *         &lt;element name="sCityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "sCityName"
})
@XmlRootElement(name = "GamesPerCity")
public class GamesPerCity {

    @XmlElement(required = true)
    protected String sCityName;

    /**
     * Obtém o valor da propriedade sCityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCityName() {
        return sCityName;
    }

    /**
     * Define o valor da propriedade sCityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCityName(String value) {
        this.sCityName = value;
    }

}
