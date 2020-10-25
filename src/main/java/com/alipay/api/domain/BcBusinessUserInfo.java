package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BC互动，B端实体对应的实际用户信息模型
 *
 * @author auto create
 * @since 1.0, 2020-06-08 15:20:47
 */
public class BcBusinessUserInfo extends AlipayObject {

	private static final long serialVersionUID = 5112662643599575745L;

	/**
	 * BC互动，B端实体对应的实际B端操作人员的头像地址
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * BC互动，B端实体对应的实际B端操作人员的用户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * BC互动，B端实体对应的实际B端操作人员的用户帐号id
	 */
	@ApiField("uid")
	private String uid;

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
