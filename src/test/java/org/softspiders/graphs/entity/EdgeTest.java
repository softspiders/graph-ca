package org.softspiders.graphs.entity;

import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class EdgeTest {

	@Test
	public void createByIdsOfTwoNodes() {
		new Edge(UUID.randomUUID(), UUID.randomUUID());
	}

	@Test
	public void creationByIdShouldSetFirstNodeId() {
		assertNotNull(new Edge(UUID.randomUUID(), UUID.randomUUID()).nodeId1);
	}

	@Test
	public void creationByIdShouldSetSecondNodeId() {
		assertNotNull(new Edge(UUID.randomUUID(), UUID.randomUUID()).nodeId2);
	}

	@Test(expected = NullPointerException.class /* no exception expected */)
	public void creationWithFirstIdNullIdShouldThrowNPE() {
		new Edge(null, UUID.randomUUID());
	}

	@Test(expected = NullPointerException.class /* no exception expected */)
	public void creationWithSecondIdNullIdShouldThrowNPE() {
		new Edge(UUID.randomUUID(), null);
	}

	@Test(expected = NullPointerException.class /* no exception expected */)
	public void creationWithBothIdsNullIdShouldThrowNPE() {
		new Edge(null, null);
	}
}