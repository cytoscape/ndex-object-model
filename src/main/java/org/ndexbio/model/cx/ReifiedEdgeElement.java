package org.ndexbio.model.cx;

import org.cxio.core.interfaces.AspectElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ReifiedEdgeElement implements AspectElement {

	final public static String NAME  = "ReifiedEdges";
	
	private String edge;
	private String node;
	
	public ReifiedEdgeElement() {
	}

	public ReifiedEdgeElement(String nodeId, String edgeId) {
		this.edge=edgeId;
		this.node=nodeId;
	}
	
	@Override
	@JsonIgnore
	public String getAspectName() {
		return NAME;
	}

	@Override
	@JsonIgnore
	public long getSum() {
		return 0;
	}

	public String getEdge() {
		return edge;
	}

	public void setEdge(String edge) {
		this.edge = edge;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

}