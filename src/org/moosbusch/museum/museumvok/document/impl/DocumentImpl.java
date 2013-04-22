/*

 *
 */
package org.moosbusch.museum.museumvok.document.impl;

import java.io.IOException;
import java.io.InputStream;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.museumvok.document.Document;
import org.moosbusch.museum.museumvok.document.spi.AbstractDocument;
import org.moosbusch.museum.museumvok.util.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument<MuseumVokObjectFactory> {

    public DocumentImpl(String language) {
        super(language);
    }

    public DocumentImpl(InputStream in, String language) throws IOException, XmlException {
        super(in, language);
    }

    @Override
    protected String createLanguage() {
        return Document.DEFAULT_LANGUAGE;
    }

    @Override
    protected MuseumVokObjectFactory createObjectFactory() {
        return new MuseumVokObjectFactory();
    }


}
