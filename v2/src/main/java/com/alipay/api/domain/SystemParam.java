package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 系统对接参数，包含对接方业务身份；幂等请求ID等。
 *
 * @author auto create
 * @since 1.0, 2023-08-09 19:22:21
 */
public class SystemParam extends AlipayObject {

	private static final long serialVersionUID = 7758716429831347257L;

	/**
	 * 业务功能类型
	 */
	@ApiField("function")
	private String function;

	/**
	 * 业务合作伙伴
	 */
	@ApiField("partner")
	private String partner;

	/**
	 * 系统幂等请求id
	 */
	@ApiField("request_id")
	private String requestId;

	public String getFunction() {
		return this.function;
	}
	public void setFunction(String function) {
		this.function = function;
	}

	public String getPartner() {
		return this.partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
