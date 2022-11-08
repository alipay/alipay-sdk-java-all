package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家结算户信息
 *
 * @author auto create
 * @since 1.0, 2022-01-18 16:06:30
 */
public class PayeeInfo extends AlipayObject {

	private static final long serialVersionUID = 6854447887765116317L;

	/**
	 * 结算户名
	 */
	@ApiField("payee_account_name")
	private String payeeAccountName;

	/**
	 * 结算户号
	 */
	@ApiField("payee_account_no")
	private String payeeAccountNo;

	/**
	 * 结算户所在银行联行号
	 */
	@ApiField("payee_bank_code")
	private String payeeBankCode;

	public String getPayeeAccountName() {
		return this.payeeAccountName;
	}
	public void setPayeeAccountName(String payeeAccountName) {
		this.payeeAccountName = payeeAccountName;
	}

	public String getPayeeAccountNo() {
		return this.payeeAccountNo;
	}
	public void setPayeeAccountNo(String payeeAccountNo) {
		this.payeeAccountNo = payeeAccountNo;
	}

	public String getPayeeBankCode() {
		return this.payeeBankCode;
	}
	public void setPayeeBankCode(String payeeBankCode) {
		this.payeeBankCode = payeeBankCode;
	}

}
