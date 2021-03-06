package org.wikidata.wdtk.dumpfiles;

/*
 * #%L
 * Wikidata Toolkit Dump File Handling
 * %%
 * Copyright (C) 2014 Wikidata Toolkit Developers
 * %%
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
 * #L%
 */

import org.wikidata.wdtk.datamodel.interfaces.EntityDocument;
import org.wikidata.wdtk.datamodel.interfaces.ItemDocument;
import org.wikidata.wdtk.datamodel.interfaces.PropertyDocument;

/**
 * Interface for classes that are able to process {@link EntityDocument} objects
 * in some way. Classes that implement this can subscribe to receive entity
 * documents as obtained, e.g., from parsing dump files.
 * 
 * @author Markus Kroetzsch
 * 
 */
public interface EntityDocumentProcessor {

	/**
	 * Processes the given ItemDocument.
	 * 
	 * @param itemDocument
	 *            the ItemDocument
	 */
	public void processItemDocument(ItemDocument itemDocument);

	/**
	 * Processes the given PropertyDocument.
	 * 
	 * @param propertyDocument
	 *            the PropertyDocument
	 */
	public void processPropertyDocument(PropertyDocument propertyDocument);

	/**
	 * Performs final actions that should be done after all entity documents in
	 * a batch of entity documents have been processed. This is usually called
	 * after a whole dumpfile was completely processed.
	 */
	public void finishProcessingEntityDocuments();

}
