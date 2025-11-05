package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款账单聚合信息
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:22:42
 */
public class ConsumerLoanBillAggInfo extends AlipayObject {

	private static final long serialVersionUID = 2383435414857619566L;

	/**
	 * 当前待还总金额，单位为分，1000代表10.00元
	 */
	@ApiField("current_repay_amount")
	private Long currentRepayAmount;

	/**
	 * 出账日期，若无出账日可不填
	 */
	@ApiField("expanditure_publish_date")
	private String expanditurePublishDate;

	/**
	 * 到期天数，单位为天
	 */
	@ApiField("expire_days")
	private Long expireDays;

	/**
	 * 剩余待还总金额，单位为分，1000代表10.00元
	 */
	@ApiField("last_total_principal_amount")
	private Long lastTotalPrincipalAmount;

	/**
	 * 下期待还金额，单位为分，1000代表10.00元
	 */
	@ApiField("next_repay_amount")
	private Long nextRepayAmount;

	/**
	 * 下期还款时间
	 */
	@ApiField("next_repay_date")
	private String nextRepayDate;

	/**
	 * 还款日期
	 */
	@ApiField("repay_date")
	private String repayDate;

	/**
	 * 是否特殊账务状态，当用户标识为延期、展期、债务重组、联贷转自营时，用户点击“查看”，直接跳转到三方商户承接页
	 */
	@ApiField("special_account")
	private Boolean specialAccount;

	/**
	 * 账单聚合状态
	 */
	@ApiField("status")
	private String status;

	public Long getCurrentRepayAmount() {
		return this.currentRepayAmount;
	}
	public void setCurrentRepayAmount(Long currentRepayAmount) {
		this.currentRepayAmount = currentRepayAmount;
	}

	public String getExpanditurePublishDate() {
		return this.expanditurePublishDate;
	}
	public void setExpanditurePublishDate(String expanditurePublishDate) {
		this.expanditurePublishDate = expanditurePublishDate;
	}

	public Long getExpireDays() {
		return this.expireDays;
	}
	public void setExpireDays(Long expireDays) {
		this.expireDays = expireDays;
	}

	public Long getLastTotalPrincipalAmount() {
		return this.lastTotalPrincipalAmount;
	}
	public void setLastTotalPrincipalAmount(Long lastTotalPrincipalAmount) {
		this.lastTotalPrincipalAmount = lastTotalPrincipalAmount;
	}

	public Long getNextRepayAmount() {
		return this.nextRepayAmount;
	}
	public void setNextRepayAmount(Long nextRepayAmount) {
		this.nextRepayAmount = nextRepayAmount;
	}

	public String getNextRepayDate() {
		return this.nextRepayDate;
	}
	public void setNextRepayDate(String nextRepayDate) {
		this.nextRepayDate = nextRepayDate;
	}

	public String getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}

	public Boolean getSpecialAccount() {
		return this.specialAccount;
	}
	public void setSpecialAccount(Boolean specialAccount) {
		this.specialAccount = specialAccount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
