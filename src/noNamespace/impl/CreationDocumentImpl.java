/*
 * An XML document type.
 * Localname: creation
 * Namespace: 
 * Java type: noNamespace.CreationDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one creation(@) element.
 *
 * This is a complex type.
 */
public class CreationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CreationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATION$0 = 
        new javax.xml.namespace.QName("", "creation");
    
    
    /**
     * Gets the "creation" element
     */
    public noNamespace.CreationDocument.Creation getCreation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CreationDocument.Creation target = null;
            target = (noNamespace.CreationDocument.Creation)get_store().find_element_user(CREATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "creation" element
     */
    @Inject(optional=true) public void setCreation(noNamespace.CreationDocument.Creation creation)
    {
        generatedSetterHelperImpl(creation, CREATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "creation" element
     */
    public noNamespace.CreationDocument.Creation addNewCreation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CreationDocument.Creation target = null;
            target = (noNamespace.CreationDocument.Creation)get_store().add_element_user(CREATION$0);
            return target;
        }
    }
    /**
     * An XML creation(@).
     *
     * This is a complex type.
     */
    public static class CreationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CreationDocument.Creation
    {
        private static final long serialVersionUID = 1L;
        
        public CreationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOURCE$0 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName IDENTIFIER$2 = 
            new javax.xml.namespace.QName("", "identifier");
        private static final javax.xml.namespace.QName CREATOR$4 = 
            new javax.xml.namespace.QName("", "creator");
        private static final javax.xml.namespace.QName CREATED$6 = 
            new javax.xml.namespace.QName("", "created");
        
        
        /**
         * Gets the "source" element
         */
        public java.lang.String getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" element
         */
        public org.apache.xmlbeans.XmlString xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "source" element
         */
        @Inject(optional=true) public void setSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$0);
                }
                target.setStringValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" element
         */
        public void xsetSource(org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$0);
                }
                target.set(source);
            }
        }
        
        /**
         * Gets the "identifier" element
         */
        public java.lang.String getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "identifier" element
         */
        public org.apache.xmlbeans.XmlString xgetIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFIER$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "identifier" element
         */
        @Inject(optional=true) public void setIdentifier(java.lang.String identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIER$2);
                }
                target.setStringValue(identifier);
            }
        }
        
        /**
         * Sets (as xml) the "identifier" element
         */
        public void xsetIdentifier(org.apache.xmlbeans.XmlString identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFIER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFIER$2);
                }
                target.set(identifier);
            }
        }
        
        /**
         * Gets a List of "creator" elements
         */
        public java.util.List<java.lang.String> getCreatorList()
        {
            final class CreatorList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return CreationImpl.this.getCreatorArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = CreationImpl.this.getCreatorArray(i);
                    CreationImpl.this.setCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { CreationImpl.this.insertCreator(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = CreationImpl.this.getCreatorArray(i);
                    CreationImpl.this.removeCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return CreationImpl.this.sizeOfCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CreatorList();
            }
        }
        
        /**
         * Gets array of all "creator" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.CreationDocument.Creation.Creator> targetList = new java.util.ArrayList<noNamespace.CreationDocument.Creation.Creator>();
                get_store().find_all_element_users(CREATOR$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "creator" element
         */
        public java.lang.String getCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATOR$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "creator" elements
         */
        public java.util.List<noNamespace.CreationDocument.Creation.Creator> xgetCreatorList()
        {
            final class CreatorList extends java.util.AbstractList<noNamespace.CreationDocument.Creation.Creator>
            {
                @Override
                public noNamespace.CreationDocument.Creation.Creator get(int i)
                    { return CreationImpl.this.xgetCreatorArray(i); }
                
                @Override
                public noNamespace.CreationDocument.Creation.Creator set(int i, noNamespace.CreationDocument.Creation.Creator o)
                {
                    noNamespace.CreationDocument.Creation.Creator old = CreationImpl.this.xgetCreatorArray(i);
                    CreationImpl.this.xsetCreatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.CreationDocument.Creation.Creator o)
                    { CreationImpl.this.insertNewCreator(i).set(o); }
                
                @Override
                public noNamespace.CreationDocument.Creation.Creator remove(int i)
                {
                    noNamespace.CreationDocument.Creation.Creator old = CreationImpl.this.xgetCreatorArray(i);
                    CreationImpl.this.removeCreator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return CreationImpl.this.sizeOfCreatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CreatorList();
            }
        }
        
        /**
         * Gets array of all "creator" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.CreationDocument.Creation.Creator[] xgetCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.CreationDocument.Creation.Creator> targetList = new java.util.ArrayList<noNamespace.CreationDocument.Creation.Creator>();
                get_store().find_all_element_users(CREATOR$4, targetList);
                noNamespace.CreationDocument.Creation.Creator[] result = new noNamespace.CreationDocument.Creation.Creator[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "creator" element
         */
        public noNamespace.CreationDocument.Creation.Creator xgetCreatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CreationDocument.Creation.Creator target = null;
                target = (noNamespace.CreationDocument.Creation.Creator)get_store().find_element_user(CREATOR$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "creator" element
         */
        public int sizeOfCreatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATOR$4);
            }
        }
        
        /**
         * Sets array of all "creator" element
         */
        @Inject(optional=true) public void setCreatorArray(java.lang.String[] creatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(creatorArray, CREATOR$4);
            }
        }
        
        /**
         * Sets ith "creator" element
         */
        @Inject(optional=true) public void setCreatorArray(int i, java.lang.String creator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATOR$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(creator);
            }
        }
        
        /**
         * Sets (as xml) array of all "creator" element
         */
        public void xsetCreatorArray(noNamespace.CreationDocument.Creation.Creator[]creatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(creatorArray, CREATOR$4);
            }
        }
        
        /**
         * Sets (as xml) ith "creator" element
         */
        public void xsetCreatorArray(int i, noNamespace.CreationDocument.Creation.Creator creator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CreationDocument.Creation.Creator target = null;
                target = (noNamespace.CreationDocument.Creation.Creator)get_store().find_element_user(CREATOR$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(creator);
            }
        }
        
        /**
         * Inserts the value as the ith "creator" element
         */
        public void insertCreator(int i, java.lang.String creator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CREATOR$4, i);
                target.setStringValue(creator);
            }
        }
        
        /**
         * Appends the value as the last "creator" element
         */
        public void addCreator(java.lang.String creator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATOR$4);
                target.setStringValue(creator);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "creator" element
         */
        public noNamespace.CreationDocument.Creation.Creator insertNewCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CreationDocument.Creation.Creator target = null;
                target = (noNamespace.CreationDocument.Creation.Creator)get_store().insert_element_user(CREATOR$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "creator" element
         */
        public noNamespace.CreationDocument.Creation.Creator addNewCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CreationDocument.Creation.Creator target = null;
                target = (noNamespace.CreationDocument.Creation.Creator)get_store().add_element_user(CREATOR$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "creator" element
         */
        public void removeCreator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATOR$4, i);
            }
        }
        
        /**
         * Gets the "created" element
         */
        public java.lang.String getCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "created" element
         */
        public org.apache.xmlbeans.XmlString xgetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATED$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "created" element
         */
        public boolean isSetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATED$6) != 0;
            }
        }
        
        /**
         * Sets the "created" element
         */
        @Inject(optional=true) public void setCreated(java.lang.String created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$6);
                }
                target.setStringValue(created);
            }
        }
        
        /**
         * Sets (as xml) the "created" element
         */
        public void xsetCreated(org.apache.xmlbeans.XmlString created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATED$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATED$6);
                }
                target.set(created);
            }
        }
        
        /**
         * Unsets the "created" element
         */
        public void unsetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATED$6, 0);
            }
        }
        /**
         * An XML creator(@).
         *
         * This is an atomic type that is a restriction of noNamespace.CreationDocument$Creation$Creator.
         */
        public static class CreatorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.CreationDocument.Creation.Creator
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
}
