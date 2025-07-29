package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * test case
 *
 * @author auto create
 * @since 1.0, 2025-07-28 15:37:52
 */
public class RainysCompelxTypeWeakRefTwo extends AlipayObject {

	private static final long serialVersionUID = 2416719565182834712L;

	/**
	 * case
	 */
	@ApiField("demo_weak_empty")
	private String demoWeakEmpty;

	/**
	 * case
	 */
	@ApiField("demo_weak_value")
	private String demoWeakValue;

	public String getDemoWeakEmpty() {
		return this.demoWeakEmpty;
	}
	public void setDemoWeakEmpty(String demoWeakEmpty) {
		this.demoWeakEmpty = demoWeakEmpty;
	}

	public String getDemoWeakValue() {
		return this.demoWeakValue;
	}
	public void setDemoWeakValue(String demoWeakValue) {
		this.demoWeakValue = demoWeakValue;
	}

}
