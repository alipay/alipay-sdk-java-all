package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.goods.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:05:45
 */
public class AlipayPcreditHuabeiGoodsOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8637818999165125516L;

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
