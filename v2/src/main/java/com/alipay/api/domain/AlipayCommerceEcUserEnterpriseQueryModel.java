package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户企业列表
 *
 * @author auto create
 * @since 1.0, 2023-08-11 11:20:36
 */
public class AlipayCommerceEcUserEnterpriseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8395321633289641544L;

	/**
	 * 用户open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

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
