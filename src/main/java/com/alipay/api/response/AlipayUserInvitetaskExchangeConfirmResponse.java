package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invitetask.exchange.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayUserInvitetaskExchangeConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 2891846229498114438L;

	/** 
	 * true-确认成功，可以进行下一步的代扣、发货
false-确认失败，不要进行下一步代扣
	 */
	@ApiField("confirm_result")
	private Boolean confirmResult;

	public void setConfirmResult(Boolean confirmResult) {
		this.confirmResult = confirmResult;
	}
	public Boolean getConfirmResult( ) {
		return this.confirmResult;
	}

}
