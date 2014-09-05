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
package org.moosbusch.museum.document.museumvok.spi;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import noNamespace.ConceptDocument.Concept;
import noNamespace.MuseumvokDocument;
import noNamespace.MuseumvokDocument.Museumvok;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import org.moosbusch.museum.document.museumvok.MuseumVokXmlDocument;
import org.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import org.moosbusch.museum.inject.museumvok.impl.DefaultMuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractMuseumVokXmlDocument<T extends DefaultMuseumVokObjectFactory>
        extends AbstractMuseumXmlDocument<MuseumvokDocument, T, Museumvok, Concept>
        implements MuseumVokXmlDocument<T> {

    public AbstractMuseumVokXmlDocument() {
    }

    public AbstractMuseumVokXmlDocument(InputStream in) throws IOException, XmlException {
        super(in);
    }

    protected abstract void addDocumentTypeDefinition(MuseumvokDocument museumVokDocument);

    @Override
    public Museumvok getRootElement() {
        return getRootWrapperElement().getMuseumvok();
    }

    @Override
    public Collection<Concept> getRecords() {
        return getRootElement().getConceptList();
    }
}
