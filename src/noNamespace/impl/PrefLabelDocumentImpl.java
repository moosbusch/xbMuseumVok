/*
 * An XML document type.
 * Localname: prefLabel
 * Namespace: 
 * Java type: noNamespace.PrefLabelDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one prefLabel(@) element.
 *
 * This is a complex type.
 */
public class PrefLabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.PrefLabelDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrefLabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREFLABEL$0 = 
        new javax.xml.namespace.QName("", "prefLabel");
    
    
    /**
     * Gets the "prefLabel" element
     */
    public noNamespace.PrefLabelDocument.PrefLabel getPrefLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.PrefLabelDocument.PrefLabel target = null;
            target = (noNamespace.PrefLabelDocument.PrefLabel)get_store().find_element_user(PREFLABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "prefLabel" element
     */
    @Inject(optional=true) public void setPrefLabel(noNamespace.PrefLabelDocument.PrefLabel prefLabel)
    {
        generatedSetterHelperImpl(prefLabel, PREFLABEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "prefLabel" element
     */
    public noNamespace.PrefLabelDocument.PrefLabel addNewPrefLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.PrefLabelDocument.PrefLabel target = null;
            target = (noNamespace.PrefLabelDocument.PrefLabel)get_store().add_element_user(PREFLABEL$0);
            return target;
        }
    }
    /**
     * An XML prefLabel(@).
     *
     * This is an atomic type that is a restriction of noNamespace.PrefLabelDocument$PrefLabel.
     */
    public static class PrefLabelImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.PrefLabelDocument.PrefLabel
    {
        private static final long serialVersionUID = 1L;
        
        public PrefLabelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected PrefLabelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
