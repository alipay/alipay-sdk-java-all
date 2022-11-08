package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.identitypay.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-14 01:36:52
 */
public class AlipayFundIdentitypayMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5279395955356717996L;

	/** 
	 * 鉴权方式标签
（estate_audit-物业审核/self_scan-自主扫码/live_payment-生活缴费/government_org-政府审核）
	 */
	@ApiField("authentication_type")
	private String authenticationType;

	/** 
	 * 成员类型
	 */
	@ApiField("business_params")
	private String businessParams;

	/** 
	 * 用户昵称
	 */
	@ApiField("member_name")
	private String memberName;

	/** 
	 * 标识用户是否签约
	 */
	@ApiField("status")
	private Boolean status;

	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public String getAuthenticationType( ) {
		return this.authenticationType;
	}

	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}
	public String getBusinessParams( ) {
		return this.businessParams;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberName( ) {
		return this.memberName;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
