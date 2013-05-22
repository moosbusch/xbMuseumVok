/*

 *
 */
package org.moosbusch.museum.museumvok.document.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import noNamespace.MuseumvokDocument;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.museumvok.document.spi.AbstractDocument;
import org.moosbusch.museum.museumvok.inject.impl.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument<MuseumVokObjectFactory> {

    public DocumentImpl() {
    }

    public DocumentImpl(InputStream in) throws IOException, XmlException {
        super(in);
    }

    @Override
    protected void addDocumentTypeDefinition(MuseumvokDocument museumVokDocument) {
        museumVokDocument.documentProperties().setDoctypeName(
                MUSEUMVOK_DOCTYPE_NAME);
        museumVokDocument.documentProperties().setDoctypeSystemId(
                MUSEUMVOK_DOCTYPE_SYSTEM_ID);
    }

    @Override
    protected MuseumvokDocument loadDocumentImpl(InputStream in)
            throws IOException, XmlException {
        return MuseumvokDocument.Factory.parse(in);
    }

    @Override
    protected void saveDocumentImpl(MuseumvokDocument museumVokDocument,
            OutputStream out) throws IOException {
        XmlOptions xmlOptions = new XmlOptions();
        xmlOptions.setSavePrettyPrint();
        xmlOptions.setValidateStrict();
        addDocumentTypeDefinition(museumVokDocument);
        museumVokDocument.save(out, xmlOptions);
    }

    @Override
    protected MuseumVokObjectFactory createObjectFactory() {
        return new MuseumVokObjectFactory();
    }
}
