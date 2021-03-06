
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
 *         &lt;element name="AllGoalKeepersResult" type="{http://footballpool.dataaccess.eu}ArrayOfString"/>
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
    "allGoalKeepersResult"
})
@XmlRootElement(name = "AllGoalKeepersResponse")
public class AllGoalKeepersResponse {

    @XmlElement(name = "AllGoalKeepersResult", required = true)
    protected ArrayOfString allGoalKeepersResult;

    /**
     * Obtém o valor da propriedade allGoalKeepersResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getAllGoalKeepersResult() {
        return allGoalKeepersResult;
    }

    /**
     * Define o valor da propriedade allGoalKeepersResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setAllGoalKeepersResult(ArrayOfString value) {
        this.allGoalKeepersResult = value;
    }

}
