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
package io.github.moosbusch.museum.inject.museumvok;

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
import io.github.moosbusch.museum.inject.MuseumXmlModule;

/**
 *
 * @author moosbusch
 */
public interface MuseumVokModule extends MuseumXmlModule {

    public CreationDocument createMuseumVokCreationDocument();

    public Creation createMuseumVokCreation();

    public AltTermDocument createMuseumVokAltTermDocument();

    public AltTerm createMuseumVokAltTerm();

    public PrefTermDocument createMuseumVokPrefTermDocument();

    public PrefTerm createMuseumVokPrefTerm();

    public NoteDocument createMuseumVokNoteDocument();

    public Note createMuseumVokNote();

    public TextDocument createMuseumVokTextDocument();

    public Text createMuseumVokText();

    public EquivConceptDocument createMuseumVokEquivConceptDocument();

    public EquivConcept createMuseumVokEquivConcept();

    public ConceptDocument createMuseumVokConceptDocument();

    public Concept createMuseumVokConcept();

    public RelationshipDocument createMuseumVokRelationshipDocument();

    public Relationship createMuseumVokRelationship();

    public EquivRelationshipDocument createMuseumVokEquivRelationshipDocument();

    public EquivRelationship createMuseumVokEquivRelationship();

    public MuseumvokDocument createMuseumVokMuseumvokDocument();

    public Museumvok createMuseumVokMuseumvok();

    public NotationDocument createMuseumVokNotationDocument();

}