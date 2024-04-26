package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 华为云MP角色信息查询
 *
 * @author auto create
 * @since 1.0, 2024-04-15 11:38:52
 */
public class AnttechOceanbaseEntityroleHuaweimpQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5523724513139626615L;

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
