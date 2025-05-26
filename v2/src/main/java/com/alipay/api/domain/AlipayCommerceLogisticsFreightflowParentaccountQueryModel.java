package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 货运企业支付主账户实时查余
 *
 * @author auto create
 * @since 1.0, 2025-05-07 10:09:35
 */
public class AlipayCommerceLogisticsFreightflowParentaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4677361169738294376L;

	/**
	 * 账户卡号
	 */
	@ApiField("account_card_no")
	private String accountCardNo;

	/**
	 * 物流公司编码，由支付宝分配
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 银行管理模式。 本期： ANT_MYBANK(网商银行模式)
	 */
	@ApiField("mode")
	private String mode;

	public String getAccountCardNo() {
		return this.accountCardNo;
	}
	public void setAccountCardNo(String accountCardNo) {
		this.accountCardNo = accountCardNo;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMode() {
		return this.mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

}
