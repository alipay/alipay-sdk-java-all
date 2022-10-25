package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.goods.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-11 18:47:01
 */
public class AlipayPcreditHuabeiMerchantGoodsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8523113359916649338L;

	/** 
	 * 业务处理成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
