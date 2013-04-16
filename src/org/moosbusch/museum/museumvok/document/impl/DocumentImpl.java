/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.museumvok.document.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.museumvok.document.Document;
import org.moosbusch.museum.museumvok.document.spi.AbstractDocument;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument {

    public DocumentImpl(String language) {
        super(language);
    }

    public DocumentImpl(File f, String language) throws IOException, XmlException {
        super(f, language);
    }

    public DocumentImpl(InputStream in, String language) throws IOException, XmlException {
        super(in, language);
    }

    public DocumentImpl(URL url, String language) throws IOException, XmlException {
        super(url, language);
    }

    @Override
    protected String createLanguage() {
        return Document.DEFAULT_LANGUAGE;
    }


}
