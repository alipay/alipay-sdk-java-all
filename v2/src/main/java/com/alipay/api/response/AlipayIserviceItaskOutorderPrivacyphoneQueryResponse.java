package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.outorder.privacyphone.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-15 11:47:26
 */
public class AlipayIserviceItaskOutorderPrivacyphoneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4497254697146267125L;

	/** 
	 * 隐私小号过期时间
	 */
	@ApiField("current_expire_time")
	private Date currentExpireTime;

	/** 
	 * 绑定的隐私小号
	 */
	@ApiField("privacy_bind_phone")
	private String privacyBindPhone;

	/** 
	 * 用户手机类型
	 */
	@ApiField("user_phone_type")
	private String userPhoneType;

	public void setCurrentExpireTime(Date currentExpireTime) {
		this.currentExpireTime = currentExpireTime;
	}
	public Date getCurrentExpireTime( ) {
		return this.currentExpireTime;
	}

	public void setPrivacyBindPhone(String privacyBindPhone) {
		this.privacyBindPhone = privacyBindPhone;
	}
	public String getPrivacyBindPhone( ) {
		return this.privacyBindPhone;
	}

	public void setUserPhoneType(String userPhoneType) {
		this.userPhoneType = userPhoneType;
	}
	public String getUserPhoneType( ) {
		return this.userPhoneType;
	}

}
