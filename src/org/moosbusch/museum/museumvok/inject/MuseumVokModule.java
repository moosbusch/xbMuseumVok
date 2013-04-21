/*

 *
 */
package org.moosbusch.museum.museumvok.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;
import java.util.Locale;
import noNamespace.AltTermDocument;
import noNamespace.AltTermDocument.AltTerm;
import noNamespace.ConceptDocument;
import noNamespace.ConceptDocument.Concept;
import noNamespace.CreationDocument;
import noNamespace.CreationDocument.Creation;
import noNamespace.EquivConceptDocument;
import noNamespace.EquivConceptDocument.EquivConcept;
import noNamespace.EquivRelationshipDocument;
import noNamespace.EquivRelationshipDocument.EquivRelationship;
import noNamespace.MuseumvokDocument;
import noNamespace.MuseumvokDocument.Museumvok;
import noNamespace.NoteDocument;
import noNamespace.NoteDocument.Note;
import noNamespace.PrefTermDocument;
import noNamespace.PrefTermDocument.PrefTerm;
import noNamespace.RelationshipDocument;
import noNamespace.RelationshipDocument.Relationship;
import noNamespace.TextDocument;
import noNamespace.TextDocument.Text;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument;
import org.moosbusch.museum.museumvok.document.Document;
import org.moosbusch.museum.museumvok.document.impl.DocumentImpl;
import org.moosbusch.museum.museumvok.inject.annotation.Language;

/**
 *
 * @author moosbusch
 */
public class MuseumVokModule extends AbstractModule {

    private Injector defaultInjector;

    protected final Injector getDefaultInjector() {
        synchronized (this) {
            if (defaultInjector == null) {
                defaultInjector = Guice.createInjector(this);
            }

            return defaultInjector;
        }
    }

    protected final <T extends XmlObject> T entityCreated(T entity) {
        getDefaultInjector().injectMembers(entity);
        return entityCreatedImpl(entity);
    }

    protected <T extends XmlObject> T entityCreatedImpl(T entity) {
        return entity;
    }

    @Override
    protected void configure() {
        binder().bind(String.class).annotatedWith(Language.class).toInstance(Document.DEFAULT_LANGUAGE);
    }

    @Provides
    public CreationDocument createCreationDocument() {
        CreationDocument result = CreationDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Creation createCreation() {
        Creation result = CreationDocument.Creation.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public AltTermDocument createAltTermDocument() {
        AltTermDocument result = AltTermDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public AltTerm createAltTerm() {
        AltTerm result = AltTermDocument.AltTerm.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public PrefTermDocument createPrefTermDocument() {
        PrefTermDocument result = PrefTermDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public PrefTerm createPrefTerm() {
        PrefTerm result = PrefTermDocument.PrefTerm.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NoteDocument createNoteDocument() {
        NoteDocument result = NoteDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Note createNote() {
        Note result = Note.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TextDocument createTextDocument() {
        TextDocument result = TextDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Text createText() {
        Text result = TextDocument.Text.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public EquivConceptDocument createEquivConceptDocument() {
        EquivConceptDocument result = EquivConceptDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public EquivConcept createEquivConcept() {
        EquivConcept result = EquivConceptDocument.EquivConcept.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ConceptDocument createConceptDocument() {
        ConceptDocument result = ConceptDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Concept createConcept() {
        Concept result = ConceptDocument.Concept.Factory.newInstance();
        result = entityCreated(result);
        result.getPrefTermList().add(createPrefTerm());
        return result;
    }

    @Provides
    public RelationshipDocument createRelationshipDocument() {
        RelationshipDocument result = RelationshipDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Relationship createRelationship() {
        Relationship result = Relationship.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public EquivRelationshipDocument createEquivRelationshipDocument() {
        EquivRelationshipDocument result = EquivRelationshipDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public EquivRelationship createEquivRelationship() {
        EquivRelationship result = EquivRelationship.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public MuseumvokDocument createMuseumvokDocument() {
        MuseumvokDocument result = MuseumvokDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Museumvok createMuseumvok() {
        Museumvok result = MuseumvokDocument.Museumvok.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NotationDocument createNotationDocument() {
        NotationDocument result = NotationDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

}