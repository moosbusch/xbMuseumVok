/*
 * An XML document type.
 * Localname: modified
 * Namespace: 
 * Java type: noNamespace.ModifiedDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one modified(@) element.
 *
 * This is a complex type.
 */
public class ModifiedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ModifiedDocument
{
    private static final long serialVersionUID = 1L;
    
    public ModifiedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODIFIED$0 = 
        new javax.xml.namespace.QName("", "modified");
    
    
    /**
     * Gets the "modified" element
     */
    public java.lang.String getModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "modified" element
     */
    public noNamespace.ModifiedDocument.Modified xgetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ModifiedDocument.Modified target = null;
            target = (noNamespace.ModifiedDocument.Modified)get_store().find_element_user(MODIFIED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "modified" element
     */
    @Inject(optional=true) public void setModified(java.lang.String modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIED$0);
            }
            target.setStringValue(modified);
        }
    }
    
    /**
     * Sets (as xml) the "modified" element
     */
    public void xsetModified(noNamespace.ModifiedDocument.Modified modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ModifiedDocument.Modified target = null;
            target = (noNamespace.ModifiedDocument.Modified)get_store().find_element_user(MODIFIED$0, 0);
            if (target == null)
            {
                target = (noNamespace.ModifiedDocument.Modified)get_store().add_element_user(MODIFIED$0);
            }
            target.set(modified);
        }
    }
    /**
     * An XML modified(@).
     *
     * This is an atomic type that is a restriction of noNamespace.ModifiedDocument$Modified.
     */
    public static class ModifiedImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ModifiedDocument.Modified
    {
        private static final long serialVersionUID = 1L;
        
        public ModifiedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ModifiedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
