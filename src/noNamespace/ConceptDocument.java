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
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConceptDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("concept3fafdoctype");
    
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Concept.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("concept3973elemtype");
        
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
        java.util.List<noNamespace.ConceptDocument.Concept.AltTerm> getAltTermList();
        
        /**
         * Gets array of all "altTerm" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.AltTerm[] getAltTermArray();
        
        /**
         * Gets ith "altTerm" element
         */
        noNamespace.ConceptDocument.Concept.AltTerm getAltTermArray(int i);
        
        /**
         * Tests for nil ith "altTerm" element
         */
        boolean isNilAltTermArray(int i);
        
        /**
         * Returns number of "altTerm" element
         */
        int sizeOfAltTermArray();
        
        /**
         * Sets array of all "altTerm" element
         */
        void setAltTermArray(noNamespace.ConceptDocument.Concept.AltTerm[] altTermArray);
        
        /**
         * Sets ith "altTerm" element
         */
        void setAltTermArray(int i, noNamespace.ConceptDocument.Concept.AltTerm altTerm);
        
        /**
         * Nils the ith "altTerm" element
         */
        void setNilAltTermArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "altTerm" element
         */
        noNamespace.ConceptDocument.Concept.AltTerm insertNewAltTerm(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "altTerm" element
         */
        noNamespace.ConceptDocument.Concept.AltTerm addNewAltTerm();
        
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
        java.util.List<noNamespace.ConceptDocument.Concept.HiddenLabel> xgetHiddenLabelList();
        
        /**
         * Gets (as xml) array of all "hiddenLabel" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.HiddenLabel[] xgetHiddenLabelArray();
        
        /**
         * Gets (as xml) ith "hiddenLabel" element
         */
        noNamespace.ConceptDocument.Concept.HiddenLabel xgetHiddenLabelArray(int i);
        
        /**
         * Tests for nil ith "hiddenLabel" element
         */
        boolean isNilHiddenLabelArray(int i);
        
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
        void xsetHiddenLabelArray(noNamespace.ConceptDocument.Concept.HiddenLabel[] hiddenLabelArray);
        
        /**
         * Sets (as xml) ith "hiddenLabel" element
         */
        void xsetHiddenLabelArray(int i, noNamespace.ConceptDocument.Concept.HiddenLabel hiddenLabel);
        
        /**
         * Nils the ith "hiddenLabel" element
         */
        void setNilHiddenLabelArray(int i);
        
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
        noNamespace.ConceptDocument.Concept.HiddenLabel insertNewHiddenLabel(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "hiddenLabel" element
         */
        noNamespace.ConceptDocument.Concept.HiddenLabel addNewHiddenLabel();
        
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
        java.util.List<noNamespace.ConceptDocument.Concept.MemberOfCollection> xgetMemberOfCollectionList();
        
        /**
         * Gets (as xml) array of all "memberOfCollection" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.MemberOfCollection[] xgetMemberOfCollectionArray();
        
        /**
         * Gets (as xml) ith "memberOfCollection" element
         */
        noNamespace.ConceptDocument.Concept.MemberOfCollection xgetMemberOfCollectionArray(int i);
        
        /**
         * Tests for nil ith "memberOfCollection" element
         */
        boolean isNilMemberOfCollectionArray(int i);
        
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
        void xsetMemberOfCollectionArray(noNamespace.ConceptDocument.Concept.MemberOfCollection[] memberOfCollectionArray);
        
        /**
         * Sets (as xml) ith "memberOfCollection" element
         */
        void xsetMemberOfCollectionArray(int i, noNamespace.ConceptDocument.Concept.MemberOfCollection memberOfCollection);
        
        /**
         * Nils the ith "memberOfCollection" element
         */
        void setNilMemberOfCollectionArray(int i);
        
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
        noNamespace.ConceptDocument.Concept.MemberOfCollection insertNewMemberOfCollection(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "memberOfCollection" element
         */
        noNamespace.ConceptDocument.Concept.MemberOfCollection addNewMemberOfCollection();
        
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
        java.util.List<noNamespace.ConceptDocument.Concept.Broader> xgetBroaderList();
        
        /**
         * Gets (as xml) array of all "broader" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.Broader[] xgetBroaderArray();
        
        /**
         * Gets (as xml) ith "broader" element
         */
        noNamespace.ConceptDocument.Concept.Broader xgetBroaderArray(int i);
        
        /**
         * Tests for nil ith "broader" element
         */
        boolean isNilBroaderArray(int i);
        
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
        void xsetBroaderArray(noNamespace.ConceptDocument.Concept.Broader[] broaderArray);
        
        /**
         * Sets (as xml) ith "broader" element
         */
        void xsetBroaderArray(int i, noNamespace.ConceptDocument.Concept.Broader broader);
        
        /**
         * Nils the ith "broader" element
         */
        void setNilBroaderArray(int i);
        
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
        noNamespace.ConceptDocument.Concept.Broader insertNewBroader(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "broader" element
         */
        noNamespace.ConceptDocument.Concept.Broader addNewBroader();
        
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
        java.util.List<noNamespace.ConceptDocument.Concept.Narrower> xgetNarrowerList();
        
        /**
         * Gets (as xml) array of all "narrower" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.Narrower[] xgetNarrowerArray();
        
        /**
         * Gets (as xml) ith "narrower" element
         */
        noNamespace.ConceptDocument.Concept.Narrower xgetNarrowerArray(int i);
        
        /**
         * Tests for nil ith "narrower" element
         */
        boolean isNilNarrowerArray(int i);
        
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
        void xsetNarrowerArray(noNamespace.ConceptDocument.Concept.Narrower[] narrowerArray);
        
        /**
         * Sets (as xml) ith "narrower" element
         */
        void xsetNarrowerArray(int i, noNamespace.ConceptDocument.Concept.Narrower narrower);
        
        /**
         * Nils the ith "narrower" element
         */
        void setNilNarrowerArray(int i);
        
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
        noNamespace.ConceptDocument.Concept.Narrower insertNewNarrower(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "narrower" element
         */
        noNamespace.ConceptDocument.Concept.Narrower addNewNarrower();
        
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
        java.util.List<noNamespace.ConceptDocument.Concept.UseFor> xgetUseForList();
        
        /**
         * Gets (as xml) array of all "useFor" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.UseFor[] xgetUseForArray();
        
        /**
         * Gets (as xml) ith "useFor" element
         */
        noNamespace.ConceptDocument.Concept.UseFor xgetUseForArray(int i);
        
        /**
         * Tests for nil ith "useFor" element
         */
        boolean isNilUseForArray(int i);
        
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
        void xsetUseForArray(noNamespace.ConceptDocument.Concept.UseFor[] useForArray);
        
        /**
         * Sets (as xml) ith "useFor" element
         */
        void xsetUseForArray(int i, noNamespace.ConceptDocument.Concept.UseFor useFor);
        
        /**
         * Nils the ith "useFor" element
         */
        void setNilUseForArray(int i);
        
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
        noNamespace.ConceptDocument.Concept.UseFor insertNewUseFor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "useFor" element
         */
        noNamespace.ConceptDocument.Concept.UseFor addNewUseFor();
        
        /**
         * Removes the ith "useFor" element
         */
        void removeUseFor(int i);
        
        /**
         * Gets a List of "relationship" elements
         */
        java.util.List<noNamespace.ConceptDocument.Concept.Relationship> getRelationshipList();
        
        /**
         * Gets array of all "relationship" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.Relationship[] getRelationshipArray();
        
        /**
         * Gets ith "relationship" element
         */
        noNamespace.ConceptDocument.Concept.Relationship getRelationshipArray(int i);
        
        /**
         * Tests for nil ith "relationship" element
         */
        boolean isNilRelationshipArray(int i);
        
        /**
         * Returns number of "relationship" element
         */
        int sizeOfRelationshipArray();
        
        /**
         * Sets array of all "relationship" element
         */
        void setRelationshipArray(noNamespace.ConceptDocument.Concept.Relationship[] relationshipArray);
        
        /**
         * Sets ith "relationship" element
         */
        void setRelationshipArray(int i, noNamespace.ConceptDocument.Concept.Relationship relationship);
        
        /**
         * Nils the ith "relationship" element
         */
        void setNilRelationshipArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "relationship" element
         */
        noNamespace.ConceptDocument.Concept.Relationship insertNewRelationship(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "relationship" element
         */
        noNamespace.ConceptDocument.Concept.Relationship addNewRelationship();
        
        /**
         * Removes the ith "relationship" element
         */
        void removeRelationship(int i);
        
        /**
         * Gets a List of "equivRelationship" elements
         */
        java.util.List<noNamespace.ConceptDocument.Concept.EquivRelationship> getEquivRelationshipList();
        
        /**
         * Gets array of all "equivRelationship" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.EquivRelationship[] getEquivRelationshipArray();
        
        /**
         * Gets ith "equivRelationship" element
         */
        noNamespace.ConceptDocument.Concept.EquivRelationship getEquivRelationshipArray(int i);
        
        /**
         * Tests for nil ith "equivRelationship" element
         */
        boolean isNilEquivRelationshipArray(int i);
        
        /**
         * Returns number of "equivRelationship" element
         */
        int sizeOfEquivRelationshipArray();
        
        /**
         * Sets array of all "equivRelationship" element
         */
        void setEquivRelationshipArray(noNamespace.ConceptDocument.Concept.EquivRelationship[] equivRelationshipArray);
        
        /**
         * Sets ith "equivRelationship" element
         */
        void setEquivRelationshipArray(int i, noNamespace.ConceptDocument.Concept.EquivRelationship equivRelationship);
        
        /**
         * Nils the ith "equivRelationship" element
         */
        void setNilEquivRelationshipArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "equivRelationship" element
         */
        noNamespace.ConceptDocument.Concept.EquivRelationship insertNewEquivRelationship(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "equivRelationship" element
         */
        noNamespace.ConceptDocument.Concept.EquivRelationship addNewEquivRelationship();
        
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
        java.util.List<noNamespace.ConceptDocument.Concept.Definition> xgetDefinitionList();
        
        /**
         * Gets (as xml) array of all "definition" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.Definition[] xgetDefinitionArray();
        
        /**
         * Gets (as xml) ith "definition" element
         */
        noNamespace.ConceptDocument.Concept.Definition xgetDefinitionArray(int i);
        
        /**
         * Tests for nil ith "definition" element
         */
        boolean isNilDefinitionArray(int i);
        
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
        void xsetDefinitionArray(noNamespace.ConceptDocument.Concept.Definition[] definitionArray);
        
        /**
         * Sets (as xml) ith "definition" element
         */
        void xsetDefinitionArray(int i, noNamespace.ConceptDocument.Concept.Definition definition);
        
        /**
         * Nils the ith "definition" element
         */
        void setNilDefinitionArray(int i);
        
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
        noNamespace.ConceptDocument.Concept.Definition insertNewDefinition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "definition" element
         */
        noNamespace.ConceptDocument.Concept.Definition addNewDefinition();
        
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
        java.util.List<noNamespace.ConceptDocument.Concept.Depiction> xgetDepictionList();
        
        /**
         * Gets (as xml) array of all "depiction" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.Depiction[] xgetDepictionArray();
        
        /**
         * Gets (as xml) ith "depiction" element
         */
        noNamespace.ConceptDocument.Concept.Depiction xgetDepictionArray(int i);
        
        /**
         * Tests for nil ith "depiction" element
         */
        boolean isNilDepictionArray(int i);
        
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
        void xsetDepictionArray(noNamespace.ConceptDocument.Concept.Depiction[] depictionArray);
        
        /**
         * Sets (as xml) ith "depiction" element
         */
        void xsetDepictionArray(int i, noNamespace.ConceptDocument.Concept.Depiction depiction);
        
        /**
         * Nils the ith "depiction" element
         */
        void setNilDepictionArray(int i);
        
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
        noNamespace.ConceptDocument.Concept.Depiction insertNewDepiction(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "depiction" element
         */
        noNamespace.ConceptDocument.Concept.Depiction addNewDepiction();
        
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
        java.util.List<noNamespace.ConceptDocument.Concept.SubjectIndicator> xgetSubjectIndicatorList();
        
        /**
         * Gets (as xml) array of all "subjectIndicator" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.SubjectIndicator[] xgetSubjectIndicatorArray();
        
        /**
         * Gets (as xml) ith "subjectIndicator" element
         */
        noNamespace.ConceptDocument.Concept.SubjectIndicator xgetSubjectIndicatorArray(int i);
        
        /**
         * Tests for nil ith "subjectIndicator" element
         */
        boolean isNilSubjectIndicatorArray(int i);
        
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
        void xsetSubjectIndicatorArray(noNamespace.ConceptDocument.Concept.SubjectIndicator[] subjectIndicatorArray);
        
        /**
         * Sets (as xml) ith "subjectIndicator" element
         */
        void xsetSubjectIndicatorArray(int i, noNamespace.ConceptDocument.Concept.SubjectIndicator subjectIndicator);
        
        /**
         * Nils the ith "subjectIndicator" element
         */
        void setNilSubjectIndicatorArray(int i);
        
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
        noNamespace.ConceptDocument.Concept.SubjectIndicator insertNewSubjectIndicator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subjectIndicator" element
         */
        noNamespace.ConceptDocument.Concept.SubjectIndicator addNewSubjectIndicator();
        
        /**
         * Removes the ith "subjectIndicator" element
         */
        void removeSubjectIndicator(int i);
        
        /**
         * Gets a List of "note" elements
         */
        java.util.List<noNamespace.ConceptDocument.Concept.Note> getNoteList();
        
        /**
         * Gets array of all "note" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.Note[] getNoteArray();
        
        /**
         * Gets ith "note" element
         */
        noNamespace.ConceptDocument.Concept.Note getNoteArray(int i);
        
        /**
         * Tests for nil ith "note" element
         */
        boolean isNilNoteArray(int i);
        
        /**
         * Returns number of "note" element
         */
        int sizeOfNoteArray();
        
        /**
         * Sets array of all "note" element
         */
        void setNoteArray(noNamespace.ConceptDocument.Concept.Note[] noteArray);
        
        /**
         * Sets ith "note" element
         */
        void setNoteArray(int i, noNamespace.ConceptDocument.Concept.Note note);
        
        /**
         * Nils the ith "note" element
         */
        void setNilNoteArray(int i);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "note" element
         */
        noNamespace.ConceptDocument.Concept.Note insertNewNote(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "note" element
         */
        noNamespace.ConceptDocument.Concept.Note addNewNote();
        
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
        java.util.List<noNamespace.ConceptDocument.Concept.Modified> xgetModifiedList();
        
        /**
         * Gets (as xml) array of all "modified" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.ConceptDocument.Concept.Modified[] xgetModifiedArray();
        
        /**
         * Gets (as xml) ith "modified" element
         */
        noNamespace.ConceptDocument.Concept.Modified xgetModifiedArray(int i);
        
        /**
         * Tests for nil ith "modified" element
         */
        boolean isNilModifiedArray(int i);
        
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
        void xsetModifiedArray(noNamespace.ConceptDocument.Concept.Modified[] modifiedArray);
        
        /**
         * Sets (as xml) ith "modified" element
         */
        void xsetModifiedArray(int i, noNamespace.ConceptDocument.Concept.Modified modified);
        
        /**
         * Nils the ith "modified" element
         */
        void setNilModifiedArray(int i);
        
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
        noNamespace.ConceptDocument.Concept.Modified insertNewModified(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "modified" element
         */
        noNamespace.ConceptDocument.Concept.Modified addNewModified();
        
        /**
         * Removes the ith "modified" element
         */
        void removeModified(int i);
        
        /**
         * An XML altTerm(@).
         *
         * This is a complex type.
         */
        public interface AltTerm extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AltTerm.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("alttermf924elemtype");
            
            /**
             * Gets the "altLabel" element
             */
            noNamespace.AltLabelDocument.AltLabel getAltLabel();
            
            /**
             * Sets the "altLabel" element
             */
            void setAltLabel(noNamespace.AltLabelDocument.AltLabel altLabel);
            
            /**
             * Appends and returns a new empty "altLabel" element
             */
            noNamespace.AltLabelDocument.AltLabel addNewAltLabel();
            
            /**
             * Gets the "typeOfLabel" element
             */
            java.lang.String getTypeOfLabel();
            
            /**
             * Gets (as xml) the "typeOfLabel" element
             */
            org.apache.xmlbeans.XmlString xgetTypeOfLabel();
            
            /**
             * True if has "typeOfLabel" element
             */
            boolean isSetTypeOfLabel();
            
            /**
             * Sets the "typeOfLabel" element
             */
            void setTypeOfLabel(java.lang.String typeOfLabel);
            
            /**
             * Sets (as xml) the "typeOfLabel" element
             */
            void xsetTypeOfLabel(org.apache.xmlbeans.XmlString typeOfLabel);
            
            /**
             * Unsets the "typeOfLabel" element
             */
            void unsetTypeOfLabel();
            
            /**
             * Gets the "source" element
             */
            java.lang.String getSource();
            
            /**
             * Gets (as xml) the "source" element
             */
            org.apache.xmlbeans.XmlString xgetSource();
            
            /**
             * True if has "source" element
             */
            boolean isSetSource();
            
            /**
             * Sets the "source" element
             */
            void setSource(java.lang.String source);
            
            /**
             * Sets (as xml) the "source" element
             */
            void xsetSource(org.apache.xmlbeans.XmlString source);
            
            /**
             * Unsets the "source" element
             */
            void unsetSource();
            
            /**
             * Gets the "lang" attribute
             */
            java.lang.String getLang();
            
            /**
             * Gets (as xml) the "lang" attribute
             */
            org.apache.xmlbeans.XmlString xgetLang();
            
            /**
             * True if has "lang" attribute
             */
            boolean isSetLang();
            
            /**
             * Sets the "lang" attribute
             */
            void setLang(java.lang.String lang);
            
            /**
             * Sets (as xml) the "lang" attribute
             */
            void xsetLang(org.apache.xmlbeans.XmlString lang);
            
            /**
             * Unsets the "lang" attribute
             */
            void unsetLang();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.AltTerm newInstance() {
                  return (noNamespace.ConceptDocument.Concept.AltTerm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.AltTerm newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.AltTerm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML hiddenLabel(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$HiddenLabel.
         */
        public interface HiddenLabel extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HiddenLabel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("hiddenlabelc659elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.HiddenLabel newValue(java.lang.Object obj) {
                  return (noNamespace.ConceptDocument.Concept.HiddenLabel) type.newValue( obj ); }
                
                public static noNamespace.ConceptDocument.Concept.HiddenLabel newInstance() {
                  return (noNamespace.ConceptDocument.Concept.HiddenLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.HiddenLabel newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.HiddenLabel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML memberOfCollection(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$MemberOfCollection.
         */
        public interface MemberOfCollection extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MemberOfCollection.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("memberofcollectiond60eelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.MemberOfCollection newValue(java.lang.Object obj) {
                  return (noNamespace.ConceptDocument.Concept.MemberOfCollection) type.newValue( obj ); }
                
                public static noNamespace.ConceptDocument.Concept.MemberOfCollection newInstance() {
                  return (noNamespace.ConceptDocument.Concept.MemberOfCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.MemberOfCollection newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.MemberOfCollection) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML broader(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$Broader.
         */
        public interface Broader extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Broader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("broader751eelemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.Broader newValue(java.lang.Object obj) {
                  return (noNamespace.ConceptDocument.Concept.Broader) type.newValue( obj ); }
                
                public static noNamespace.ConceptDocument.Concept.Broader newInstance() {
                  return (noNamespace.ConceptDocument.Concept.Broader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.Broader newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.Broader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML narrower(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$Narrower.
         */
        public interface Narrower extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Narrower.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("narrower7447elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.Narrower newValue(java.lang.Object obj) {
                  return (noNamespace.ConceptDocument.Concept.Narrower) type.newValue( obj ); }
                
                public static noNamespace.ConceptDocument.Concept.Narrower newInstance() {
                  return (noNamespace.ConceptDocument.Concept.Narrower) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.Narrower newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.Narrower) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML useFor(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$UseFor.
         */
        public interface UseFor extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UseFor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("usefor98c1elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.UseFor newValue(java.lang.Object obj) {
                  return (noNamespace.ConceptDocument.Concept.UseFor) type.newValue( obj ); }
                
                public static noNamespace.ConceptDocument.Concept.UseFor newInstance() {
                  return (noNamespace.ConceptDocument.Concept.UseFor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.UseFor newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.UseFor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML relationship(@).
         *
         * This is a complex type.
         */
        public interface Relationship extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Relationship.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("relationship2437elemtype");
            
            /**
             * Gets the "related" element
             */
            java.lang.String getRelated();
            
            /**
             * Gets (as xml) the "related" element
             */
            org.apache.xmlbeans.XmlString xgetRelated();
            
            /**
             * Sets the "related" element
             */
            void setRelated(java.lang.String related);
            
            /**
             * Sets (as xml) the "related" element
             */
            void xsetRelated(org.apache.xmlbeans.XmlString related);
            
            /**
             * Gets the "typeOfRelationship" element
             */
            java.lang.String getTypeOfRelationship();
            
            /**
             * Gets (as xml) the "typeOfRelationship" element
             */
            org.apache.xmlbeans.XmlString xgetTypeOfRelationship();
            
            /**
             * True if has "typeOfRelationship" element
             */
            boolean isSetTypeOfRelationship();
            
            /**
             * Sets the "typeOfRelationship" element
             */
            void setTypeOfRelationship(java.lang.String typeOfRelationship);
            
            /**
             * Sets (as xml) the "typeOfRelationship" element
             */
            void xsetTypeOfRelationship(org.apache.xmlbeans.XmlString typeOfRelationship);
            
            /**
             * Unsets the "typeOfRelationship" element
             */
            void unsetTypeOfRelationship();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.Relationship newInstance() {
                  return (noNamespace.ConceptDocument.Concept.Relationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.Relationship newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.Relationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML equivRelationship(@).
         *
         * This is a complex type.
         */
        public interface EquivRelationship extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EquivRelationship.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("equivrelationshipb87delemtype");
            
            /**
             * Gets the "equivConcept" element
             */
            noNamespace.EquivConceptDocument.EquivConcept getEquivConcept();
            
            /**
             * Sets the "equivConcept" element
             */
            void setEquivConcept(noNamespace.EquivConceptDocument.EquivConcept equivConcept);
            
            /**
             * Appends and returns a new empty "equivConcept" element
             */
            noNamespace.EquivConceptDocument.EquivConcept addNewEquivConcept();
            
            /**
             * Gets the "mappingRelation" element
             */
            java.lang.String getMappingRelation();
            
            /**
             * Gets (as xml) the "mappingRelation" element
             */
            org.apache.xmlbeans.XmlString xgetMappingRelation();
            
            /**
             * Sets the "mappingRelation" element
             */
            void setMappingRelation(java.lang.String mappingRelation);
            
            /**
             * Sets (as xml) the "mappingRelation" element
             */
            void xsetMappingRelation(org.apache.xmlbeans.XmlString mappingRelation);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.EquivRelationship newInstance() {
                  return (noNamespace.ConceptDocument.Concept.EquivRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.EquivRelationship newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.EquivRelationship) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML definition(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$Definition.
         */
        public interface Definition extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Definition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("definition49d2elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.Definition newValue(java.lang.Object obj) {
                  return (noNamespace.ConceptDocument.Concept.Definition) type.newValue( obj ); }
                
                public static noNamespace.ConceptDocument.Concept.Definition newInstance() {
                  return (noNamespace.ConceptDocument.Concept.Definition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.Definition newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.Definition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML depiction(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$Depiction.
         */
        public interface Depiction extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Depiction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("depictiond16celemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.Depiction newValue(java.lang.Object obj) {
                  return (noNamespace.ConceptDocument.Concept.Depiction) type.newValue( obj ); }
                
                public static noNamespace.ConceptDocument.Concept.Depiction newInstance() {
                  return (noNamespace.ConceptDocument.Concept.Depiction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.Depiction newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.Depiction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML subjectIndicator(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$SubjectIndicator.
         */
        public interface SubjectIndicator extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubjectIndicator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("subjectindicator50c2elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.SubjectIndicator newValue(java.lang.Object obj) {
                  return (noNamespace.ConceptDocument.Concept.SubjectIndicator) type.newValue( obj ); }
                
                public static noNamespace.ConceptDocument.Concept.SubjectIndicator newInstance() {
                  return (noNamespace.ConceptDocument.Concept.SubjectIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.SubjectIndicator newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.SubjectIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML note(@).
         *
         * This is a complex type.
         */
        public interface Note extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Note.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("note44f1elemtype");
            
            /**
             * Gets the "text" element
             */
            noNamespace.TextDocument.Text getText();
            
            /**
             * Sets the "text" element
             */
            void setText(noNamespace.TextDocument.Text text);
            
            /**
             * Appends and returns a new empty "text" element
             */
            noNamespace.TextDocument.Text addNewText();
            
            /**
             * Gets the "editor" element
             */
            java.lang.String getEditor();
            
            /**
             * Gets (as xml) the "editor" element
             */
            org.apache.xmlbeans.XmlString xgetEditor();
            
            /**
             * True if has "editor" element
             */
            boolean isSetEditor();
            
            /**
             * Sets the "editor" element
             */
            void setEditor(java.lang.String editor);
            
            /**
             * Sets (as xml) the "editor" element
             */
            void xsetEditor(org.apache.xmlbeans.XmlString editor);
            
            /**
             * Unsets the "editor" element
             */
            void unsetEditor();
            
            /**
             * Gets the "edited" element
             */
            java.lang.String getEdited();
            
            /**
             * Gets (as xml) the "edited" element
             */
            org.apache.xmlbeans.XmlString xgetEdited();
            
            /**
             * True if has "edited" element
             */
            boolean isSetEdited();
            
            /**
             * Sets the "edited" element
             */
            void setEdited(java.lang.String edited);
            
            /**
             * Sets (as xml) the "edited" element
             */
            void xsetEdited(org.apache.xmlbeans.XmlString edited);
            
            /**
             * Unsets the "edited" element
             */
            void unsetEdited();
            
            /**
             * Gets the "typeOfNote" attribute
             */
            java.lang.String getTypeOfNote();
            
            /**
             * Gets (as xml) the "typeOfNote" attribute
             */
            org.apache.xmlbeans.XmlString xgetTypeOfNote();
            
            /**
             * Sets the "typeOfNote" attribute
             */
            void setTypeOfNote(java.lang.String typeOfNote);
            
            /**
             * Sets (as xml) the "typeOfNote" attribute
             */
            void xsetTypeOfNote(org.apache.xmlbeans.XmlString typeOfNote);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.Note newInstance() {
                  return (noNamespace.ConceptDocument.Concept.Note) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.Note newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.Note) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML modified(@).
         *
         * This is an atomic type that is a restriction of noNamespace.ConceptDocument$Concept$Modified.
         */
        public interface Modified extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Modified.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s32C078CD38F534DEA8974BB26E2F8EAC").resolveHandle("modified4248elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ConceptDocument.Concept.Modified newValue(java.lang.Object obj) {
                  return (noNamespace.ConceptDocument.Concept.Modified) type.newValue( obj ); }
                
                public static noNamespace.ConceptDocument.Concept.Modified newInstance() {
                  return (noNamespace.ConceptDocument.Concept.Modified) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ConceptDocument.Concept.Modified newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ConceptDocument.Concept.Modified) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
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
