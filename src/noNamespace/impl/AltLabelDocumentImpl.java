/*
 * An XML document type.
 * Localname: altLabel
 * Namespace:
 * Java type: noNamespace.AltLabelDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;

/**
 * A document containing one altLabel(@) element.
 *
 * This is a complex type.
 */
public class AltLabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AltLabelDocument
{
    private static final long serialVersionUID = 1L;

    public AltLabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ALTLABEL$0 =
        new javax.xml.namespace.QName("", "altLabel");


    /**
     * Gets the "altLabel" element
     */
    public noNamespace.AltLabelDocument.AltLabel getAltLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AltLabelDocument.AltLabel target = null;
            target = (noNamespace.AltLabelDocument.AltLabel)get_store().find_element_user(ALTLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "altLabel" element
     */
    @Inject(optional=true) public void setAltLabel(noNamespace.AltLabelDocument.AltLabel altLabel)
    {
        generatedSetterHelperImpl(altLabel, ALTLABEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "altLabel" element
     */
    public noNamespace.AltLabelDocument.AltLabel addNewAltLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AltLabelDocument.AltLabel target = null;
            target = (noNamespace.AltLabelDocument.AltLabel)get_store().add_element_user(ALTLABEL$0);
            return target;
        }
    }
    /**
     * An XML altLabel(@).
     *
     * This is an atomic type that is a restriction of noNamespace.AltLabelDocument$AltLabel.
     */
    public static class AltLabelImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.AltLabelDocument.AltLabel
    {
        private static final long serialVersionUID = 1L;

        public AltLabelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }

        protected AltLabelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }


    }
}
