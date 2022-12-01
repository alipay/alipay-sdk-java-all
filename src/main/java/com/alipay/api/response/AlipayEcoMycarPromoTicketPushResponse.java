package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.promo.ticket.push response.
 * 
 * @author auto create
 * @since 1.0, 2020-12-31 11:37:53
 */
public class AlipayEcoMycarPromoTicketPushResponse extends AlipayResponse {

	private static final long serialVersionUID = 7663551518659559263L;

	/** 
	 * 处理结果返回码
	 */
	@ApiField("sp_apply_no")
	private String spApplyNo;

	public void setSpApplyNo(String spApplyNo) {
		this.spApplyNo = spApplyNo;
	}
	public String getSpApplyNo( ) {
		return this.spApplyNo;
	}

}
