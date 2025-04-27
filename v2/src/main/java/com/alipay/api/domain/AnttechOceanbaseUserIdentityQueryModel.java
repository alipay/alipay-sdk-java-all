package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户认证信息查询
 *
 * @author auto create
 * @since 1.0, 2024-01-08 14:36:21
 */
public class AnttechOceanbaseUserIdentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3286959575741657176L;

	/**
	 * 通行证id
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
