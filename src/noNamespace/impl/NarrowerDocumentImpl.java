/*
 * An XML document type.
 * Localname: narrower
 * Namespace: 
 * Java type: noNamespace.NarrowerDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one narrower(@) element.
 *
 * This is a complex type.
 */
public class NarrowerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NarrowerDocument
{
    private static final long serialVersionUID = 1L;
    
    public NarrowerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NARROWER$0 = 
        new javax.xml.namespace.QName("", "narrower");
    
    
    /**
     * Gets the "narrower" element
     */
    public java.lang.String getNarrower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NARROWER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "narrower" element
     */
    public noNamespace.NarrowerDocument.Narrower xgetNarrower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NarrowerDocument.Narrower target = null;
            target = (noNamespace.NarrowerDocument.Narrower)get_store().find_element_user(NARROWER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "narrower" element
     */
    @Inject(optional=true) public void setNarrower(java.lang.String narrower)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NARROWER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NARROWER$0);
            }
            target.setStringValue(narrower);
        }
    }
    
    /**
     * Sets (as xml) the "narrower" element
     */
    public void xsetNarrower(noNamespace.NarrowerDocument.Narrower narrower)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NarrowerDocument.Narrower target = null;
            target = (noNamespace.NarrowerDocument.Narrower)get_store().find_element_user(NARROWER$0, 0);
            if (target == null)
            {
                target = (noNamespace.NarrowerDocument.Narrower)get_store().add_element_user(NARROWER$0);
            }
            target.set(narrower);
        }
    }
    /**
     * An XML narrower(@).
     *
     * This is an atomic type that is a restriction of noNamespace.NarrowerDocument$Narrower.
     */
    public static class NarrowerImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.NarrowerDocument.Narrower
    {
        private static final long serialVersionUID = 1L;
        
        public NarrowerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NarrowerImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
