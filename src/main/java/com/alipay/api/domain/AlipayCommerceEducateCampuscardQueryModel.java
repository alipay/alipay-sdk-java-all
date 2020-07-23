package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园卡查询
 *
 * @author auto create
 * @since 1.0, 2019-04-12 15:41:58
 */
public class AlipayCommerceEducateCampuscardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6641481824232423719L;

	/**
	 * 支付宝用户ID
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
