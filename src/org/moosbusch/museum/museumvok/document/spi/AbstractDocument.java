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
import org.apache.xmlbeans.XmlObject;
import org.moosbusch.museum.museumvok.document.Document;
import org.moosbusch.museum.museumvok.util.MuseumVokObjectFactory;
import org.mvel2.MVEL;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument<T extends MuseumVokObjectFactory>
    implements Document<T> {

    private MuseumvokDocument museumVokDocument;
    private final String language;
    private final T objectFactory;

    public AbstractDocument(String language) {
        this.language = initLanguage();
        this.objectFactory = initObjectFactory();
        init();
    }

    public AbstractDocument(InputStream in, String language) throws IOException, XmlException {
        this.language = initLanguage();
        this.objectFactory = initObjectFactory();
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

    private T initObjectFactory() {
        return createObjectFactory();
    }

    protected abstract T createObjectFactory();

    protected abstract String createLanguage();

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
    public Object getMuseumVokObject(String expression) {
        
//        return MVEL.eval(expression, getMuseumVokDocument());
//        return getMuseumVokDocument().selectChildren("", expression);
//        Object result = getEngine().createExpression(expression).evaluate(getExpressionContext());
//
//        if (result != null) {
//            return (T) result;
//        }

//        return null;
    }

    @Override
    public T getObjectFactory() {
        return objectFactory;
    }

    @Override
    public void loadDocument(InputStream input) throws IOException, XmlException {
        setMuseumVokDocument(getObjectFactory().loadMuseumVokDocument(input));
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
