package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 按用户账号删除用户登录账号
 *
 * @author auto create
 * @since 1.0, 2026-09-07 14:57:46
 */
public class AnttechOceanbasePassaccountDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4393724352625173687L;

	/**
	 * OceanBase Cloud的用户Id，可从个人中心获取
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
