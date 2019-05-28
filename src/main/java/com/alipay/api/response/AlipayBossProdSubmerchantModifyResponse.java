package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.prod.submerchant.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-15 11:15:59
 */
public class AlipayBossProdSubmerchantModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4352721323767946212L;

	/** 
	 * 受理商户在支付宝入驻后的识别号，商户入驻后由支付宝返回
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
