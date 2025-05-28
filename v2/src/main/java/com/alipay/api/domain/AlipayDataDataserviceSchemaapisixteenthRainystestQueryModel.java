package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型接口测试16
 *
 * @author auto create
 * @since 1.0, 2025-03-07 18:47:25
 */
public class AlipayDataDataserviceSchemaapisixteenthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2526593338939465471L;

	/**
	 * 匿名复杂类型
	 */
	@ApiField("demo_object")
	private RainysComplexRefThird demoObject;

	/**
	 * 强引用
	 */
	@ApiField("demo_weak")
	private RainyComplexTypesTheEighth demoWeak;

	public RainysComplexRefThird getDemoObject() {
		return this.demoObject;
	}
	public void setDemoObject(RainysComplexRefThird demoObject) {
		this.demoObject = demoObject;
	}

	public RainyComplexTypesTheEighth getDemoWeak() {
		return this.demoWeak;
	}
	public void setDemoWeak(RainyComplexTypesTheEighth demoWeak) {
		this.demoWeak = demoWeak;
	}

}
