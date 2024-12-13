package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份信息查询
 *
 * @author auto create
 * @since 1.0, 2022-11-08 15:18:27
 */
public class AlipayUserCertifyIdentifyInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8393129231338952448L;

	/**
	 * havana_id
	 */
	@ApiField("havana_id")
	private String havanaId;

	/**
	 * 登录ID
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 用户在应用（AppId）下的用户唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getHavanaId() {
		return this.havanaId;
	}
	public void setHavanaId(String havanaId) {
		this.havanaId = havanaId;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
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
