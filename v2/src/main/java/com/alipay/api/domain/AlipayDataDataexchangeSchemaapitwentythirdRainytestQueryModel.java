package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型接口测试23_引用复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-04-23 16:41:31
 */
public class AlipayDataDataexchangeSchemaapitwentythirdRainytestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8618668988868871753L;

	/**
	 * 测试数据，匿名复杂类型示例
	 */
	@ApiField("demo_ref")
	private RainyComplexTypesRefWeakFifth demoRef;

	/**
	 * 测试数据，强引用复杂类型示例
	 */
	@ApiField("demo_strong_ref")
	private RainyComplexTypesTheThirteen demoStrongRef;

	/**
	 * 测试数据，弱引用复杂类型示例
	 */
	@ApiField("demo_wink_ref")
	private RainyComplexTypesTheFourteenOne demoWinkRef;

	public RainyComplexTypesRefWeakFifth getDemoRef() {
		return this.demoRef;
	}
	public void setDemoRef(RainyComplexTypesRefWeakFifth demoRef) {
		this.demoRef = demoRef;
	}

	public RainyComplexTypesTheThirteen getDemoStrongRef() {
		return this.demoStrongRef;
	}
	public void setDemoStrongRef(RainyComplexTypesTheThirteen demoStrongRef) {
		this.demoStrongRef = demoStrongRef;
	}

	public RainyComplexTypesTheFourteenOne getDemoWinkRef() {
		return this.demoWinkRef;
	}
	public void setDemoWinkRef(RainyComplexTypesTheFourteenOne demoWinkRef) {
		this.demoWinkRef = demoWinkRef;
	}

}
