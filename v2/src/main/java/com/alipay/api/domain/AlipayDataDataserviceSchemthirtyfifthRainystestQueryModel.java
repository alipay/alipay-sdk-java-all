package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Schema模型的测试接口35_线上问题复现_N选一
 *
 * @author auto create
 * @since 1.0, 2025-06-20 16:47:28
 */
public class AlipayDataDataserviceSchemthirtyfifthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4533278863174195228L;

	/**
	 * 测试数据
	 */
	@ApiField("demo_ref")
	private RainyComplexTypesTheThirteen demoRef;

	/**
	 * 测试数据，无需关注；
	 */
	@ApiField("demo_str_1")
	private String demoStr1;

	/**
	 * 测试数据，无需关注；
	 */
	@ApiField("demo_str_2")
	private String demoStr2;

	public RainyComplexTypesTheThirteen getDemoRef() {
		return this.demoRef;
	}
	public void setDemoRef(RainyComplexTypesTheThirteen demoRef) {
		this.demoRef = demoRef;
	}

	public String getDemoStr1() {
		return this.demoStr1;
	}
	public void setDemoStr1(String demoStr1) {
		this.demoStr1 = demoStr1;
	}

	public String getDemoStr2() {
		return this.demoStr2;
	}
	public void setDemoStr2(String demoStr2) {
		this.demoStr2 = demoStr2;
	}

}
