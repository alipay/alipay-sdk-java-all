package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保存默认结算账户
 *
 * @author auto create
 * @since 1.0, 2024-11-15 16:07:20
 */
public class AlipayCommerceMerchantcardSettleaccountSaveModel extends AlipayObject {

	private static final long serialVersionUID = 7675151716416392336L;

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
