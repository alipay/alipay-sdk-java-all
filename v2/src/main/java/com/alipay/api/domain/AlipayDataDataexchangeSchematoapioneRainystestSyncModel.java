package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Schema模型的测试toAnt接口0312
 *
 * @author auto create
 * @since 1.0, 2026-03-12 16:02:44
 */
public class AlipayDataDataexchangeSchematoapioneRainystestSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6473999954673844865L;

	/**
	 * test
	 */
	@ApiField("demo")
	private String demo;

	/**
	 * test
	 */
	@ApiField("demo_open_id")
	private String demoOpenId;

	/**
	 * test
	 */
	@ApiField("demo_ref")
	private RainyComplexTypesRefWeakFirst demoRef;

	public String getDemo() {
		return this.demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}

	public String getDemoOpenId() {
		return this.demoOpenId;
	}
	public void setDemoOpenId(String demoOpenId) {
		this.demoOpenId = demoOpenId;
	}

	public RainyComplexTypesRefWeakFirst getDemoRef() {
		return this.demoRef;
	}
	public void setDemoRef(RainyComplexTypesRefWeakFirst demoRef) {
		this.demoRef = demoRef;
	}

}
