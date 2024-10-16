package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销收款账号进件
 *
 * @author auto create
 * @since 1.0, 2023-10-27 17:05:39
 */
public class AlipayMarketingActivityPayeeinfoCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4422485652819714862L;

	/**
	 * 结算使用的收款账号。收款账号必须是支付宝的2088开头的账号。
	 */
	@ApiField("payee_pid")
	private String payeePid;

	/**
	 * 进件账号归属的资金结算请求模式，默认为请款模式
PERIOD 账期模式
CAPTURE 请款模式
	 */
	@ApiField("payee_settle_mode")
	private String payeeSettleMode;

	public String getPayeePid() {
		return this.payeePid;
	}
	public void setPayeePid(String payeePid) {
		this.payeePid = payeePid;
	}

	public String getPayeeSettleMode() {
		return this.payeeSettleMode;
	}
	public void setPayeeSettleMode(String payeeSettleMode) {
		this.payeeSettleMode = payeeSettleMode;
	}

}
