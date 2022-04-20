package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户详细信息
 *
 * @author auto create
 * @since 1.0, 2020-11-24 16:37:11
 */
public class BuyerInfo extends AlipayObject {

	private static final long serialVersionUID = 8383672868299845968L;

	/**
	 * 用户手机号
	 */
	@ApiField("mobile")
	private String mobile;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
