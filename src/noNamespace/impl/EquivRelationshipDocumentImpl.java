/*
 * An XML document type.
 * Localname: equivRelationship
 * Namespace: 
 * Java type: noNamespace.EquivRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
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
    @Inject(optional=true) public void setEquivRelationship(noNamespace.EquivRelationshipDocument.EquivRelationship equivRelationship)
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
}
