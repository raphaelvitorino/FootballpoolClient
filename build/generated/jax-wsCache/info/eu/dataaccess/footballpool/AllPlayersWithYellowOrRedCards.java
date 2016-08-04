
package eu.dataaccess.footballpool;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="bSortedByName" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bSortedByYellowCards" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bSortedByRedCards" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "bSortedByName",
    "bSortedByYellowCards",
    "bSortedByRedCards"
})
@XmlRootElement(name = "AllPlayersWithYellowOrRedCards")
public class AllPlayersWithYellowOrRedCards {

    protected boolean bSortedByName;
    protected boolean bSortedByYellowCards;
    protected boolean bSortedByRedCards;

    /**
     * Obtém o valor da propriedade bSortedByName.
     * 
     */
    public boolean isBSortedByName() {
        return bSortedByName;
    }

    /**
     * Define o valor da propriedade bSortedByName.
     * 
     */
    public void setBSortedByName(boolean value) {
        this.bSortedByName = value;
    }

    /**
     * Obtém o valor da propriedade bSortedByYellowCards.
     * 
     */
    public boolean isBSortedByYellowCards() {
        return bSortedByYellowCards;
    }

    /**
     * Define o valor da propriedade bSortedByYellowCards.
     * 
     */
    public void setBSortedByYellowCards(boolean value) {
        this.bSortedByYellowCards = value;
    }

    /**
     * Obtém o valor da propriedade bSortedByRedCards.
     * 
     */
    public boolean isBSortedByRedCards() {
        return bSortedByRedCards;
    }

    /**
     * Define o valor da propriedade bSortedByRedCards.
     * 
     */
    public void setBSortedByRedCards(boolean value) {
        this.bSortedByRedCards = value;
    }

}
