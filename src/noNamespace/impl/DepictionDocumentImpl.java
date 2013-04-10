/*
 * An XML document type.
 * Localname: depiction
 * Namespace: 
 * Java type: noNamespace.DepictionDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one depiction(@) element.
 *
 * This is a complex type.
 */
public class DepictionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DepictionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DepictionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPICTION$0 = 
        new javax.xml.namespace.QName("", "depiction");
    
    
    /**
     * Gets the "depiction" element
     */
    public java.lang.String getDepiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPICTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "depiction" element
     */
    public noNamespace.DepictionDocument.Depiction xgetDepiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DepictionDocument.Depiction target = null;
            target = (noNamespace.DepictionDocument.Depiction)get_store().find_element_user(DEPICTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "depiction" element
     */
    @Inject(optional=true) public void setDepiction(java.lang.String depiction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPICTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPICTION$0);
            }
            target.setStringValue(depiction);
        }
    }
    
    /**
     * Sets (as xml) the "depiction" element
     */
    public void xsetDepiction(noNamespace.DepictionDocument.Depiction depiction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DepictionDocument.Depiction target = null;
            target = (noNamespace.DepictionDocument.Depiction)get_store().find_element_user(DEPICTION$0, 0);
            if (target == null)
            {
                target = (noNamespace.DepictionDocument.Depiction)get_store().add_element_user(DEPICTION$0);
            }
            target.set(depiction);
        }
    }
    /**
     * An XML depiction(@).
     *
     * This is an atomic type that is a restriction of noNamespace.DepictionDocument$Depiction.
     */
    public static class DepictionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.DepictionDocument.Depiction
    {
        private static final long serialVersionUID = 1L;
        
        public DepictionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DepictionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
