/*
 * An XML document type.
 * Localname: note
 * Namespace: 
 * Java type: noNamespace.NoteDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one note(@) element.
 *
 * This is a complex type.
 */
public class NoteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NoteDocument
{
    private static final long serialVersionUID = 1L;
    
    public NoteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTE$0 = 
        new javax.xml.namespace.QName("", "note");
    
    
    /**
     * Gets the "note" element
     */
    public noNamespace.NoteDocument.Note getNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NoteDocument.Note target = null;
            target = (noNamespace.NoteDocument.Note)get_store().find_element_user(NOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "note" element
     */
    @Inject(optional=true) public void setNote(noNamespace.NoteDocument.Note note)
    {
        generatedSetterHelperImpl(note, NOTE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "note" element
     */
    public noNamespace.NoteDocument.Note addNewNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.NoteDocument.Note target = null;
            target = (noNamespace.NoteDocument.Note)get_store().add_element_user(NOTE$0);
            return target;
        }
    }
    /**
     * An XML note(@).
     *
     * This is a complex type.
     */
    public static class NoteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.NoteDocument.Note
    {
        private static final long serialVersionUID = 1L;
        
        public NoteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEXT$0 = 
            new javax.xml.namespace.QName("", "text");
        private static final javax.xml.namespace.QName EDITOR$2 = 
            new javax.xml.namespace.QName("", "editor");
        private static final javax.xml.namespace.QName EDITED$4 = 
            new javax.xml.namespace.QName("", "edited");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("", "type");
        
        
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
         * Gets the "editor" element
         */
        public java.lang.String getEditor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITOR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "editor" element
         */
        public org.apache.xmlbeans.XmlString xgetEditor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDITOR$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "editor" element
         */
        public boolean isSetEditor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EDITOR$2) != 0;
            }
        }
        
        /**
         * Sets the "editor" element
         */
        @Inject(optional=true) public void setEditor(java.lang.String editor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EDITOR$2);
                }
                target.setStringValue(editor);
            }
        }
        
        /**
         * Sets (as xml) the "editor" element
         */
        public void xsetEditor(org.apache.xmlbeans.XmlString editor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDITOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EDITOR$2);
                }
                target.set(editor);
            }
        }
        
        /**
         * Unsets the "editor" element
         */
        public void unsetEditor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EDITOR$2, 0);
            }
        }
        
        /**
         * Gets the "edited" element
         */
        public java.lang.String getEdited()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITED$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "edited" element
         */
        public org.apache.xmlbeans.XmlString xgetEdited()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDITED$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "edited" element
         */
        public boolean isSetEdited()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EDITED$4) != 0;
            }
        }
        
        /**
         * Sets the "edited" element
         */
        @Inject(optional=true) public void setEdited(java.lang.String edited)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EDITED$4);
                }
                target.setStringValue(edited);
            }
        }
        
        /**
         * Sets (as xml) the "edited" element
         */
        public void xsetEdited(org.apache.xmlbeans.XmlString edited)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDITED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EDITED$4);
                }
                target.set(edited);
            }
        }
        
        /**
         * Unsets the "edited" element
         */
        public void unsetEdited()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EDITED$4, 0);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
                }
                target.set(type);
            }
        }
    }
}
