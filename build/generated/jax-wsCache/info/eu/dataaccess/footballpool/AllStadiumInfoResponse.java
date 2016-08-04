
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
 *         &lt;element name="AllStadiumInfoResult" type="{http://footballpool.dataaccess.eu}ArrayOftStadiumInfo"/>
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
    "allStadiumInfoResult"
})
@XmlRootElement(name = "AllStadiumInfoResponse")
public class AllStadiumInfoResponse {

    @XmlElement(name = "AllStadiumInfoResult", required = true)
    protected ArrayOftStadiumInfo allStadiumInfoResult;

    /**
     * Obtém o valor da propriedade allStadiumInfoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftStadiumInfo }
     *     
     */
    public ArrayOftStadiumInfo getAllStadiumInfoResult() {
        return allStadiumInfoResult;
    }

    /**
     * Define o valor da propriedade allStadiumInfoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftStadiumInfo }
     *     
     */
    public void setAllStadiumInfoResult(ArrayOftStadiumInfo value) {
        this.allStadiumInfoResult = value;
    }

}
