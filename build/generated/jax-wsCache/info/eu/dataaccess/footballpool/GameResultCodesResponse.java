
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
 *         &lt;element name="GameResultCodesResult" type="{http://footballpool.dataaccess.eu}ArrayOftGameResultCode"/>
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
    "gameResultCodesResult"
})
@XmlRootElement(name = "GameResultCodesResponse")
public class GameResultCodesResponse {

    @XmlElement(name = "GameResultCodesResult", required = true)
    protected ArrayOftGameResultCode gameResultCodesResult;

    /**
     * Obtém o valor da propriedade gameResultCodesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftGameResultCode }
     *     
     */
    public ArrayOftGameResultCode getGameResultCodesResult() {
        return gameResultCodesResult;
    }

    /**
     * Define o valor da propriedade gameResultCodesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftGameResultCode }
     *     
     */
    public void setGameResultCodesResult(ArrayOftGameResultCode value) {
        this.gameResultCodesResult = value;
    }

}
