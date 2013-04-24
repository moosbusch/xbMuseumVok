/*

 *
 */
package org.moosbusch.museum.museumvok.document.spi;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import noNamespace.ConceptDocument.Concept;
import noNamespace.MuseumvokDocument;
import noNamespace.MuseumvokDocument.Museumvok;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import org.moosbusch.museum.museumvok.document.Document;
import org.moosbusch.museum.museumvok.inject.impl.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument<T extends MuseumVokObjectFactory>
        extends AbstractMuseumXmlDocument<MuseumvokDocument, T, Museumvok, Concept>
        implements Document<T> {

    public AbstractDocument() {
    }

    public AbstractDocument(InputStream in) throws IOException, XmlException {
        super(in);
    }

    public Museumvok getRootElement() {
        synchronized (getRootWrapperElement().monitor()) {
            return getRootWrapperElement().getMuseumvok();
        }
    }

    @Override
    public Collection<Concept> getItems() {
        synchronized (getRootWrapperElement().monitor()) {
            return getRootElement().getConceptList();
        }
    }
}
