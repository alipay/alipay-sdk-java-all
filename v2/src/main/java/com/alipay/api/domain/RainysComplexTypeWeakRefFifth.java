package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-04-23 16:41:31
 */
public class RainysComplexTypeWeakRefFifth extends AlipayObject {

	private static final long serialVersionUID = 1529159787268679228L;

	/**
	 * demo——date的测试数据
	 */
	@ApiField("demo_date")
	private Date demoDate;

	public Date getDemoDate() {
		return this.demoDate;
	}
	public void setDemoDate(Date demoDate) {
		this.demoDate = demoDate;
	}

}
