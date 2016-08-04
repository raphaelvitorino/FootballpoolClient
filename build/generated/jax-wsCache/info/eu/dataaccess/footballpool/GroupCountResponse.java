
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
 *         &lt;element name="GroupCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "groupCountResult"
})
@XmlRootElement(name = "GroupCountResponse")
public class GroupCountResponse {

    @XmlElement(name = "GroupCountResult")
    protected int groupCountResult;

    /**
     * Obtém o valor da propriedade groupCountResult.
     * 
     */
    public int getGroupCountResult() {
        return groupCountResult;
    }

    /**
     * Define o valor da propriedade groupCountResult.
     * 
     */
    public void setGroupCountResult(int value) {
        this.groupCountResult = value;
    }

}
