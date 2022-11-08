package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额充值
 *
 * @author auto create
 * @since 1.0, 2022-07-28 14:17:16
 */
public class VoucherBalanceRechargeInfo extends AlipayObject {

	private static final long serialVersionUID = 3369877319889279658L;

	/**
	 * 支付宝余额充值金额
 限制： 
1.币种为人民币，单位元。 
2. 总预算=优惠金额*总发券张数
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 出资的商户支付宝登录账号 
限制: 
logon_id和partner_id必须且只能二选一
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 出资的商户支付宝ID 
限制: 
logon_id和partner_id必须且只能二选一
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
