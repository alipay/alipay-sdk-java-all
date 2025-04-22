package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成官网登录态
 *
 * @author auto create
 * @since 1.0, 2023-11-08 15:07:49
 */
public class AnttechOceanbasePassinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8113146899872914229L;

	/**
	 * 通行证id，用户UID
	 */
	@ApiField("passport_id")
	private String passportId;

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

}
