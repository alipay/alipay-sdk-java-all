package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁健康授权获取用户实名信息
 *
 * @author auto create
 * @since 1.0, 2025-12-30 14:07:41
 */
public class AlipayCommerceMedicalHomedoctorUserinfoShareModel extends AlipayObject {

	private static final long serialVersionUID = 6438849983625629127L;

	/**
	 * 蚂蚁健康访问令牌。通过该令牌调用需要授权接口
	 */
	@ApiField("aq_access_token")
	private String aqAccessToken;

	/**
	 * 蚂蚁健康用户对外开放OPEN_ID
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
