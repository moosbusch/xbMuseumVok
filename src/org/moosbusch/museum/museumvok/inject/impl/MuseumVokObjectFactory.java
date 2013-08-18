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
package org.moosbusch.museum.museumvok.inject.impl;

import noNamespace.MuseumvokDocument;
import org.moosbusch.museum.inject.spi.AbstractXmlObjectFactory;
import org.moosbusch.museum.museumvok.inject.MuseumVokModule;

/**
 *
 * @author moosbusch
 */
public class MuseumVokObjectFactory extends AbstractXmlObjectFactory
        <MuseumVokModule, MuseumvokDocument> {

    @Override
    protected MuseumVokModule createModule() {
        return new MuseumVokModuleImpl();
    }

    @Override
    public MuseumvokDocument createRootElement() {
        return createTypedObject(MuseumvokDocument.class);
    }
}
