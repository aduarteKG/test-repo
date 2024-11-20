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

import org.junit.jupiter.api.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Allure;

class OtherTests {

	@Test
	void testThisThing() {
        Allure.getLifecycle().updateTestCase(tr -> tr.getLabels().removeIf(label -> "suite".equals(label.getName())));

		Allure.label("parentSuite", "API");
        Allure.suite("OtherTests");
        Allure.label("subSuite", "testThisThing");
	}

	@Test
	void testThisOtherThing() {
        Allure.getLifecycle().updateTestCase(tr -> tr.getLabels().removeIf(label -> "suite".equals(label.getName())));

		Allure.label("parentSuite", "API");
        Allure.suite("OtherTests");
        Allure.label("subSuite", "testThisOtherThing");
	}

}
