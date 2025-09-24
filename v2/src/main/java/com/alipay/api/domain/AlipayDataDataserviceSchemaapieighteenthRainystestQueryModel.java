package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Schema模型的测试接口18
 *
 * @author auto create
 * @since 1.0, 2025-03-07 17:08:00
 */
public class AlipayDataDataserviceSchemaapieighteenthRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3777236895552622526L;

	/**
	 * 匿名复杂类型
	 */
	@ApiField("demo_object_1")
	private RainysComplexRefForth demoObject1;

	/**
	 * 弱引用
	 */
	@ApiField("demo_weak")
	private RainysComplexRefFifth demoWeak;

	public RainysComplexRefForth getDemoObject1() {
		return this.demoObject1;
	}
	public void setDemoObject1(RainysComplexRefForth demoObject1) {
		this.demoObject1 = demoObject1;
	}

	public RainysComplexRefFifth getDemoWeak() {
		return this.demoWeak;
	}
	public void setDemoWeak(RainysComplexRefFifth demoWeak) {
		this.demoWeak = demoWeak;
	}

}
