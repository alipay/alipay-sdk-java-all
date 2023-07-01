package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户企业查询
 *
 * @author auto create
 * @since 1.0, 2023-06-20 10:26:55
 */
public class AnttechOceanbaseUsercompanyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1577332864292463214L;

	/**
	 * 通行证编码
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
