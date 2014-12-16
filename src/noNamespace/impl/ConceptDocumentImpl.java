/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package noNamespace.impl;  
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
    public void setConcept(noNamespace.ConceptDocument.Concept concept)
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
        public void setAbout(java.lang.String about)
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
        public void setPrefTermArray(noNamespace.PrefTermDocument.PrefTerm[] prefTermArray)
        {
            check_orphaned();
            arraySetterHelper(prefTermArray, PREFTERM$2);
        }
        
        /**
         * Sets ith "prefTerm" element
         */
        public void setPrefTermArray(int i, noNamespace.PrefTermDocument.PrefTerm prefTerm)
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
        public java.util.List<noNamespace.AltTermDocument.AltTerm> getAltTermList()
        {
            final class AltTermList extends java.util.AbstractList<noNamespace.AltTermDocument.AltTerm>
            {
                @Override
                public noNamespace.AltTermDocument.AltTerm get(int i)
                    { return ConceptImpl.this.getAltTermArray(i); }
                
                @Override
                public noNamespace.AltTermDocument.AltTerm set(int i, noNamespace.AltTermDocument.AltTerm o)
                {
                    noNamespace.AltTermDocument.AltTerm old = ConceptImpl.this.getAltTermArray(i);
                    ConceptImpl.this.setAltTermArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.AltTermDocument.AltTerm o)
                    { ConceptImpl.this.insertNewAltTerm(i).set(o); }
                
                @Override
                public noNamespace.AltTermDocument.AltTerm remove(int i)
                {
                    noNamespace.AltTermDocument.AltTerm old = ConceptImpl.this.getAltTermArray(i);
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
        public noNamespace.AltTermDocument.AltTerm[] getAltTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.AltTermDocument.AltTerm> targetList = new java.util.ArrayList<noNamespace.AltTermDocument.AltTerm>();
                get_store().find_all_element_users(ALTTERM$4, targetList);
                noNamespace.AltTermDocument.AltTerm[] result = new noNamespace.AltTermDocument.AltTerm[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "altTerm" element
         */
        public noNamespace.AltTermDocument.AltTerm getAltTermArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AltTermDocument.AltTerm target = null;
                target = (noNamespace.AltTermDocument.AltTerm)get_store().find_element_user(ALTTERM$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setAltTermArray(noNamespace.AltTermDocument.AltTerm[] altTermArray)
        {
            check_orphaned();
            arraySetterHelper(altTermArray, ALTTERM$4);
        }
        
        /**
         * Sets ith "altTerm" element
         */
        public void setAltTermArray(int i, noNamespace.AltTermDocument.AltTerm altTerm)
        {
            generatedSetterHelperImpl(altTerm, ALTTERM$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "altTerm" element
         */
        public noNamespace.AltTermDocument.AltTerm insertNewAltTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AltTermDocument.AltTerm target = null;
                target = (noNamespace.AltTermDocument.AltTerm)get_store().insert_element_user(ALTTERM$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "altTerm" element
         */
        public noNamespace.AltTermDocument.AltTerm addNewAltTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.AltTermDocument.AltTerm target = null;
                target = (noNamespace.AltTermDocument.AltTerm)get_store().add_element_user(ALTTERM$4);
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
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
        public java.util.List<org.apache.xmlbeans.XmlString> xgetHiddenLabelList()
        {
            final class HiddenLabelList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return ConceptImpl.this.xgetHiddenLabelArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetHiddenLabelArray(i);
                    ConceptImpl.this.xsetHiddenLabelArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { ConceptImpl.this.insertNewHiddenLabel(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetHiddenLabelArray(i);
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
        public org.apache.xmlbeans.XmlString[] xgetHiddenLabelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(HIDDENLABEL$6, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "hiddenLabel" element
         */
        public org.apache.xmlbeans.XmlString xgetHiddenLabelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIDDENLABEL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setHiddenLabelArray(java.lang.String[] hiddenLabelArray)
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
        public void setHiddenLabelArray(int i, java.lang.String hiddenLabel)
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
        public void xsetHiddenLabelArray(org.apache.xmlbeans.XmlString[]hiddenLabelArray)
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
        public void xsetHiddenLabelArray(int i, org.apache.xmlbeans.XmlString hiddenLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HIDDENLABEL$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(hiddenLabel);
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
        public org.apache.xmlbeans.XmlString insertNewHiddenLabel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(HIDDENLABEL$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "hiddenLabel" element
         */
        public org.apache.xmlbeans.XmlString addNewHiddenLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HIDDENLABEL$6);
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
        public void setNotation(java.lang.String notation)
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
        public void setInScheme(java.lang.String inScheme)
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
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
        public java.util.List<org.apache.xmlbeans.XmlString> xgetMemberOfCollectionList()
        {
            final class MemberOfCollectionList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return ConceptImpl.this.xgetMemberOfCollectionArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetMemberOfCollectionArray(i);
                    ConceptImpl.this.xsetMemberOfCollectionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { ConceptImpl.this.insertNewMemberOfCollection(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetMemberOfCollectionArray(i);
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
        public org.apache.xmlbeans.XmlString[] xgetMemberOfCollectionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(MEMBEROFCOLLECTION$12, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "memberOfCollection" element
         */
        public org.apache.xmlbeans.XmlString xgetMemberOfCollectionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBEROFCOLLECTION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setMemberOfCollectionArray(java.lang.String[] memberOfCollectionArray)
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
        public void setMemberOfCollectionArray(int i, java.lang.String memberOfCollection)
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
        public void xsetMemberOfCollectionArray(org.apache.xmlbeans.XmlString[]memberOfCollectionArray)
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
        public void xsetMemberOfCollectionArray(int i, org.apache.xmlbeans.XmlString memberOfCollection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEMBEROFCOLLECTION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(memberOfCollection);
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
        public org.apache.xmlbeans.XmlString insertNewMemberOfCollection(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MEMBEROFCOLLECTION$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "memberOfCollection" element
         */
        public org.apache.xmlbeans.XmlString addNewMemberOfCollection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEMBEROFCOLLECTION$12);
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
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
        public java.util.List<org.apache.xmlbeans.XmlString> xgetBroaderList()
        {
            final class BroaderList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return ConceptImpl.this.xgetBroaderArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetBroaderArray(i);
                    ConceptImpl.this.xsetBroaderArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { ConceptImpl.this.insertNewBroader(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetBroaderArray(i);
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
        public org.apache.xmlbeans.XmlString[] xgetBroaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(BROADER$14, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "broader" element
         */
        public org.apache.xmlbeans.XmlString xgetBroaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BROADER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setBroaderArray(java.lang.String[] broaderArray)
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
        public void setBroaderArray(int i, java.lang.String broader)
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
        public void xsetBroaderArray(org.apache.xmlbeans.XmlString[]broaderArray)
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
        public void xsetBroaderArray(int i, org.apache.xmlbeans.XmlString broader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BROADER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(broader);
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
        public org.apache.xmlbeans.XmlString insertNewBroader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(BROADER$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "broader" element
         */
        public org.apache.xmlbeans.XmlString addNewBroader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BROADER$14);
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
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
        public java.util.List<org.apache.xmlbeans.XmlString> xgetNarrowerList()
        {
            final class NarrowerList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return ConceptImpl.this.xgetNarrowerArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetNarrowerArray(i);
                    ConceptImpl.this.xsetNarrowerArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { ConceptImpl.this.insertNewNarrower(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetNarrowerArray(i);
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
        public org.apache.xmlbeans.XmlString[] xgetNarrowerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(NARROWER$16, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "narrower" element
         */
        public org.apache.xmlbeans.XmlString xgetNarrowerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NARROWER$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setNarrowerArray(java.lang.String[] narrowerArray)
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
        public void setNarrowerArray(int i, java.lang.String narrower)
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
        public void xsetNarrowerArray(org.apache.xmlbeans.XmlString[]narrowerArray)
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
        public void xsetNarrowerArray(int i, org.apache.xmlbeans.XmlString narrower)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NARROWER$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(narrower);
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
        public org.apache.xmlbeans.XmlString insertNewNarrower(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NARROWER$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "narrower" element
         */
        public org.apache.xmlbeans.XmlString addNewNarrower()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NARROWER$16);
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
        public void setUse(java.lang.String use)
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
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
        public java.util.List<org.apache.xmlbeans.XmlString> xgetUseForList()
        {
            final class UseForList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return ConceptImpl.this.xgetUseForArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetUseForArray(i);
                    ConceptImpl.this.xsetUseForArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { ConceptImpl.this.insertNewUseFor(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetUseForArray(i);
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
        public org.apache.xmlbeans.XmlString[] xgetUseForArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(USEFOR$20, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "useFor" element
         */
        public org.apache.xmlbeans.XmlString xgetUseForArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEFOR$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setUseForArray(java.lang.String[] useForArray)
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
        public void setUseForArray(int i, java.lang.String useFor)
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
        public void xsetUseForArray(org.apache.xmlbeans.XmlString[]useForArray)
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
        public void xsetUseForArray(int i, org.apache.xmlbeans.XmlString useFor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USEFOR$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(useFor);
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
        public org.apache.xmlbeans.XmlString insertNewUseFor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(USEFOR$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "useFor" element
         */
        public org.apache.xmlbeans.XmlString addNewUseFor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USEFOR$20);
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
        public java.util.List<noNamespace.RelationshipDocument.Relationship> getRelationshipList()
        {
            final class RelationshipList extends java.util.AbstractList<noNamespace.RelationshipDocument.Relationship>
            {
                @Override
                public noNamespace.RelationshipDocument.Relationship get(int i)
                    { return ConceptImpl.this.getRelationshipArray(i); }
                
                @Override
                public noNamespace.RelationshipDocument.Relationship set(int i, noNamespace.RelationshipDocument.Relationship o)
                {
                    noNamespace.RelationshipDocument.Relationship old = ConceptImpl.this.getRelationshipArray(i);
                    ConceptImpl.this.setRelationshipArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.RelationshipDocument.Relationship o)
                    { ConceptImpl.this.insertNewRelationship(i).set(o); }
                
                @Override
                public noNamespace.RelationshipDocument.Relationship remove(int i)
                {
                    noNamespace.RelationshipDocument.Relationship old = ConceptImpl.this.getRelationshipArray(i);
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
        public noNamespace.RelationshipDocument.Relationship[] getRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.RelationshipDocument.Relationship> targetList = new java.util.ArrayList<noNamespace.RelationshipDocument.Relationship>();
                get_store().find_all_element_users(RELATIONSHIP$22, targetList);
                noNamespace.RelationshipDocument.Relationship[] result = new noNamespace.RelationshipDocument.Relationship[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "relationship" element
         */
        public noNamespace.RelationshipDocument.Relationship getRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RelationshipDocument.Relationship target = null;
                target = (noNamespace.RelationshipDocument.Relationship)get_store().find_element_user(RELATIONSHIP$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setRelationshipArray(noNamespace.RelationshipDocument.Relationship[] relationshipArray)
        {
            check_orphaned();
            arraySetterHelper(relationshipArray, RELATIONSHIP$22);
        }
        
        /**
         * Sets ith "relationship" element
         */
        public void setRelationshipArray(int i, noNamespace.RelationshipDocument.Relationship relationship)
        {
            generatedSetterHelperImpl(relationship, RELATIONSHIP$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "relationship" element
         */
        public noNamespace.RelationshipDocument.Relationship insertNewRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RelationshipDocument.Relationship target = null;
                target = (noNamespace.RelationshipDocument.Relationship)get_store().insert_element_user(RELATIONSHIP$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "relationship" element
         */
        public noNamespace.RelationshipDocument.Relationship addNewRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RelationshipDocument.Relationship target = null;
                target = (noNamespace.RelationshipDocument.Relationship)get_store().add_element_user(RELATIONSHIP$22);
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
        public java.util.List<noNamespace.EquivRelationshipDocument.EquivRelationship> getEquivRelationshipList()
        {
            final class EquivRelationshipList extends java.util.AbstractList<noNamespace.EquivRelationshipDocument.EquivRelationship>
            {
                @Override
                public noNamespace.EquivRelationshipDocument.EquivRelationship get(int i)
                    { return ConceptImpl.this.getEquivRelationshipArray(i); }
                
                @Override
                public noNamespace.EquivRelationshipDocument.EquivRelationship set(int i, noNamespace.EquivRelationshipDocument.EquivRelationship o)
                {
                    noNamespace.EquivRelationshipDocument.EquivRelationship old = ConceptImpl.this.getEquivRelationshipArray(i);
                    ConceptImpl.this.setEquivRelationshipArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.EquivRelationshipDocument.EquivRelationship o)
                    { ConceptImpl.this.insertNewEquivRelationship(i).set(o); }
                
                @Override
                public noNamespace.EquivRelationshipDocument.EquivRelationship remove(int i)
                {
                    noNamespace.EquivRelationshipDocument.EquivRelationship old = ConceptImpl.this.getEquivRelationshipArray(i);
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
        public noNamespace.EquivRelationshipDocument.EquivRelationship[] getEquivRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.EquivRelationshipDocument.EquivRelationship> targetList = new java.util.ArrayList<noNamespace.EquivRelationshipDocument.EquivRelationship>();
                get_store().find_all_element_users(EQUIVRELATIONSHIP$24, targetList);
                noNamespace.EquivRelationshipDocument.EquivRelationship[] result = new noNamespace.EquivRelationshipDocument.EquivRelationship[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "equivRelationship" element
         */
        public noNamespace.EquivRelationshipDocument.EquivRelationship getEquivRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EquivRelationshipDocument.EquivRelationship target = null;
                target = (noNamespace.EquivRelationshipDocument.EquivRelationship)get_store().find_element_user(EQUIVRELATIONSHIP$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setEquivRelationshipArray(noNamespace.EquivRelationshipDocument.EquivRelationship[] equivRelationshipArray)
        {
            check_orphaned();
            arraySetterHelper(equivRelationshipArray, EQUIVRELATIONSHIP$24);
        }
        
        /**
         * Sets ith "equivRelationship" element
         */
        public void setEquivRelationshipArray(int i, noNamespace.EquivRelationshipDocument.EquivRelationship equivRelationship)
        {
            generatedSetterHelperImpl(equivRelationship, EQUIVRELATIONSHIP$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "equivRelationship" element
         */
        public noNamespace.EquivRelationshipDocument.EquivRelationship insertNewEquivRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EquivRelationshipDocument.EquivRelationship target = null;
                target = (noNamespace.EquivRelationshipDocument.EquivRelationship)get_store().insert_element_user(EQUIVRELATIONSHIP$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "equivRelationship" element
         */
        public noNamespace.EquivRelationshipDocument.EquivRelationship addNewEquivRelationship()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.EquivRelationshipDocument.EquivRelationship target = null;
                target = (noNamespace.EquivRelationshipDocument.EquivRelationship)get_store().add_element_user(EQUIVRELATIONSHIP$24);
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
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
        public java.util.List<org.apache.xmlbeans.XmlString> xgetDefinitionList()
        {
            final class DefinitionList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return ConceptImpl.this.xgetDefinitionArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetDefinitionArray(i);
                    ConceptImpl.this.xsetDefinitionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { ConceptImpl.this.insertNewDefinition(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetDefinitionArray(i);
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
        public org.apache.xmlbeans.XmlString[] xgetDefinitionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(DEFINITION$26, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "definition" element
         */
        public org.apache.xmlbeans.XmlString xgetDefinitionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFINITION$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setDefinitionArray(java.lang.String[] definitionArray)
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
        public void setDefinitionArray(int i, java.lang.String definition)
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
        public void xsetDefinitionArray(org.apache.xmlbeans.XmlString[]definitionArray)
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
        public void xsetDefinitionArray(int i, org.apache.xmlbeans.XmlString definition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFINITION$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(definition);
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
        public org.apache.xmlbeans.XmlString insertNewDefinition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DEFINITION$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "definition" element
         */
        public org.apache.xmlbeans.XmlString addNewDefinition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFINITION$26);
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
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
        public java.util.List<org.apache.xmlbeans.XmlString> xgetDepictionList()
        {
            final class DepictionList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return ConceptImpl.this.xgetDepictionArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetDepictionArray(i);
                    ConceptImpl.this.xsetDepictionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { ConceptImpl.this.insertNewDepiction(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetDepictionArray(i);
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
        public org.apache.xmlbeans.XmlString[] xgetDepictionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(DEPICTION$28, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "depiction" element
         */
        public org.apache.xmlbeans.XmlString xgetDepictionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPICTION$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setDepictionArray(java.lang.String[] depictionArray)
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
        public void setDepictionArray(int i, java.lang.String depiction)
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
        public void xsetDepictionArray(org.apache.xmlbeans.XmlString[]depictionArray)
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
        public void xsetDepictionArray(int i, org.apache.xmlbeans.XmlString depiction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPICTION$28, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(depiction);
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
        public org.apache.xmlbeans.XmlString insertNewDepiction(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DEPICTION$28, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "depiction" element
         */
        public org.apache.xmlbeans.XmlString addNewDepiction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPICTION$28);
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
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
        public java.util.List<org.apache.xmlbeans.XmlString> xgetSubjectIndicatorList()
        {
            final class SubjectIndicatorList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return ConceptImpl.this.xgetSubjectIndicatorArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetSubjectIndicatorArray(i);
                    ConceptImpl.this.xsetSubjectIndicatorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { ConceptImpl.this.insertNewSubjectIndicator(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetSubjectIndicatorArray(i);
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
        public org.apache.xmlbeans.XmlString[] xgetSubjectIndicatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(SUBJECTINDICATOR$30, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "subjectIndicator" element
         */
        public org.apache.xmlbeans.XmlString xgetSubjectIndicatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECTINDICATOR$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setSubjectIndicatorArray(java.lang.String[] subjectIndicatorArray)
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
        public void setSubjectIndicatorArray(int i, java.lang.String subjectIndicator)
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
        public void xsetSubjectIndicatorArray(org.apache.xmlbeans.XmlString[]subjectIndicatorArray)
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
        public void xsetSubjectIndicatorArray(int i, org.apache.xmlbeans.XmlString subjectIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECTINDICATOR$30, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subjectIndicator);
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
        public org.apache.xmlbeans.XmlString insertNewSubjectIndicator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SUBJECTINDICATOR$30, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subjectIndicator" element
         */
        public org.apache.xmlbeans.XmlString addNewSubjectIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECTINDICATOR$30);
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
        public java.util.List<noNamespace.NoteDocument.Note> getNoteList()
        {
            final class NoteList extends java.util.AbstractList<noNamespace.NoteDocument.Note>
            {
                @Override
                public noNamespace.NoteDocument.Note get(int i)
                    { return ConceptImpl.this.getNoteArray(i); }
                
                @Override
                public noNamespace.NoteDocument.Note set(int i, noNamespace.NoteDocument.Note o)
                {
                    noNamespace.NoteDocument.Note old = ConceptImpl.this.getNoteArray(i);
                    ConceptImpl.this.setNoteArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.NoteDocument.Note o)
                    { ConceptImpl.this.insertNewNote(i).set(o); }
                
                @Override
                public noNamespace.NoteDocument.Note remove(int i)
                {
                    noNamespace.NoteDocument.Note old = ConceptImpl.this.getNoteArray(i);
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
        public noNamespace.NoteDocument.Note[] getNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.NoteDocument.Note> targetList = new java.util.ArrayList<noNamespace.NoteDocument.Note>();
                get_store().find_all_element_users(NOTE$32, targetList);
                noNamespace.NoteDocument.Note[] result = new noNamespace.NoteDocument.Note[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "note" element
         */
        public noNamespace.NoteDocument.Note getNoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NoteDocument.Note target = null;
                target = (noNamespace.NoteDocument.Note)get_store().find_element_user(NOTE$32, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setNoteArray(noNamespace.NoteDocument.Note[] noteArray)
        {
            check_orphaned();
            arraySetterHelper(noteArray, NOTE$32);
        }
        
        /**
         * Sets ith "note" element
         */
        public void setNoteArray(int i, noNamespace.NoteDocument.Note note)
        {
            generatedSetterHelperImpl(note, NOTE$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "note" element
         */
        public noNamespace.NoteDocument.Note insertNewNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NoteDocument.Note target = null;
                target = (noNamespace.NoteDocument.Note)get_store().insert_element_user(NOTE$32, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "note" element
         */
        public noNamespace.NoteDocument.Note addNewNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.NoteDocument.Note target = null;
                target = (noNamespace.NoteDocument.Note)get_store().add_element_user(NOTE$32);
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
        public void setCreation(noNamespace.CreationDocument.Creation creation)
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
        public void setStatus(java.lang.String status)
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
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
        public java.util.List<org.apache.xmlbeans.XmlString> xgetModifiedList()
        {
            final class ModifiedList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return ConceptImpl.this.xgetModifiedArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetModifiedArray(i);
                    ConceptImpl.this.xsetModifiedArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { ConceptImpl.this.insertNewModified(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = ConceptImpl.this.xgetModifiedArray(i);
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
        public org.apache.xmlbeans.XmlString[] xgetModifiedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(MODIFIED$38, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "modified" element
         */
        public org.apache.xmlbeans.XmlString xgetModifiedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODIFIED$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
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
        public void setModifiedArray(java.lang.String[] modifiedArray)
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
        public void setModifiedArray(int i, java.lang.String modified)
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
        public void xsetModifiedArray(org.apache.xmlbeans.XmlString[]modifiedArray)
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
        public void xsetModifiedArray(int i, org.apache.xmlbeans.XmlString modified)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODIFIED$38, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(modified);
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
        public org.apache.xmlbeans.XmlString insertNewModified(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MODIFIED$38, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "modified" element
         */
        public org.apache.xmlbeans.XmlString addNewModified()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODIFIED$38);
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
    }
}
