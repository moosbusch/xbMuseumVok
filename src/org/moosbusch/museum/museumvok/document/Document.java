/*

 *
 */
package org.moosbusch.museum.museumvok.document;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Locale;
import noNamespace.ConceptDocument.Concept;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.moosbusch.museum.museumvok.util.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends MuseumVokObjectFactory> {

    public static final String PATH_DELEGATE_INTERFACE_CLASS =
            "org.apache.xmlbeans.impl.xpath.saxon.XBeansXPathSaxon95";
    public static final String DEFAULT_LANGUAGE = Locale.getDefault().toLanguageTag();

    public void addConcept(Concept concept);

    public void removeConcept(Concept concept);

    public Collection<Concept> getConcepts();

    public void loadDocument(InputStream input) throws IOException, XmlException;

    public void saveDocument(OutputStream output) throws IOException;

    public void clearDocument();

    public String getLanguage();

    public Object getObjectByXPath(String xpath);

    public T getObjectFactory();

}
