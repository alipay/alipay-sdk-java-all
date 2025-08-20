package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付结构模组
 *
 * @author auto create
 * @since 1.0, 2025-08-18 16:36:16
 */
public class OpenModuleData extends AlipayObject {

	private static final long serialVersionUID = 7784457691934926921L;

	/**
	 * 支付结果描述
	 */
	@ApiField("summary")
	private OpenPayResultSummary summary;

	public OpenPayResultSummary getSummary() {
		return this.summary;
	}
	public void setSummary(OpenPayResultSummary summary) {
		this.summary = summary;
	}

}
