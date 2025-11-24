package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付结构模组
 *
 * @author auto create
 * @since 1.0, 2025-08-27 14:43:59
 */
public class OpenModuleData extends AlipayObject {

	private static final long serialVersionUID = 6842171512745472368L;

	/**
	 * 概要结果描述
	 */
	@ApiField("red_code")
	private String redCode;

	/**
	 * 支付结果描述
	 */
	@ApiField("summary")
	private OpenPayResultSummary summary;

	public String getRedCode() {
		return this.redCode;
	}
	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public OpenPayResultSummary getSummary() {
		return this.summary;
	}
	public void setSummary(OpenPayResultSummary summary) {
		this.summary = summary;
	}

}
