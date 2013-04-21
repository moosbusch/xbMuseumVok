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
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.museumvok.document.Document;
import org.moosbusch.museum.museumvok.util.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument implements Document {

    private MuseumvokDocument museumVokDocument;
    private final String language;

    public AbstractDocument(String language) {
        this.language = initLanguage();
        init();
    }

    public AbstractDocument(InputStream in, String language) throws IOException, XmlException {
        this.language = initLanguage();
        init(in);
    }

    private void init() {
        clearDocument();
    }

    private void init(InputStream in) throws IOException, XmlException {
        loadDocument(in);
    }

    private String initLanguage() {
        return createLanguage();
    }

    protected abstract String createLanguage();

    protected MuseumvokDocument getMuseumVokDocument() {
        return museumVokDocument;
    }

    protected void setMuseumVokDocument(MuseumvokDocument museumVokDocument) {
        this.museumVokDocument = museumVokDocument;
    }

    @Override
    public void loadDocument(InputStream input) throws IOException, XmlException {
        setMuseumVokDocument(
                new MuseumVokObjectFactory().loadMuseumVokDocument(input));
    }

    @Override
    public void saveDocument(OutputStream output) throws IOException {
        new MuseumVokObjectFactory().saveMuseumVokDocument(
                getMuseumVokDocument(), output);
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

    @Override
    public String getLanguage() {
        return language;
    }

}
