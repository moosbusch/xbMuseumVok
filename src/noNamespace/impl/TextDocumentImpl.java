/*
 * An XML document type.
 * Localname: text
 * Namespace: 
 * Java type: noNamespace.TextDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one text(@) element.
 *
 * This is a complex type.
 */
public class TextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.TextDocument
{
    private static final long serialVersionUID = 1L;
    
    public TextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEXT$0 = 
        new javax.xml.namespace.QName("", "text");
    
    
    /**
     * Gets the "text" element
     */
    public noNamespace.TextDocument.Text getText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TextDocument.Text target = null;
            target = (noNamespace.TextDocument.Text)get_store().find_element_user(TEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "text" element
     */
    @Inject(optional=true) public void setText(noNamespace.TextDocument.Text text)
    {
        generatedSetterHelperImpl(text, TEXT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "text" element
     */
    public noNamespace.TextDocument.Text addNewText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.TextDocument.Text target = null;
            target = (noNamespace.TextDocument.Text)get_store().add_element_user(TEXT$0);
            return target;
        }
    }
    /**
     * An XML text(@).
     *
     * This is an atomic type that is a restriction of noNamespace.TextDocument$Text.
     */
    public static class TextImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.TextDocument.Text
    {
        private static final long serialVersionUID = 1L;
        
        public TextImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected TextImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPEOFTEXT$0 = 
            new javax.xml.namespace.QName("", "typeOfText");
        
        
        /**
         * Gets the "typeOfText" attribute
         */
        public noNamespace.TextDocument.Text.TypeOfText.Enum getTypeOfText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEOFTEXT$0);
                if (target == null)
                {
                    return null;
                }
                return (noNamespace.TextDocument.Text.TypeOfText.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "typeOfText" attribute
         */
        public noNamespace.TextDocument.Text.TypeOfText xgetTypeOfText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TextDocument.Text.TypeOfText target = null;
                target = (noNamespace.TextDocument.Text.TypeOfText)get_store().find_attribute_user(TYPEOFTEXT$0);
                return target;
            }
        }
        
        /**
         * Sets the "typeOfText" attribute
         */
        @Inject(optional=true) public void setTypeOfText(noNamespace.TextDocument.Text.TypeOfText.Enum typeOfText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEOFTEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPEOFTEXT$0);
                }
                target.setEnumValue(typeOfText);
            }
        }
        
        /**
         * Sets (as xml) the "typeOfText" attribute
         */
        public void xsetTypeOfText(noNamespace.TextDocument.Text.TypeOfText typeOfText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.TextDocument.Text.TypeOfText target = null;
                target = (noNamespace.TextDocument.Text.TypeOfText)get_store().find_attribute_user(TYPEOFTEXT$0);
                if (target == null)
                {
                    target = (noNamespace.TextDocument.Text.TypeOfText)get_store().add_attribute_user(TYPEOFTEXT$0);
                }
                target.set(typeOfText);
            }
        }
        /**
         * An XML typeOfText(@).
         *
         * This is an atomic type that is a restriction of noNamespace.TextDocument$Text$TypeOfText.
         */
        public static class TypeOfTextImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements noNamespace.TextDocument.Text.TypeOfText
        {
            private static final long serialVersionUID = 1L;
            
            public TypeOfTextImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeOfTextImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
