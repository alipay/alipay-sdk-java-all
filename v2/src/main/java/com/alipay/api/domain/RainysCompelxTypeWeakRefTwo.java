package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * test case
 *
 * @author auto create
 * @since 1.0, 2025-07-29 15:52:34
 */
public class RainysCompelxTypeWeakRefTwo extends AlipayObject {

	private static final long serialVersionUID = 8892329786353517481L;

	/**
	 * test case
	 */
	@ApiField("demo_emtpy_prod_vv")
	private String demoEmtpyProdVv;

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

	public String getDemoEmtpyProdVv() {
		return this.demoEmtpyProdVv;
	}
	public void setDemoEmtpyProdVv(String demoEmtpyProdVv) {
		this.demoEmtpyProdVv = demoEmtpyProdVv;
	}

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
