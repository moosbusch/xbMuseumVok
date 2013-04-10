/*
 * An XML document type.
 * Localname: broader
 * Namespace: 
 * Java type: noNamespace.BroaderDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one broader(@) element.
 *
 * This is a complex type.
 */
public class BroaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.BroaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public BroaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROADER$0 = 
        new javax.xml.namespace.QName("", "broader");
    
    
    /**
     * Gets the "broader" element
     */
    public java.lang.String getBroader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "broader" element
     */
    public noNamespace.BroaderDocument.Broader xgetBroader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BroaderDocument.Broader target = null;
            target = (noNamespace.BroaderDocument.Broader)get_store().find_element_user(BROADER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "broader" element
     */
    @Inject(optional=true) public void setBroader(java.lang.String broader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROADER$0);
            }
            target.setStringValue(broader);
        }
    }
    
    /**
     * Sets (as xml) the "broader" element
     */
    public void xsetBroader(noNamespace.BroaderDocument.Broader broader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.BroaderDocument.Broader target = null;
            target = (noNamespace.BroaderDocument.Broader)get_store().find_element_user(BROADER$0, 0);
            if (target == null)
            {
                target = (noNamespace.BroaderDocument.Broader)get_store().add_element_user(BROADER$0);
            }
            target.set(broader);
        }
    }
    /**
     * An XML broader(@).
     *
     * This is an atomic type that is a restriction of noNamespace.BroaderDocument$Broader.
     */
    public static class BroaderImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.BroaderDocument.Broader
    {
        private static final long serialVersionUID = 1L;
        
        public BroaderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected BroaderImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
