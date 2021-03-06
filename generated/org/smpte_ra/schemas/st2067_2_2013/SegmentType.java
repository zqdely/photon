
package org.smpte_ra.schemas.st2067_2_2013;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for SegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.smpte-ra.org/schemas/433/2008/dcmlTypes/}UUIDType"/>
 *         &lt;element name="Annotation" type="{http://www.smpte-ra.org/schemas/433/2008/dcmlTypes/}UserTextType" minOccurs="0"/>
 *         &lt;element name="SequenceList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MarkerSequence" type="{http://www.smpte-ra.org/schemas/2067-3/2013}SequenceType" minOccurs="0"/>
 *                   &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentType", namespace = "http://www.smpte-ra.org/schemas/2067-3/2013", propOrder = {
    "id",
    "annotation",
    "sequenceList"
})
public class SegmentType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Annotation")
    protected UserTextType annotation;
    @XmlElement(name = "SequenceList", required = true)
    protected SegmentType.SequenceList sequenceList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link UserTextType }
     *     
     */
    public UserTextType getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserTextType }
     *     
     */
    public void setAnnotation(UserTextType value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the sequenceList property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentType.SequenceList }
     *     
     */
    public SegmentType.SequenceList getSequenceList() {
        return sequenceList;
    }

    /**
     * Sets the value of the sequenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentType.SequenceList }
     *     
     */
    public void setSequenceList(SegmentType.SequenceList value) {
        this.sequenceList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MarkerSequence" type="{http://www.smpte-ra.org/schemas/2067-3/2013}SequenceType" minOccurs="0"/>
     *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "markerSequence",
        "any"
    })
    public static class SequenceList {

        @XmlElement(name = "MarkerSequence", namespace = "http://www.smpte-ra.org/schemas/2067-3/2013")
        protected SequenceType markerSequence;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the markerSequence property.
         * 
         * @return
         *     possible object is
         *     {@link SequenceType }
         *     
         */
        public SequenceType getMarkerSequence() {
            return markerSequence;
        }

        /**
         * Sets the value of the markerSequence property.
         * 
         * @param value
         *     allowed object is
         *     {@link SequenceType }
         *     
         */
        public void setMarkerSequence(SequenceType value) {
            this.markerSequence = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * {@link Element }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}
