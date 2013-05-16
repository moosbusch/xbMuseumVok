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
import org.moosbusch.museum.museumvok.inject.annotation.Language;
import org.moosbusch.museum.museumvok.inject.spi.AbstractMuseumVokModule;

/**
 *
 * @author moosbusch
 */
public class MuseumVokModuleImpl extends AbstractMuseumVokModule {

    @Override
    protected void configure() {
        binder().bind(String.class).annotatedWith(Language.class).toInstance(getLanguage());
    }

    @Provides
    @Override
    public Document<? extends MuseumVokObjectFactory> createDocument() {
        return new DocumentImpl();
    }

    @Provides
    public CreationDocument createCreationDocument() {
        CreationDocument result = CreationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public Creation createCreation() {
        Creation result = CreationDocument.Creation.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AltTermDocument createAltTermDocument() {
        AltTermDocument result = AltTermDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public AltTerm createAltTerm() {
        AltTerm result = AltTermDocument.AltTerm.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PrefTermDocument createPrefTermDocument() {
        PrefTermDocument result = PrefTermDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public PrefTerm createPrefTerm() {
        PrefTerm result = PrefTermDocument.PrefTerm.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NoteDocument createNoteDocument() {
        NoteDocument result = NoteDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public Note createNote() {
        Note result = Note.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public TextDocument createTextDocument() {
        TextDocument result = TextDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public Text createText() {
        Text result = TextDocument.Text.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EquivConceptDocument createEquivConceptDocument() {
        EquivConceptDocument result = EquivConceptDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EquivConcept createEquivConcept() {
        EquivConcept result = EquivConceptDocument.EquivConcept.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public ConceptDocument createConceptDocument() {
        ConceptDocument result = ConceptDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public Concept createConcept() {
        Concept result = ConceptDocument.Concept.Factory.newInstance();
        result = injectMembers(result);
//        result.getPrefTermList().add(createPrefTerm());
        return result;
    }

    @Provides
    public RelationshipDocument createRelationshipDocument() {
        RelationshipDocument result = RelationshipDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public Relationship createRelationship() {
        Relationship result = Relationship.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EquivRelationshipDocument createEquivRelationshipDocument() {
        EquivRelationshipDocument result = EquivRelationshipDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public EquivRelationship createEquivRelationship() {
        EquivRelationship result = EquivRelationship.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public MuseumvokDocument createMuseumvokDocument() {
        MuseumvokDocument result = MuseumvokDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public Museumvok createMuseumvok() {
        Museumvok result = MuseumvokDocument.Museumvok.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

    @Provides
    public NotationDocument createNotationDocument() {
        NotationDocument result = NotationDocument.Factory.newInstance();
        result = injectMembers(result);
        return result;
    }

}