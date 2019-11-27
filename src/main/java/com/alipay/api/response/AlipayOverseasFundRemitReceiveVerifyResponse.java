package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.fund.remit.receive.verify response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayOverseasFundRemitReceiveVerifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2755999539487993285L;

	/** 
	 * masked_login_id, 脱敏的用户支付宝登录号
	 */
	@ApiField("masked_login_id")
	private String maskedLoginId;

	/** 
	 * masked_real_name, 脱敏的用户实名信息
	 */
	@ApiField("masked_real_name")
	private String maskedRealName;

	/** 
	 * profile_photo, 序列化的用户头像
	 */
	@ApiField("profile_photo")
	private String profilePhoto;

	/** 
	 * receiver_id, 收款人唯一id信息, 汇款机构可以把receiver_id作为alipay.overseas.fund.remit.recieve.create的参数，从而唯一确定收款人.
	 */
	@ApiField("receiver_id")
	private String receiverId;

	public void setMaskedLoginId(String maskedLoginId) {
		this.maskedLoginId = maskedLoginId;
	}
	public String getMaskedLoginId( ) {
		return this.maskedLoginId;
	}

	public void setMaskedRealName(String maskedRealName) {
		this.maskedRealName = maskedRealName;
	}
	public String getMaskedRealName( ) {
		return this.maskedRealName;
	}

	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	public String getProfilePhoto( ) {
		return this.profilePhoto;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
	public String getReceiverId( ) {
		return this.receiverId;
	}

}
