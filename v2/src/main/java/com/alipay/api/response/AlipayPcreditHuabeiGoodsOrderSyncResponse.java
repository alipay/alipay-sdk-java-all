package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.goods.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:59:17
 */
public class AlipayPcreditHuabeiGoodsOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5673497555595165233L;

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
