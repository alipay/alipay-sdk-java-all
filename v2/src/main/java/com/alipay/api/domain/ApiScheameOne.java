package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2024-12-05 10:17:20
 */
public class ApiScheameOne extends AlipayObject {

	private static final long serialVersionUID = 5335462581374739288L;

	/**
	 * 测试
	 */
	@ApiField("test_a")
	private String testA;

	/**
	 * null
	 */
	@ApiListField("test_b")
	@ApiField("api_scheame_two")
	private List<ApiScheameTwo> testB;

	public String getTestA() {
		return this.testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}

	public List<ApiScheameTwo> getTestB() {
		return this.testB;
	}
	public void setTestB(List<ApiScheameTwo> testB) {
		this.testB = testB;
	}

}
