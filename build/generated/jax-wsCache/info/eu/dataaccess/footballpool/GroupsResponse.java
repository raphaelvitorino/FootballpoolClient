
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
 *         &lt;element name="GroupsResult" type="{http://footballpool.dataaccess.eu}ArrayOftGroupInfo"/>
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
    "groupsResult"
})
@XmlRootElement(name = "GroupsResponse")
public class GroupsResponse {

    @XmlElement(name = "GroupsResult", required = true)
    protected ArrayOftGroupInfo groupsResult;

    /**
     * Obtém o valor da propriedade groupsResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGroupInfo }
     *     
     */
    public ArrayOftGroupInfo getGroupsResult() {
        return groupsResult;
    }

    /**
     * Define o valor da propriedade groupsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGroupInfo }
     *     
     */
    public void setGroupsResult(ArrayOftGroupInfo value) {
        this.groupsResult = value;
    }

}
