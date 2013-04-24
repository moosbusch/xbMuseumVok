/*

 *
 */
package org.moosbusch.museum.museumvok.document;

import noNamespace.ConceptDocument.Concept;
import noNamespace.MuseumvokDocument;
import noNamespace.MuseumvokDocument.Museumvok;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.museumvok.inject.impl.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends MuseumVokObjectFactory>
    extends MuseumXmlDocument<MuseumvokDocument, T, Museumvok, Concept> {

}
