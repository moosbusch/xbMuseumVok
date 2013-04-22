/*

 *
 */
package org.moosbusch.museum.museumvok.document.spi;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import noNamespace.ConceptDocument;
import noNamespace.MuseumvokDocument;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.store.Path;
import org.moosbusch.museum.document.AbstractMuseumXmlDocument;
import org.moosbusch.museum.museumvok.document.Document;
import org.moosbusch.museum.museumvok.util.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument<T extends MuseumVokObjectFactory>
        extends AbstractMuseumXmlDocument<T> implements Document<T> {

    private MuseumvokDocument museumVokDocument;

    public AbstractDocument() {
    }

    public AbstractDocument(InputStream in) throws IOException, XmlException {
        super(in);
    }

    protected final MuseumvokDocument getMuseumVokDocument() {
        return museumVokDocument;
    }

    protected final void setMuseumVokDocument(MuseumvokDocument museumVokDocument) {
        if (museumVokDocument != null) {
            this.museumVokDocument = museumVokDocument;
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public XmlObject getObjectByXPath(String xpath) {
        XmlOptions options = new XmlOptions();
        options.put(Path.PATH_DELEGATE_INTERFACE, PATH_DELEGATE_INTERFACE_CLASS);
        XmlCursor cur = getMuseumVokDocument().getMuseumvok().newCursor();
        cur.selectPath(xpath, options);
        XmlObject result = cur.getObject();
        cur.dispose();

        return result;
    }

    @Override
    public void loadDocument(InputStream input) throws IOException, XmlException {
        setMuseumVokDocument(getObjectFactory().loadMuseumVokDocument(input));
    }

    @Override
    public void saveDocument(OutputStream output) throws IOException {
        getObjectFactory().saveMuseumVokDocument(getMuseumVokDocument(), output);
        output.flush();
        output.close();
    }

    @Override
    public void clearDocument() {
        setMuseumVokDocument(
                new MuseumVokObjectFactory().createMuseumvokDocument());
    }

    @Override
    public void addConcept(ConceptDocument.Concept concept) {
        getMuseumVokDocument().getMuseumvok().getConceptList().add(concept);
    }

    @Override
    public void removeConcept(ConceptDocument.Concept concept) {
        getMuseumVokDocument().getMuseumvok().getConceptList().remove(concept);
    }

    @Override
    public Collection<ConceptDocument.Concept> getConcepts() {
        return Collections.unmodifiableCollection(
                getMuseumVokDocument().getMuseumvok().getConceptList());
    }
}
