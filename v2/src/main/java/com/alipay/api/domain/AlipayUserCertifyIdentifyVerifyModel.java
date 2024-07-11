package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份信息校验
 *
 * @author auto create
 * @since 1.0, 2020-09-07 19:11:15
 */
public class AlipayUserCertifyIdentifyVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5393176944947548123L;

	/**
	 * 分配给业务的场景码
	 */
	@ApiField("biz_code")
	private String bizCode;

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
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
