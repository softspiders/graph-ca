package org.softspiders.graphs.entity;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class EdgeTest {

	@Test
	public void createByBothNodes() {
		new Edge(new Node(), new Node());
	}

	@Test
	public void creationByBothNodesShouldSetBothNodes() {
		assertNotNull(new Edge(new Node(), new Node()).node1);
		assertNotNull(new Edge(new Node(), new Node()).node2);
	}

	@Test(expected = NullPointerException.class /* no exception expected */)
	public void creationWithFirstNodeNullShouldThrowNPE() {
		new Edge(null, new Node());
	}

	@Test(expected = NullPointerException.class /* no exception expected */)
	public void creationWithSecondNodeNullIdShouldThrowNPE() {
		new Edge(new Node(), null);
	}

	@Test(expected = NullPointerException.class /* no exception expected */)
	public void creationWithBothNodesNullIdShouldThrowNPE() {
		new Edge(null, null);
	}
}