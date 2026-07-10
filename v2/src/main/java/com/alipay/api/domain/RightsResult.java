package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果数据
 *
 * @author auto create
 * @since 1.0, 2026-04-28 15:27:49
 */
public class RightsResult extends AlipayObject {

	private static final long serialVersionUID = 5436757669657411643L;

	/**
	 * 是否有权益
	 */
	@ApiField("rights")
	private String rights;

	public String getRights() {
		return this.rights;
	}
	public void setRights(String rights) {
		this.rights = rights;
	}

}
