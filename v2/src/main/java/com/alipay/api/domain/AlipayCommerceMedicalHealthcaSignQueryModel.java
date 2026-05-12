package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询签约结果
 *
 * @author auto create
 * @since 1.0, 2026-03-11 10:26:52
 */
public class AlipayCommerceMedicalHealthcaSignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3398897677438241922L;

	/**
	 * 业务标识
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 请求唯一标识
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 签署合同ID
	 */
	@ApiField("sign_flow_id")
	private String signFlowId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSignFlowId() {
		return this.signFlowId;
	}
	public void setSignFlowId(String signFlowId) {
		this.signFlowId = signFlowId;
	}

}
