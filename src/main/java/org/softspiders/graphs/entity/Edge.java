package org.softspiders.graphs.entity;

import java.util.UUID;

public class Edge {
	public Node node1;
	public Node node2;

	public Edge(Node node1, Node node2) {
		if(node1 == null || node2 == null) {
			throw new NullPointerException();
		}
		this.node1 = node1;
		this.node2 = node2;
	}
}
