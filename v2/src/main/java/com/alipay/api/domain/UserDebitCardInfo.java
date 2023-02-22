package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 借记卡信息
 *
 * @author auto create
 * @since 1.0, 2022-12-02 16:41:41
 */
public class UserDebitCardInfo extends AlipayObject {

	private static final long serialVersionUID = 3485581313189182248L;

	/**
	 * 借记卡户名
	 */
	@ApiField("account_name")
	private String accountName;

	/**
	 * 借记卡等账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 发卡行机构编码
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 借记卡发卡行
	 */
	@ApiField("issuing_bank")
	private String issuingBank;

	public String getAccountName() {
		return this.accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIssuingBank() {
		return this.issuingBank;
	}
	public void setIssuingBank(String issuingBank) {
		this.issuingBank = issuingBank;
	}

}
