package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.goods.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-30 09:35:23
 */
public class AlipayPcreditHuabeiMerchantGoodsSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3732263416624512979L;

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
