package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 超级导购查询联合商户列表
 *
 * @author auto create
 * @since 1.0, 2024-05-27 20:47:22
 */
public class AlipayCommerceYuntaskUnitedpidsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6116742924118826978L;

	/**
	 * 联合商户id
	 */
	@ApiField("united_id")
	private String unitedId;

	public String getUnitedId() {
		return this.unitedId;
	}
	public void setUnitedId(String unitedId) {
		this.unitedId = unitedId;
	}

}
