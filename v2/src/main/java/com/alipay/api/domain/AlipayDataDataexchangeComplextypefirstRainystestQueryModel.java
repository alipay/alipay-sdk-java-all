package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试校验复杂类型01
 *
 * @author auto create
 * @since 1.0, 2024-12-02 20:47:11
 */
public class AlipayDataDataexchangeComplextypefirstRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5261964868529121424L;

	/**
	 * 引用复杂类型
	 */
	@ApiField("complex_type_01")
	private RainyComplexTypesRefWeakFirst complexType01;

	/**
	 * 引用已有的复杂类型
	 */
	@ApiField("complex_type_02")
	private RainyComplexTypesTheFirst complexType02;

	public RainyComplexTypesRefWeakFirst getComplexType01() {
		return this.complexType01;
	}
	public void setComplexType01(RainyComplexTypesRefWeakFirst complexType01) {
		this.complexType01 = complexType01;
	}

	public RainyComplexTypesTheFirst getComplexType02() {
		return this.complexType02;
	}
	public void setComplexType02(RainyComplexTypesTheFirst complexType02) {
		this.complexType02 = complexType02;
	}

}
