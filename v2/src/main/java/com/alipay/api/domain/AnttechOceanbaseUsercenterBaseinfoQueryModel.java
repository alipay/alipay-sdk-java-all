package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 从主站获取用户基本信息
 *
 * @author auto create
 * @since 1.0, 2024-04-17 14:36:49
 */
public class AnttechOceanbaseUsercenterBaseinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6136631213145199944L;

	/**
	 * 登录态
	 */
	@ApiField("authorization")
	private String authorization;

	/**
	 * 通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	public String getAuthorization() {
		return this.authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

}
