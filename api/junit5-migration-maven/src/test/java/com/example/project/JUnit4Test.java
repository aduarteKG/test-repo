/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import io.qameta.allure.Allure;

public class JUnit4Test {

	@Test
	public void test() {
        Allure.getLifecycle().updateTestCase(tr -> tr.getLabels().removeIf(label -> "suite".equals(label.getName())));

        Allure.label("parentSuite", "API");
        Allure.suite("JUnit4Test");
        Allure.label("subSuite", "test");

		assertEquals(3, 1 + 2);
	}
}
