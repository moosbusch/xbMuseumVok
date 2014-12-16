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
 * A document containing one equivRelationship(@) element.
 *
 * This is a complex type.
 */
public class EquivRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EquivRelationshipDocument
{
    private static final long serialVersionUID = 1L;
    
    public EquivRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EQUIVRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("", "equivRelationship");
    
    
    /**
     * Gets the "equivRelationship" element
     */
    public noNamespace.EquivRelationshipDocument.EquivRelationship getEquivRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EquivRelationshipDocument.EquivRelationship target = null;
            target = (noNamespace.EquivRelationshipDocument.EquivRelationship)get_store().find_element_user(EQUIVRELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "equivRelationship" element
     */
    public void setEquivRelationship(noNamespace.EquivRelationshipDocument.EquivRelationship equivRelationship)
    {
        generatedSetterHelperImpl(equivRelationship, EQUIVRELATIONSHIP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "equivRelationship" element
     */
    public noNamespace.EquivRelationshipDocument.EquivRelationship addNewEquivRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.EquivRelationshipDocument.EquivRelationship target = null;
            target = (noNamespace.EquivRelationshipDocument.EquivRelationship)get_store().add_element_user(EQUIVRELATIONSHIP$0);
            return target;
        }
    }
    /**
     * An XML equivRelationship(@).
     *
     * This is a complex type.
     */
    public static class EquivRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EquivRelationshipDocument.EquivRelationship
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
        public void setEquivConcept(noNamespace.EquivConceptDocument.EquivConcept equivConcept)
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
        public void setMappingRelation(java.lang.String mappingRelation)
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
}
