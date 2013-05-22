/*

 *
 */
package org.moosbusch.museum.museumvok.inject.impl;

import noNamespace.MuseumvokDocument;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory;
import org.moosbusch.museum.museumvok.inject.MuseumVokModule;

/**
 *
 * @author moosbusch
 */
public class MuseumVokObjectFactory extends AbstractMuseumXmlObjectFactory
        <MuseumVokModule, MuseumvokDocument> {

    @Override
    protected MuseumVokModule createModule() {
        return new MuseumVokModuleImpl(this);
    }

    @Override
    public MuseumvokDocument createRootElement() {
        return createTypedObject(MuseumvokDocument.class);
    }
}
