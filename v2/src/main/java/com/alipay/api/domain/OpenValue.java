package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openid转unionid,返回用户在同一分组应用下的用户id
 *
 * @author auto create
 * @since 1.0, 2024-05-27 11:42:47
 */
public class OpenValue extends AlipayObject {

	private static final long serialVersionUID = 4847794466275227226L;

	/**
	 * 用户OpenID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户unionid
	 */
	@ApiField("union_id")
	private String unionId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUnionId() {
		return this.unionId;
	}
	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

}
