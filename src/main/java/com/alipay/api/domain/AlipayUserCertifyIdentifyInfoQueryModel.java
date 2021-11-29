package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户身份信息查询
 *
 * @author auto create
 * @since 1.0, 2020-11-14 21:10:26
 */
public class AlipayUserCertifyIdentifyInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3758865947735695546L;

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
