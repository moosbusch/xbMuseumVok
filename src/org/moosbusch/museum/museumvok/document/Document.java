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
package org.moosbusch.museum.museumvok.document;

import noNamespace.ConceptDocument.Concept;
import noNamespace.MuseumvokDocument;
import noNamespace.MuseumvokDocument.Museumvok;
import org.moosbusch.museum.document.XmlDocument;
import org.moosbusch.museum.museumvok.inject.impl.MuseumVokObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends MuseumVokObjectFactory>
    extends XmlDocument<MuseumvokDocument, T, Museumvok, Concept> {

    public static final String MUSEUMVOK_DOCTYPE_NAME = "museumvok";
    public static final String MUSEUMVOK_DOCTYPE_SYSTEM_ID = "museumvok0.2.dtd";

}
