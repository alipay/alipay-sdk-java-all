package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OPENid 相关的映射类型
 *
 * @author auto create
 * @since 1.0, 2026-03-06 14:29:37
 */
public class RainyComplexTypesTheThird extends AlipayObject {

	private static final long serialVersionUID = 5352512562185135319L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("idtype_open_id")
	private String idtypeOpenId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id_idtype")
	private String userIdIdtype;

	public String getIdtypeOpenId() {
		return this.idtypeOpenId;
	}
	public void setIdtypeOpenId(String idtypeOpenId) {
		this.idtypeOpenId = idtypeOpenId;
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

	public String getUserIdIdtype() {
		return this.userIdIdtype;
	}
	public void setUserIdIdtype(String userIdIdtype) {
		this.userIdIdtype = userIdIdtype;
	}

}
