package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保存默认结算账户
 *
 * @author auto create
 * @since 1.0, 2025-01-16 10:39:17
 */
public class AlipayCommerceMerchantcardSettleaccountSaveModel extends AlipayObject {

	private static final long serialVersionUID = 8334947393674278225L;

	/**
	 * 结算收款的支付宝账号，是登录账号，非pid
	 */
	@ApiField("settle_alipay_logon_id")
	private String settleAlipayLogonId;

	public String getSettleAlipayLogonId() {
		return this.settleAlipayLogonId;
	}
	public void setSettleAlipayLogonId(String settleAlipayLogonId) {
		this.settleAlipayLogonId = settleAlipayLogonId;
	}

}
