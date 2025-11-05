package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房直付银行信息
 *
 * @author auto create
 * @since 1.0, 2024-12-19 22:32:17
 */
public class RentPayBankInfo extends AlipayObject {

	private static final long serialVersionUID = 4612273391351721316L;

	/**
	 * 收款账户开户人名称
	 */
	@ApiField("rent_acct_name")
	private String rentAcctName;

	/**
	 * 公积金中心对租赁机构收款银行分配的银行编码
	 */
	@ApiField("rent_bank_code")
	private String rentBankCode;

	/**
	 * 开户银行全称
	 */
	@ApiField("rent_bank_name")
	private String rentBankName;

	/**
	 * 收款银行账号号码
	 */
	@ApiField("rent_card_num")
	private String rentCardNum;

	public String getRentAcctName() {
		return this.rentAcctName;
	}
	public void setRentAcctName(String rentAcctName) {
		this.rentAcctName = rentAcctName;
	}

	public String getRentBankCode() {
		return this.rentBankCode;
	}
	public void setRentBankCode(String rentBankCode) {
		this.rentBankCode = rentBankCode;
	}

	public String getRentBankName() {
		return this.rentBankName;
	}
	public void setRentBankName(String rentBankName) {
		this.rentBankName = rentBankName;
	}

	public String getRentCardNum() {
		return this.rentCardNum;
	}
	public void setRentCardNum(String rentCardNum) {
		this.rentCardNum = rentCardNum;
	}

}
