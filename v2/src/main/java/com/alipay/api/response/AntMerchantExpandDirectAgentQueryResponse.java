package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.direct.agent.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-02 10:03:11
 */
public class AntMerchantExpandDirectAgentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5877914451957369922L;

	/** 
	 * 商户支付宝账号对应的商户pid
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 支付宝风控审核不通过原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * 商户进件状态
	 */
	@ApiField("status")
	private String status;

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
