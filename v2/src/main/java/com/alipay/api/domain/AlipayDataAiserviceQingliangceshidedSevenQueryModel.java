package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 青凉新流程测试dev007
 *
 * @author auto create
 * @since 1.0, 2025-07-21 15:57:33
 */
public class AlipayDataAiserviceQingliangceshidedSevenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2233632962397634547L;

	/**
	 * 演示目标
	 */
	@ApiField("ceshi_demo")
	private String ceshiDemo;

	public String getCeshiDemo() {
		return this.ceshiDemo;
	}
	public void setCeshiDemo(String ceshiDemo) {
		this.ceshiDemo = ceshiDemo;
	}

}
