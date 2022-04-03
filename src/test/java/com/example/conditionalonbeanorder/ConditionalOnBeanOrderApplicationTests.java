package com.example.conditionalonbeanorder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ConditionalOnBeanOrderApplicationTests {

	@Test
	void contextLoads(ApplicationContext context) {
		assertThat(context.containsBean("beanB")).isTrue();
		// You'd expect beanA to be created when beanB exists.
		// This only happens if beanB is declared first in the configuration class.
		assertThat(context.containsBean("beanA")).isTrue();
	}

}
