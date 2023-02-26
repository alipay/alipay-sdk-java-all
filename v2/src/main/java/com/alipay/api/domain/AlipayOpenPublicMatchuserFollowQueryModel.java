package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号用户关注情况高级查询接口
 *
 * @author auto create
 * @since 1.0, 2022-12-16 14:02:15
 */
public class AlipayOpenPublicMatchuserFollowQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5815851279722978338L;

	/**
	 * 身份证号码
	 */
	@ApiField("identity_card")
	private String identityCard;

	/**
	 * 手机号码
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 支付宝用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户id，2088开头的16位长度字符串
	 */
	@ApiField("user_id")
	private String userId;

	public String getIdentityCard() {
		return this.identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
