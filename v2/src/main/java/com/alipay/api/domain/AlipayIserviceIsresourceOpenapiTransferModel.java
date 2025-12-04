package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * isresource应用服务
 *
 * @author auto create
 * @since 1.0, 2025-04-25 16:19:28
 */
public class AlipayIserviceIsresourceOpenapiTransferModel extends AlipayObject {

	private static final long serialVersionUID = 2716658686855254764L;

	/**
	 * facade名称#方法名
	 */
	@ApiField("action")
	private String action;

	/**
	 * 接口参数
	 */
	@ApiField("params")
	private String params;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

}
