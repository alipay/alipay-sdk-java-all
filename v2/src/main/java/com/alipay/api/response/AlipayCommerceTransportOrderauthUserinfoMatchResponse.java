package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.orderauth.userinfo.match response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-25 10:42:36
 */
public class AlipayCommerceTransportOrderauthUserinfoMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 7883276112156734699L;

	/** 
	 * 支付宝唯一用户开放ID
	 */
	@ApiField("matched_open_id")
	private String matchedOpenId;

	/** 
	 * 支付宝唯一用户开放ID
	 */
	@ApiField("matched_user_id")
	private String matchedUserId;

	/** 
	 * 匹配得到的支付宝账号风险级别。N1：未匹配到用户；L序列为低风险，M序列为中风险，H序列为高风险；
	 */
	@ApiField("matched_user_risk_level")
	private String matchedUserRiskLevel;

	/** 
	 * 匹配得到的支付宝账号风险原因
	 */
	@ApiField("matched_user_risk_reason")
	private String matchedUserRiskReason;

	public void setMatchedOpenId(String matchedOpenId) {
		this.matchedOpenId = matchedOpenId;
	}
	public String getMatchedOpenId( ) {
		return this.matchedOpenId;
	}

	public void setMatchedUserId(String matchedUserId) {
		this.matchedUserId = matchedUserId;
	}
	public String getMatchedUserId( ) {
		return this.matchedUserId;
	}

	public void setMatchedUserRiskLevel(String matchedUserRiskLevel) {
		this.matchedUserRiskLevel = matchedUserRiskLevel;
	}
	public String getMatchedUserRiskLevel( ) {
		return this.matchedUserRiskLevel;
	}

	public void setMatchedUserRiskReason(String matchedUserRiskReason) {
		this.matchedUserRiskReason = matchedUserRiskReason;
	}
	public String getMatchedUserRiskReason( ) {
		return this.matchedUserRiskReason;
	}

}
