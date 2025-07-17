package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 复杂类型接口引用05_老流程
 *
 * @author auto create
 * @since 1.0, 2024-12-11 19:28:33
 */
public class AlipayDataDataserviceComplextestthirdRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3312516693285788767L;

	/**
	 * 不同迭代的复杂类型
	 */
	@ApiField("complex_type")
	private RainyComplexTypesTheFourth complexType;

	public RainyComplexTypesTheFourth getComplexType() {
		return this.complexType;
	}
	public void setComplexType(RainyComplexTypesTheFourth complexType) {
		this.complexType = complexType;
	}

}
