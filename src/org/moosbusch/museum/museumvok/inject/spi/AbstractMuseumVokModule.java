/*
 * 
 *
 */
package org.moosbusch.museum.museumvok.inject.spi;

import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;
import org.moosbusch.museum.museumvok.inject.MuseumVokModule;
import org.moosbusch.museum.museumvok.inject.impl.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractMuseumVokModule extends AbstractMuseumXmlModule
    implements MuseumVokModule {

    public AbstractMuseumVokModule(MuseumVokObjectFactory objFactory) {
        super(objFactory);
    }

    @Override
    protected String createLanguage() {
        return MuseumXmlDocument.DEFAULT_LANGUAGE;
    }

    @Override
    public MuseumVokObjectFactory getObjectFactory() {
        return (MuseumVokObjectFactory) super.getObjectFactory();
    }
}
