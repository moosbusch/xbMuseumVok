/*
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moosbusch.museum.inject.museumvok.impl;

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
import org.moosbusch.museum.document.museumvok.MuseumVokXmlDocument;
import org.moosbusch.museum.document.museumvok.impl.DefaultMuseumVokXmlDocument;
import org.moosbusch.museum.inject.annotation.Language;
import org.moosbusch.museum.inject.museumvok.spi.AbstractMuseumVokModule;

/**
 *
 * @author moosbusch
 */
public class DefaultMuseumVokModule extends AbstractMuseumVokModule {

    @Override
    protected void configureImpl() {
        binder().bind(String.class).annotatedWith(Language.class).toInstance(getLanguage());
    }

    @Provides
    @Override
    public MuseumVokXmlDocument<? extends DefaultMuseumVokObjectFactory> createDocument() {
        return new DefaultMuseumVokXmlDocument();
    }

    @Provides
    @Override
    public CreationDocument createMuseumVokCreationDocument() {
        CreationDocument result = CreationDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Creation createMuseumVokCreation() {
        Creation result = CreationDocument.Creation.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public AltTermDocument createMuseumVokAltTermDocument() {
        AltTermDocument result = AltTermDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public AltTerm createMuseumVokAltTerm() {
        AltTerm result = AltTermDocument.AltTerm.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public PrefTermDocument createMuseumVokPrefTermDocument() {
        PrefTermDocument result = PrefTermDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public PrefTerm createMuseumVokPrefTerm() {
        PrefTerm result = PrefTermDocument.PrefTerm.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NoteDocument createMuseumVokNoteDocument() {
        NoteDocument result = NoteDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Note createMuseumVokNote() {
        Note result = Note.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public TextDocument createMuseumVokTextDocument() {
        TextDocument result = TextDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Text createMuseumVokText() {
        Text result = TextDocument.Text.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EquivConceptDocument createMuseumVokEquivConceptDocument() {
        EquivConceptDocument result = EquivConceptDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EquivConcept createMuseumVokEquivConcept() {
        EquivConcept result = EquivConceptDocument.EquivConcept.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ConceptDocument createMuseumVokConceptDocument() {
        ConceptDocument result = ConceptDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Concept createMuseumVokConcept() {
        Concept result = ConceptDocument.Concept.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RelationshipDocument createMuseumVokRelationshipDocument() {
        RelationshipDocument result = RelationshipDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Relationship createMuseumVokRelationship() {
        Relationship result = Relationship.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EquivRelationshipDocument createMuseumVokEquivRelationshipDocument() {
        EquivRelationshipDocument result = EquivRelationshipDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EquivRelationship createMuseumVokEquivRelationship() {
        EquivRelationship result = EquivRelationship.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public MuseumvokDocument createMuseumVokMuseumvokDocument() {
        MuseumvokDocument result = MuseumvokDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public Museumvok createMuseumVokMuseumvok() {
        Museumvok result = MuseumvokDocument.Museumvok.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NotationDocument createMuseumVokNotationDocument() {
        NotationDocument result = NotationDocument.Factory.newInstance();
        return result;
    }
}
