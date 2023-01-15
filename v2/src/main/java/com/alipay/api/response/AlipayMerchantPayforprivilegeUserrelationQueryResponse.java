package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegeUserRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.userrelation.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:36:40
 */
public class AlipayMerchantPayforprivilegeUserrelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7124979617511537114L;

	/** 
	 * 充值业务用户与商户的关系
	 */
	@ApiField("member_info")
	private PayForPrivilegeUserRelation memberInfo;

	public void setMemberInfo(PayForPrivilegeUserRelation memberInfo) {
		this.memberInfo = memberInfo;
	}
	public PayForPrivilegeUserRelation getMemberInfo( ) {
		return this.memberInfo;
	}

}
