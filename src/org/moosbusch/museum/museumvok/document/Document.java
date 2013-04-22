/*

 *
 */
package org.moosbusch.museum.museumvok.document;

import java.util.Collection;
import java.util.Locale;
import noNamespace.ConceptDocument.Concept;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.museumvok.util.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends MuseumVokObjectFactory> extends MuseumXmlDocument<T> {

    public void addConcept(Concept concept);

    public void removeConcept(Concept concept);

    public Collection<Concept> getConcepts();

}
