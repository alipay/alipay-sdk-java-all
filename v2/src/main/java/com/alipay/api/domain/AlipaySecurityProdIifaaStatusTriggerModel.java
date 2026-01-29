package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IIFAA凭证状态生命周期管理
 *
 * @author auto create
 * @since 1.0, 2026-01-08 19:34:18
 */
public class AlipaySecurityProdIifaaStatusTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 8884395544765352962L;

	/**
	 * 操作类型
	 */
	@ApiField("action")
	private String action;

	/**
	 * 请求参数
	 */
	@ApiField("request_param")
	private String requestParam;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getRequestParam() {
		return this.requestParam;
	}
	public void setRequestParam(String requestParam) {
		this.requestParam = requestParam;
	}

}
