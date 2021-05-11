package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 建立会员关系
 *
 * @author auto create
 * @since 1.0, 2021-04-19 16:39:40
 */
public class AlipayMerchantPayforprivilegeUserrelationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8131511812738739959L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
