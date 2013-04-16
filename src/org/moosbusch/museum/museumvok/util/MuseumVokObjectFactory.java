/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.museumvok.util;

import com.google.inject.Guice;
import com.google.inject.Injector;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import noNamespace.MuseumvokDocument;
import org.apache.xmlbeans.ObjectFactory;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.museumvok.inject.MuseumVokModule;

/**
 *
 * @author moosbusch
 */
public class MuseumVokObjectFactory implements ObjectFactory {

    public static final String CONCEPT_LIST_PROPERTY_NAME =
            "noNamespace.impl.MuseumvokDocumentImpl$MuseumvokImpl.conceptlist";
    public static final String BROADER_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.broaderlist";
    public static final String ALT_TERM_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.alttermlist";
    public static final String DEFINITION_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.definitionlist";
    public static final String DEPICTION_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.depictionlist";
    public static final String EQUIV_RELATIONSHIP_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.equivrelationshiplist";
    public static final String HIDDEN_LABEL_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.hiddenlabellist";
    public static final String BROADERLIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.memberofcollectionlist";
    public static final String NARROWER_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.narrowerlist";
    public static final String MODIFIED_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.modifiedlist";
    public static final String NOTE_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.notelist";
    public static final String PREF_TERM_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.preftermlist";
    public static final String RELATIONSHIP_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.relationshiplist";
    public static final String SUBJECT_INDICATOR_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.subjectindicatorlist";
    public static final String USE_FOR_LIST_PROPERTY_NAME =
            "noNamespace.impl.ConceptDocumentImpl$ConceptImpl.useforlist";

    protected MuseumVokObjectFactory() {
    }

    public static MuseumVokObjectFactory getInstance() {
        return MuseumVokFactoryHolder.INSTANCE;
    }

    private Injector createMuseumVokInjector() {
        return Guice.createInjector(new MuseumVokModule());
    }

    @SuppressWarnings("unchecked")
    public <T> T createMuseumVokObject(Class<?> type) {
        return (T) createMuseumVokInjector().getInstance(type);
    }

    public MuseumvokDocument createMuseumvokDocument() {
        return createMuseumVokObject(MuseumvokDocument.class);
    }

    public MuseumvokDocument loadMuseumVokDocument(InputStream in)
            throws IOException, XmlException {
        return MuseumvokDocument.Factory.parse(in);
    }

    public void saveMuseumVokDocument(MuseumvokDocument museumVokDocument,
            OutputStream out) throws IOException {
        XmlOptions xmlOptions = new XmlOptions();
        xmlOptions.setSavePrettyPrint();
        xmlOptions.setValidateStrict();
        museumVokDocument.save(out, xmlOptions);
    }

    @Override
    public Object createObject(Class type) {
        return createMuseumVokObject(type);
    }

    private static class MuseumVokFactoryHolder {

        private static final MuseumVokObjectFactory INSTANCE = new MuseumVokObjectFactory();
    }
}
