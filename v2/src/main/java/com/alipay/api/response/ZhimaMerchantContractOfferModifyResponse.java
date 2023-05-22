package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.offer.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:01:44
 */
public class ZhimaMerchantContractOfferModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7557582993326661477L;

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
