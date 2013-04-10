/*
 * An XML document type.
 * Localname: subjectIndicator
 * Namespace: 
 * Java type: noNamespace.SubjectIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one subjectIndicator(@) element.
 *
 * This is a complex type.
 */
public class SubjectIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.SubjectIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubjectIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECTINDICATOR$0 = 
        new javax.xml.namespace.QName("", "subjectIndicator");
    
    
    /**
     * Gets the "subjectIndicator" element
     */
    public java.lang.String getSubjectIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "subjectIndicator" element
     */
    public noNamespace.SubjectIndicatorDocument.SubjectIndicator xgetSubjectIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubjectIndicatorDocument.SubjectIndicator target = null;
            target = (noNamespace.SubjectIndicatorDocument.SubjectIndicator)get_store().find_element_user(SUBJECTINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "subjectIndicator" element
     */
    @Inject(optional=true) public void setSubjectIndicator(java.lang.String subjectIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECTINDICATOR$0);
            }
            target.setStringValue(subjectIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "subjectIndicator" element
     */
    public void xsetSubjectIndicator(noNamespace.SubjectIndicatorDocument.SubjectIndicator subjectIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.SubjectIndicatorDocument.SubjectIndicator target = null;
            target = (noNamespace.SubjectIndicatorDocument.SubjectIndicator)get_store().find_element_user(SUBJECTINDICATOR$0, 0);
            if (target == null)
            {
                target = (noNamespace.SubjectIndicatorDocument.SubjectIndicator)get_store().add_element_user(SUBJECTINDICATOR$0);
            }
            target.set(subjectIndicator);
        }
    }
    /**
     * An XML subjectIndicator(@).
     *
     * This is an atomic type that is a restriction of noNamespace.SubjectIndicatorDocument$SubjectIndicator.
     */
    public static class SubjectIndicatorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.SubjectIndicatorDocument.SubjectIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public SubjectIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SubjectIndicatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
