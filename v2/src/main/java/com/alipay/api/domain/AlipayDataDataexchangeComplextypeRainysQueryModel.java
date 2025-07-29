package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 复杂类型接口引用01
 *
 * @author auto create
 * @since 1.0, 2024-09-09 14:41:17
 */
public class AlipayDataDataexchangeComplextypeRainysQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6893122629954592345L;

	/**
	 * 引用当前迭代；
	 */
	@ApiField("references_test_a")
	private RainyComplexTypesTheFirst referencesTestA;

	/**
	 * 引用不同迭代的复杂类型；
	 */
	@ApiField("references_test_b")
	private RainyComplexTypesTheSecond referencesTestB;

	public RainyComplexTypesTheFirst getReferencesTestA() {
		return this.referencesTestA;
	}
	public void setReferencesTestA(RainyComplexTypesTheFirst referencesTestA) {
		this.referencesTestA = referencesTestA;
	}

	public RainyComplexTypesTheSecond getReferencesTestB() {
		return this.referencesTestB;
	}
	public void setReferencesTestB(RainyComplexTypesTheSecond referencesTestB) {
		this.referencesTestB = referencesTestB;
	}

}
