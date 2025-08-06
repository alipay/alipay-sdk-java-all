package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Schema模型的测试接口19
 *
 * @author auto create
 * @since 1.0, 2025-03-07 19:52:24
 */
public class AlipayDataDataserviceSchemaapininteenthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8782945466469757977L;

	/**
	 * 匿名复杂类型
	 */
	@ApiField("demo_object_1")
	private RainysComplexRefSixth demoObject1;

	/**
	 * 强引用
	 */
	@ApiField("demo_strong")
	private RainyComplexTypesTheNinth demoStrong;

	/**
	 * 弱引用
	 */
	@ApiField("demo_weak")
	private RainysComplexRefSeventh demoWeak;

	public RainysComplexRefSixth getDemoObject1() {
		return this.demoObject1;
	}
	public void setDemoObject1(RainysComplexRefSixth demoObject1) {
		this.demoObject1 = demoObject1;
	}

	public RainyComplexTypesTheNinth getDemoStrong() {
		return this.demoStrong;
	}
	public void setDemoStrong(RainyComplexTypesTheNinth demoStrong) {
		this.demoStrong = demoStrong;
	}

	public RainysComplexRefSeventh getDemoWeak() {
		return this.demoWeak;
	}
	public void setDemoWeak(RainysComplexRefSeventh demoWeak) {
		this.demoWeak = demoWeak;
	}

}
