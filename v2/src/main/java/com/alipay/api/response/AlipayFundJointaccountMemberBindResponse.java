package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.jointaccount.member.bind response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-07 15:02:07
 */
public class AlipayFundJointaccountMemberBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 2393618291879438595L;

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
