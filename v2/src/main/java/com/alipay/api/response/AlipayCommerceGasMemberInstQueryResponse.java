package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.member.inst.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-27 15:47:22
 */
public class AlipayCommerceGasMemberInstQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7729944172426378282L;

	/** 
	 * 机构侧会员id
	 */
	@ApiField("member_no")
	private String memberNo;

	/** 
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberNo( ) {
		return this.memberNo;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
