package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mdataprod.user.profile.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMdataprodUserProfileGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4129539678929843336L;

	/** 
	 * 是否成功标志
	 */
	@ApiField("success")
	private String success;

	/** 
	 * 用户画像信息的json格式
	 */
	@ApiField("user_profile_json")
	private String userProfileJson;

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

	public void setUserProfileJson(String userProfileJson) {
		this.userProfileJson = userProfileJson;
	}
	public String getUserProfileJson( ) {
		return this.userProfileJson;
	}

}
