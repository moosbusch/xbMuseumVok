/*
 * An XML document type.
 * Localname: memberOfCollection
 * Namespace: 
 * Java type: noNamespace.MemberOfCollectionDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one memberOfCollection(@) element.
 *
 * This is a complex type.
 */
public class MemberOfCollectionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MemberOfCollectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MemberOfCollectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBEROFCOLLECTION$0 = 
        new javax.xml.namespace.QName("", "memberOfCollection");
    
    
    /**
     * Gets the "memberOfCollection" element
     */
    public java.lang.String getMemberOfCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBEROFCOLLECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "memberOfCollection" element
     */
    public noNamespace.MemberOfCollectionDocument.MemberOfCollection xgetMemberOfCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MemberOfCollectionDocument.MemberOfCollection target = null;
            target = (noNamespace.MemberOfCollectionDocument.MemberOfCollection)get_store().find_element_user(MEMBEROFCOLLECTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "memberOfCollection" element
     */
    @Inject(optional=true) public void setMemberOfCollection(java.lang.String memberOfCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBEROFCOLLECTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEMBEROFCOLLECTION$0);
            }
            target.setStringValue(memberOfCollection);
        }
    }
    
    /**
     * Sets (as xml) the "memberOfCollection" element
     */
    public void xsetMemberOfCollection(noNamespace.MemberOfCollectionDocument.MemberOfCollection memberOfCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MemberOfCollectionDocument.MemberOfCollection target = null;
            target = (noNamespace.MemberOfCollectionDocument.MemberOfCollection)get_store().find_element_user(MEMBEROFCOLLECTION$0, 0);
            if (target == null)
            {
                target = (noNamespace.MemberOfCollectionDocument.MemberOfCollection)get_store().add_element_user(MEMBEROFCOLLECTION$0);
            }
            target.set(memberOfCollection);
        }
    }
    /**
     * An XML memberOfCollection(@).
     *
     * This is an atomic type that is a restriction of noNamespace.MemberOfCollectionDocument$MemberOfCollection.
     */
    public static class MemberOfCollectionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.MemberOfCollectionDocument.MemberOfCollection
    {
        private static final long serialVersionUID = 1L;
        
        public MemberOfCollectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberOfCollectionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
