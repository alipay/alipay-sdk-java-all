package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询千牛网商有数widget的数据
 *
 * @author auto create
 * @since 1.0, 2022-09-29 14:08:33
 */
public class MybankCreditCreditriskWidgetQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6177373385399747872L;

	/**
	 * 支付宝userid
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
