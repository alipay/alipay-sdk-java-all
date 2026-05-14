package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户认证信息查询
 *
 * @author auto create
 * @since 1.0, 2026-03-04 10:57:43
 */
public class AlipayCommerceMedicalAqUsercertifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8175576312626767568L;

	/**
	 * 授权码
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 用于标记AQ用户在应用下的唯一标识
	 */
	@ApiField("aq_sub_id")
	private String aqSubId;

	/**
	 * 应用id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAqSubId() {
		return this.aqSubId;
	}
	public void setAqSubId(String aqSubId) {
		this.aqSubId = aqSubId;
	}

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

}
