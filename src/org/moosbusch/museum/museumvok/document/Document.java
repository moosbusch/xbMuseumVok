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

/**
 *
 * @author moosbusch
 */
public interface Document {

    public static final String DEFAULT_LANGUAGE = Locale.getDefault().toLanguageTag();

    public void addConcept(Concept concept);

    public void removeConcept(Concept concept);

    public Collection<Concept> getConcepts();

    public void loadDocument(InputStream input) throws IOException, XmlException;

    public void saveDocument(OutputStream output) throws IOException;

    public void clearDocument();

    public String getLanguage();

}
