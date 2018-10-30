package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 公众号标签管理-查询用户标签
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:14
 */
public class AlipayOpenPublicLabelUserQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4312396851226466811L;

	/**
	 * 支付宝用户的userid，2088开头长度为16位的字符串
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
