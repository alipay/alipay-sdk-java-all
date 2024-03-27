package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店审核结果详情
 *
 * @author auto create
 * @since 1.0, 2023-11-08 11:14:20
 */
public class ShopAuditResultDetail extends AlipayObject {

	private static final long serialVersionUID = 7443854724664525738L;

	/**
	 * 业务类型，比如行业资质类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 驳回原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 结果，通过或者驳回
	 */
	@ApiField("result")
	private String result;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
