package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AQ授权获取用户实名信息
 *
 * @author auto create
 * @since 1.0, 2025-12-01 18:12:42
 */
public class AlipayCommerceMedicalHomedoctorUserinfoShareModel extends AlipayObject {

	private static final long serialVersionUID = 8554457352448677188L;

	/**
	 * AQ访问令牌。通过该令牌调用需要授权类接口
	 */
	@ApiField("aq_access_token")
	private String aqAccessToken;

	/**
	 * 用户对外开放openid
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	public String getAqAccessToken() {
		return this.aqAccessToken;
	}
	public void setAqAccessToken(String aqAccessToken) {
		this.aqAccessToken = aqAccessToken;
	}

	public String getAqOpenId() {
		return this.aqOpenId;
	}
	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}

}
