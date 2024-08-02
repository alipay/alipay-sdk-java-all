package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行账户明细
 *
 * @author auto create
 * @since 1.0, 2024-04-22 10:38:19
 */
public class TuitionBankAccountDetail extends AlipayObject {

	private static final long serialVersionUID = 2338473681875269994L;

	/**
	 * 银行收款账号
	 */
	@ApiField("bank_account_no")
	private String bankAccountNo;

	/**
	 * 银行swiftCode/BIC
	 */
	@ApiField("bank_bic")
	private String bankBic;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 银行收款账户名
	 */
	@ApiField("holder_account_name")
	private TuitionUserName holderAccountName;

	/**
	 * 银行收款账户地址
	 */
	@ApiField("holder_address")
	private TuitionAddress holderAddress;

	/**
	 * 本地银行清算号
	 */
	@ApiField("routing_number")
	private String routingNumber;

	public String getBankAccountNo() {
		return this.bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankBic() {
		return this.bankBic;
	}
	public void setBankBic(String bankBic) {
		this.bankBic = bankBic;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public TuitionUserName getHolderAccountName() {
		return this.holderAccountName;
	}
	public void setHolderAccountName(TuitionUserName holderAccountName) {
		this.holderAccountName = holderAccountName;
	}

	public TuitionAddress getHolderAddress() {
		return this.holderAddress;
	}
	public void setHolderAddress(TuitionAddress holderAddress) {
		this.holderAddress = holderAddress;
	}

	public String getRoutingNumber() {
		return this.routingNumber;
	}
	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

}
