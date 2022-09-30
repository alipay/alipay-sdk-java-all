package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ceshi moxing
 *
 * @author auto create
 * @since 1.0, 2017-08-01 16:05:41
 */
public class AlipayKeyanClass extends AlipayObject {

	private static final long serialVersionUID = 1263998385555175697L;

	/**
	 * 1
	 */
	@ApiField("user_name")
	private String userName;

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
