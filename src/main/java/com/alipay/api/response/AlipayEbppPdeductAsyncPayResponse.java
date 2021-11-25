package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.async.pay response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:43:57
 */
public class AlipayEbppPdeductAsyncPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6725291186823413477L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 商户代扣业务流水
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 扣款流水状态
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
