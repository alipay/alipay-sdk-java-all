package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 建立会员关系
 *
 * @author auto create
 * @since 1.0, 2020-07-14 15:37:30
 */
public class AlipayMerchantPayforprivilegeUserrelationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5282676684822752759L;

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
