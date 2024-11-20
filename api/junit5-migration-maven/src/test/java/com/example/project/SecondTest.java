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

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Allure;

class SecondTest {

	@Test
	@Disabled
	void mySecondTest() {
        Allure.getLifecycle().updateTestCase(tr -> tr.getLabels().removeIf(label -> "suite".equals(label.getName())));

		Allure.label("parentSuite", "API");
        Allure.suite("mySecondTest");
        Allure.label("subSuite", "mySecondTest");
		assertEquals(2, 1, "2 is not equal to 1");
	}

	@Test
	@Tag("slow")
	void aSlowTest() throws InterruptedException {
        Allure.getLifecycle().updateTestCase(tr -> tr.getLabels().removeIf(label -> "suite".equals(label.getName())));

		Allure.label("parentSuite", "API");
        Allure.suite("mySecondTest");
        Allure.label("subSuite", "aSlowTest");
		Thread.sleep(1000);
	}
}
