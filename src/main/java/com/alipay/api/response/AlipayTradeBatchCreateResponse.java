package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-24 17:16:03
 */
public class AlipayTradeBatchCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1189357871787638392L;

	/** 
	 * T/F，T表示成功，F表示失败
	 */
	@ApiField("is_success")
	private String isSuccess;

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

}
