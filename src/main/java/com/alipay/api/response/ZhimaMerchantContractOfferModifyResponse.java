package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.offer.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-20 10:18:02
 */
public class ZhimaMerchantContractOfferModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2516515631729489667L;

	/** 
	 * 业务操作结果，成功或失败
	 */
	@ApiField("biz_result")
	private String bizResult;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

}
