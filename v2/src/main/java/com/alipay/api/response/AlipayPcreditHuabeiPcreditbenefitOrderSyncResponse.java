package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:37:53
 */
public class AlipayPcreditHuabeiPcreditbenefitOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7661547994444485233L;

	/** 
	 * 操作结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
