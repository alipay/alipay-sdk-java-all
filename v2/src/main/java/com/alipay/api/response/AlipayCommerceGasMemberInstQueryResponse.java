package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.member.inst.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-20 10:52:16
 */
public class AlipayCommerceGasMemberInstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5618144176177355525L;

	/** 
	 * 机构侧会员id
	 */
	@ApiField("member_no")
	private String memberNo;

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberNo( ) {
		return this.memberNo;
	}

}
