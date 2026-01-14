package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户认证信息查询
 *
 * @author auto create
 * @since 1.0, 2025-07-25 10:32:51
 */
public class AnttechOceanbaseUserIdentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5646265584917423898L;

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
