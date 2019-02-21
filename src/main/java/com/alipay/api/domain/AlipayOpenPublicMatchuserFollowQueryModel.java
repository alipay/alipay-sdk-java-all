package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号用户关注情况高级查询接口
 *
 * @author auto create
 * @since 1.0, 2017-11-07 14:06:28
 */
public class AlipayOpenPublicMatchuserFollowQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6815569536838766324L;

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
