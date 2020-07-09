package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据淘宝ID匹配投放端广告系统的用户ID
 *
 * @author auto create
 * @since 1.0, 2018-10-22 15:17:26
 */
public class AlipayCommerceTransportAdUserMatchModel extends AlipayObject {

	private static final long serialVersionUID = 5549182211666543319L;

	/**
	 * 第三方平台用户ID
	 */
	@ApiField("third_user_id")
	private String thirdUserId;

	public String getThirdUserId() {
		return this.thirdUserId;
	}
	public void setThirdUserId(String thirdUserId) {
		this.thirdUserId = thirdUserId;
	}

}
