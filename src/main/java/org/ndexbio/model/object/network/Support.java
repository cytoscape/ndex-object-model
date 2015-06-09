/**
 *   Copyright (c) 2013, 2015
 *  	The Regents of the University of California
 *  	The Cytoscape Consortium
 *   All rights reserved.
 *
 *   Permission to use, copy, modify, and distribute this software for any
 *   purpose with or without fee is hereby granted, provided that the above
 *   copyright notice and this permission notice appear in all copies.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 *   WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 *   MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 *   ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 *   WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 *   ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 *   OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
package org.ndexbio.model.object.network;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Support extends PropertiedNetworkElement
{

	private String _text;
    private long _citationId;



    /**************************************************************************
    * Default constructor.
    **************************************************************************/
    public Support()
    {
        super();
        _citationId = -1;
        _type = this.getClass().getSimpleName();
    }



    public String getText()
    {
        return _text;
    }

    public void setText(String text)
    {
        _text = text;
    }

	public long getCitationId() {
		return _citationId;
	}

	public void setCitationId(long citationId) {
		this._citationId = citationId;
	}
    
    
}
