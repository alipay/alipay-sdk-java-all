package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.goods.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 07:51:19
 */
public class AlipayPcreditHuabeiGoodsOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7518272284156521222L;

	/** 
	 * 业务结果
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
