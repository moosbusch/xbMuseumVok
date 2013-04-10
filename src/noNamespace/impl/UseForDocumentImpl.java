/*
 * An XML document type.
 * Localname: useFor
 * Namespace: 
 * Java type: noNamespace.UseForDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one useFor(@) element.
 *
 * This is a complex type.
 */
public class UseForDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.UseForDocument
{
    private static final long serialVersionUID = 1L;
    
    public UseForDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEFOR$0 = 
        new javax.xml.namespace.QName("", "useFor");
    
    
    /**
     * Gets the "useFor" element
     */
    public java.lang.String getUseFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEFOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "useFor" element
     */
    public noNamespace.UseForDocument.UseFor xgetUseFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UseForDocument.UseFor target = null;
            target = (noNamespace.UseForDocument.UseFor)get_store().find_element_user(USEFOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "useFor" element
     */
    @Inject(optional=true) public void setUseFor(java.lang.String useFor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEFOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEFOR$0);
            }
            target.setStringValue(useFor);
        }
    }
    
    /**
     * Sets (as xml) the "useFor" element
     */
    public void xsetUseFor(noNamespace.UseForDocument.UseFor useFor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.UseForDocument.UseFor target = null;
            target = (noNamespace.UseForDocument.UseFor)get_store().find_element_user(USEFOR$0, 0);
            if (target == null)
            {
                target = (noNamespace.UseForDocument.UseFor)get_store().add_element_user(USEFOR$0);
            }
            target.set(useFor);
        }
    }
    /**
     * An XML useFor(@).
     *
     * This is an atomic type that is a restriction of noNamespace.UseForDocument$UseFor.
     */
    public static class UseForImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.UseForDocument.UseFor
    {
        private static final long serialVersionUID = 1L;
        
        public UseForImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected UseForImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
