package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Schema模型的测试接口17
 *
 * @author auto create
 * @since 1.0, 2025-08-18 23:02:18
 */
public class AlipayDataDataserviceSchemaapseventeenthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7691453334326219256L;

	/**
	 * 匿名复杂类型
	 */
	@ApiField("demo_ref")
	private RainysComplexRefFirst demoRef;

	/**
	 * 弱引用
	 */
	@ApiField("demo_weak_ref")
	private RainysComplexRefSecond demoWeakRef;

	public RainysComplexRefFirst getDemoRef() {
		return this.demoRef;
	}
	public void setDemoRef(RainysComplexRefFirst demoRef) {
		this.demoRef = demoRef;
	}

	public RainysComplexRefSecond getDemoWeakRef() {
		return this.demoWeakRef;
	}
	public void setDemoWeakRef(RainysComplexRefSecond demoWeakRef) {
		this.demoWeakRef = demoWeakRef;
	}

}
