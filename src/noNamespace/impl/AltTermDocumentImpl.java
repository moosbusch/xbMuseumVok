/*
 * An XML document type.
 * Localname: altTerm
 * Namespace:
 * Java type: noNamespace.AltTermDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;

/**
 * A document containing one altTerm(@) element.
 *
 * This is a complex type.
 */
public class AltTermDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AltTermDocument
{
    private static final long serialVersionUID = 1L;

    public AltTermDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ALTTERM$0 =
        new javax.xml.namespace.QName("", "altTerm");


    /**
     * Gets the "altTerm" element
     */
    public noNamespace.AltTermDocument.AltTerm getAltTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AltTermDocument.AltTerm target = null;
            target = (noNamespace.AltTermDocument.AltTerm)get_store().find_element_user(ALTTERM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "altTerm" element
     */
    @Inject(optional=true) public void setAltTerm(noNamespace.AltTermDocument.AltTerm altTerm)
    {
        generatedSetterHelperImpl(altTerm, ALTTERM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "altTerm" element
     */
    public noNamespace.AltTermDocument.AltTerm addNewAltTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.AltTermDocument.AltTerm target = null;
            target = (noNamespace.AltTermDocument.AltTerm)get_store().add_element_user(ALTTERM$0);
            return target;
        }
    }
    /**
     * An XML altTerm(@).
     *
     * This is a complex type.
     */
    public static class AltTermImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.AltTermDocument.AltTerm
    {
        private static final long serialVersionUID = 1L;

        public AltTermImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName ALTLABEL$0 =
            new javax.xml.namespace.QName("", "altLabel");
        private static final javax.xml.namespace.QName TYPEOFLABEL$2 =
            new javax.xml.namespace.QName("", "typeOfLabel");
        private static final javax.xml.namespace.QName SOURCE$4 =
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName LANG$6 =
            new javax.xml.namespace.QName("", "lang");


        /**
         * Gets the "altLabel" element
         */
        public java.lang.String getAltLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTLABEL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "altLabel" element
         */
        public org.apache.xmlbeans.XmlString xgetAltLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTLABEL$0, 0);
                return target;
            }
        }

        /**
         * Sets the "altLabel" element
         */
        @Inject(optional=true) public void setAltLabel(java.lang.String altLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTLABEL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTLABEL$0);
                }
                target.setStringValue(altLabel);
            }
        }

        /**
         * Sets (as xml) the "altLabel" element
         */
        public void xsetAltLabel(org.apache.xmlbeans.XmlString altLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTLABEL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTLABEL$0);
                }
                target.set(altLabel);
            }
        }

        /**
         * Gets the "typeOfLabel" element
         */
        public java.lang.String getTypeOfLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFLABEL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "typeOfLabel" element
         */
        public org.apache.xmlbeans.XmlString xgetTypeOfLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEOFLABEL$2, 0);
                return target;
            }
        }

        /**
         * True if has "typeOfLabel" element
         */
        public boolean isSetTypeOfLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPEOFLABEL$2) != 0;
            }
        }

        /**
         * Sets the "typeOfLabel" element
         */
        @Inject(optional=true) public void setTypeOfLabel(java.lang.String typeOfLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEOFLABEL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEOFLABEL$2);
                }
                target.setStringValue(typeOfLabel);
            }
        }

        /**
         * Sets (as xml) the "typeOfLabel" element
         */
        public void xsetTypeOfLabel(org.apache.xmlbeans.XmlString typeOfLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEOFLABEL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEOFLABEL$2);
                }
                target.set(typeOfLabel);
            }
        }

        /**
         * Unsets the "typeOfLabel" element
         */
        public void unsetTypeOfLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPEOFLABEL$2, 0);
            }
        }

        /**
         * Gets the "source" element
         */
        public java.lang.String getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "source" element
         */
        public org.apache.xmlbeans.XmlString xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$4, 0);
                return target;
            }
        }

        /**
         * True if has "source" element
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCE$4) != 0;
            }
        }

        /**
         * Sets the "source" element
         */
        @Inject(optional=true) public void setSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$4);
                }
                target.setStringValue(source);
            }
        }

        /**
         * Sets (as xml) the "source" element
         */
        public void xsetSource(org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$4);
                }
                target.set(source);
            }
        }

        /**
         * Unsets the "source" element
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCE$4, 0);
            }
        }

        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANG$6);
                return target;
            }
        }

        /**
         * Sets the "lang" attribute
         */
        @Inject(optional=true) public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$6);
                }
                target.setStringValue(lang);
            }
        }

        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlString lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANG$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANG$6);
                }
                target.set(lang);
            }
        }
    }
}
