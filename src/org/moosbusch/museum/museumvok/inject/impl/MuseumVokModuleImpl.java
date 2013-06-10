/*

 *
 */
package org.moosbusch.museum.museumvok.inject.impl;

import com.google.inject.Provides;
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
import org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument;
import org.moosbusch.museum.museumvok.document.Document;
import org.moosbusch.museum.museumvok.document.impl.DocumentImpl;
import org.moosbusch.museum.inject.annotation.Language;
import org.moosbusch.museum.museumvok.inject.spi.AbstractMuseumVokModule;

/**
 *
 * @author moosbusch
 */
public class MuseumVokModuleImpl extends AbstractMuseumVokModule {

    @Override
    protected void configureImpl() {
        binder().bind(String.class).annotatedWith(Language.class).toInstance(getLanguage());
    }

    @Provides
    @Override
    public Document<? extends MuseumVokObjectFactory> createDocument() {
        return new DocumentImpl();
    }

    @Provides
    @Override
    public CreationDocument createCreationDocument() {
        CreationDocument result = CreationDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Creation createCreation() {
        Creation result = CreationDocument.Creation.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public AltTermDocument createAltTermDocument() {
        AltTermDocument result = AltTermDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public AltTerm createAltTerm() {
        AltTerm result = AltTermDocument.AltTerm.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public PrefTermDocument createPrefTermDocument() {
        PrefTermDocument result = PrefTermDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public PrefTerm createPrefTerm() {
        PrefTerm result = PrefTermDocument.PrefTerm.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NoteDocument createNoteDocument() {
        NoteDocument result = NoteDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Note createNote() {
        Note result = Note.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public TextDocument createTextDocument() {
        TextDocument result = TextDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Text createText() {
        Text result = TextDocument.Text.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EquivConceptDocument createEquivConceptDocument() {
        EquivConceptDocument result = EquivConceptDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EquivConcept createEquivConcept() {
        EquivConcept result = EquivConceptDocument.EquivConcept.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ConceptDocument createConceptDocument() {
        ConceptDocument result = ConceptDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Concept createConcept() {
        Concept result = ConceptDocument.Concept.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RelationshipDocument createRelationshipDocument() {
        RelationshipDocument result = RelationshipDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Relationship createRelationship() {
        Relationship result = Relationship.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EquivRelationshipDocument createEquivRelationshipDocument() {
        EquivRelationshipDocument result = EquivRelationshipDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EquivRelationship createEquivRelationship() {
        EquivRelationship result = EquivRelationship.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public MuseumvokDocument createMuseumvokDocument() {
        MuseumvokDocument result = MuseumvokDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Museumvok createMuseumvok() {
        Museumvok result = MuseumvokDocument.Museumvok.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NotationDocument createNotationDocument() {
        NotationDocument result = NotationDocument.Factory.newInstance();
        return result;
    }
}