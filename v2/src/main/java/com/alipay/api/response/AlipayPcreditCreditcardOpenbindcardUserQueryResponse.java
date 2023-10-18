package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.creditcard.openbindcard.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-17 15:56:46
 */
public class AlipayPcreditCreditcardOpenbindcardUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5368222597541711543L;

	/** 
	 * 活动是否对查询用户准入
	 */
	@ApiField("admit")
	private String admit;

	/** 
	 * 查询用户是否已经完成过活动
	 */
	@ApiField("completed_activity")
	private String completedActivity;

	public void setAdmit(String admit) {
		this.admit = admit;
	}
	public String getAdmit( ) {
		return this.admit;
	}

	public void setCompletedActivity(String completedActivity) {
		this.completedActivity = completedActivity;
	}
	public String getCompletedActivity( ) {
		return this.completedActivity;
	}

}
