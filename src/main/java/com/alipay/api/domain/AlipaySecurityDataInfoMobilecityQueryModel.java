package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机号归属信息查询
 *
 * @author auto create
 * @since 1.0, 2017-01-03 17:38:43
 */
public class AlipaySecurityDataInfoMobilecityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4378445853485636452L;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
