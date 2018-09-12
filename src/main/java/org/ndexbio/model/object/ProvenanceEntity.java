/**
 * Copyright (c) 2013, 2016, The Regents of the University of California, The Cytoscape Consortium
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package org.ndexbio.model.object;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.ndexbio.model.object.network.NetworkSummary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
public class ProvenanceEntity implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<SimplePropertyValuePair> _properties;
	private ProvenanceEvent _creationEvent;
	private String _uri;

	public ProvenanceEntity () {
        _properties = new ArrayList<>();
	} 

	public ProvenanceEntity(NetworkSummary networkSummary, String hostURI) {
		_uri = hostURI + "/network/" + networkSummary.getExternalId();
		_properties = new ArrayList<>();
	}

	public List<SimplePropertyValuePair> getProperties() {
		return _properties;
	}

	public void setProperties(List<SimplePropertyValuePair> properties) {
		this._properties = properties;
	}

	public ProvenanceEvent getCreationEvent() {
		return _creationEvent;
	}

	public void setCreationEvent(ProvenanceEvent creationEvent) {
		this._creationEvent = creationEvent;
	}

	public String getUri() {
		return _uri;
	}

	public void setUri(String uri) {
		this._uri = uri;
	}
	
	public void addProperty ( String name, String value) { 
		_properties.add(new SimplePropertyValuePair (name,value));
	}
}
