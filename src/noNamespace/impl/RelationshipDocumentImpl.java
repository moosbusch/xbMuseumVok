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
 * A document containing one relationship(@) element.
 *
 * This is a complex type.
 */
public class RelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RelationshipDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONSHIP$0 = 
        new javax.xml.namespace.QName("", "relationship");
    
    
    /**
     * Gets the "relationship" element
     */
    public noNamespace.RelationshipDocument.Relationship getRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RelationshipDocument.Relationship target = null;
            target = (noNamespace.RelationshipDocument.Relationship)get_store().find_element_user(RELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relationship" element
     */
    public void setRelationship(noNamespace.RelationshipDocument.Relationship relationship)
    {
        generatedSetterHelperImpl(relationship, RELATIONSHIP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relationship" element
     */
    public noNamespace.RelationshipDocument.Relationship addNewRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RelationshipDocument.Relationship target = null;
            target = (noNamespace.RelationshipDocument.Relationship)get_store().add_element_user(RELATIONSHIP$0);
            return target;
        }
    }
    /**
     * An XML relationship(@).
     *
     * This is a complex type.
     */
    public static class RelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RelationshipDocument.Relationship
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
        public void setRelated(java.lang.String related)
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
        public void setTypeOfRelationship(java.lang.String typeOfRelationship)
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
}
