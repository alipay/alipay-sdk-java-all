package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销收款账号进件
 *
 * @author auto create
 * @since 1.0, 2022-07-27 13:54:54
 */
public class AlipayMarketingActivityPayeeinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5167769631785688526L;

	/**
	 * 结算使用的收款账号。收款账号必须是支付宝的2088开头的账号。
	 */
	@ApiField("payee_pid")
	private String payeePid;

	public String getPayeePid() {
		return this.payeePid;
	}
	public void setPayeePid(String payeePid) {
		this.payeePid = payeePid;
	}

}
