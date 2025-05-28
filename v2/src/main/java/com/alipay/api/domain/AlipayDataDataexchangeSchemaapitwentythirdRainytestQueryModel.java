package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新模型接口测试23_引用复杂类型
 *
 * @author auto create
 * @since 1.0, 2025-05-07 10:32:27
 */
public class AlipayDataDataexchangeSchemaapitwentythirdRainytestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4549184568598922312L;

	/**
	 * 1.1版本新增的 测试数据
	 */
	@ApiField("demo")
	private String demo;

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
	 * 新增的测试数据
	 */
	@ApiField("demo_vv_ref")
	private RainyComplexTypesTheFourteen demoVvRef;

	/**
	 * 测试数据，弱引用复杂类型示例
	 */
	@ApiField("demo_wink_ref")
	private RainyComplexTypesTheFourteenOne demoWinkRef;

	public String getDemo() {
		return this.demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}

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

	public RainyComplexTypesTheFourteen getDemoVvRef() {
		return this.demoVvRef;
	}
	public void setDemoVvRef(RainyComplexTypesTheFourteen demoVvRef) {
		this.demoVvRef = demoVvRef;
	}

	public RainyComplexTypesTheFourteenOne getDemoWinkRef() {
		return this.demoWinkRef;
	}
	public void setDemoWinkRef(RainyComplexTypesTheFourteenOne demoWinkRef) {
		this.demoWinkRef = demoWinkRef;
	}

}
