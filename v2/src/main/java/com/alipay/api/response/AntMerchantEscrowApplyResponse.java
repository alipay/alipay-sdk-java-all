package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.escrow.apply response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-20 13:47:49
 */
public class AntMerchantEscrowApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4322467858489554141L;

	/** 
	 * 支付宝受理单号，基于商户+外部请求号做唯一性校验
	 */
	@ApiField("ant_merchant_order_no")
	private String antMerchantOrderNo;

	/** 
	 * 发起商户入驻签约申请的外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setAntMerchantOrderNo(String antMerchantOrderNo) {
		this.antMerchantOrderNo = antMerchantOrderNo;
	}
	public String getAntMerchantOrderNo( ) {
		return this.antMerchantOrderNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
