package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * BC互动，B端实体对应的实际用户信息模型
 *
 * @author auto create
 * @since 1.0, 2022-11-01 12:02:25
 */
public class BcBusinessUserInfo extends AlipayObject {

	private static final long serialVersionUID = 6431425466425624725L;

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
	 * 商家openId
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
