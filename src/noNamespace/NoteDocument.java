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
package noNamespace;


/**
 * A document containing one note(@) element.
 *
 * This is a complex type.
 */
public interface NoteDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NoteDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA75ECD0220A9C22DFDD0E419E7724324").resolveHandle("noted3ebdoctype");
    
    /**
     * Gets the "note" element
     */
    noNamespace.NoteDocument.Note getNote();
    
    /**
     * Sets the "note" element
     */
    void setNote(noNamespace.NoteDocument.Note note);
    
    /**
     * Appends and returns a new empty "note" element
     */
    noNamespace.NoteDocument.Note addNewNote();
    
    /**
     * An XML note(@).
     *
     * This is a complex type.
     */
    public interface Note extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Note.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA75ECD0220A9C22DFDD0E419E7724324").resolveHandle("notef3adelemtype");
        
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
         * Gets the "type" attribute
         */
        noNamespace.NoteDocument.Note.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        noNamespace.NoteDocument.Note.Type xgetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(noNamespace.NoteDocument.Note.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(noNamespace.NoteDocument.Note.Type type);
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of noNamespace.NoteDocument$Note$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA75ECD0220A9C22DFDD0E419E7724324").resolveHandle("typeb787attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum CHANGE_NOTE = Enum.forString("changeNote");
            static final Enum EDITORIAL_NOTE = Enum.forString("editorialNote");
            static final Enum EXAMPLE = Enum.forString("example");
            static final Enum HISTORY_NOTE = Enum.forString("historyNote");
            static final Enum SCOPE_NOTE = Enum.forString("scopeNote");
            
            static final int INT_CHANGE_NOTE = Enum.INT_CHANGE_NOTE;
            static final int INT_EDITORIAL_NOTE = Enum.INT_EDITORIAL_NOTE;
            static final int INT_EXAMPLE = Enum.INT_EXAMPLE;
            static final int INT_HISTORY_NOTE = Enum.INT_HISTORY_NOTE;
            static final int INT_SCOPE_NOTE = Enum.INT_SCOPE_NOTE;
            
            /**
             * Enumeration value class for noNamespace.NoteDocument$Note$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CHANGE_NOTE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_CHANGE_NOTE = 1;
                static final int INT_EDITORIAL_NOTE = 2;
                static final int INT_EXAMPLE = 3;
                static final int INT_HISTORY_NOTE = 4;
                static final int INT_SCOPE_NOTE = 5;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("changeNote", INT_CHANGE_NOTE),
                      new Enum("editorialNote", INT_EDITORIAL_NOTE),
                      new Enum("example", INT_EXAMPLE),
                      new Enum("historyNote", INT_HISTORY_NOTE),
                      new Enum("scopeNote", INT_SCOPE_NOTE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.NoteDocument.Note.Type newValue(java.lang.Object obj) {
                  return (noNamespace.NoteDocument.Note.Type) type.newValue( obj ); }
                
                public static noNamespace.NoteDocument.Note.Type newInstance() {
                  return (noNamespace.NoteDocument.Note.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.NoteDocument.Note.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.NoteDocument.Note.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.NoteDocument.Note newInstance() {
              return (noNamespace.NoteDocument.Note) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.NoteDocument.Note newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.NoteDocument.Note) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.NoteDocument newInstance() {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.NoteDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.NoteDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.NoteDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.NoteDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.NoteDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.NoteDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.NoteDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.NoteDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.NoteDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.NoteDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.NoteDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.NoteDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.NoteDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.NoteDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.NoteDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static noNamespace.NoteDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static noNamespace.NoteDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.NoteDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
