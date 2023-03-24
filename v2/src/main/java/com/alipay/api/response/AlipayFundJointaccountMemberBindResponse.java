package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.member.bind response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 03:21:39
 */
public class AlipayFundJointaccountMemberBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 8238834161252697631L;

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
