package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 白帽子信息查询接口
 *
 * @author auto create
 * @since 1.0, 2018-11-25 14:36:52
 */
public class AlipaySecurityProdAfsrcWhitehatinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4563447717178798914L;

	/**
	 * HavanaId(淘宝uid)
	 */
	@ApiField("hid")
	private Long hid;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getHid() {
		return this.hid;
	}
	public void setHid(Long hid) {
		this.hid = hid;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
