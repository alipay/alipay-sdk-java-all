package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.user.point.receive response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 18:44:26
 */
public class AlipayInsAutoUserPointReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7497271629723564699L;

	/** 
	 * 本次成功积攒的积分量
如攒油活动，则是本次积攒油量，单位ml
	 */
	@ApiField("save_amount")
	private Long saveAmount;

	public void setSaveAmount(Long saveAmount) {
		this.saveAmount = saveAmount;
	}
	public Long getSaveAmount( ) {
		return this.saveAmount;
	}

}
