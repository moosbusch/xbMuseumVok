/*

 *
 */
package org.moosbusch.museum.museumvok.inject;

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
import org.moosbusch.museum.inject.XmlModule;

/**
 *
 * @author moosbusch
 */
public interface MuseumVokModule extends XmlModule {

    @Provides
    public CreationDocument createCreationDocument();

    @Provides
    public Creation createCreation();

    @Provides
    public AltTermDocument createAltTermDocument();

    @Provides
    public AltTerm createAltTerm();

    @Provides
    public PrefTermDocument createPrefTermDocument();

    @Provides
    public PrefTerm createPrefTerm();

    @Provides
    public NoteDocument createNoteDocument();

    @Provides
    public Note createNote();

    @Provides
    public TextDocument createTextDocument();

    @Provides
    public Text createText();

    @Provides
    public EquivConceptDocument createEquivConceptDocument();

    @Provides
    public EquivConcept createEquivConcept();

    @Provides
    public ConceptDocument createConceptDocument();

    @Provides
    public Concept createConcept();

    @Provides
    public RelationshipDocument createRelationshipDocument();

    @Provides
    public Relationship createRelationship();

    @Provides
    public EquivRelationshipDocument createEquivRelationshipDocument();

    @Provides
    public EquivRelationship createEquivRelationship();

    @Provides
    public MuseumvokDocument createMuseumvokDocument();

    @Provides
    public Museumvok createMuseumvok();

    @Provides
    public NotationDocument createNotationDocument();

}