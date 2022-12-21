package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量代发到账户收款方模型
 *
 * @author auto create
 * @since 1.0, 2020-12-22 15:48:25
 */
public class AccPayeeInfo extends AlipayObject {

	private static final long serialVersionUID = 2797467736479668232L;

	/**
	 * 收款方电子钱包账号。
	 */
	@ApiField("payee_account")
	private String payeeAccount;

	/**
	 * 收款方电子钱包持有者姓名。
	 */
	@ApiField("payee_name")
	private String payeeName;

	/**
	 * 收款账户类型，支付宝账户（USER_ID）或银行卡（BANK_CARD_NO）等。
	 */
	@ApiField("payee_type")
	private String payeeType;

	public String getPayeeAccount() {
		return this.payeeAccount;
	}
	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

	public String getPayeeName() {
		return this.payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeType() {
		return this.payeeType;
	}
	public void setPayeeType(String payeeType) {
		this.payeeType = payeeType;
	}

}
