/*
 * An XML document type.
 * Localname: hiddenLabel
 * Namespace: 
 * Java type: noNamespace.HiddenLabelDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one hiddenLabel(@) element.
 *
 * This is a complex type.
 */
public class HiddenLabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.HiddenLabelDocument
{
    private static final long serialVersionUID = 1L;
    
    public HiddenLabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIDDENLABEL$0 = 
        new javax.xml.namespace.QName("", "hiddenLabel");
    
    
    /**
     * Gets the "hiddenLabel" element
     */
    public java.lang.String getHiddenLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIDDENLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hiddenLabel" element
     */
    public noNamespace.HiddenLabelDocument.HiddenLabel xgetHiddenLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.HiddenLabelDocument.HiddenLabel target = null;
            target = (noNamespace.HiddenLabelDocument.HiddenLabel)get_store().find_element_user(HIDDENLABEL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hiddenLabel" element
     */
    @Inject(optional=true) public void setHiddenLabel(java.lang.String hiddenLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIDDENLABEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIDDENLABEL$0);
            }
            target.setStringValue(hiddenLabel);
        }
    }
    
    /**
     * Sets (as xml) the "hiddenLabel" element
     */
    public void xsetHiddenLabel(noNamespace.HiddenLabelDocument.HiddenLabel hiddenLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.HiddenLabelDocument.HiddenLabel target = null;
            target = (noNamespace.HiddenLabelDocument.HiddenLabel)get_store().find_element_user(HIDDENLABEL$0, 0);
            if (target == null)
            {
                target = (noNamespace.HiddenLabelDocument.HiddenLabel)get_store().add_element_user(HIDDENLABEL$0);
            }
            target.set(hiddenLabel);
        }
    }
    /**
     * An XML hiddenLabel(@).
     *
     * This is an atomic type that is a restriction of noNamespace.HiddenLabelDocument$HiddenLabel.
     */
    public static class HiddenLabelImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.HiddenLabelDocument.HiddenLabel
    {
        private static final long serialVersionUID = 1L;
        
        public HiddenLabelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected HiddenLabelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
