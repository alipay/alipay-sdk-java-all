package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 垫资查询
 *
 * @author auto create
 * @since 1.0, 2019-05-27 19:53:16
 */
public class AlipayTradeAdvanceConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3598323435557476497L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

}
