package org.wikidata.wdtk.util;

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

import java.io.IOException;
import java.io.InputStream;

/**
 * Interface to access files on the Web. Mock implementations can be used for
 * testing without Web access.
 * 
 * @author Markus Kroetzsch
 * 
 */
public interface WebResourceFetcher {

	/**
	 * Returns a BufferedReader for the document at the given URL. The reader
	 * should be closed after use. The bytes found at the given URL will be
	 * interpreted as UTF-8 for this operation.
	 * 
	 * @param urlString
	 *            the URL of the document
	 * @return BufferedReader for the requested document
	 * @throws IOException
	 *             if the document at the URL could not be opended or the URL
	 *             was invalid
	 */
	// BufferedReader getBufferedReaderForUrl(String urlString) throws
	// IOException;

	/**
	 * Returns a BufferedReader for the Gzip-compressed document at the given
	 * URL. The reader should be closed after use. The bytes found in the
	 * gzipped file at the given URL will be interpreted as UTF-8 for this
	 * operation.
	 * 
	 * @param urlString
	 *            the URL of the gzipped document
	 * @return BufferedReader for the requested document
	 * @throws IOException
	 *             if the document at the URL could not be opended or the URL
	 *             was invalid
	 */
	// BufferedReader getBufferedReaderForGzipUrl(String urlString)
	// throws IOException;

	/**
	 * Returns an InputStream for the document at the given URL. This can be
	 * used for downloading. The stream should be closed after use.
	 * 
	 * @param urlString
	 *            the URL of the document
	 * @return InputStream for the requested document
	 * @throws IOException
	 *             if the document at the URL could not be opened or the URL was
	 *             invalid
	 */
	InputStream getInputStreamForUrl(String urlString) throws IOException;

	/**
	 * Returns an InputStream for the Gzip-compressed document at the given URL.
	 * This can be used for downloading. The stream should be closed after use.
	 * 
	 * @param urlString
	 *            the URL of the document
	 * @return InputStream for the requested document
	 * @throws IOException
	 *             if the document at the URL could not be opened or the URL was
	 *             invalid
	 */
	InputStream getInputStreamForGzipUrl(String urlString) throws IOException;

}