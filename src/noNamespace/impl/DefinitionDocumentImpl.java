/*
 * An XML document type.
 * Localname: definition
 * Namespace: 
 * Java type: noNamespace.DefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one definition(@) element.
 *
 * This is a complex type.
 */
public class DefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.DefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITION$0 = 
        new javax.xml.namespace.QName("", "definition");
    
    
    /**
     * Gets the "definition" element
     */
    public java.lang.String getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "definition" element
     */
    public noNamespace.DefinitionDocument.Definition xgetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DefinitionDocument.Definition target = null;
            target = (noNamespace.DefinitionDocument.Definition)get_store().find_element_user(DEFINITION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "definition" element
     */
    @Inject(optional=true) public void setDefinition(java.lang.String definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFINITION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFINITION$0);
            }
            target.setStringValue(definition);
        }
    }
    
    /**
     * Sets (as xml) the "definition" element
     */
    public void xsetDefinition(noNamespace.DefinitionDocument.Definition definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.DefinitionDocument.Definition target = null;
            target = (noNamespace.DefinitionDocument.Definition)get_store().find_element_user(DEFINITION$0, 0);
            if (target == null)
            {
                target = (noNamespace.DefinitionDocument.Definition)get_store().add_element_user(DEFINITION$0);
            }
            target.set(definition);
        }
    }
    /**
     * An XML definition(@).
     *
     * This is an atomic type that is a restriction of noNamespace.DefinitionDocument$Definition.
     */
    public static class DefinitionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.DefinitionDocument.Definition
    {
        private static final long serialVersionUID = 1L;
        
        public DefinitionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DefinitionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
