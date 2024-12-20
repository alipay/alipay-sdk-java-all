package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型测试校验复杂类型03
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:17:18
 */
public class AlipayDataDataserviceSchemacomplexthirdRainystestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7264351287893214517L;

	/**
	 * 迭代内新增
	 */
	@ApiField("demo_new_strong")
	private RainyComplexTypesRefWeakFirst demoNewStrong;

	/**
	 * 迭代内新增
	 */
	@ApiField("demo_new_weak")
	private RainyComplexTypesRefWeakSecond demoNewWeak;

	public RainyComplexTypesRefWeakFirst getDemoNewStrong() {
		return this.demoNewStrong;
	}
	public void setDemoNewStrong(RainyComplexTypesRefWeakFirst demoNewStrong) {
		this.demoNewStrong = demoNewStrong;
	}

	public RainyComplexTypesRefWeakSecond getDemoNewWeak() {
		return this.demoNewWeak;
	}
	public void setDemoNewWeak(RainyComplexTypesRefWeakSecond demoNewWeak) {
		this.demoNewWeak = demoNewWeak;
	}

}
