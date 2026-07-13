package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Rainys模型接口创建测试01对照
 *
 * @author auto create
 * @since 1.0, 2026-07-06 11:23:07
 */
public class AlipayDataDataserviceOnlinetestRainysQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5768124826938985417L;

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
