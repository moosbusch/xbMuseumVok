/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.museumvok.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;
import noNamespace.AltLabelDocument;
import noNamespace.AltLabelDocument.AltLabel;
import noNamespace.AltTermDocument;
import noNamespace.AltTermDocument.AltTerm;
import noNamespace.BroaderDocument;
import noNamespace.ConceptDocument;
import noNamespace.ConceptDocument.Concept;
import noNamespace.ConceptDocument.Concept.EquivRelationship;
import noNamespace.ConceptDocument.Concept.Note;
import noNamespace.ConceptDocument.Concept.Relationship;
import noNamespace.CreationDocument;
import noNamespace.CreationDocument.Creation;
import noNamespace.CreatorDocument;
import noNamespace.DefinitionDocument;
import noNamespace.DepictionDocument;
import noNamespace.EquivConceptDocument;
import noNamespace.EquivConceptDocument.EquivConcept;
import noNamespace.EquivRelationshipDocument;
import noNamespace.HiddenLabelDocument;
import noNamespace.MemberOfCollectionDocument;
import noNamespace.ModifiedDocument;
import noNamespace.MuseumvokDocument;
import noNamespace.MuseumvokDocument.Museumvok;
import noNamespace.NarrowerDocument;
import noNamespace.NoteDocument;
import noNamespace.PrefLabelDocument;
import noNamespace.PrefLabelDocument.PrefLabel;
import noNamespace.PrefTermDocument;
import noNamespace.PrefTermDocument.PrefTerm;
import noNamespace.RelationshipDocument;
import noNamespace.SubjectIndicatorDocument;
import noNamespace.TextDocument;
import noNamespace.TextDocument.Text;
import noNamespace.UseForDocument;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.xb.xsdschema.NotationDocument;
import org.moosbusch.museum.museumvok.document.Document;
import org.moosbusch.museum.museumvok.document.impl.DocumentImpl;

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
    }

//    @Provides
//    public MuseumVokObjectFactory getObjectFactory() {
//        return MuseumVokObjectFactory.getInstance();
//    }

    @Provides
    public Document createDocument() {
        return new DocumentImpl();
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
    public noNamespace.ConceptDocument.Concept.AltTerm createConceptAltTerm() {
        noNamespace.ConceptDocument.Concept.AltTerm result =
                ConceptDocument.Concept.AltTerm.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public AltLabelDocument createAltLabelDocument() {
        AltLabelDocument result = AltLabelDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public AltLabel createAltLabel() {
        AltLabel result = AltLabelDocument.AltLabel.Factory.newInstance();
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
    public PrefLabelDocument createPrefLabelDocument() {
        PrefLabelDocument result = PrefLabelDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public PrefLabel createPrefLabel() {
        PrefLabel result = PrefLabelDocument.PrefLabel.Factory.newInstance();
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
    public CreatorDocument createCreatorDocument() {
        CreatorDocument result = CreatorDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public BroaderDocument createBroaderDocument() {
        BroaderDocument result = BroaderDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NarrowerDocument createNarrowerDocument() {
        NarrowerDocument result = NarrowerDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NotationDocument createNotationDocument() {
        NotationDocument result = NotationDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ModifiedDocument createModifiedDocument() {
        ModifiedDocument result = ModifiedDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DepictionDocument createDepictionDocument() {
        DepictionDocument result = DepictionDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DefinitionDocument createDefinitionDocument() {
        DefinitionDocument result = DefinitionDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public HiddenLabelDocument createHiddenLabelDocument() {
        HiddenLabelDocument result = HiddenLabelDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public MemberOfCollectionDocument createMemberOfCollectionDocument() {
        MemberOfCollectionDocument result = MemberOfCollectionDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public UseForDocument createUseForDocument() {
        UseForDocument result = UseForDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SubjectIndicatorDocument createSubjectIndicatorDocument() {
        SubjectIndicatorDocument result = SubjectIndicatorDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

}