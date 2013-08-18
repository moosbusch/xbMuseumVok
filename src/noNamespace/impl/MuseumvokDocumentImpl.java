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
package noNamespace.impl;  import com.google.inject.Inject;
/**
 * A document containing one museumvok(@) element.
 *
 * This is a complex type.
 */
public class MuseumvokDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MuseumvokDocument
{
    private static final long serialVersionUID = 1L;
    
    public MuseumvokDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MUSEUMVOK$0 = 
        new javax.xml.namespace.QName("", "museumvok");
    
    
    /**
     * Gets the "museumvok" element
     */
    public noNamespace.MuseumvokDocument.Museumvok getMuseumvok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MuseumvokDocument.Museumvok target = null;
            target = (noNamespace.MuseumvokDocument.Museumvok)get_store().find_element_user(MUSEUMVOK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "museumvok" element
     */
    @Inject(optional=true) public void setMuseumvok(noNamespace.MuseumvokDocument.Museumvok museumvok)
    {
        generatedSetterHelperImpl(museumvok, MUSEUMVOK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "museumvok" element
     */
    public noNamespace.MuseumvokDocument.Museumvok addNewMuseumvok()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.MuseumvokDocument.Museumvok target = null;
            target = (noNamespace.MuseumvokDocument.Museumvok)get_store().add_element_user(MUSEUMVOK$0);
            return target;
        }
    }
    /**
     * An XML museumvok(@).
     *
     * This is a complex type.
     */
    public static class MuseumvokImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.MuseumvokDocument.Museumvok
    {
        private static final long serialVersionUID = 1L;
        
        public MuseumvokImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONCEPT$0 = 
            new javax.xml.namespace.QName("", "Concept");
        
        
        /**
         * Gets a List of "Concept" elements
         */
        public java.util.List<noNamespace.ConceptDocument.Concept> getConceptList()
        {
            final class ConceptList extends java.util.AbstractList<noNamespace.ConceptDocument.Concept>
            {
                @Override
                public noNamespace.ConceptDocument.Concept get(int i)
                    { return MuseumvokImpl.this.getConceptArray(i); }
                
                @Override
                public noNamespace.ConceptDocument.Concept set(int i, noNamespace.ConceptDocument.Concept o)
                {
                    noNamespace.ConceptDocument.Concept old = MuseumvokImpl.this.getConceptArray(i);
                    MuseumvokImpl.this.setConceptArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, noNamespace.ConceptDocument.Concept o)
                    { MuseumvokImpl.this.insertNewConcept(i).set(o); }
                
                @Override
                public noNamespace.ConceptDocument.Concept remove(int i)
                {
                    noNamespace.ConceptDocument.Concept old = MuseumvokImpl.this.getConceptArray(i);
                    MuseumvokImpl.this.removeConcept(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return MuseumvokImpl.this.sizeOfConceptArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ConceptList();
            }
        }
        
        /**
         * Gets array of all "Concept" elements
         * @deprecated
         */
        @Deprecated
        public noNamespace.ConceptDocument.Concept[] getConceptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<noNamespace.ConceptDocument.Concept> targetList = new java.util.ArrayList<noNamespace.ConceptDocument.Concept>();
                get_store().find_all_element_users(CONCEPT$0, targetList);
                noNamespace.ConceptDocument.Concept[] result = new noNamespace.ConceptDocument.Concept[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Concept" element
         */
        public noNamespace.ConceptDocument.Concept getConceptArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept target = null;
                target = (noNamespace.ConceptDocument.Concept)get_store().find_element_user(CONCEPT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Concept" element
         */
        public int sizeOfConceptArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONCEPT$0);
            }
        }
        
        /**
         * Sets array of all "Concept" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setConceptArray(noNamespace.ConceptDocument.Concept[] conceptArray)
        {
            check_orphaned();
            arraySetterHelper(conceptArray, CONCEPT$0);
        }
        
        /**
         * Sets ith "Concept" element
         */
        @Inject(optional=true) public void setConceptArray(int i, noNamespace.ConceptDocument.Concept concept)
        {
            generatedSetterHelperImpl(concept, CONCEPT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Concept" element
         */
        public noNamespace.ConceptDocument.Concept insertNewConcept(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.ConceptDocument.Concept target = null;
                target = (noNamespace.ConceptDocument.Concept)get_store().insert_element_user(CONCEPT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Concept" element
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
         * Removes the ith "Concept" element
         */
        public void removeConcept(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONCEPT$0, i);
            }
        }
    }
}
