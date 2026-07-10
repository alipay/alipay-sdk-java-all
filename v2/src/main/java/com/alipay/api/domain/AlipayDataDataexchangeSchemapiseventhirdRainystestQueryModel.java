package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Schema模型的测试openapi接口0703
 *
 * @author auto create
 * @since 1.0, 2026-07-06 10:37:57
 */
public class AlipayDataDataexchangeSchemapiseventhirdRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6866255638379672711L;

	/**
	 * 测试数据
	 */
	@ApiField("demo_ref")
	private RainyComplexTypesTheten demoRef;

	public RainyComplexTypesTheten getDemoRef() {
		return this.demoRef;
	}
	public void setDemoRef(RainyComplexTypesTheten demoRef) {
		this.demoRef = demoRef;
	}

}
