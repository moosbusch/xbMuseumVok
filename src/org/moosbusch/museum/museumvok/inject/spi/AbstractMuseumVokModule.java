/*
 *
 *
 */
package org.moosbusch.museum.museumvok.inject.spi;

import org.moosbusch.museum.document.XmlDocument;
import org.moosbusch.museum.inject.spi.AbstractXmlModule;
import org.moosbusch.museum.museumvok.inject.MuseumVokModule;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractMuseumVokModule extends AbstractXmlModule
    implements MuseumVokModule {

    @Override
    protected String createLanguage() {
        return XmlDocument.DEFAULT_LANGUAGE;
    }

}
