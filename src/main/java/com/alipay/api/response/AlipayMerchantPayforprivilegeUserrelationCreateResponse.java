package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegeUserRelation;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.userrelation.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-08 11:35:09
 */
public class AlipayMerchantPayforprivilegeUserrelationCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7845362561923672176L;

	/** 
	 * 充享惠业务用户与商户关系
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
