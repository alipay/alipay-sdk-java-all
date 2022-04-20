package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改额度
 *
 * @author auto create
 * @since 1.0, 2021-12-14 17:49:58
 */
public class AlipayEbppInvoiceExpensecontrolQuotaModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1662338247343998867L;

	/**
	 * 企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 变更模式
ADD - 给余额增加amount
DEDUCT - 给余额扣减amount
UPDATE_BALANCE-更新可用余额为amount
FREEZE-余额冻结（若冻结，则员工因公支付不可用）
UNFREEZE-余额解冻
DELETE-余额删除
	 */
	@ApiField("action")
	private String action;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 变更的金额/余额，以（分）为单位
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 外部操作幂等ID（接入方接口调用幂等控制ID）
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 外部平台编码（通常为接入方大写英文缩写）
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 余额ID
	 */
	@ApiField("quota_id")
	private String quotaId;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getQuotaId() {
		return this.quotaId;
	}
	public void setQuotaId(String quotaId) {
		this.quotaId = quotaId;
	}

}
