/*
 * An XML document type.
 * Localname: creator
 * Namespace: 
 * Java type: noNamespace.CreatorDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one creator(@) element.
 *
 * This is a complex type.
 */
public class CreatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATOR$0 = 
        new javax.xml.namespace.QName("", "creator");
    
    
    /**
     * Gets the "creator" element
     */
    public java.lang.String getCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "creator" element
     */
    public noNamespace.CreatorDocument.Creator xgetCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CreatorDocument.Creator target = null;
            target = (noNamespace.CreatorDocument.Creator)get_store().find_element_user(CREATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "creator" element
     */
    @Inject(optional=true) public void setCreator(java.lang.String creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATOR$0);
            }
            target.setStringValue(creator);
        }
    }
    
    /**
     * Sets (as xml) the "creator" element
     */
    public void xsetCreator(noNamespace.CreatorDocument.Creator creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CreatorDocument.Creator target = null;
            target = (noNamespace.CreatorDocument.Creator)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                target = (noNamespace.CreatorDocument.Creator)get_store().add_element_user(CREATOR$0);
            }
            target.set(creator);
        }
    }
    /**
     * An XML creator(@).
     *
     * This is an atomic type that is a restriction of noNamespace.CreatorDocument$Creator.
     */
    public static class CreatorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.CreatorDocument.Creator
    {
        private static final long serialVersionUID = 1L;
        
        public CreatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CreatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
