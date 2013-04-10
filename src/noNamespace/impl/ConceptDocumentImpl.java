/*
 * An XML document type.
 * Localname: Concept
 * Namespace: 
 * Java type: noNamespace.ConceptDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one Concept(@) element.
 *
 * This is a complex type.
 */
public class ConceptDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ConceptDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConceptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONCEPT$0 = 
        new javax.xml.namespace.QName("", "Concept");
    
    
    /**
     * Gets the "Concept" element
     */
    public noNamespace.ConceptDocument.Concept getConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ConceptDocument.Concept target = null;
            target = (noNamespace.ConceptDocument.Concept)get_store().find_element_user(CONCEPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Concept" element
     */
    @Inject(optional=true) public void setConcept(noNamespace.ConceptDocument.Concept concept)
    {
        generatedSetterHelperImpl(concept, CONCEPT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Concept" element
     */
    public noNamespace.ConceptDocument.Concept addNewConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ConceptDocument.Concept target = null;
            target = (noNamespace.ConceptDocument.Concept)get_store().add_element_user(CONCEPT$0);
            return target;
        }
    }
    /**
     * An XML Concept(@).
     *
     * This is a complex type.
     */
    public static class ConceptImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ConceptDocument.Concept
    {
        private static final long serialVersionUID = 1L;
        
        public ConceptImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ABOUT$0 = 
            new javax.xml.namespace.QName("", "about");
        private static final javax.xml.namespace.QName PREFTERM$2 = 
            new javax.xml.namespace.QName("", "prefTerm");
        private static final javax.xml.namespace.QName ALTTERM$4 = 
            new javax.xml.namespace.QName("", "altTerm");
        private static final javax.xml.namespace.QName HIDDENLABEL$6 = 
            new javax.xml.namespace.QName("", "hiddenLabel");
        private static final javax.xml.namespace.QName NOTATION$8 = 
            new javax.xml.namespace.QName("", "notation");
        private static final javax.xml.namespace.QName INSCHEME$10 = 
            new javax.xml.namespace.QName("", "inScheme");
        private static final javax.xml.namespace.QName MEMBEROFCOLLECTION$12 = 
            new javax.xml.namespace.QName("", "memberOfCollection");
        private static final javax.xml.namespace.QName BROADER$14 = 
            new javax.xml.namespace.QName("", "broader");
        private static final javax.xml.namespace.QName NARROWER$16 = 
            new javax.xml.namespace.QName("", "narrower");
        private static final javax.xml.namespace.QName USE$18 = 
            new javax.xml.namespace.QName("", "use");
        private static final javax.xml.namespace.QName USEFOR$20 = 
            new javax.xml.namespace.QName("", "useFor");
        private static final javax.xml.namespace.QName RELATIONSHIP$22 = 
            new javax.xml.namespace.QName("", "relationship");
        private static final javax.xml.namespace.QName EQUIVRELATIONSHIP$24 = 
            new javax.xml.namespace.QName("", "equivRelationship");
        private static final javax.xml.namespace.QName DEFINITION$26 = 
            new javax.xml.namespace.QName("", "definition");
        private static final javax.xml.namespace.QName DEPICTION$28 = 
            new javax.xml.namespace.QName("", "depiction");
        private static final javax.xml.namespace.QName SUBJECTINDICATOR$30 = 
            new javax.xml.namespace.QName("", "subjectIndicator");
        private static final javax.xml.namespace.QName NOTE$32 = 
            new javax.xml.namespace.QName("", "note");
        private static final javax.xml.namespace.QName CREATION$34 = 
            new javax.xml.namespace.QName("", "creation");
        private static final javax.xml.namespace.QName STATUS$36 = 
            new javax.xml.namespace.QName("", "status");
        private static final javax.xml.namespace.QName MODIFIED$38 = 
            new javax.xml.namespace.QName("", "modified");
        
        
        /**
         * Gets the "about" element
         */
        public java.lang.String getAbout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABOUT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "about" element
         */
        public org.apache.xmlbeans.XmlString xgetAbout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABOUT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "about" element
         */
        @Inject(optional=true) public void setAbout(java.lang.String about)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABOUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABOUT$0);
                }
                target.setStringValue(about);
            }
        }
        
        /**
         * Sets (as xml) the "about" element
         */
        public void xsetAbout(org.apache.xmlbeans.XmlString about)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABOUT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ABOUT$0);
                }
                target.set(about);
            }
        }
        
        /**
         * Gets a List of "prefTerm" elements
         */
        public java.util.List<noNamespace.PrefTermDocument.PrefTerm> getPrefTermList()
        {
            final class PrefTermList extends java.util.AbstractList<noNamespace.PrefTermDocument.PrefTerm>
            {
                @Override
                public noNamespace.PrefTermDocument.PrefTerm get(int i)
                    { return ConceptImpl.this.getPrefTermArray(i); }
                
                @Override
                public noNamespace.PrefTermDocument.PrefTerm set(int i, noNamespace.PrefTermDocument.PrefTerm o)
                {
                    noNamespace.PrefTermDocument.PrefTerm old = ConceptImpl.this.getPrefTermArray(i);
                    ConceptImpl.this.setPrefTermArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.PrefTermDocument.PrefTerm o)
                    { ConceptImpl.this.insertNewPrefTerm(i).set(o); }
                
                @Override
                public noNamespace.PrefTermDocument.PrefTerm remove(int i)
                {
                    noNamespace.PrefTermDocument.PrefTerm old = ConceptImpl.this.getPrefTermArray(i);
                    ConceptImpl.this.removePrefTerm(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfPrefTermArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new PrefTermList();
            }
        }
        
        /**
         * Gets array of all "prefTerm" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.PrefTermDocument.PrefTerm[] getPrefTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.PrefTermDocument.PrefTerm> targetList = new java.util.ArrayList<noNamespace.PrefTermDocument.PrefTerm>();
                get_store().find_all_element_users(PREFTERM$2, targetList);
                noNamespace.PrefTermDocument.PrefTerm[] result = new noNamespace.PrefTermDocument.PrefTerm[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "prefTerm" element
         */
        public noNamespace.PrefTermDocument.PrefTerm getPrefTermArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PrefTermDocument.PrefTerm target = null;
                target = (noNamespace.PrefTermDocument.PrefTerm)get_store().find_element_user(PREFTERM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "prefTerm" element
         */
        public int sizeOfPrefTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PREFTERM$2);
            }
        }
        
        /**
         * Sets array of all "prefTerm" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setPrefTermArray(noNamespace.PrefTermDocument.PrefTerm[] prefTermArray)
        {
            check_orphaned();
            arraySetterHelper(prefTermArray, PREFTERM$2);
        }
        
        /**
         * Sets ith "prefTerm" element
         */
        @Inject(optional=true) public void setPrefTermArray(int i, noNamespace.PrefTermDocument.PrefTerm prefTerm)
        {
            generatedSetterHelperImpl(prefTerm, PREFTERM$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "prefTerm" element
         */
        public noNamespace.PrefTermDocument.PrefTerm insertNewPrefTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PrefTermDocument.PrefTerm target = null;
                target = (noNamespace.PrefTermDocument.PrefTerm)get_store().insert_element_user(PREFTERM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "prefTerm" element
         */
        public noNamespace.PrefTermDocument.PrefTerm addNewPrefTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.PrefTermDocument.PrefTerm target = null;
                target = (noNamespace.PrefTermDocument.PrefTerm)get_store().add_element_user(PREFTERM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "prefTerm" element
         */
        public void removePrefTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PREFTERM$2, i);
            }
        }
        
        /**
         * Gets a List of "altTerm" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.AltTerm> getAltTermList()
        {
            final class AltTermList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.AltTerm>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.AltTerm get(int i)
                    { return ConceptImpl.this.getAltTermArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.AltTerm set(int i, noNamespace.ConceptDocument.Concept.AltTerm o)
                {
                    noNamespace.ConceptDocument.Concept.AltTerm old = ConceptImpl.this.getAltTermArray(i);
                    ConceptImpl.this.setAltTermArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.AltTerm o)
                    { ConceptImpl.this.insertNewAltTerm(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.AltTerm remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.AltTerm old = ConceptImpl.this.getAltTermArray(i);
                    ConceptImpl.this.removeAltTerm(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfAltTermArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AltTermList();
            }
        }
        
        /**
         * Gets array of all "altTerm" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.AltTerm[] getAltTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.AltTerm> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.AltTerm>();
                get_store().find_all_element_users(ALTTERM$4, targetList);
                noNamespace.ConceptDocument.Concept.AltTerm[] result = new noNamespace.ConceptDocument.Concept.AltTerm[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "altTerm" element
         */
        public noNamespace.ConceptDocument.Concept.AltTerm getAltTermArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.AltTerm target = null;
                target = (noNamespace.ConceptDocument.Concept.AltTerm)get_store().find_element_user(ALTTERM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "altTerm" element
         */
        public boolean isNilAltTermArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.AltTerm target = null;
                target = (noNamespace.ConceptDocument.Concept.AltTerm)get_store().find_element_user(ALTTERM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "altTerm" element
         */
        public int sizeOfAltTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTTERM$4);
            }
        }
        
        /**
         * Sets array of all "altTerm" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setAltTermArray(noNamespace.ConceptDocument.Concept.AltTerm[] altTermArray)
        {
            check_orphaned();
            arraySetterHelper(altTermArray, ALTTERM$4);
        }
        
        /**
         * Sets ith "altTerm" element
         */
        @Inject(optional=true) public void setAltTermArray(int i, noNamespace.ConceptDocument.Concept.AltTerm altTerm)
        {
            generatedSetterHelperImpl(altTerm, ALTTERM$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Nils the ith "altTerm" element
         */
        @Inject(optional=true) public void setNilAltTermArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.AltTerm target = null;
                target = (noNamespace.ConceptDocument.Concept.AltTerm)get_store().find_element_user(ALTTERM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "altTerm" element
         */
        public noNamespace.ConceptDocument.Concept.AltTerm insertNewAltTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.AltTerm target = null;
                target = (noNamespace.ConceptDocument.Concept.AltTerm)get_store().insert_element_user(ALTTERM$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "altTerm" element
         */
        public noNamespace.ConceptDocument.Concept.AltTerm addNewAltTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.AltTerm target = null;
                target = (noNamespace.ConceptDocument.Concept.AltTerm)get_store().add_element_user(ALTTERM$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "altTerm" element
         */
        public void removeAltTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTTERM$4, i);
            }
        }
        
        /**
         * Gets a List of "hiddenLabel" elements
         */
        public java.util.List<java.lang.String> getHiddenLabelList()
        {
            final class HiddenLabelList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return ConceptImpl.this.getHiddenLabelArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = ConceptImpl.this.getHiddenLabelArray(i);
                    ConceptImpl.this.setHiddenLabelArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { ConceptImpl.this.insertHiddenLabel(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = ConceptImpl.this.getHiddenLabelArray(i);
                    ConceptImpl.this.removeHiddenLabel(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfHiddenLabelArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new HiddenLabelList();
            }
        }
        
        /**
         * Gets array of all "hiddenLabel" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getHiddenLabelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.HiddenLabel> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.HiddenLabel>();
                get_store().find_all_element_users(HIDDENLABEL$6, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "hiddenLabel" element
         */
        public java.lang.String getHiddenLabelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIDDENLABEL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "hiddenLabel" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.HiddenLabel> xgetHiddenLabelList()
        {
            final class HiddenLabelList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.HiddenLabel>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.HiddenLabel get(int i)
                    { return ConceptImpl.this.xgetHiddenLabelArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.HiddenLabel set(int i, noNamespace.ConceptDocument.Concept.HiddenLabel o)
                {
                    noNamespace.ConceptDocument.Concept.HiddenLabel old = ConceptImpl.this.xgetHiddenLabelArray(i);
                    ConceptImpl.this.xsetHiddenLabelArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.HiddenLabel o)
                    { ConceptImpl.this.insertNewHiddenLabel(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.HiddenLabel remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.HiddenLabel old = ConceptImpl.this.xgetHiddenLabelArray(i);
                    ConceptImpl.this.removeHiddenLabel(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfHiddenLabelArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new HiddenLabelList();
            }
        }
        
        /**
         * Gets array of all "hiddenLabel" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.HiddenLabel[] xgetHiddenLabelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.HiddenLabel> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.HiddenLabel>();
                get_store().find_all_element_users(HIDDENLABEL$6, targetList);
                noNamespace.ConceptDocument.Concept.HiddenLabel[] result = new noNamespace.ConceptDocument.Concept.HiddenLabel[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "hiddenLabel" element
         */
        public noNamespace.ConceptDocument.Concept.HiddenLabel xgetHiddenLabelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.HiddenLabel target = null;
                target = (noNamespace.ConceptDocument.Concept.HiddenLabel)get_store().find_element_user(HIDDENLABEL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "hiddenLabel" element
         */
        public boolean isNilHiddenLabelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.HiddenLabel target = null;
                target = (noNamespace.ConceptDocument.Concept.HiddenLabel)get_store().find_element_user(HIDDENLABEL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "hiddenLabel" element
         */
        public int sizeOfHiddenLabelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HIDDENLABEL$6);
            }
        }
        
        /**
         * Sets array of all "hiddenLabel" element
         */
        @Inject(optional=true) public void setHiddenLabelArray(java.lang.String[] hiddenLabelArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(hiddenLabelArray, HIDDENLABEL$6);
            }
        }
        
        /**
         * Sets ith "hiddenLabel" element
         */
        @Inject(optional=true) public void setHiddenLabelArray(int i, java.lang.String hiddenLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HIDDENLABEL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(hiddenLabel);
            }
        }
        
        /**
         * Sets (as xml) array of all "hiddenLabel" element
         */
        public void xsetHiddenLabelArray(noNamespace.ConceptDocument.Concept.HiddenLabel[]hiddenLabelArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(hiddenLabelArray, HIDDENLABEL$6);
            }
        }
        
        /**
         * Sets (as xml) ith "hiddenLabel" element
         */
        public void xsetHiddenLabelArray(int i, noNamespace.ConceptDocument.Concept.HiddenLabel hiddenLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.HiddenLabel target = null;
                target = (noNamespace.ConceptDocument.Concept.HiddenLabel)get_store().find_element_user(HIDDENLABEL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(hiddenLabel);
            }
        }
        
        /**
         * Nils the ith "hiddenLabel" element
         */
        @Inject(optional=true) public void setNilHiddenLabelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.HiddenLabel target = null;
                target = (noNamespace.ConceptDocument.Concept.HiddenLabel)get_store().find_element_user(HIDDENLABEL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "hiddenLabel" element
         */
        public void insertHiddenLabel(int i, java.lang.String hiddenLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(HIDDENLABEL$6, i);
                target.setStringValue(hiddenLabel);
            }
        }
        
        /**
         * Appends the value as the last "hiddenLabel" element
         */
        public void addHiddenLabel(java.lang.String hiddenLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HIDDENLABEL$6);
                target.setStringValue(hiddenLabel);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "hiddenLabel" element
         */
        public noNamespace.ConceptDocument.Concept.HiddenLabel insertNewHiddenLabel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.HiddenLabel target = null;
                target = (noNamespace.ConceptDocument.Concept.HiddenLabel)get_store().insert_element_user(HIDDENLABEL$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "hiddenLabel" element
         */
        public noNamespace.ConceptDocument.Concept.HiddenLabel addNewHiddenLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.HiddenLabel target = null;
                target = (noNamespace.ConceptDocument.Concept.HiddenLabel)get_store().add_element_user(HIDDENLABEL$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "hiddenLabel" element
         */
        public void removeHiddenLabel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HIDDENLABEL$6, i);
            }
        }
        
        /**
         * Gets the "notation" element
         */
        public java.lang.String getNotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTATION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "notation" element
         */
        public org.apache.xmlbeans.XmlString xgetNotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTATION$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "notation" element
         */
        public boolean isSetNotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOTATION$8) != 0;
            }
        }
        
        /**
         * Sets the "notation" element
         */
        @Inject(optional=true) public void setNotation(java.lang.String notation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTATION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTATION$8);
                }
                target.setStringValue(notation);
            }
        }
        
        /**
         * Sets (as xml) the "notation" element
         */
        public void xsetNotation(org.apache.xmlbeans.XmlString notation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTATION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTATION$8);
                }
                target.set(notation);
            }
        }
        
        /**
         * Unsets the "notation" element
         */
        public void unsetNotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOTATION$8, 0);
            }
        }
        
        /**
         * Gets the "inScheme" element
         */
        public java.lang.String getInScheme()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSCHEME$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "inScheme" element
         */
        public org.apache.xmlbeans.XmlString xgetInScheme()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSCHEME$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "inScheme" element
         */
        @Inject(optional=true) public void setInScheme(java.lang.String inScheme)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSCHEME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSCHEME$10);
                }
                target.setStringValue(inScheme);
            }
        }
        
        /**
         * Sets (as xml) the "inScheme" element
         */
        public void xsetInScheme(org.apache.xmlbeans.XmlString inScheme)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSCHEME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSCHEME$10);
                }
                target.set(inScheme);
            }
        }
        
        /**
         * Gets a List of "memberOfCollection" elements
         */
        public java.util.List<java.lang.String> getMemberOfCollectionList()
        {
            final class MemberOfCollectionList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return ConceptImpl.this.getMemberOfCollectionArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = ConceptImpl.this.getMemberOfCollectionArray(i);
                    ConceptImpl.this.setMemberOfCollectionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { ConceptImpl.this.insertMemberOfCollection(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = ConceptImpl.this.getMemberOfCollectionArray(i);
                    ConceptImpl.this.removeMemberOfCollection(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfMemberOfCollectionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MemberOfCollectionList();
            }
        }
        
        /**
         * Gets array of all "memberOfCollection" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getMemberOfCollectionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.MemberOfCollection> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.MemberOfCollection>();
                get_store().find_all_element_users(MEMBEROFCOLLECTION$12, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "memberOfCollection" element
         */
        public java.lang.String getMemberOfCollectionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBEROFCOLLECTION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "memberOfCollection" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.MemberOfCollection> xgetMemberOfCollectionList()
        {
            final class MemberOfCollectionList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.MemberOfCollection>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.MemberOfCollection get(int i)
                    { return ConceptImpl.this.xgetMemberOfCollectionArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.MemberOfCollection set(int i, noNamespace.ConceptDocument.Concept.MemberOfCollection o)
                {
                    noNamespace.ConceptDocument.Concept.MemberOfCollection old = ConceptImpl.this.xgetMemberOfCollectionArray(i);
                    ConceptImpl.this.xsetMemberOfCollectionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.MemberOfCollection o)
                    { ConceptImpl.this.insertNewMemberOfCollection(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.MemberOfCollection remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.MemberOfCollection old = ConceptImpl.this.xgetMemberOfCollectionArray(i);
                    ConceptImpl.this.removeMemberOfCollection(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfMemberOfCollectionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MemberOfCollectionList();
            }
        }
        
        /**
         * Gets array of all "memberOfCollection" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.MemberOfCollection[] xgetMemberOfCollectionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.MemberOfCollection> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.MemberOfCollection>();
                get_store().find_all_element_users(MEMBEROFCOLLECTION$12, targetList);
                noNamespace.ConceptDocument.Concept.MemberOfCollection[] result = new noNamespace.ConceptDocument.Concept.MemberOfCollection[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "memberOfCollection" element
         */
        public noNamespace.ConceptDocument.Concept.MemberOfCollection xgetMemberOfCollectionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.MemberOfCollection target = null;
                target = (noNamespace.ConceptDocument.Concept.MemberOfCollection)get_store().find_element_user(MEMBEROFCOLLECTION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "memberOfCollection" element
         */
        public boolean isNilMemberOfCollectionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.MemberOfCollection target = null;
                target = (noNamespace.ConceptDocument.Concept.MemberOfCollection)get_store().find_element_user(MEMBEROFCOLLECTION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "memberOfCollection" element
         */
        public int sizeOfMemberOfCollectionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEMBEROFCOLLECTION$12);
            }
        }
        
        /**
         * Sets array of all "memberOfCollection" element
         */
        @Inject(optional=true) public void setMemberOfCollectionArray(java.lang.String[] memberOfCollectionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(memberOfCollectionArray, MEMBEROFCOLLECTION$12);
            }
        }
        
        /**
         * Sets ith "memberOfCollection" element
         */
        @Inject(optional=true) public void setMemberOfCollectionArray(int i, java.lang.String memberOfCollection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEMBEROFCOLLECTION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(memberOfCollection);
            }
        }
        
        /**
         * Sets (as xml) array of all "memberOfCollection" element
         */
        public void xsetMemberOfCollectionArray(noNamespace.ConceptDocument.Concept.MemberOfCollection[]memberOfCollectionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(memberOfCollectionArray, MEMBEROFCOLLECTION$12);
            }
        }
        
        /**
         * Sets (as xml) ith "memberOfCollection" element
         */
        public void xsetMemberOfCollectionArray(int i, noNamespace.ConceptDocument.Concept.MemberOfCollection memberOfCollection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.MemberOfCollection target = null;
                target = (noNamespace.ConceptDocument.Concept.MemberOfCollection)get_store().find_element_user(MEMBEROFCOLLECTION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(memberOfCollection);
            }
        }
        
        /**
         * Nils the ith "memberOfCollection" element
         */
        @Inject(optional=true) public void setNilMemberOfCollectionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.MemberOfCollection target = null;
                target = (noNamespace.ConceptDocument.Concept.MemberOfCollection)get_store().find_element_user(MEMBEROFCOLLECTION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "memberOfCollection" element
         */
        public void insertMemberOfCollection(int i, java.lang.String memberOfCollection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MEMBEROFCOLLECTION$12, i);
                target.setStringValue(memberOfCollection);
            }
        }
        
        /**
         * Appends the value as the last "memberOfCollection" element
         */
        public void addMemberOfCollection(java.lang.String memberOfCollection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEMBEROFCOLLECTION$12);
                target.setStringValue(memberOfCollection);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "memberOfCollection" element
         */
        public noNamespace.ConceptDocument.Concept.MemberOfCollection insertNewMemberOfCollection(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.MemberOfCollection target = null;
                target = (noNamespace.ConceptDocument.Concept.MemberOfCollection)get_store().insert_element_user(MEMBEROFCOLLECTION$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "memberOfCollection" element
         */
        public noNamespace.ConceptDocument.Concept.MemberOfCollection addNewMemberOfCollection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.MemberOfCollection target = null;
                target = (noNamespace.ConceptDocument.Concept.MemberOfCollection)get_store().add_element_user(MEMBEROFCOLLECTION$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "memberOfCollection" element
         */
        public void removeMemberOfCollection(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEMBEROFCOLLECTION$12, i);
            }
        }
        
        /**
         * Gets a List of "broader" elements
         */
        public java.util.List<java.lang.String> getBroaderList()
        {
            final class BroaderList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return ConceptImpl.this.getBroaderArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = ConceptImpl.this.getBroaderArray(i);
                    ConceptImpl.this.setBroaderArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { ConceptImpl.this.insertBroader(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = ConceptImpl.this.getBroaderArray(i);
                    ConceptImpl.this.removeBroader(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfBroaderArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BroaderList();
            }
        }
        
        /**
         * Gets array of all "broader" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getBroaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Broader> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Broader>();
                get_store().find_all_element_users(BROADER$14, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "broader" element
         */
        public java.lang.String getBroaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "broader" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.Broader> xgetBroaderList()
        {
            final class BroaderList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.Broader>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.Broader get(int i)
                    { return ConceptImpl.this.xgetBroaderArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Broader set(int i, noNamespace.ConceptDocument.Concept.Broader o)
                {
                    noNamespace.ConceptDocument.Concept.Broader old = ConceptImpl.this.xgetBroaderArray(i);
                    ConceptImpl.this.xsetBroaderArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.Broader o)
                    { ConceptImpl.this.insertNewBroader(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Broader remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.Broader old = ConceptImpl.this.xgetBroaderArray(i);
                    ConceptImpl.this.removeBroader(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfBroaderArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new BroaderList();
            }
        }
        
        /**
         * Gets array of all "broader" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.Broader[] xgetBroaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Broader> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Broader>();
                get_store().find_all_element_users(BROADER$14, targetList);
                noNamespace.ConceptDocument.Concept.Broader[] result = new noNamespace.ConceptDocument.Concept.Broader[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "broader" element
         */
        public noNamespace.ConceptDocument.Concept.Broader xgetBroaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Broader target = null;
                target = (noNamespace.ConceptDocument.Concept.Broader)get_store().find_element_user(BROADER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "broader" element
         */
        public boolean isNilBroaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Broader target = null;
                target = (noNamespace.ConceptDocument.Concept.Broader)get_store().find_element_user(BROADER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "broader" element
         */
        public int sizeOfBroaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BROADER$14);
            }
        }
        
        /**
         * Sets array of all "broader" element
         */
        @Inject(optional=true) public void setBroaderArray(java.lang.String[] broaderArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(broaderArray, BROADER$14);
            }
        }
        
        /**
         * Sets ith "broader" element
         */
        @Inject(optional=true) public void setBroaderArray(int i, java.lang.String broader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BROADER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(broader);
            }
        }
        
        /**
         * Sets (as xml) array of all "broader" element
         */
        public void xsetBroaderArray(noNamespace.ConceptDocument.Concept.Broader[]broaderArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(broaderArray, BROADER$14);
            }
        }
        
        /**
         * Sets (as xml) ith "broader" element
         */
        public void xsetBroaderArray(int i, noNamespace.ConceptDocument.Concept.Broader broader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Broader target = null;
                target = (noNamespace.ConceptDocument.Concept.Broader)get_store().find_element_user(BROADER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(broader);
            }
        }
        
        /**
         * Nils the ith "broader" element
         */
        @Inject(optional=true) public void setNilBroaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Broader target = null;
                target = (noNamespace.ConceptDocument.Concept.Broader)get_store().find_element_user(BROADER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "broader" element
         */
        public void insertBroader(int i, java.lang.String broader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BROADER$14, i);
                target.setStringValue(broader);
            }
        }
        
        /**
         * Appends the value as the last "broader" element
         */
        public void addBroader(java.lang.String broader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BROADER$14);
                target.setStringValue(broader);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "broader" element
         */
        public noNamespace.ConceptDocument.Concept.Broader insertNewBroader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Broader target = null;
                target = (noNamespace.ConceptDocument.Concept.Broader)get_store().insert_element_user(BROADER$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "broader" element
         */
        public noNamespace.ConceptDocument.Concept.Broader addNewBroader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Broader target = null;
                target = (noNamespace.ConceptDocument.Concept.Broader)get_store().add_element_user(BROADER$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "broader" element
         */
        public void removeBroader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BROADER$14, i);
            }
        }
        
        /**
         * Gets a List of "narrower" elements
         */
        public java.util.List<java.lang.String> getNarrowerList()
        {
            final class NarrowerList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return ConceptImpl.this.getNarrowerArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = ConceptImpl.this.getNarrowerArray(i);
                    ConceptImpl.this.setNarrowerArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { ConceptImpl.this.insertNarrower(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = ConceptImpl.this.getNarrowerArray(i);
                    ConceptImpl.this.removeNarrower(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfNarrowerArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new NarrowerList();
            }
        }
        
        /**
         * Gets array of all "narrower" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getNarrowerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Narrower> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Narrower>();
                get_store().find_all_element_users(NARROWER$16, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "narrower" element
         */
        public java.lang.String getNarrowerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NARROWER$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "narrower" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.Narrower> xgetNarrowerList()
        {
            final class NarrowerList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.Narrower>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.Narrower get(int i)
                    { return ConceptImpl.this.xgetNarrowerArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Narrower set(int i, noNamespace.ConceptDocument.Concept.Narrower o)
                {
                    noNamespace.ConceptDocument.Concept.Narrower old = ConceptImpl.this.xgetNarrowerArray(i);
                    ConceptImpl.this.xsetNarrowerArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.Narrower o)
                    { ConceptImpl.this.insertNewNarrower(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Narrower remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.Narrower old = ConceptImpl.this.xgetNarrowerArray(i);
                    ConceptImpl.this.removeNarrower(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfNarrowerArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new NarrowerList();
            }
        }
        
        /**
         * Gets array of all "narrower" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.Narrower[] xgetNarrowerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Narrower> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Narrower>();
                get_store().find_all_element_users(NARROWER$16, targetList);
                noNamespace.ConceptDocument.Concept.Narrower[] result = new noNamespace.ConceptDocument.Concept.Narrower[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "narrower" element
         */
        public noNamespace.ConceptDocument.Concept.Narrower xgetNarrowerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Narrower target = null;
                target = (noNamespace.ConceptDocument.Concept.Narrower)get_store().find_element_user(NARROWER$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "narrower" element
         */
        public boolean isNilNarrowerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Narrower target = null;
                target = (noNamespace.ConceptDocument.Concept.Narrower)get_store().find_element_user(NARROWER$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "narrower" element
         */
        public int sizeOfNarrowerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NARROWER$16);
            }
        }
        
        /**
         * Sets array of all "narrower" element
         */
        @Inject(optional=true) public void setNarrowerArray(java.lang.String[] narrowerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(narrowerArray, NARROWER$16);
            }
        }
        
        /**
         * Sets ith "narrower" element
         */
        @Inject(optional=true) public void setNarrowerArray(int i, java.lang.String narrower)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NARROWER$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(narrower);
            }
        }
        
        /**
         * Sets (as xml) array of all "narrower" element
         */
        public void xsetNarrowerArray(noNamespace.ConceptDocument.Concept.Narrower[]narrowerArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(narrowerArray, NARROWER$16);
            }
        }
        
        /**
         * Sets (as xml) ith "narrower" element
         */
        public void xsetNarrowerArray(int i, noNamespace.ConceptDocument.Concept.Narrower narrower)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Narrower target = null;
                target = (noNamespace.ConceptDocument.Concept.Narrower)get_store().find_element_user(NARROWER$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(narrower);
            }
        }
        
        /**
         * Nils the ith "narrower" element
         */
        @Inject(optional=true) public void setNilNarrowerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Narrower target = null;
                target = (noNamespace.ConceptDocument.Concept.Narrower)get_store().find_element_user(NARROWER$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "narrower" element
         */
        public void insertNarrower(int i, java.lang.String narrower)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NARROWER$16, i);
                target.setStringValue(narrower);
            }
        }
        
        /**
         * Appends the value as the last "narrower" element
         */
        public void addNarrower(java.lang.String narrower)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NARROWER$16);
                target.setStringValue(narrower);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "narrower" element
         */
        public noNamespace.ConceptDocument.Concept.Narrower insertNewNarrower(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Narrower target = null;
                target = (noNamespace.ConceptDocument.Concept.Narrower)get_store().insert_element_user(NARROWER$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "narrower" element
         */
        public noNamespace.ConceptDocument.Concept.Narrower addNewNarrower()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Narrower target = null;
                target = (noNamespace.ConceptDocument.Concept.Narrower)get_store().add_element_user(NARROWER$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "narrower" element
         */
        public void removeNarrower(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NARROWER$16, i);
            }
        }
        
        /**
         * Gets the "use" element
         */
        public java.lang.String getUse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "use" element
         */
        public org.apache.xmlbeans.XmlString xgetUse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USE$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "use" element
         */
        public boolean isSetUse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USE$18) != 0;
            }
        }
        
        /**
         * Sets the "use" element
         */
        @Inject(optional=true) public void setUse(java.lang.String use)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USE$18);
                }
                target.setStringValue(use);
            }
        }
        
        /**
         * Sets (as xml) the "use" element
         */
        public void xsetUse(org.apache.xmlbeans.XmlString use)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USE$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USE$18);
                }
                target.set(use);
            }
        }
        
        /**
         * Unsets the "use" element
         */
        public void unsetUse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USE$18, 0);
            }
        }
        
        /**
         * Gets a List of "useFor" elements
         */
        public java.util.List<java.lang.String> getUseForList()
        {
            final class UseForList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return ConceptImpl.this.getUseForArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = ConceptImpl.this.getUseForArray(i);
                    ConceptImpl.this.setUseForArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { ConceptImpl.this.insertUseFor(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = ConceptImpl.this.getUseForArray(i);
                    ConceptImpl.this.removeUseFor(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfUseForArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new UseForList();
            }
        }
        
        /**
         * Gets array of all "useFor" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getUseForArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.UseFor> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.UseFor>();
                get_store().find_all_element_users(USEFOR$20, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "useFor" element
         */
        public java.lang.String getUseForArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEFOR$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "useFor" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.UseFor> xgetUseForList()
        {
            final class UseForList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.UseFor>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.UseFor get(int i)
                    { return ConceptImpl.this.xgetUseForArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.UseFor set(int i, noNamespace.ConceptDocument.Concept.UseFor o)
                {
                    noNamespace.ConceptDocument.Concept.UseFor old = ConceptImpl.this.xgetUseForArray(i);
                    ConceptImpl.this.xsetUseForArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.UseFor o)
                    { ConceptImpl.this.insertNewUseFor(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.UseFor remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.UseFor old = ConceptImpl.this.xgetUseForArray(i);
                    ConceptImpl.this.removeUseFor(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfUseForArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new UseForList();
            }
        }
        
        /**
         * Gets array of all "useFor" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.UseFor[] xgetUseForArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.UseFor> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.UseFor>();
                get_store().find_all_element_users(USEFOR$20, targetList);
                noNamespace.ConceptDocument.Concept.UseFor[] result = new noNamespace.ConceptDocument.Concept.UseFor[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "useFor" element
         */
        public noNamespace.ConceptDocument.Concept.UseFor xgetUseForArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.UseFor target = null;
                target = (noNamespace.ConceptDocument.Concept.UseFor)get_store().find_element_user(USEFOR$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "useFor" element
         */
        public boolean isNilUseForArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.UseFor target = null;
                target = (noNamespace.ConceptDocument.Concept.UseFor)get_store().find_element_user(USEFOR$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "useFor" element
         */
        public int sizeOfUseForArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USEFOR$20);
            }
        }
        
        /**
         * Sets array of all "useFor" element
         */
        @Inject(optional=true) public void setUseForArray(java.lang.String[] useForArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(useForArray, USEFOR$20);
            }
        }
        
        /**
         * Sets ith "useFor" element
         */
        @Inject(optional=true) public void setUseForArray(int i, java.lang.String useFor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEFOR$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(useFor);
            }
        }
        
        /**
         * Sets (as xml) array of all "useFor" element
         */
        public void xsetUseForArray(noNamespace.ConceptDocument.Concept.UseFor[]useForArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(useForArray, USEFOR$20);
            }
        }
        
        /**
         * Sets (as xml) ith "useFor" element
         */
        public void xsetUseForArray(int i, noNamespace.ConceptDocument.Concept.UseFor useFor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.UseFor target = null;
                target = (noNamespace.ConceptDocument.Concept.UseFor)get_store().find_element_user(USEFOR$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(useFor);
            }
        }
        
        /**
         * Nils the ith "useFor" element
         */
        @Inject(optional=true) public void setNilUseForArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.UseFor target = null;
                target = (noNamespace.ConceptDocument.Concept.UseFor)get_store().find_element_user(USEFOR$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "useFor" element
         */
        public void insertUseFor(int i, java.lang.String useFor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(USEFOR$20, i);
                target.setStringValue(useFor);
            }
        }
        
        /**
         * Appends the value as the last "useFor" element
         */
        public void addUseFor(java.lang.String useFor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEFOR$20);
                target.setStringValue(useFor);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "useFor" element
         */
        public noNamespace.ConceptDocument.Concept.UseFor insertNewUseFor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.UseFor target = null;
                target = (noNamespace.ConceptDocument.Concept.UseFor)get_store().insert_element_user(USEFOR$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "useFor" element
         */
        public noNamespace.ConceptDocument.Concept.UseFor addNewUseFor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.UseFor target = null;
                target = (noNamespace.ConceptDocument.Concept.UseFor)get_store().add_element_user(USEFOR$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "useFor" element
         */
        public void removeUseFor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USEFOR$20, i);
            }
        }
        
        /**
         * Gets a List of "relationship" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.Relationship> getRelationshipList()
        {
            final class RelationshipList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.Relationship>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.Relationship get(int i)
                    { return ConceptImpl.this.getRelationshipArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Relationship set(int i, noNamespace.ConceptDocument.Concept.Relationship o)
                {
                    noNamespace.ConceptDocument.Concept.Relationship old = ConceptImpl.this.getRelationshipArray(i);
                    ConceptImpl.this.setRelationshipArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.Relationship o)
                    { ConceptImpl.this.insertNewRelationship(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Relationship remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.Relationship old = ConceptImpl.this.getRelationshipArray(i);
                    ConceptImpl.this.removeRelationship(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfRelationshipArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RelationshipList();
            }
        }
        
        /**
         * Gets array of all "relationship" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.Relationship[] getRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Relationship> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Relationship>();
                get_store().find_all_element_users(RELATIONSHIP$22, targetList);
                noNamespace.ConceptDocument.Concept.Relationship[] result = new noNamespace.ConceptDocument.Concept.Relationship[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "relationship" element
         */
        public noNamespace.ConceptDocument.Concept.Relationship getRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Relationship target = null;
                target = (noNamespace.ConceptDocument.Concept.Relationship)get_store().find_element_user(RELATIONSHIP$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "relationship" element
         */
        public boolean isNilRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Relationship target = null;
                target = (noNamespace.ConceptDocument.Concept.Relationship)get_store().find_element_user(RELATIONSHIP$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "relationship" element
         */
        public int sizeOfRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATIONSHIP$22);
            }
        }
        
        /**
         * Sets array of all "relationship" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRelationshipArray(noNamespace.ConceptDocument.Concept.Relationship[] relationshipArray)
        {
            check_orphaned();
            arraySetterHelper(relationshipArray, RELATIONSHIP$22);
        }
        
        /**
         * Sets ith "relationship" element
         */
        @Inject(optional=true) public void setRelationshipArray(int i, noNamespace.ConceptDocument.Concept.Relationship relationship)
        {
            generatedSetterHelperImpl(relationship, RELATIONSHIP$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Nils the ith "relationship" element
         */
        @Inject(optional=true) public void setNilRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Relationship target = null;
                target = (noNamespace.ConceptDocument.Concept.Relationship)get_store().find_element_user(RELATIONSHIP$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "relationship" element
         */
        public noNamespace.ConceptDocument.Concept.Relationship insertNewRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Relationship target = null;
                target = (noNamespace.ConceptDocument.Concept.Relationship)get_store().insert_element_user(RELATIONSHIP$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "relationship" element
         */
        public noNamespace.ConceptDocument.Concept.Relationship addNewRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Relationship target = null;
                target = (noNamespace.ConceptDocument.Concept.Relationship)get_store().add_element_user(RELATIONSHIP$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "relationship" element
         */
        public void removeRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATIONSHIP$22, i);
            }
        }
        
        /**
         * Gets a List of "equivRelationship" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.EquivRelationship> getEquivRelationshipList()
        {
            final class EquivRelationshipList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.EquivRelationship>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.EquivRelationship get(int i)
                    { return ConceptImpl.this.getEquivRelationshipArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.EquivRelationship set(int i, noNamespace.ConceptDocument.Concept.EquivRelationship o)
                {
                    noNamespace.ConceptDocument.Concept.EquivRelationship old = ConceptImpl.this.getEquivRelationshipArray(i);
                    ConceptImpl.this.setEquivRelationshipArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.EquivRelationship o)
                    { ConceptImpl.this.insertNewEquivRelationship(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.EquivRelationship remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.EquivRelationship old = ConceptImpl.this.getEquivRelationshipArray(i);
                    ConceptImpl.this.removeEquivRelationship(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfEquivRelationshipArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new EquivRelationshipList();
            }
        }
        
        /**
         * Gets array of all "equivRelationship" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.EquivRelationship[] getEquivRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.EquivRelationship> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.EquivRelationship>();
                get_store().find_all_element_users(EQUIVRELATIONSHIP$24, targetList);
                noNamespace.ConceptDocument.Concept.EquivRelationship[] result = new noNamespace.ConceptDocument.Concept.EquivRelationship[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "equivRelationship" element
         */
        public noNamespace.ConceptDocument.Concept.EquivRelationship getEquivRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.EquivRelationship target = null;
                target = (noNamespace.ConceptDocument.Concept.EquivRelationship)get_store().find_element_user(EQUIVRELATIONSHIP$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "equivRelationship" element
         */
        public boolean isNilEquivRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.EquivRelationship target = null;
                target = (noNamespace.ConceptDocument.Concept.EquivRelationship)get_store().find_element_user(EQUIVRELATIONSHIP$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "equivRelationship" element
         */
        public int sizeOfEquivRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EQUIVRELATIONSHIP$24);
            }
        }
        
        /**
         * Sets array of all "equivRelationship" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setEquivRelationshipArray(noNamespace.ConceptDocument.Concept.EquivRelationship[] equivRelationshipArray)
        {
            check_orphaned();
            arraySetterHelper(equivRelationshipArray, EQUIVRELATIONSHIP$24);
        }
        
        /**
         * Sets ith "equivRelationship" element
         */
        @Inject(optional=true) public void setEquivRelationshipArray(int i, noNamespace.ConceptDocument.Concept.EquivRelationship equivRelationship)
        {
            generatedSetterHelperImpl(equivRelationship, EQUIVRELATIONSHIP$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Nils the ith "equivRelationship" element
         */
        @Inject(optional=true) public void setNilEquivRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.EquivRelationship target = null;
                target = (noNamespace.ConceptDocument.Concept.EquivRelationship)get_store().find_element_user(EQUIVRELATIONSHIP$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "equivRelationship" element
         */
        public noNamespace.ConceptDocument.Concept.EquivRelationship insertNewEquivRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.EquivRelationship target = null;
                target = (noNamespace.ConceptDocument.Concept.EquivRelationship)get_store().insert_element_user(EQUIVRELATIONSHIP$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "equivRelationship" element
         */
        public noNamespace.ConceptDocument.Concept.EquivRelationship addNewEquivRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.EquivRelationship target = null;
                target = (noNamespace.ConceptDocument.Concept.EquivRelationship)get_store().add_element_user(EQUIVRELATIONSHIP$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "equivRelationship" element
         */
        public void removeEquivRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EQUIVRELATIONSHIP$24, i);
            }
        }
        
        /**
         * Gets a List of "definition" elements
         */
        public java.util.List<java.lang.String> getDefinitionList()
        {
            final class DefinitionList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return ConceptImpl.this.getDefinitionArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = ConceptImpl.this.getDefinitionArray(i);
                    ConceptImpl.this.setDefinitionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { ConceptImpl.this.insertDefinition(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = ConceptImpl.this.getDefinitionArray(i);
                    ConceptImpl.this.removeDefinition(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfDefinitionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DefinitionList();
            }
        }
        
        /**
         * Gets array of all "definition" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getDefinitionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Definition> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Definition>();
                get_store().find_all_element_users(DEFINITION$26, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "definition" element
         */
        public java.lang.String getDefinitionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFINITION$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "definition" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.Definition> xgetDefinitionList()
        {
            final class DefinitionList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.Definition>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.Definition get(int i)
                    { return ConceptImpl.this.xgetDefinitionArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Definition set(int i, noNamespace.ConceptDocument.Concept.Definition o)
                {
                    noNamespace.ConceptDocument.Concept.Definition old = ConceptImpl.this.xgetDefinitionArray(i);
                    ConceptImpl.this.xsetDefinitionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.Definition o)
                    { ConceptImpl.this.insertNewDefinition(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Definition remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.Definition old = ConceptImpl.this.xgetDefinitionArray(i);
                    ConceptImpl.this.removeDefinition(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfDefinitionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DefinitionList();
            }
        }
        
        /**
         * Gets array of all "definition" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.Definition[] xgetDefinitionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Definition> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Definition>();
                get_store().find_all_element_users(DEFINITION$26, targetList);
                noNamespace.ConceptDocument.Concept.Definition[] result = new noNamespace.ConceptDocument.Concept.Definition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "definition" element
         */
        public noNamespace.ConceptDocument.Concept.Definition xgetDefinitionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Definition target = null;
                target = (noNamespace.ConceptDocument.Concept.Definition)get_store().find_element_user(DEFINITION$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "definition" element
         */
        public boolean isNilDefinitionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Definition target = null;
                target = (noNamespace.ConceptDocument.Concept.Definition)get_store().find_element_user(DEFINITION$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "definition" element
         */
        public int sizeOfDefinitionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEFINITION$26);
            }
        }
        
        /**
         * Sets array of all "definition" element
         */
        @Inject(optional=true) public void setDefinitionArray(java.lang.String[] definitionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(definitionArray, DEFINITION$26);
            }
        }
        
        /**
         * Sets ith "definition" element
         */
        @Inject(optional=true) public void setDefinitionArray(int i, java.lang.String definition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFINITION$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(definition);
            }
        }
        
        /**
         * Sets (as xml) array of all "definition" element
         */
        public void xsetDefinitionArray(noNamespace.ConceptDocument.Concept.Definition[]definitionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(definitionArray, DEFINITION$26);
            }
        }
        
        /**
         * Sets (as xml) ith "definition" element
         */
        public void xsetDefinitionArray(int i, noNamespace.ConceptDocument.Concept.Definition definition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Definition target = null;
                target = (noNamespace.ConceptDocument.Concept.Definition)get_store().find_element_user(DEFINITION$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(definition);
            }
        }
        
        /**
         * Nils the ith "definition" element
         */
        @Inject(optional=true) public void setNilDefinitionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Definition target = null;
                target = (noNamespace.ConceptDocument.Concept.Definition)get_store().find_element_user(DEFINITION$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "definition" element
         */
        public void insertDefinition(int i, java.lang.String definition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DEFINITION$26, i);
                target.setStringValue(definition);
            }
        }
        
        /**
         * Appends the value as the last "definition" element
         */
        public void addDefinition(java.lang.String definition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFINITION$26);
                target.setStringValue(definition);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "definition" element
         */
        public noNamespace.ConceptDocument.Concept.Definition insertNewDefinition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Definition target = null;
                target = (noNamespace.ConceptDocument.Concept.Definition)get_store().insert_element_user(DEFINITION$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "definition" element
         */
        public noNamespace.ConceptDocument.Concept.Definition addNewDefinition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Definition target = null;
                target = (noNamespace.ConceptDocument.Concept.Definition)get_store().add_element_user(DEFINITION$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "definition" element
         */
        public void removeDefinition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEFINITION$26, i);
            }
        }
        
        /**
         * Gets a List of "depiction" elements
         */
        public java.util.List<java.lang.String> getDepictionList()
        {
            final class DepictionList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return ConceptImpl.this.getDepictionArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = ConceptImpl.this.getDepictionArray(i);
                    ConceptImpl.this.setDepictionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { ConceptImpl.this.insertDepiction(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = ConceptImpl.this.getDepictionArray(i);
                    ConceptImpl.this.removeDepiction(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfDepictionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DepictionList();
            }
        }
        
        /**
         * Gets array of all "depiction" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getDepictionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Depiction> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Depiction>();
                get_store().find_all_element_users(DEPICTION$28, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "depiction" element
         */
        public java.lang.String getDepictionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPICTION$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "depiction" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.Depiction> xgetDepictionList()
        {
            final class DepictionList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.Depiction>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.Depiction get(int i)
                    { return ConceptImpl.this.xgetDepictionArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Depiction set(int i, noNamespace.ConceptDocument.Concept.Depiction o)
                {
                    noNamespace.ConceptDocument.Concept.Depiction old = ConceptImpl.this.xgetDepictionArray(i);
                    ConceptImpl.this.xsetDepictionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.Depiction o)
                    { ConceptImpl.this.insertNewDepiction(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Depiction remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.Depiction old = ConceptImpl.this.xgetDepictionArray(i);
                    ConceptImpl.this.removeDepiction(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfDepictionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DepictionList();
            }
        }
        
        /**
         * Gets array of all "depiction" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.Depiction[] xgetDepictionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Depiction> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Depiction>();
                get_store().find_all_element_users(DEPICTION$28, targetList);
                noNamespace.ConceptDocument.Concept.Depiction[] result = new noNamespace.ConceptDocument.Concept.Depiction[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "depiction" element
         */
        public noNamespace.ConceptDocument.Concept.Depiction xgetDepictionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Depiction target = null;
                target = (noNamespace.ConceptDocument.Concept.Depiction)get_store().find_element_user(DEPICTION$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "depiction" element
         */
        public boolean isNilDepictionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Depiction target = null;
                target = (noNamespace.ConceptDocument.Concept.Depiction)get_store().find_element_user(DEPICTION$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "depiction" element
         */
        public int sizeOfDepictionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEPICTION$28);
            }
        }
        
        /**
         * Sets array of all "depiction" element
         */
        @Inject(optional=true) public void setDepictionArray(java.lang.String[] depictionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(depictionArray, DEPICTION$28);
            }
        }
        
        /**
         * Sets ith "depiction" element
         */
        @Inject(optional=true) public void setDepictionArray(int i, java.lang.String depiction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPICTION$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(depiction);
            }
        }
        
        /**
         * Sets (as xml) array of all "depiction" element
         */
        public void xsetDepictionArray(noNamespace.ConceptDocument.Concept.Depiction[]depictionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(depictionArray, DEPICTION$28);
            }
        }
        
        /**
         * Sets (as xml) ith "depiction" element
         */
        public void xsetDepictionArray(int i, noNamespace.ConceptDocument.Concept.Depiction depiction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Depiction target = null;
                target = (noNamespace.ConceptDocument.Concept.Depiction)get_store().find_element_user(DEPICTION$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(depiction);
            }
        }
        
        /**
         * Nils the ith "depiction" element
         */
        @Inject(optional=true) public void setNilDepictionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Depiction target = null;
                target = (noNamespace.ConceptDocument.Concept.Depiction)get_store().find_element_user(DEPICTION$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "depiction" element
         */
        public void insertDepiction(int i, java.lang.String depiction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DEPICTION$28, i);
                target.setStringValue(depiction);
            }
        }
        
        /**
         * Appends the value as the last "depiction" element
         */
        public void addDepiction(java.lang.String depiction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPICTION$28);
                target.setStringValue(depiction);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "depiction" element
         */
        public noNamespace.ConceptDocument.Concept.Depiction insertNewDepiction(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Depiction target = null;
                target = (noNamespace.ConceptDocument.Concept.Depiction)get_store().insert_element_user(DEPICTION$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "depiction" element
         */
        public noNamespace.ConceptDocument.Concept.Depiction addNewDepiction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Depiction target = null;
                target = (noNamespace.ConceptDocument.Concept.Depiction)get_store().add_element_user(DEPICTION$28);
                return target;
            }
        }
        
        /**
         * Removes the ith "depiction" element
         */
        public void removeDepiction(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEPICTION$28, i);
            }
        }
        
        /**
         * Gets a List of "subjectIndicator" elements
         */
        public java.util.List<java.lang.String> getSubjectIndicatorList()
        {
            final class SubjectIndicatorList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return ConceptImpl.this.getSubjectIndicatorArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = ConceptImpl.this.getSubjectIndicatorArray(i);
                    ConceptImpl.this.setSubjectIndicatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { ConceptImpl.this.insertSubjectIndicator(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = ConceptImpl.this.getSubjectIndicatorArray(i);
                    ConceptImpl.this.removeSubjectIndicator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfSubjectIndicatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SubjectIndicatorList();
            }
        }
        
        /**
         * Gets array of all "subjectIndicator" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getSubjectIndicatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.SubjectIndicator> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.SubjectIndicator>();
                get_store().find_all_element_users(SUBJECTINDICATOR$30, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "subjectIndicator" element
         */
        public java.lang.String getSubjectIndicatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTINDICATOR$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "subjectIndicator" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.SubjectIndicator> xgetSubjectIndicatorList()
        {
            final class SubjectIndicatorList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.SubjectIndicator>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.SubjectIndicator get(int i)
                    { return ConceptImpl.this.xgetSubjectIndicatorArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.SubjectIndicator set(int i, noNamespace.ConceptDocument.Concept.SubjectIndicator o)
                {
                    noNamespace.ConceptDocument.Concept.SubjectIndicator old = ConceptImpl.this.xgetSubjectIndicatorArray(i);
                    ConceptImpl.this.xsetSubjectIndicatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.SubjectIndicator o)
                    { ConceptImpl.this.insertNewSubjectIndicator(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.SubjectIndicator remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.SubjectIndicator old = ConceptImpl.this.xgetSubjectIndicatorArray(i);
                    ConceptImpl.this.removeSubjectIndicator(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfSubjectIndicatorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SubjectIndicatorList();
            }
        }
        
        /**
         * Gets array of all "subjectIndicator" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.SubjectIndicator[] xgetSubjectIndicatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.SubjectIndicator> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.SubjectIndicator>();
                get_store().find_all_element_users(SUBJECTINDICATOR$30, targetList);
                noNamespace.ConceptDocument.Concept.SubjectIndicator[] result = new noNamespace.ConceptDocument.Concept.SubjectIndicator[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "subjectIndicator" element
         */
        public noNamespace.ConceptDocument.Concept.SubjectIndicator xgetSubjectIndicatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.SubjectIndicator target = null;
                target = (noNamespace.ConceptDocument.Concept.SubjectIndicator)get_store().find_element_user(SUBJECTINDICATOR$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "subjectIndicator" element
         */
        public boolean isNilSubjectIndicatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.SubjectIndicator target = null;
                target = (noNamespace.ConceptDocument.Concept.SubjectIndicator)get_store().find_element_user(SUBJECTINDICATOR$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "subjectIndicator" element
         */
        public int sizeOfSubjectIndicatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBJECTINDICATOR$30);
            }
        }
        
        /**
         * Sets array of all "subjectIndicator" element
         */
        @Inject(optional=true) public void setSubjectIndicatorArray(java.lang.String[] subjectIndicatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subjectIndicatorArray, SUBJECTINDICATOR$30);
            }
        }
        
        /**
         * Sets ith "subjectIndicator" element
         */
        @Inject(optional=true) public void setSubjectIndicatorArray(int i, java.lang.String subjectIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECTINDICATOR$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(subjectIndicator);
            }
        }
        
        /**
         * Sets (as xml) array of all "subjectIndicator" element
         */
        public void xsetSubjectIndicatorArray(noNamespace.ConceptDocument.Concept.SubjectIndicator[]subjectIndicatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subjectIndicatorArray, SUBJECTINDICATOR$30);
            }
        }
        
        /**
         * Sets (as xml) ith "subjectIndicator" element
         */
        public void xsetSubjectIndicatorArray(int i, noNamespace.ConceptDocument.Concept.SubjectIndicator subjectIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.SubjectIndicator target = null;
                target = (noNamespace.ConceptDocument.Concept.SubjectIndicator)get_store().find_element_user(SUBJECTINDICATOR$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subjectIndicator);
            }
        }
        
        /**
         * Nils the ith "subjectIndicator" element
         */
        @Inject(optional=true) public void setNilSubjectIndicatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.SubjectIndicator target = null;
                target = (noNamespace.ConceptDocument.Concept.SubjectIndicator)get_store().find_element_user(SUBJECTINDICATOR$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "subjectIndicator" element
         */
        public void insertSubjectIndicator(int i, java.lang.String subjectIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SUBJECTINDICATOR$30, i);
                target.setStringValue(subjectIndicator);
            }
        }
        
        /**
         * Appends the value as the last "subjectIndicator" element
         */
        public void addSubjectIndicator(java.lang.String subjectIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECTINDICATOR$30);
                target.setStringValue(subjectIndicator);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subjectIndicator" element
         */
        public noNamespace.ConceptDocument.Concept.SubjectIndicator insertNewSubjectIndicator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.SubjectIndicator target = null;
                target = (noNamespace.ConceptDocument.Concept.SubjectIndicator)get_store().insert_element_user(SUBJECTINDICATOR$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subjectIndicator" element
         */
        public noNamespace.ConceptDocument.Concept.SubjectIndicator addNewSubjectIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.SubjectIndicator target = null;
                target = (noNamespace.ConceptDocument.Concept.SubjectIndicator)get_store().add_element_user(SUBJECTINDICATOR$30);
                return target;
            }
        }
        
        /**
         * Removes the ith "subjectIndicator" element
         */
        public void removeSubjectIndicator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBJECTINDICATOR$30, i);
            }
        }
        
        /**
         * Gets a List of "note" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.Note> getNoteList()
        {
            final class NoteList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.Note>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.Note get(int i)
                    { return ConceptImpl.this.getNoteArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Note set(int i, noNamespace.ConceptDocument.Concept.Note o)
                {
                    noNamespace.ConceptDocument.Concept.Note old = ConceptImpl.this.getNoteArray(i);
                    ConceptImpl.this.setNoteArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.Note o)
                    { ConceptImpl.this.insertNewNote(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Note remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.Note old = ConceptImpl.this.getNoteArray(i);
                    ConceptImpl.this.removeNote(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfNoteArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new NoteList();
            }
        }
        
        /**
         * Gets array of all "note" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.Note[] getNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Note> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Note>();
                get_store().find_all_element_users(NOTE$32, targetList);
                noNamespace.ConceptDocument.Concept.Note[] result = new noNamespace.ConceptDocument.Concept.Note[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "note" element
         */
        public noNamespace.ConceptDocument.Concept.Note getNoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Note target = null;
                target = (noNamespace.ConceptDocument.Concept.Note)get_store().find_element_user(NOTE$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "note" element
         */
        public boolean isNilNoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Note target = null;
                target = (noNamespace.ConceptDocument.Concept.Note)get_store().find_element_user(NOTE$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "note" element
         */
        public int sizeOfNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOTE$32);
            }
        }
        
        /**
         * Sets array of all "note" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setNoteArray(noNamespace.ConceptDocument.Concept.Note[] noteArray)
        {
            check_orphaned();
            arraySetterHelper(noteArray, NOTE$32);
        }
        
        /**
         * Sets ith "note" element
         */
        @Inject(optional=true) public void setNoteArray(int i, noNamespace.ConceptDocument.Concept.Note note)
        {
            generatedSetterHelperImpl(note, NOTE$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Nils the ith "note" element
         */
        @Inject(optional=true) public void setNilNoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Note target = null;
                target = (noNamespace.ConceptDocument.Concept.Note)get_store().find_element_user(NOTE$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "note" element
         */
        public noNamespace.ConceptDocument.Concept.Note insertNewNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Note target = null;
                target = (noNamespace.ConceptDocument.Concept.Note)get_store().insert_element_user(NOTE$32, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "note" element
         */
        public noNamespace.ConceptDocument.Concept.Note addNewNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Note target = null;
                target = (noNamespace.ConceptDocument.Concept.Note)get_store().add_element_user(NOTE$32);
                return target;
            }
        }
        
        /**
         * Removes the ith "note" element
         */
        public void removeNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOTE$32, i);
            }
        }
        
        /**
         * Gets the "creation" element
         */
        public noNamespace.CreationDocument.Creation getCreation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.CreationDocument.Creation target = null;
                target = (noNamespace.CreationDocument.Creation)get_store().find_element_user(CREATION$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "creation" element
         */
        public boolean isSetCreation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATION$34) != 0;
            }
        }
        
        /**
         * Sets the "creation" element
         */
        @Inject(optional=true) public void setCreation(noNamespace.CreationDocument.Creation creation)
        {
            generatedSetterHelperImpl(creation, CREATION$34, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (noNamespace.CreationDocument.Creation)get_store().add_element_user(CREATION$34);
                return target;
            }
        }
        
        /**
         * Unsets the "creation" element
         */
        public void unsetCreation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATION$34, 0);
            }
        }
        
        /**
         * Gets the "status" element
         */
        public java.lang.String getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "status" element
         */
        public org.apache.xmlbeans.XmlString xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$36, 0);
                return target;
            }
        }
        
        /**
         * True if has "status" element
         */
        public boolean isSetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$36) != 0;
            }
        }
        
        /**
         * Sets the "status" element
         */
        @Inject(optional=true) public void setStatus(java.lang.String status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$36);
                }
                target.setStringValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "status" element
         */
        public void xsetStatus(org.apache.xmlbeans.XmlString status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$36);
                }
                target.set(status);
            }
        }
        
        /**
         * Unsets the "status" element
         */
        public void unsetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$36, 0);
            }
        }
        
        /**
         * Gets a List of "modified" elements
         */
        public java.util.List<java.lang.String> getModifiedList()
        {
            final class ModifiedList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return ConceptImpl.this.getModifiedArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = ConceptImpl.this.getModifiedArray(i);
                    ConceptImpl.this.setModifiedArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { ConceptImpl.this.insertModified(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = ConceptImpl.this.getModifiedArray(i);
                    ConceptImpl.this.removeModified(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfModifiedArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ModifiedList();
            }
        }
        
        /**
         * Gets array of all "modified" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getModifiedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Modified> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Modified>();
                get_store().find_all_element_users(MODIFIED$38, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "modified" element
         */
        public java.lang.String getModifiedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "modified" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept.Modified> xgetModifiedList()
        {
            final class ModifiedList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept.Modified>
            {
                @Override
                public noNamespace.ConceptDocument.Concept.Modified get(int i)
                    { return ConceptImpl.this.xgetModifiedArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Modified set(int i, noNamespace.ConceptDocument.Concept.Modified o)
                {
                    noNamespace.ConceptDocument.Concept.Modified old = ConceptImpl.this.xgetModifiedArray(i);
                    ConceptImpl.this.xsetModifiedArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept.Modified o)
                    { ConceptImpl.this.insertNewModified(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept.Modified remove(int i)
                {
                    noNamespace.ConceptDocument.Concept.Modified old = ConceptImpl.this.xgetModifiedArray(i);
                    ConceptImpl.this.removeModified(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ConceptImpl.this.sizeOfModifiedArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ModifiedList();
            }
        }
        
        /**
         * Gets array of all "modified" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept.Modified[] xgetModifiedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept.Modified> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept.Modified>();
                get_store().find_all_element_users(MODIFIED$38, targetList);
                noNamespace.ConceptDocument.Concept.Modified[] result = new noNamespace.ConceptDocument.Concept.Modified[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "modified" element
         */
        public noNamespace.ConceptDocument.Concept.Modified xgetModifiedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Modified target = null;
                target = (noNamespace.ConceptDocument.Concept.Modified)get_store().find_element_user(MODIFIED$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Tests for nil ith "modified" element
         */
        public boolean isNilModifiedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Modified target = null;
                target = (noNamespace.ConceptDocument.Concept.Modified)get_store().find_element_user(MODIFIED$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.isNil();
            }
        }
        
        /**
         * Returns number of "modified" element
         */
        public int sizeOfModifiedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MODIFIED$38);
            }
        }
        
        /**
         * Sets array of all "modified" element
         */
        @Inject(optional=true) public void setModifiedArray(java.lang.String[] modifiedArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(modifiedArray, MODIFIED$38);
            }
        }
        
        /**
         * Sets ith "modified" element
         */
        @Inject(optional=true) public void setModifiedArray(int i, java.lang.String modified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(modified);
            }
        }
        
        /**
         * Sets (as xml) array of all "modified" element
         */
        public void xsetModifiedArray(noNamespace.ConceptDocument.Concept.Modified[]modifiedArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(modifiedArray, MODIFIED$38);
            }
        }
        
        /**
         * Sets (as xml) ith "modified" element
         */
        public void xsetModifiedArray(int i, noNamespace.ConceptDocument.Concept.Modified modified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Modified target = null;
                target = (noNamespace.ConceptDocument.Concept.Modified)get_store().find_element_user(MODIFIED$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(modified);
            }
        }
        
        /**
         * Nils the ith "modified" element
         */
        @Inject(optional=true) public void setNilModifiedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Modified target = null;
                target = (noNamespace.ConceptDocument.Concept.Modified)get_store().find_element_user(MODIFIED$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setNil();
            }
        }
        
        /**
         * Inserts the value as the ith "modified" element
         */
        public void insertModified(int i, java.lang.String modified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MODIFIED$38, i);
                target.setStringValue(modified);
            }
        }
        
        /**
         * Appends the value as the last "modified" element
         */
        public void addModified(java.lang.String modified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIED$38);
                target.setStringValue(modified);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "modified" element
         */
        public noNamespace.ConceptDocument.Concept.Modified insertNewModified(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Modified target = null;
                target = (noNamespace.ConceptDocument.Concept.Modified)get_store().insert_element_user(MODIFIED$38, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "modified" element
         */
        public noNamespace.ConceptDocument.Concept.Modified addNewModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept.Modified target = null;
                target = (noNamespace.ConceptDocument.Concept.Modified)get_store().add_element_user(MODIFIED$38);
                return target;
            }
        }
        
        /**
         * Removes the ith "modified" element
         */
        public void removeModified(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MODIFIED$38, i);
            }
        }
        /**
         * An XML altTerm(@).
         *
         * This is a complex type.
         */
        public static class AltTermImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ConceptDocument.Concept.AltTerm
        {
            private static final long serialVersionUID = 1L;
            
            public AltTermImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ALTLABEL$0 = 
                new javax.xml.namespace.QName("", "altLabel");
            private static final javax.xml.namespace.QName TYPEOFLABEL$2 = 
                new javax.xml.namespace.QName("", "typeOfLabel");
            private static final javax.xml.namespace.QName SOURCE$4 = 
                new javax.xml.namespace.QName("", "source");
            private static final javax.xml.namespace.QName LANG$6 = 
                new javax.xml.namespace.QName("", "lang");
            
            
            /**
             * Gets the "altLabel" element
             */
            public noNamespace.AltLabelDocument.AltLabel getAltLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AltLabelDocument.AltLabel target = null;
                    target = (noNamespace.AltLabelDocument.AltLabel)get_store().find_element_user(ALTLABEL$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "altLabel" element
             */
            @Inject(optional=true) public void setAltLabel(noNamespace.AltLabelDocument.AltLabel altLabel)
            {
                generatedSetterHelperImpl(altLabel, ALTLABEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "altLabel" element
             */
            public noNamespace.AltLabelDocument.AltLabel addNewAltLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.AltLabelDocument.AltLabel target = null;
                    target = (noNamespace.AltLabelDocument.AltLabel)get_store().add_element_user(ALTLABEL$0);
                    return target;
                }
            }
            
            /**
             * Gets the "typeOfLabel" element
             */
            public java.lang.String getTypeOfLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFLABEL$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "typeOfLabel" element
             */
            public org.apache.xmlbeans.XmlString xgetTypeOfLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEOFLABEL$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "typeOfLabel" element
             */
            public boolean isSetTypeOfLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TYPEOFLABEL$2) != 0;
                }
            }
            
            /**
             * Sets the "typeOfLabel" element
             */
            @Inject(optional=true) public void setTypeOfLabel(java.lang.String typeOfLabel)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFLABEL$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEOFLABEL$2);
                    }
                    target.setStringValue(typeOfLabel);
                }
            }
            
            /**
             * Sets (as xml) the "typeOfLabel" element
             */
            public void xsetTypeOfLabel(org.apache.xmlbeans.XmlString typeOfLabel)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEOFLABEL$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEOFLABEL$2);
                    }
                    target.set(typeOfLabel);
                }
            }
            
            /**
             * Unsets the "typeOfLabel" element
             */
            public void unsetTypeOfLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TYPEOFLABEL$2, 0);
                }
            }
            
            /**
             * Gets the "source" element
             */
            public java.lang.String getSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$4, 0);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "source" element
             */
            public boolean isSetSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SOURCE$4) != 0;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$4);
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
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$4);
                    }
                    target.set(source);
                }
            }
            
            /**
             * Unsets the "source" element
             */
            public void unsetSource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SOURCE$4, 0);
                }
            }
            
            /**
             * Gets the "lang" attribute
             */
            public java.lang.String getLang()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "lang" attribute
             */
            public org.apache.xmlbeans.XmlString xgetLang()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANG$6);
                    return target;
                }
            }
            
            /**
             * True if has "lang" attribute
             */
            public boolean isSetLang()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LANG$6) != null;
                }
            }
            
            /**
             * Sets the "lang" attribute
             */
            @Inject(optional=true) public void setLang(java.lang.String lang)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$6);
                    }
                    target.setStringValue(lang);
                }
            }
            
            /**
             * Sets (as xml) the "lang" attribute
             */
            public void xsetLang(org.apache.xmlbeans.XmlString lang)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANG$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANG$6);
                    }
                    target.set(lang);
                }
            }
            
            /**
             * Unsets the "lang" attribute
             */
            public void unsetLang()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LANG$6);
                }
            }
        }
        /**
         * An XML hiddenLabel(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$HiddenLabel.
         */
        public static class HiddenLabelImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ConceptDocument.Concept.HiddenLabel
        {
            private static final long serialVersionUID = 1L;
            
            public HiddenLabelImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected HiddenLabelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML memberOfCollection(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$MemberOfCollection.
         */
        public static class MemberOfCollectionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ConceptDocument.Concept.MemberOfCollection
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
        /**
         * An XML broader(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$Broader.
         */
        public static class BroaderImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ConceptDocument.Concept.Broader
        {
            private static final long serialVersionUID = 1L;
            
            public BroaderImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected BroaderImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML narrower(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$Narrower.
         */
        public static class NarrowerImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ConceptDocument.Concept.Narrower
        {
            private static final long serialVersionUID = 1L;
            
            public NarrowerImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected NarrowerImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML useFor(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$UseFor.
         */
        public static class UseForImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ConceptDocument.Concept.UseFor
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
        /**
         * An XML relationship(@).
         *
         * This is a complex type.
         */
        public static class RelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ConceptDocument.Concept.Relationship
        {
            private static final long serialVersionUID = 1L;
            
            public RelationshipImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RELATED$0 = 
                new javax.xml.namespace.QName("", "related");
            private static final javax.xml.namespace.QName TYPEOFRELATIONSHIP$2 = 
                new javax.xml.namespace.QName("", "typeOfRelationship");
            
            
            /**
             * Gets the "related" element
             */
            public java.lang.String getRelated()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATED$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "related" element
             */
            public org.apache.xmlbeans.XmlString xgetRelated()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATED$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "related" element
             */
            @Inject(optional=true) public void setRelated(java.lang.String related)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATED$0);
                    }
                    target.setStringValue(related);
                }
            }
            
            /**
             * Sets (as xml) the "related" element
             */
            public void xsetRelated(org.apache.xmlbeans.XmlString related)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATED$0);
                    }
                    target.set(related);
                }
            }
            
            /**
             * Gets the "typeOfRelationship" element
             */
            public java.lang.String getTypeOfRelationship()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFRELATIONSHIP$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "typeOfRelationship" element
             */
            public org.apache.xmlbeans.XmlString xgetTypeOfRelationship()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEOFRELATIONSHIP$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "typeOfRelationship" element
             */
            public boolean isSetTypeOfRelationship()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TYPEOFRELATIONSHIP$2) != 0;
                }
            }
            
            /**
             * Sets the "typeOfRelationship" element
             */
            @Inject(optional=true) public void setTypeOfRelationship(java.lang.String typeOfRelationship)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFRELATIONSHIP$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEOFRELATIONSHIP$2);
                    }
                    target.setStringValue(typeOfRelationship);
                }
            }
            
            /**
             * Sets (as xml) the "typeOfRelationship" element
             */
            public void xsetTypeOfRelationship(org.apache.xmlbeans.XmlString typeOfRelationship)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEOFRELATIONSHIP$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEOFRELATIONSHIP$2);
                    }
                    target.set(typeOfRelationship);
                }
            }
            
            /**
             * Unsets the "typeOfRelationship" element
             */
            public void unsetTypeOfRelationship()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TYPEOFRELATIONSHIP$2, 0);
                }
            }
        }
        /**
         * An XML equivRelationship(@).
         *
         * This is a complex type.
         */
        public static class EquivRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ConceptDocument.Concept.EquivRelationship
        {
            private static final long serialVersionUID = 1L;
            
            public EquivRelationshipImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName EQUIVCONCEPT$0 = 
                new javax.xml.namespace.QName("", "equivConcept");
            private static final javax.xml.namespace.QName MAPPINGRELATION$2 = 
                new javax.xml.namespace.QName("", "mappingRelation");
            
            
            /**
             * Gets the "equivConcept" element
             */
            public noNamespace.EquivConceptDocument.EquivConcept getEquivConcept()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EquivConceptDocument.EquivConcept target = null;
                    target = (noNamespace.EquivConceptDocument.EquivConcept)get_store().find_element_user(EQUIVCONCEPT$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "equivConcept" element
             */
            @Inject(optional=true) public void setEquivConcept(noNamespace.EquivConceptDocument.EquivConcept equivConcept)
            {
                generatedSetterHelperImpl(equivConcept, EQUIVCONCEPT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "equivConcept" element
             */
            public noNamespace.EquivConceptDocument.EquivConcept addNewEquivConcept()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EquivConceptDocument.EquivConcept target = null;
                    target = (noNamespace.EquivConceptDocument.EquivConcept)get_store().add_element_user(EQUIVCONCEPT$0);
                    return target;
                }
            }
            
            /**
             * Gets the "mappingRelation" element
             */
            public java.lang.String getMappingRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPPINGRELATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "mappingRelation" element
             */
            public org.apache.xmlbeans.XmlString xgetMappingRelation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPINGRELATION$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "mappingRelation" element
             */
            @Inject(optional=true) public void setMappingRelation(java.lang.String mappingRelation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPPINGRELATION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPPINGRELATION$2);
                    }
                    target.setStringValue(mappingRelation);
                }
            }
            
            /**
             * Sets (as xml) the "mappingRelation" element
             */
            public void xsetMappingRelation(org.apache.xmlbeans.XmlString mappingRelation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MAPPINGRELATION$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MAPPINGRELATION$2);
                    }
                    target.set(mappingRelation);
                }
            }
        }
        /**
         * An XML definition(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$Definition.
         */
        public static class DefinitionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ConceptDocument.Concept.Definition
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
        /**
         * An XML depiction(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$Depiction.
         */
        public static class DepictionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ConceptDocument.Concept.Depiction
        {
            private static final long serialVersionUID = 1L;
            
            public DepictionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DepictionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML subjectIndicator(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$SubjectIndicator.
         */
        public static class SubjectIndicatorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ConceptDocument.Concept.SubjectIndicator
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
        /**
         * An XML note(@).
         *
         * This is a complex type.
         */
        public static class NoteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ConceptDocument.Concept.Note
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
            private static final javax.xml.namespace.QName TYPEOFNOTE$6 = 
                new javax.xml.namespace.QName("", "typeOfNote");
            
            
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
             * Gets the "typeOfNote" attribute
             */
            public java.lang.String getTypeOfNote()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEOFNOTE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "typeOfNote" attribute
             */
            public org.apache.xmlbeans.XmlString xgetTypeOfNote()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPEOFNOTE$6);
                    return target;
                }
            }
            
            /**
             * Sets the "typeOfNote" attribute
             */
            @Inject(optional=true) public void setTypeOfNote(java.lang.String typeOfNote)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEOFNOTE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPEOFNOTE$6);
                    }
                    target.setStringValue(typeOfNote);
                }
            }
            
            /**
             * Sets (as xml) the "typeOfNote" attribute
             */
            public void xsetTypeOfNote(org.apache.xmlbeans.XmlString typeOfNote)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPEOFNOTE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPEOFNOTE$6);
                    }
                    target.set(typeOfNote);
                }
            }
        }
        /**
         * An XML modified(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$Modified.
         */
        public static class ModifiedImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.ConceptDocument.Concept.Modified
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
}
