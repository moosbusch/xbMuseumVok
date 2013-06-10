/*

 *
 */
package org.moosbusch.museum.museumvok.inject.impl;

import noNamespace.MuseumvokDocument;
import org.moosbusch.museum.inject.spi.AbstractXmlObjectFactory;
import org.moosbusch.museum.museumvok.inject.MuseumVokModule;

/**
 *
 * @author moosbusch
 */
public class MuseumVokObjectFactory extends AbstractXmlObjectFactory
        <MuseumVokModule, MuseumvokDocument> {

    @Override
    protected MuseumVokModule createModule() {
        return new MuseumVokModuleImpl();
    }

    @Override
    public MuseumvokDocument createRootElement() {
        return createTypedObject(MuseumvokDocument.class);
    }
}
