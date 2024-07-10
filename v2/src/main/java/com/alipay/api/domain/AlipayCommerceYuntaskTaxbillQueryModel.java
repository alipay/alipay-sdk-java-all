package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询税筹签约信息
 *
 * @author auto create
 * @since 1.0, 2022-11-30 15:24:49
 */
public class AlipayCommerceYuntaskTaxbillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7615741457429293427L;

	/**
	 * 税筹签约用户的uid，此处指用户支付宝登录id
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

}
