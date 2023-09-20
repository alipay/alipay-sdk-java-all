package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通行证账号
 *
 * @author auto create
 * @since 1.0, 2023-08-14 17:21:58
 */
public class PassAccountDTO extends AlipayObject {

	private static final long serialVersionUID = 7719515966132665689L;

	/**
	 * 账号名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 通行证id
	 */
	@ApiField("passport_id")
	private String passportId;

	/**
	 * 账号类型
	 */
	@ApiField("type")
	private String type;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPassportId() {
		return this.passportId;
	}
	public void setPassportId(String passportId) {
		this.passportId = passportId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
