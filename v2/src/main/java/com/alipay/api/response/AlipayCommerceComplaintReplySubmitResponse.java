package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.complaint.reply.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-05 13:50:07
 */
public class AlipayCommerceComplaintReplySubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6518624499378599886L;

	/** 
	 * 修改结果
	 */
	@ApiField("res")
	private Boolean res;

	public void setRes(Boolean res) {
		this.res = res;
	}
	public Boolean getRes( ) {
		return this.res;
	}

}
