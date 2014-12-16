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
 * A document containing one equivConcept(@) element.
 *
 * This is a complex type.
 */
public class EquivConceptDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EquivConceptDocument
{
    private static final long serialVersionUID = 1L;
    
    public EquivConceptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EQUIVCONCEPT$0 = 
        new javax.xml.namespace.QName("", "equivConcept");
    
    
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
     * An XML equivConcept(@).
     *
     * This is a complex type.
     */
    public static class EquivConceptImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.EquivConceptDocument.EquivConcept
    {
        private static final long serialVersionUID = 1L;
        
        public EquivConceptImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EQUIVID$0 = 
            new javax.xml.namespace.QName("", "equivID");
        private static final javax.xml.namespace.QName EQUIVLABEL$2 = 
            new javax.xml.namespace.QName("", "equivLabel");
        private static final javax.xml.namespace.QName EQUIVSOURCE$4 = 
            new javax.xml.namespace.QName("", "equivSource");
        
        
        /**
         * Gets the "equivID" element
         */
        public java.lang.String getEquivID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIVID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "equivID" element
         */
        public org.apache.xmlbeans.XmlString xgetEquivID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EQUIVID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "equivID" element
         */
        public void setEquivID(java.lang.String equivID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIVID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EQUIVID$0);
                }
                target.setStringValue(equivID);
            }
        }
        
        /**
         * Sets (as xml) the "equivID" element
         */
        public void xsetEquivID(org.apache.xmlbeans.XmlString equivID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EQUIVID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EQUIVID$0);
                }
                target.set(equivID);
            }
        }
        
        /**
         * Gets the "equivLabel" element
         */
        public java.lang.String getEquivLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIVLABEL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "equivLabel" element
         */
        public org.apache.xmlbeans.XmlString xgetEquivLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EQUIVLABEL$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "equivLabel" element
         */
        public void setEquivLabel(java.lang.String equivLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIVLABEL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EQUIVLABEL$2);
                }
                target.setStringValue(equivLabel);
            }
        }
        
        /**
         * Sets (as xml) the "equivLabel" element
         */
        public void xsetEquivLabel(org.apache.xmlbeans.XmlString equivLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EQUIVLABEL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EQUIVLABEL$2);
                }
                target.set(equivLabel);
            }
        }
        
        /**
         * Gets the "equivSource" element
         */
        public java.lang.String getEquivSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIVSOURCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "equivSource" element
         */
        public org.apache.xmlbeans.XmlString xgetEquivSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EQUIVSOURCE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "equivSource" element
         */
        public void setEquivSource(java.lang.String equivSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EQUIVSOURCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EQUIVSOURCE$4);
                }
                target.setStringValue(equivSource);
            }
        }
        
        /**
         * Sets (as xml) the "equivSource" element
         */
        public void xsetEquivSource(org.apache.xmlbeans.XmlString equivSource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EQUIVSOURCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EQUIVSOURCE$4);
                }
                target.set(equivSource);
            }
        }
    }
}
