package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取登录用户信息
 *
 * @author auto create
 * @since 1.0, 2021-08-26 13:58:08
 */
public class AnttechOceanbasePassinfoLogininfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5298995147781431133L;

	/**
	 * 通行认证令牌
	 */
	@ApiField("ob_auth_token")
	private String obAuthToken;

	/**
	 * 是否续期标记。设置true续期、设置false不续期。默认不续期。
	 */
	@ApiField("renew")
	private Boolean renew;

	/**
	 * 自然实体类型。MEMBER（个人账号）、MASTER（企业主账号）
	 */
	@ApiField("role_type")
	private String roleType;

	public String getObAuthToken() {
		return this.obAuthToken;
	}
	public void setObAuthToken(String obAuthToken) {
		this.obAuthToken = obAuthToken;
	}

	public Boolean getRenew() {
		return this.renew;
	}
	public void setRenew(Boolean renew) {
		this.renew = renew;
	}

	public String getRoleType() {
		return this.roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
