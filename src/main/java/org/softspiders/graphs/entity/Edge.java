package org.softspiders.graphs.entity;

import java.util.UUID;

public class Edge {
	public UUID nodeId1;
	public UUID nodeId2;

	public Edge(UUID nodeId1, UUID nodeId2) {
		if(nodeId1 == null || nodeId2 == null) {
			throw new NullPointerException();
		}
		this.nodeId1 = nodeId1;
		this.nodeId2 = nodeId2;
	}
}
