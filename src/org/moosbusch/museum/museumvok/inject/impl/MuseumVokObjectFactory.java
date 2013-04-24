/*

 *
 */
package org.moosbusch.museum.museumvok.inject.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import noNamespace.MuseumvokDocument;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory;
import org.moosbusch.museum.museumvok.inject.MuseumVokModule;
import org.moosbusch.museum.museumvok.inject.impl.MuseumVokModuleImpl;

/**
 *
 * @author moosbusch
 */
public class MuseumVokObjectFactory extends AbstractMuseumXmlObjectFactory
        <MuseumVokModule, MuseumvokDocument> {

    public MuseumVokModule getModule() {
        return new MuseumVokModuleImpl();
    }

    @Override
    public MuseumvokDocument createRootElement() {
        return createTypedObject(MuseumvokDocument.class);
    }

    @Override
    public MuseumvokDocument loadDocument(InputStream in)
            throws IOException, XmlException {
        return MuseumvokDocument.Factory.parse(in);
    }

    @Override
    public void saveDocument(MuseumvokDocument museumVokDocument,
            OutputStream out) throws IOException {
        XmlOptions xmlOptions = new XmlOptions();
        xmlOptions.setSavePrettyPrint();
        xmlOptions.setValidateStrict();
        museumVokDocument.save(out, xmlOptions);
    }

}
