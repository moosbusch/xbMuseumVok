/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.museumvok.document.spi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
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

    public AbstractDocument() {
        init();
    }

    public AbstractDocument(File f) throws IOException, XmlException {
        init(f);
    }

    public AbstractDocument(InputStream in) throws IOException, XmlException {
        init(in);
    }

    public AbstractDocument(URL url) throws IOException, XmlException {
        init(url);
    }

    private void init() {
        clearDocument();
    }

    private void init(File f) throws IOException, XmlException {
        loadDocument(f);
    }

    private void init(InputStream in) throws IOException, XmlException {
        loadDocument(in);
    }

    private void init(URL url) throws IOException, XmlException {
        loadDocument(url);
    }

    protected MuseumvokDocument getMuseumVokDocument() {
        return museumVokDocument;
    }

    protected void setMuseumVokDocument(MuseumvokDocument museumVokDocument) {
        this.museumVokDocument = museumVokDocument;
    }

    @Override
    public void loadDocument(File file) throws IOException, XmlException {
        loadDocument(new BufferedInputStream(new FileInputStream(file)));
    }

    @Override
    public void loadDocument(URL url) throws IOException, XmlException {
        loadDocument(new BufferedInputStream(url.openStream()));
    }

    @Override
    public void saveDocument(File file) throws IOException {
        saveDocument(new BufferedOutputStream(new FileOutputStream(file)));
    }

    @Override
    public void saveDocument(OutputStream output) throws IOException {
        MuseumVokObjectFactory.getInstance().saveMuseumVokDocument(
                getMuseumVokDocument(), output);
        output.flush();
        output.close();
    }

}
