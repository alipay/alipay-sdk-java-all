package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.merchant.contract.quick.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-17 10:40:52
 */
public class ZhimaMerchantContractQuickCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6522228241741128447L;

	/** 
	 * 错误码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 错误说明
	 */
	@ApiField("biz_desc")
	private String bizDesc;

	/** 
	 * 发约单单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizDesc(String bizDesc) {
		this.bizDesc = bizDesc;
	}
	public String getBizDesc( ) {
		return this.bizDesc;
	}

	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}
	public String getOfferNo( ) {
		return this.offerNo;
	}

}
