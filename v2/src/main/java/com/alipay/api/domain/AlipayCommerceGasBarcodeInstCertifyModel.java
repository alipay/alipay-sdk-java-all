package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构动态码认证
 *
 * @author auto create
 * @since 1.0, 2024-11-20 11:10:48
 */
public class AlipayCommerceGasBarcodeInstCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 1533598328298312316L;

	/**
	 * 机构的会员编号
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

	public String getMemberNo() {
		return this.memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
