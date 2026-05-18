package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.escrow.apply.modify response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 14:47:46
 */
public class AntMerchantEscrowApplyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8565673539193948928L;

	/** 
	 * 支付宝受理主单号
	 */
	@ApiField("ant_merchant_order_no")
	private String antMerchantOrderNo;

	/** 
	 * 支付宝请求号
	 */
	@ApiField("ant_merchant_request_id")
	private String antMerchantRequestId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setAntMerchantOrderNo(String antMerchantOrderNo) {
		this.antMerchantOrderNo = antMerchantOrderNo;
	}
	public String getAntMerchantOrderNo( ) {
		return this.antMerchantOrderNo;
	}

	public void setAntMerchantRequestId(String antMerchantRequestId) {
		this.antMerchantRequestId = antMerchantRequestId;
	}
	public String getAntMerchantRequestId( ) {
		return this.antMerchantRequestId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
