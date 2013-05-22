/*
 * An XML document type.
 * Localname: prefTerm
 * Namespace:
 * Java type: noNamespace.PrefTermDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;  import com.google.inject.Inject;
import org.moosbusch.museum.inject.annotation.Language;
/**
 * A document containing one prefTerm(@) element.
 *
 * This is a complex type.
 */
public class PrefTermDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.PrefTermDocument
{
    private static final long serialVersionUID = 1L;

    public PrefTermDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName PREFTERM$0 =
        new javax.xml.namespace.QName("", "prefTerm");


    /**
     * Gets the "prefTerm" element
     */
    public noNamespace.PrefTermDocument.PrefTerm getPrefTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.PrefTermDocument.PrefTerm target = null;
            target = (noNamespace.PrefTermDocument.PrefTerm)get_store().find_element_user(PREFTERM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "prefTerm" element
     */
    @Inject(optional=true) public void setPrefTerm(noNamespace.PrefTermDocument.PrefTerm prefTerm)
    {
        generatedSetterHelperImpl(prefTerm, PREFTERM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "prefTerm" element
     */
    public noNamespace.PrefTermDocument.PrefTerm addNewPrefTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.PrefTermDocument.PrefTerm target = null;
            target = (noNamespace.PrefTermDocument.PrefTerm)get_store().add_element_user(PREFTERM$0);
            return target;
        }
    }
    /**
     * An XML prefTerm(@).
     *
     * This is a complex type.
     */
    public static class PrefTermImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.PrefTermDocument.PrefTerm
    {
        private static final long serialVersionUID = 1L;

        public PrefTermImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName PREFLABEL$0 =
            new javax.xml.namespace.QName("", "prefLabel");
        private static final javax.xml.namespace.QName SOURCE$2 =
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName LANG$4 =
            new javax.xml.namespace.QName("", "lang");


        /**
         * Gets the "prefLabel" element
         */
        public java.lang.String getPrefLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFLABEL$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "prefLabel" element
         */
        public org.apache.xmlbeans.XmlString xgetPrefLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREFLABEL$0, 0);
                return target;
            }
        }

        /**
         * Sets the "prefLabel" element
         */
        @Inject(optional=true) public void setPrefLabel(java.lang.String prefLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFLABEL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFLABEL$0);
                }
                target.setStringValue(prefLabel);
            }
        }

        /**
         * Sets (as xml) the "prefLabel" element
         */
        public void xsetPrefLabel(org.apache.xmlbeans.XmlString prefLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREFLABEL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREFLABEL$0);
                }
                target.set(prefLabel);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$2, 0);
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
                return get_store().count_elements(SOURCE$2) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$2);
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
                get_store().remove_element(SOURCE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANG$4);
                return target;
            }
        }

        /**
         * Sets the "lang" attribute
         */
        @Inject(optional=true) public void setLang(@Language java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANG$4);
                }
                target.set(lang);
            }
        }
    }
}
