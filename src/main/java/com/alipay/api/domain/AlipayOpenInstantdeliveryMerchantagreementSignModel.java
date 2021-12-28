package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 即时配送中商家代扣协议签署
 *
 * @author auto create
 * @since 1.0, 2020-12-01 17:07:02
 */
public class AlipayOpenInstantdeliveryMerchantagreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 3858372431668259385L;

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
