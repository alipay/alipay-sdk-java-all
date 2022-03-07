package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISP链路调用测试
 *
 * @author auto create
 * @since 1.0, 2022-02-18 15:40:47
 */
public class AlipayOpenOperationIspTestUseModel extends AlipayObject {

	private static final long serialVersionUID = 6787517759267338572L;

	/**
	 * 测试输入app_id
	 */
	@ApiField("app")
	private String app;

	/**
	 * 测试参数
	 */
	@ApiField("input")
	private Boolean input;

	public String getApp() {
		return this.app;
	}
	public void setApp(String app) {
		this.app = app;
	}

	public Boolean getInput() {
		return this.input;
	}
	public void setInput(Boolean input) {
		this.input = input;
	}

}
