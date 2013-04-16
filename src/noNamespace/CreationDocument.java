/*
 * An XML document type.
 * Localname: creation
 * Namespace: 
 * Java type: noNamespace.CreationDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one creation(@) element.
 *
 * This is a complex type.
 */
public interface CreationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF7F2360BB1D992D3186592B1148A258E").resolveHandle("creationee58doctype");
    
    /**
     * Gets the "creation" element
     */
    noNamespace.CreationDocument.Creation getCreation();
    
    /**
     * Sets the "creation" element
     */
    void setCreation(noNamespace.CreationDocument.Creation creation);
    
    /**
     * Appends and returns a new empty "creation" element
     */
    noNamespace.CreationDocument.Creation addNewCreation();
    
    /**
     * An XML creation(@).
     *
     * This is a complex type.
     */
    public interface Creation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Creation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF7F2360BB1D992D3186592B1148A258E").resolveHandle("creationfc0delemtype");
        
        /**
         * Gets the "source" element
         */
        java.lang.String getSource();
        
        /**
         * Gets (as xml) the "source" element
         */
        org.apache.xmlbeans.XmlString xgetSource();
        
        /**
         * Sets the "source" element
         */
        void setSource(java.lang.String source);
        
        /**
         * Sets (as xml) the "source" element
         */
        void xsetSource(org.apache.xmlbeans.XmlString source);
        
        /**
         * Gets the "identifier" element
         */
        java.lang.String getIdentifier();
        
        /**
         * Gets (as xml) the "identifier" element
         */
        org.apache.xmlbeans.XmlString xgetIdentifier();
        
        /**
         * Sets the "identifier" element
         */
        void setIdentifier(java.lang.String identifier);
        
        /**
         * Sets (as xml) the "identifier" element
         */
        void xsetIdentifier(org.apache.xmlbeans.XmlString identifier);
        
        /**
         * Gets a List of "creator" elements
         */
        java.util.List<java.lang.String> getCreatorList();
        
        /**
         * Gets array of all "creator" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getCreatorArray();
        
        /**
         * Gets ith "creator" element
         */
        java.lang.String getCreatorArray(int i);
        
        /**
         * Gets (as xml) a List of "creator" elements
         */
        java.util.List<noNamespace.CreationDocument.Creation.Creator> xgetCreatorList();
        
        /**
         * Gets (as xml) array of all "creator" elements
         * @deprecated
         */
        @Deprecated
        noNamespace.CreationDocument.Creation.Creator[] xgetCreatorArray();
        
        /**
         * Gets (as xml) ith "creator" element
         */
        noNamespace.CreationDocument.Creation.Creator xgetCreatorArray(int i);
        
        /**
         * Tests for nil ith "creator" element
         */
        boolean isNilCreatorArray(int i);
        
        /**
         * Returns number of "creator" element
         */
        int sizeOfCreatorArray();
        
        /**
         * Sets array of all "creator" element
         */
        void setCreatorArray(java.lang.String[] creatorArray);
        
        /**
         * Sets ith "creator" element
         */
        void setCreatorArray(int i, java.lang.String creator);
        
        /**
         * Sets (as xml) array of all "creator" element
         */
        void xsetCreatorArray(noNamespace.CreationDocument.Creation.Creator[] creatorArray);
        
        /**
         * Sets (as xml) ith "creator" element
         */
        void xsetCreatorArray(int i, noNamespace.CreationDocument.Creation.Creator creator);
        
        /**
         * Nils the ith "creator" element
         */
        void setNilCreatorArray(int i);
        
        /**
         * Inserts the value as the ith "creator" element
         */
        void insertCreator(int i, java.lang.String creator);
        
        /**
         * Appends the value as the last "creator" element
         */
        void addCreator(java.lang.String creator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "creator" element
         */
        noNamespace.CreationDocument.Creation.Creator insertNewCreator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "creator" element
         */
        noNamespace.CreationDocument.Creation.Creator addNewCreator();
        
        /**
         * Removes the ith "creator" element
         */
        void removeCreator(int i);
        
        /**
         * Gets the "created" element
         */
        java.lang.String getCreated();
        
        /**
         * Gets (as xml) the "created" element
         */
        org.apache.xmlbeans.XmlString xgetCreated();
        
        /**
         * True if has "created" element
         */
        boolean isSetCreated();
        
        /**
         * Sets the "created" element
         */
        void setCreated(java.lang.String created);
        
        /**
         * Sets (as xml) the "created" element
         */
        void xsetCreated(org.apache.xmlbeans.XmlString created);
        
        /**
         * Unsets the "created" element
         */
        void unsetCreated();
        
        /**
         * An XML creator(@).
         *
         * This is an atomic type that is a restriction of noNamespace.CreationDocument$Creation$Creator.
         */
        public interface Creator extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Creator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF7F2360BB1D992D3186592B1148A258E").resolveHandle("creator9ab5elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.CreationDocument.Creation.Creator newValue(java.lang.Object obj) {
                  return (noNamespace.CreationDocument.Creation.Creator) type.newValue( obj ); }
                
                public static noNamespace.CreationDocument.Creation.Creator newInstance() {
                  return (noNamespace.CreationDocument.Creation.Creator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.CreationDocument.Creation.Creator newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.CreationDocument.Creation.Creator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.CreationDocument.Creation newInstance() {
              return (noNamespace.CreationDocument.Creation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.CreationDocument.Creation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.CreationDocument.Creation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.CreationDocument newInstance() {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.CreationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.CreationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.CreationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.CreationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.CreationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.CreationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.CreationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.CreationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.CreationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.CreationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.CreationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.CreationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.CreationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.CreationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.CreationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static noNamespace.CreationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static noNamespace.CreationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.CreationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
