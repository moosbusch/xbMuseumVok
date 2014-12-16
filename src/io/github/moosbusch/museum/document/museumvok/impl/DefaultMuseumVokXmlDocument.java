/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.moosbusch.museum.document.museumvok.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import noNamespace.MuseumvokDocument;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import io.github.moosbusch.museum.document.museumvok.spi.AbstractMuseumVokXmlDocument;

/**
 *
 * @author moosbusch
 */
public class DefaultMuseumVokXmlDocument extends AbstractMuseumVokXmlDocument<DefaultMuseumVokObjectFactory> {

    public DefaultMuseumVokXmlDocument() {
    }

    public DefaultMuseumVokXmlDocument(InputStream in) throws IOException, XmlException {
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
    protected DefaultMuseumVokObjectFactory createObjectFactory() {
        return new DefaultMuseumVokObjectFactory();
    }
}
