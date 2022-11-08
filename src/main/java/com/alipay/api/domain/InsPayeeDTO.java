package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景开放平台报案接口-收款人模型
 *
 * @author auto create
 * @since 1.0, 2022-10-27 14:04:28
 */
public class InsPayeeDTO extends AlipayObject {

	private static final long serialVersionUID = 5246797692177425122L;

	/**
	 * 支付宝账号id：资金账号类型为支付宝时，必传
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 支付宝账号id：资金账号类型为支付宝时，必传
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 银行卡持卡人姓名:资金账号类型为银行卡时，必传
	 */
	@ApiField("bank_card_holder_name")
	private String bankCardHolderName;

	/**
	 * 银行卡号:资金账号类型为银行卡时，必传
	 */
	@ApiField("bank_card_no")
	private String bankCardNo;

	/**
	 * 银行id
	 */
	@ApiField("bank_id")
	private String bankId;

	/**
	 * 银行名称
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 资金账号类型：ALIPAY( 支付宝),(BANK) 银行卡
	 */
	@ApiField("bill_account_type")
	private String billAccountType;

	/**
	 * 收款人用户id
	 */
	@ApiField("payee_user_id")
	private String payeeUserId;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getBankCardHolderName() {
		return this.bankCardHolderName;
	}
	public void setBankCardHolderName(String bankCardHolderName) {
		this.bankCardHolderName = bankCardHolderName;
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getBankId() {
		return this.bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBillAccountType() {
		return this.billAccountType;
	}
	public void setBillAccountType(String billAccountType) {
		this.billAccountType = billAccountType;
	}

	public String getPayeeUserId() {
		return this.payeeUserId;
	}
	public void setPayeeUserId(String payeeUserId) {
		this.payeeUserId = payeeUserId;
	}

}
