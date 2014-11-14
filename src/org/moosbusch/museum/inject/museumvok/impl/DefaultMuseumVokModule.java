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
        return CreationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Creation createMuseumVokCreation() {
        return CreationDocument.Creation.Factory.newInstance();
    }

    @Provides
    @Override
    public AltTermDocument createMuseumVokAltTermDocument() {
        return AltTermDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AltTerm createMuseumVokAltTerm() {
        return AltTermDocument.AltTerm.Factory.newInstance();
    }

    @Provides
    @Override
    public PrefTermDocument createMuseumVokPrefTermDocument() {
        return PrefTermDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public PrefTerm createMuseumVokPrefTerm() {
        return PrefTermDocument.PrefTerm.Factory.newInstance();
    }

    @Provides
    @Override
    public NoteDocument createMuseumVokNoteDocument() {
        return NoteDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Note createMuseumVokNote() {
        return Note.Factory.newInstance();
    }

    @Provides
    @Override
    public TextDocument createMuseumVokTextDocument() {
        return TextDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Text createMuseumVokText() {
        return TextDocument.Text.Factory.newInstance();
    }

    @Provides
    @Override
    public EquivConceptDocument createMuseumVokEquivConceptDocument() {
        return EquivConceptDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EquivConcept createMuseumVokEquivConcept() {
        return EquivConceptDocument.EquivConcept.Factory.newInstance();
    }

    @Provides
    @Override
    public ConceptDocument createMuseumVokConceptDocument() {
        return ConceptDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Concept createMuseumVokConcept() {
        return ConceptDocument.Concept.Factory.newInstance();
    }

    @Provides
    @Override
    public RelationshipDocument createMuseumVokRelationshipDocument() {
        return RelationshipDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Relationship createMuseumVokRelationship() {
        return Relationship.Factory.newInstance();
    }

    @Provides
    @Override
    public EquivRelationshipDocument createMuseumVokEquivRelationshipDocument() {
        return EquivRelationshipDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EquivRelationship createMuseumVokEquivRelationship() {
        return EquivRelationship.Factory.newInstance();
    }

    @Provides
    @Override
    public MuseumvokDocument createMuseumVokMuseumvokDocument() {
        return MuseumvokDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Museumvok createMuseumVokMuseumvok() {
        return MuseumvokDocument.Museumvok.Factory.newInstance();
    }

    @Provides
    @Override
    public NotationDocument createMuseumVokNotationDocument() {
        return NotationDocument.Factory.newInstance();
    }

}
