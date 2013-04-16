/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.museumvok.document.impl;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import noNamespace.ConceptDocument.Concept;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.museumvok.document.spi.AbstractDocument;
import org.moosbusch.museum.museumvok.util.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument {

    public DocumentImpl() {
    }

    public DocumentImpl(File f) throws IOException, XmlException {
        super(f);
    }

    public DocumentImpl(InputStream in) throws IOException, XmlException {
        super(in);
    }

    public DocumentImpl(URL url) throws IOException, XmlException {
        super(url);
    }

    @Override
    public void loadDocument(InputStream input) throws IOException, XmlException {
        setMuseumVokDocument(
                MuseumVokObjectFactory.getInstance().loadMuseumVokDocument(input));
    }

    @Override
    public void saveDocument(URL url) throws IOException {
        saveDocument(new BufferedOutputStream(
                url.openConnection().getOutputStream()));
    }

    @Override
    public void clearDocument() {
        setMuseumVokDocument(
                MuseumVokObjectFactory.getInstance().createMuseumvokDocument());
    }

    @Override
    public void addConcept(Concept concept) {
        getMuseumVokDocument().getMuseumvok().getConceptList().add(concept);
    }

    @Override
    public void removeConcept(Concept concept) {
        getMuseumVokDocument().getMuseumvok().getConceptList().remove(concept);
    }

    @Override
    public Collection<Concept> getConcepts() {
        return Collections.unmodifiableCollection(
                getMuseumVokDocument().getMuseumvok().getConceptList());
    }
}
