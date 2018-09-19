package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.submerchant.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-09-23 20:46:27
 */
public class AlipayBossProdSubmerchantCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7681451177277484385L;

	/** 
	 * 受理商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}
	public String getSubMerchantId( ) {
		return this.subMerchantId;
	}

}
