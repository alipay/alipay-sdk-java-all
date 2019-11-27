package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业征信基于UID的协议授权
 *
 * @author auto create
 * @since 1.0, 2017-09-05 17:48:59
 */
public class AlipayUserAuthZhimaorgUidApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2166628655889366937L;

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
