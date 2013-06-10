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
import org.moosbusch.museum.document.spi.AbstractXmlDocument;
import org.moosbusch.museum.museumvok.document.Document;
import org.moosbusch.museum.museumvok.inject.impl.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument<T extends MuseumVokObjectFactory>
        extends AbstractXmlDocument<MuseumvokDocument, T, Museumvok, Concept>
        implements Document<T> {

    public AbstractDocument() {
    }

    public AbstractDocument(InputStream in) throws IOException, XmlException {
        super(in);
    }

    protected abstract void addDocumentTypeDefinition(MuseumvokDocument museumVokDocument);

    @Override
    public Museumvok getRootElement() {
        return getRootWrapperElement().getMuseumvok();
    }

    @Override
    public Collection<Concept> getRecords() {
        return getRootElement().getConceptList();
    }
}
