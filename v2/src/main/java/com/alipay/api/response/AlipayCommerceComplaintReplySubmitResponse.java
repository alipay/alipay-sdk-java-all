package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.complaint.reply.submit response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-10 10:36:07
 */
public class AlipayCommerceComplaintReplySubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 3896195934669711289L;

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
