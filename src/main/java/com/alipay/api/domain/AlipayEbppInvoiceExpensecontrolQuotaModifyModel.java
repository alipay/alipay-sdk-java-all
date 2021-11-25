package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改额度
 *
 * @author auto create
 * @since 1.0, 2021-11-19 11:46:41
 */
public class AlipayEbppInvoiceExpensecontrolQuotaModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1371144441741317113L;

	/**
	 * 企业签约企业合花ID-共同账号ID
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 变更模式
ADD - 增加额度
DEDUCT - 扣减额度
UPDATE_BALANCE-更新可用余额
FREEZE-额度冻结
UNFREEZE-额度解冻
	 */
	@ApiField("action")
	private String action;

	/**
	 * 授权签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 变更的额度（分）
最大值：10000000
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 外部幂等ID（由外部指定不重复ID）
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 外部平台编码（请联系对接人获取）
	 */
	@ApiField("platform")
	private String platform;

	/**
	 * 额度ID
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
