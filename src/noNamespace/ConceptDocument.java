/*
 * An XML document type.
 * Localname: Concept
 * Namespace: 
 * Java type: noNamespace.ConceptDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one Concept(@) element.
 *
 * This is a complex type.
 */
public interface ConceptDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConceptDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF7F2360BB1D992D3186592B1148A258E").resolveHandle("concept3fafdoctype");
    
    /**
     * Gets the "Concept" element
     */
    noNamespace.ConceptDocument.Concept getConcept();
    
    /**
     * Sets the "Concept" element
     */
    void setConcept(noNamespace.ConceptDocument.Concept concept);
    
    /**
     * Appends and returns a new empty "Concept" element
     */
    noNamespace.ConceptDocument.Concept addNewConcept();
    
    /**
     * An XML Concept(@).
     *
     * This is a complex type.
     */
    public interface Concept extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Concept.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF7F2360BB1D992D3186592B1148A258E").resolveHandle("concept3973elemtype");
        
        /**
         * Gets the "about" element
         */
        java.lang.String getAbout();
        
        /**
         * Gets (as xml) the "about" element
         */
        org.apache.xmlbeans.XmlString xgetAbout();
        
        /**
         * Sets the "about" element
         */
        void setAbout(java.lang.String about);
        
        /**
         * Sets (as xml) the "about" element
         */
        void xsetAbout(org.apache.xmlbeans.XmlString about);
        
        /**
         * Gets a List of "prefTerm" elements
         */
        java.util.List<noNamespace.PrefTermDocument.PrefTerm> getPrefTermList();
        
        /**
         * Gets array of all "prefTerm" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.PrefTermDocument.PrefTerm[] getPrefTermArray();
        
        /**
         * Gets ith "prefTerm" element
         */
        noNamespace.PrefTermDocument.PrefTerm getPrefTermArray(int i);
        
        /**
         * Returns number of "prefTerm" element
         */
        int sizeOfPrefTermArray();
        
        /**
         * Sets array of all "prefTerm" element
         */
        void setPrefTermArray(noNamespace.PrefTermDocument.PrefTerm[] prefTermArray);
        
        /**
         * Sets ith "prefTerm" element
         */
        void setPrefTermArray(int i, noNamespace.PrefTermDocument.PrefTerm prefTerm);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "prefTerm" element
         */
        noNamespace.PrefTermDocument.PrefTerm insertNewPrefTerm(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "prefTerm" element
         */
        noNamespace.PrefTermDocument.PrefTerm addNewPrefTerm();
        
        /**
         * Removes the ith "prefTerm" element
         */
        void removePrefTerm(int i);
        
        /**
         * Gets a List of "altTerm" elements
         */
        java.util.List<noNamespace.AltTermDocument.AltTerm> getAltTermList();
        
        /**
         * Gets array of all "altTerm" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.AltTermDocument.AltTerm[] getAltTermArray();
        
        /**
         * Gets ith "altTerm" element
         */
        noNamespace.AltTermDocument.AltTerm getAltTermArray(int i);
        
        /**
         * Returns number of "altTerm" element
         */
        int sizeOfAltTermArray();
        
        /**
         * Sets array of all "altTerm" element
         */
        void setAltTermArray(noNamespace.AltTermDocument.AltTerm[] altTermArray);
        
        /**
         * Sets ith "altTerm" element
         */
        void setAltTermArray(int i, noNamespace.AltTermDocument.AltTerm altTerm);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "altTerm" element
         */
        noNamespace.AltTermDocument.AltTerm insertNewAltTerm(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "altTerm" element
         */
        noNamespace.AltTermDocument.AltTerm addNewAltTerm();
        
        /**
         * Removes the ith "altTerm" element
         */
        void removeAltTerm(int i);
        
        /**
         * Gets a List of "hiddenLabel" elements
         */
        java.util.List<java.lang.String> getHiddenLabelList();
        
        /**
         * Gets array of all "hiddenLabel" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getHiddenLabelArray();
        
        /**
         * Gets ith "hiddenLabel" element
         */
        java.lang.String getHiddenLabelArray(int i);
        
        /**
         * Gets (as xml) a List of "hiddenLabel" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetHiddenLabelList();
        
        /**
         * Gets (as xml) array of all "hiddenLabel" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetHiddenLabelArray();
        
        /**
         * Gets (as xml) ith "hiddenLabel" element
         */
        org.apache.xmlbeans.XmlString xgetHiddenLabelArray(int i);
        
        /**
         * Returns number of "hiddenLabel" element
         */
        int sizeOfHiddenLabelArray();
        
        /**
         * Sets array of all "hiddenLabel" element
         */
        void setHiddenLabelArray(java.lang.String[] hiddenLabelArray);
        
        /**
         * Sets ith "hiddenLabel" element
         */
        void setHiddenLabelArray(int i, java.lang.String hiddenLabel);
        
        /**
         * Sets (as xml) array of all "hiddenLabel" element
         */
        void xsetHiddenLabelArray(org.apache.xmlbeans.XmlString[] hiddenLabelArray);
        
        /**
         * Sets (as xml) ith "hiddenLabel" element
         */
        void xsetHiddenLabelArray(int i, org.apache.xmlbeans.XmlString hiddenLabel);
        
        /**
         * Inserts the value as the ith "hiddenLabel" element
         */
        void insertHiddenLabel(int i, java.lang.String hiddenLabel);
        
        /**
         * Appends the value as the last "hiddenLabel" element
         */
        void addHiddenLabel(java.lang.String hiddenLabel);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "hiddenLabel" element
         */
        org.apache.xmlbeans.XmlString insertNewHiddenLabel(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "hiddenLabel" element
         */
        org.apache.xmlbeans.XmlString addNewHiddenLabel();
        
        /**
         * Removes the ith "hiddenLabel" element
         */
        void removeHiddenLabel(int i);
        
        /**
         * Gets the "notation" element
         */
        java.lang.String getNotation();
        
        /**
         * Gets (as xml) the "notation" element
         */
        org.apache.xmlbeans.XmlString xgetNotation();
        
        /**
         * True if has "notation" element
         */
        boolean isSetNotation();
        
        /**
         * Sets the "notation" element
         */
        void setNotation(java.lang.String notation);
        
        /**
         * Sets (as xml) the "notation" element
         */
        void xsetNotation(org.apache.xmlbeans.XmlString notation);
        
        /**
         * Unsets the "notation" element
         */
        void unsetNotation();
        
        /**
         * Gets the "inScheme" element
         */
        java.lang.String getInScheme();
        
        /**
         * Gets (as xml) the "inScheme" element
         */
        org.apache.xmlbeans.XmlString xgetInScheme();
        
        /**
         * Sets the "inScheme" element
         */
        void setInScheme(java.lang.String inScheme);
        
        /**
         * Sets (as xml) the "inScheme" element
         */
        void xsetInScheme(org.apache.xmlbeans.XmlString inScheme);
        
        /**
         * Gets a List of "memberOfCollection" elements
         */
        java.util.List<java.lang.String> getMemberOfCollectionList();
        
        /**
         * Gets array of all "memberOfCollection" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getMemberOfCollectionArray();
        
        /**
         * Gets ith "memberOfCollection" element
         */
        java.lang.String getMemberOfCollectionArray(int i);
        
        /**
         * Gets (as xml) a List of "memberOfCollection" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetMemberOfCollectionList();
        
        /**
         * Gets (as xml) array of all "memberOfCollection" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetMemberOfCollectionArray();
        
        /**
         * Gets (as xml) ith "memberOfCollection" element
         */
        org.apache.xmlbeans.XmlString xgetMemberOfCollectionArray(int i);
        
        /**
         * Returns number of "memberOfCollection" element
         */
        int sizeOfMemberOfCollectionArray();
        
        /**
         * Sets array of all "memberOfCollection" element
         */
        void setMemberOfCollectionArray(java.lang.String[] memberOfCollectionArray);
        
        /**
         * Sets ith "memberOfCollection" element
         */
        void setMemberOfCollectionArray(int i, java.lang.String memberOfCollection);
        
        /**
         * Sets (as xml) array of all "memberOfCollection" element
         */
        void xsetMemberOfCollectionArray(org.apache.xmlbeans.XmlString[] memberOfCollectionArray);
        
        /**
         * Sets (as xml) ith "memberOfCollection" element
         */
        void xsetMemberOfCollectionArray(int i, org.apache.xmlbeans.XmlString memberOfCollection);
        
        /**
         * Inserts the value as the ith "memberOfCollection" element
         */
        void insertMemberOfCollection(int i, java.lang.String memberOfCollection);
        
        /**
         * Appends the value as the last "memberOfCollection" element
         */
        void addMemberOfCollection(java.lang.String memberOfCollection);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "memberOfCollection" element
         */
        org.apache.xmlbeans.XmlString insertNewMemberOfCollection(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "memberOfCollection" element
         */
        org.apache.xmlbeans.XmlString addNewMemberOfCollection();
        
        /**
         * Removes the ith "memberOfCollection" element
         */
        void removeMemberOfCollection(int i);
        
        /**
         * Gets a List of "broader" elements
         */
        java.util.List<java.lang.String> getBroaderList();
        
        /**
         * Gets array of all "broader" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getBroaderArray();
        
        /**
         * Gets ith "broader" element
         */
        java.lang.String getBroaderArray(int i);
        
        /**
         * Gets (as xml) a List of "broader" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetBroaderList();
        
        /**
         * Gets (as xml) array of all "broader" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetBroaderArray();
        
        /**
         * Gets (as xml) ith "broader" element
         */
        org.apache.xmlbeans.XmlString xgetBroaderArray(int i);
        
        /**
         * Returns number of "broader" element
         */
        int sizeOfBroaderArray();
        
        /**
         * Sets array of all "broader" element
         */
        void setBroaderArray(java.lang.String[] broaderArray);
        
        /**
         * Sets ith "broader" element
         */
        void setBroaderArray(int i, java.lang.String broader);
        
        /**
         * Sets (as xml) array of all "broader" element
         */
        void xsetBroaderArray(org.apache.xmlbeans.XmlString[] broaderArray);
        
        /**
         * Sets (as xml) ith "broader" element
         */
        void xsetBroaderArray(int i, org.apache.xmlbeans.XmlString broader);
        
        /**
         * Inserts the value as the ith "broader" element
         */
        void insertBroader(int i, java.lang.String broader);
        
        /**
         * Appends the value as the last "broader" element
         */
        void addBroader(java.lang.String broader);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "broader" element
         */
        org.apache.xmlbeans.XmlString insertNewBroader(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "broader" element
         */
        org.apache.xmlbeans.XmlString addNewBroader();
        
        /**
         * Removes the ith "broader" element
         */
        void removeBroader(int i);
        
        /**
         * Gets a List of "narrower" elements
         */
        java.util.List<java.lang.String> getNarrowerList();
        
        /**
         * Gets array of all "narrower" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getNarrowerArray();
        
        /**
         * Gets ith "narrower" element
         */
        java.lang.String getNarrowerArray(int i);
        
        /**
         * Gets (as xml) a List of "narrower" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetNarrowerList();
        
        /**
         * Gets (as xml) array of all "narrower" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetNarrowerArray();
        
        /**
         * Gets (as xml) ith "narrower" element
         */
        org.apache.xmlbeans.XmlString xgetNarrowerArray(int i);
        
        /**
         * Returns number of "narrower" element
         */
        int sizeOfNarrowerArray();
        
        /**
         * Sets array of all "narrower" element
         */
        void setNarrowerArray(java.lang.String[] narrowerArray);
        
        /**
         * Sets ith "narrower" element
         */
        void setNarrowerArray(int i, java.lang.String narrower);
        
        /**
         * Sets (as xml) array of all "narrower" element
         */
        void xsetNarrowerArray(org.apache.xmlbeans.XmlString[] narrowerArray);
        
        /**
         * Sets (as xml) ith "narrower" element
         */
        void xsetNarrowerArray(int i, org.apache.xmlbeans.XmlString narrower);
        
        /**
         * Inserts the value as the ith "narrower" element
         */
        void insertNarrower(int i, java.lang.String narrower);
        
        /**
         * Appends the value as the last "narrower" element
         */
        void addNarrower(java.lang.String narrower);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "narrower" element
         */
        org.apache.xmlbeans.XmlString insertNewNarrower(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "narrower" element
         */
        org.apache.xmlbeans.XmlString addNewNarrower();
        
        /**
         * Removes the ith "narrower" element
         */
        void removeNarrower(int i);
        
        /**
         * Gets the "use" element
         */
        java.lang.String getUse();
        
        /**
         * Gets (as xml) the "use" element
         */
        org.apache.xmlbeans.XmlString xgetUse();
        
        /**
         * True if has "use" element
         */
        boolean isSetUse();
        
        /**
         * Sets the "use" element
         */
        void setUse(java.lang.String use);
        
        /**
         * Sets (as xml) the "use" element
         */
        void xsetUse(org.apache.xmlbeans.XmlString use);
        
        /**
         * Unsets the "use" element
         */
        void unsetUse();
        
        /**
         * Gets a List of "useFor" elements
         */
        java.util.List<java.lang.String> getUseForList();
        
        /**
         * Gets array of all "useFor" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getUseForArray();
        
        /**
         * Gets ith "useFor" element
         */
        java.lang.String getUseForArray(int i);
        
        /**
         * Gets (as xml) a List of "useFor" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetUseForList();
        
        /**
         * Gets (as xml) array of all "useFor" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetUseForArray();
        
        /**
         * Gets (as xml) ith "useFor" element
         */
        org.apache.xmlbeans.XmlString xgetUseForArray(int i);
        
        /**
         * Returns number of "useFor" element
         */
        int sizeOfUseForArray();
        
        /**
         * Sets array of all "useFor" element
         */
        void setUseForArray(java.lang.String[] useForArray);
        
        /**
         * Sets ith "useFor" element
         */
        void setUseForArray(int i, java.lang.String useFor);
        
        /**
         * Sets (as xml) array of all "useFor" element
         */
        void xsetUseForArray(org.apache.xmlbeans.XmlString[] useForArray);
        
        /**
         * Sets (as xml) ith "useFor" element
         */
        void xsetUseForArray(int i, org.apache.xmlbeans.XmlString useFor);
        
        /**
         * Inserts the value as the ith "useFor" element
         */
        void insertUseFor(int i, java.lang.String useFor);
        
        /**
         * Appends the value as the last "useFor" element
         */
        void addUseFor(java.lang.String useFor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "useFor" element
         */
        org.apache.xmlbeans.XmlString insertNewUseFor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "useFor" element
         */
        org.apache.xmlbeans.XmlString addNewUseFor();
        
        /**
         * Removes the ith "useFor" element
         */
        void removeUseFor(int i);
        
        /**
         * Gets a List of "relationship" elements
         */
        java.util.List<noNamespace.RelationshipDocument.Relationship> getRelationshipList();
        
        /**
         * Gets array of all "relationship" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.RelationshipDocument.Relationship[] getRelationshipArray();
        
        /**
         * Gets ith "relationship" element
         */
        noNamespace.RelationshipDocument.Relationship getRelationshipArray(int i);
        
        /**
         * Returns number of "relationship" element
         */
        int sizeOfRelationshipArray();
        
        /**
         * Sets array of all "relationship" element
         */
        void setRelationshipArray(noNamespace.RelationshipDocument.Relationship[] relationshipArray);
        
        /**
         * Sets ith "relationship" element
         */
        void setRelationshipArray(int i, noNamespace.RelationshipDocument.Relationship relationship);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "relationship" element
         */
        noNamespace.RelationshipDocument.Relationship insertNewRelationship(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "relationship" element
         */
        noNamespace.RelationshipDocument.Relationship addNewRelationship();
        
        /**
         * Removes the ith "relationship" element
         */
        void removeRelationship(int i);
        
        /**
         * Gets a List of "equivRelationship" elements
         */
        java.util.List<noNamespace.EquivRelationshipDocument.EquivRelationship> getEquivRelationshipList();
        
        /**
         * Gets array of all "equivRelationship" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.EquivRelationshipDocument.EquivRelationship[] getEquivRelationshipArray();
        
        /**
         * Gets ith "equivRelationship" element
         */
        noNamespace.EquivRelationshipDocument.EquivRelationship getEquivRelationshipArray(int i);
        
        /**
         * Returns number of "equivRelationship" element
         */
        int sizeOfEquivRelationshipArray();
        
        /**
         * Sets array of all "equivRelationship" element
         */
        void setEquivRelationshipArray(noNamespace.EquivRelationshipDocument.EquivRelationship[] equivRelationshipArray);
        
        /**
         * Sets ith "equivRelationship" element
         */
        void setEquivRelationshipArray(int i, noNamespace.EquivRelationshipDocument.EquivRelationship equivRelationship);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "equivRelationship" element
         */
        noNamespace.EquivRelationshipDocument.EquivRelationship insertNewEquivRelationship(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "equivRelationship" element
         */
        noNamespace.EquivRelationshipDocument.EquivRelationship addNewEquivRelationship();
        
        /**
         * Removes the ith "equivRelationship" element
         */
        void removeEquivRelationship(int i);
        
        /**
         * Gets a List of "definition" elements
         */
        java.util.List<java.lang.String> getDefinitionList();
        
        /**
         * Gets array of all "definition" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getDefinitionArray();
        
        /**
         * Gets ith "definition" element
         */
        java.lang.String getDefinitionArray(int i);
        
        /**
         * Gets (as xml) a List of "definition" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetDefinitionList();
        
        /**
         * Gets (as xml) array of all "definition" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetDefinitionArray();
        
        /**
         * Gets (as xml) ith "definition" element
         */
        org.apache.xmlbeans.XmlString xgetDefinitionArray(int i);
        
        /**
         * Returns number of "definition" element
         */
        int sizeOfDefinitionArray();
        
        /**
         * Sets array of all "definition" element
         */
        void setDefinitionArray(java.lang.String[] definitionArray);
        
        /**
         * Sets ith "definition" element
         */
        void setDefinitionArray(int i, java.lang.String definition);
        
        /**
         * Sets (as xml) array of all "definition" element
         */
        void xsetDefinitionArray(org.apache.xmlbeans.XmlString[] definitionArray);
        
        /**
         * Sets (as xml) ith "definition" element
         */
        void xsetDefinitionArray(int i, org.apache.xmlbeans.XmlString definition);
        
        /**
         * Inserts the value as the ith "definition" element
         */
        void insertDefinition(int i, java.lang.String definition);
        
        /**
         * Appends the value as the last "definition" element
         */
        void addDefinition(java.lang.String definition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "definition" element
         */
        org.apache.xmlbeans.XmlString insertNewDefinition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "definition" element
         */
        org.apache.xmlbeans.XmlString addNewDefinition();
        
        /**
         * Removes the ith "definition" element
         */
        void removeDefinition(int i);
        
        /**
         * Gets a List of "depiction" elements
         */
        java.util.List<java.lang.String> getDepictionList();
        
        /**
         * Gets array of all "depiction" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getDepictionArray();
        
        /**
         * Gets ith "depiction" element
         */
        java.lang.String getDepictionArray(int i);
        
        /**
         * Gets (as xml) a List of "depiction" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetDepictionList();
        
        /**
         * Gets (as xml) array of all "depiction" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetDepictionArray();
        
        /**
         * Gets (as xml) ith "depiction" element
         */
        org.apache.xmlbeans.XmlString xgetDepictionArray(int i);
        
        /**
         * Returns number of "depiction" element
         */
        int sizeOfDepictionArray();
        
        /**
         * Sets array of all "depiction" element
         */
        void setDepictionArray(java.lang.String[] depictionArray);
        
        /**
         * Sets ith "depiction" element
         */
        void setDepictionArray(int i, java.lang.String depiction);
        
        /**
         * Sets (as xml) array of all "depiction" element
         */
        void xsetDepictionArray(org.apache.xmlbeans.XmlString[] depictionArray);
        
        /**
         * Sets (as xml) ith "depiction" element
         */
        void xsetDepictionArray(int i, org.apache.xmlbeans.XmlString depiction);
        
        /**
         * Inserts the value as the ith "depiction" element
         */
        void insertDepiction(int i, java.lang.String depiction);
        
        /**
         * Appends the value as the last "depiction" element
         */
        void addDepiction(java.lang.String depiction);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "depiction" element
         */
        org.apache.xmlbeans.XmlString insertNewDepiction(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "depiction" element
         */
        org.apache.xmlbeans.XmlString addNewDepiction();
        
        /**
         * Removes the ith "depiction" element
         */
        void removeDepiction(int i);
        
        /**
         * Gets a List of "subjectIndicator" elements
         */
        java.util.List<java.lang.String> getSubjectIndicatorList();
        
        /**
         * Gets array of all "subjectIndicator" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getSubjectIndicatorArray();
        
        /**
         * Gets ith "subjectIndicator" element
         */
        java.lang.String getSubjectIndicatorArray(int i);
        
        /**
         * Gets (as xml) a List of "subjectIndicator" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetSubjectIndicatorList();
        
        /**
         * Gets (as xml) array of all "subjectIndicator" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetSubjectIndicatorArray();
        
        /**
         * Gets (as xml) ith "subjectIndicator" element
         */
        org.apache.xmlbeans.XmlString xgetSubjectIndicatorArray(int i);
        
        /**
         * Returns number of "subjectIndicator" element
         */
        int sizeOfSubjectIndicatorArray();
        
        /**
         * Sets array of all "subjectIndicator" element
         */
        void setSubjectIndicatorArray(java.lang.String[] subjectIndicatorArray);
        
        /**
         * Sets ith "subjectIndicator" element
         */
        void setSubjectIndicatorArray(int i, java.lang.String subjectIndicator);
        
        /**
         * Sets (as xml) array of all "subjectIndicator" element
         */
        void xsetSubjectIndicatorArray(org.apache.xmlbeans.XmlString[] subjectIndicatorArray);
        
        /**
         * Sets (as xml) ith "subjectIndicator" element
         */
        void xsetSubjectIndicatorArray(int i, org.apache.xmlbeans.XmlString subjectIndicator);
        
        /**
         * Inserts the value as the ith "subjectIndicator" element
         */
        void insertSubjectIndicator(int i, java.lang.String subjectIndicator);
        
        /**
         * Appends the value as the last "subjectIndicator" element
         */
        void addSubjectIndicator(java.lang.String subjectIndicator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subjectIndicator" element
         */
        org.apache.xmlbeans.XmlString insertNewSubjectIndicator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subjectIndicator" element
         */
        org.apache.xmlbeans.XmlString addNewSubjectIndicator();
        
        /**
         * Removes the ith "subjectIndicator" element
         */
        void removeSubjectIndicator(int i);
        
        /**
         * Gets a List of "note" elements
         */
        java.util.List<noNamespace.NoteDocument.Note> getNoteList();
        
        /**
         * Gets array of all "note" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.NoteDocument.Note[] getNoteArray();
        
        /**
         * Gets ith "note" element
         */
        noNamespace.NoteDocument.Note getNoteArray(int i);
        
        /**
         * Returns number of "note" element
         */
        int sizeOfNoteArray();
        
        /**
         * Sets array of all "note" element
         */
        void setNoteArray(noNamespace.NoteDocument.Note[] noteArray);
        
        /**
         * Sets ith "note" element
         */
        void setNoteArray(int i, noNamespace.NoteDocument.Note note);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "note" element
         */
        noNamespace.NoteDocument.Note insertNewNote(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "note" element
         */
        noNamespace.NoteDocument.Note addNewNote();
        
        /**
         * Removes the ith "note" element
         */
        void removeNote(int i);
        
        /**
         * Gets the "creation" element
         */
        noNamespace.CreationDocument.Creation getCreation();
        
        /**
         * True if has "creation" element
         */
        boolean isSetCreation();
        
        /**
         * Sets the "creation" element
         */
        void setCreation(noNamespace.CreationDocument.Creation creation);
        
        /**
         * Appends and returns a new empty "creation" element
         */
        noNamespace.CreationDocument.Creation addNewCreation();
        
        /**
         * Unsets the "creation" element
         */
        void unsetCreation();
        
        /**
         * Gets the "status" element
         */
        java.lang.String getStatus();
        
        /**
         * Gets (as xml) the "status" element
         */
        org.apache.xmlbeans.XmlString xgetStatus();
        
        /**
         * True if has "status" element
         */
        boolean isSetStatus();
        
        /**
         * Sets the "status" element
         */
        void setStatus(java.lang.String status);
        
        /**
         * Sets (as xml) the "status" element
         */
        void xsetStatus(org.apache.xmlbeans.XmlString status);
        
        /**
         * Unsets the "status" element
         */
        void unsetStatus();
        
        /**
         * Gets a List of "modified" elements
         */
        java.util.List<java.lang.String> getModifiedList();
        
        /**
         * Gets array of all "modified" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getModifiedArray();
        
        /**
         * Gets ith "modified" element
         */
        java.lang.String getModifiedArray(int i);
        
        /**
         * Gets (as xml) a List of "modified" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetModifiedList();
        
        /**
         * Gets (as xml) array of all "modified" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetModifiedArray();
        
        /**
         * Gets (as xml) ith "modified" element
         */
        org.apache.xmlbeans.XmlString xgetModifiedArray(int i);
        
        /**
         * Returns number of "modified" element
         */
        int sizeOfModifiedArray();
        
        /**
         * Sets array of all "modified" element
         */
        void setModifiedArray(java.lang.String[] modifiedArray);
        
        /**
         * Sets ith "modified" element
         */
        void setModifiedArray(int i, java.lang.String modified);
        
        /**
         * Sets (as xml) array of all "modified" element
         */
        void xsetModifiedArray(org.apache.xmlbeans.XmlString[] modifiedArray);
        
        /**
         * Sets (as xml) ith "modified" element
         */
        void xsetModifiedArray(int i, org.apache.xmlbeans.XmlString modified);
        
        /**
         * Inserts the value as the ith "modified" element
         */
        void insertModified(int i, java.lang.String modified);
        
        /**
         * Appends the value as the last "modified" element
         */
        void addModified(java.lang.String modified);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "modified" element
         */
        org.apache.xmlbeans.XmlString insertNewModified(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "modified" element
         */
        org.apache.xmlbeans.XmlString addNewModified();
        
        /**
         * Removes the ith "modified" element
         */
        void removeModified(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ConceptDocument.Concept newInstance() {
              return (noNamespace.ConceptDocument.Concept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ConceptDocument.Concept newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ConceptDocument.Concept) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ConceptDocument newInstance() {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ConceptDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ConceptDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ConceptDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ConceptDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ConceptDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ConceptDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ConceptDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ConceptDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ConceptDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ConceptDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ConceptDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ConceptDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ConceptDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ConceptDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ConceptDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static noNamespace.ConceptDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static noNamespace.ConceptDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ConceptDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
