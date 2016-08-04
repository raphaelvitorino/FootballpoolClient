
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
 *         &lt;element name="bWithCompetitors" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "bWithCompetitors"
})
@XmlRootElement(name = "CountryNames")
public class CountryNames {

    protected boolean bWithCompetitors;

    /**
     * Obtém o valor da propriedade bWithCompetitors.
     * 
     */
    public boolean isBWithCompetitors() {
        return bWithCompetitors;
    }

    /**
     * Define o valor da propriedade bWithCompetitors.
     * 
     */
    public void setBWithCompetitors(boolean value) {
        this.bWithCompetitors = value;
    }

}
