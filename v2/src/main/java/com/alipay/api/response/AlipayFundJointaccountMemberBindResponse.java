package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.member.bind response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-07 16:58:26
 */
public class AlipayFundJointaccountMemberBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8452264725355545763L;

	/** 
	 * 员工回应邀请链接
	 */
	@ApiField("reply_url")
	private String replyUrl;

	public void setReplyUrl(String replyUrl) {
		this.replyUrl = replyUrl;
	}
	public String getReplyUrl( ) {
		return this.replyUrl;
	}

}
