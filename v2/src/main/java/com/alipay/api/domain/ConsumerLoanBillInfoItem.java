package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费贷还款账单信息ITEM
 *
 * @author auto create
 * @since 1.0, 2024-08-06 11:22:35
 */
public class ConsumerLoanBillInfoItem extends AlipayObject {

	private static final long serialVersionUID = 5516242312591126979L;

	/**
	 * 可提前还款的日期，日期格式为YYYY-MM-DD hh:mm:ss
	 */
	@ApiField("allowed_pay_off_early_date")
	private String allowedPayOffEarlyDate;

	/**
	 * 账单ID
	 */
	@ApiField("bill_id")
	private String billId;

	/**
	 * 本期还款金额，单位为分，1000代表10.00元，状态为“本期已还”时必填，其余状态选填
	 */
	@ApiField("current_period_paid_amount")
	private Long currentPeriodPaidAmount;

	/**
	 * 本期账单还清时间，若状态非“本期已结”可不传
	 */
	@ApiField("current_period_paid_time")
	private String currentPeriodPaidTime;

	/**
	 * 罚息或违约金，单位为分，1000代表10.00元，若无该项费用填0
	 */
	@ApiField("damage_amount")
	private Long damageAmount;

	/**
	 * 账单出账日，日期格式为YYYY-MM-DD hh:mm:ss，若无出账日概念可不填写
	 */
	@ApiField("expanditure_publish_date")
	private String expanditurePublishDate;

	/**
	 * 合同ID
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 担保费及(或)保险费，单位为分，1000代表10.00元，若无该项费用填0
	 */
	@ApiField("insurance_amount")
	private Long insuranceAmount;

	/**
	 * 单位为分，1000代表10.00元
	 */
	@ApiField("interest_amount")
	private Long interestAmount;

	/**
	 * 该笔账单（账单为按照还款日聚合的还款计划），涉及到的借据笔数
	 */
	@ApiField("loan_count")
	private Long loanCount;

	/**
	 * 单位为分，1000代表10.00元，若无该项费用填0
	 */
	@ApiField("penalty_interest_amount")
	private Long penaltyInterestAmount;

	/**
	 * 单位为分，1000代表10.00元
	 */
	@ApiField("principal_amount")
	private Long principalAmount;

	/**
	 * 单位为分，1000代表10.00元
	 */
	@ApiField("repay_amount")
	private Long repayAmount;

	/**
	 * 账单还款日，日期格式为YYYY-MM-DD hh:mm:ss
	 */
	@ApiField("repay_date")
	private String repayDate;

	/**
	 * selectType = ALL
默认勾选全部逾期，不可取消
其它可还款还款账单默认不勾选
支持多选
selectType = PART
默认勾选首条逾期，不可取消
勾选逾期账单有次序限制
其它可还款账单默认不勾选
支持多选
selectType = SINGLE
默认勾选首条逾期，不可取消
若没有逾期，其它可还款账单默认勾选首条
支持单选
selectType = UN_LIMIT
不限制
	 */
	@ApiField("select_type")
	private String selectType;

	/**
	 * 账单状态，可根据实际情况填充，如无出账概念可不传未出账和已出账状态
	 */
	@ApiField("status")
	private String status;

	public String getAllowedPayOffEarlyDate() {
		return this.allowedPayOffEarlyDate;
	}
	public void setAllowedPayOffEarlyDate(String allowedPayOffEarlyDate) {
		this.allowedPayOffEarlyDate = allowedPayOffEarlyDate;
	}

	public String getBillId() {
		return this.billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}

	public Long getCurrentPeriodPaidAmount() {
		return this.currentPeriodPaidAmount;
	}
	public void setCurrentPeriodPaidAmount(Long currentPeriodPaidAmount) {
		this.currentPeriodPaidAmount = currentPeriodPaidAmount;
	}

	public String getCurrentPeriodPaidTime() {
		return this.currentPeriodPaidTime;
	}
	public void setCurrentPeriodPaidTime(String currentPeriodPaidTime) {
		this.currentPeriodPaidTime = currentPeriodPaidTime;
	}

	public Long getDamageAmount() {
		return this.damageAmount;
	}
	public void setDamageAmount(Long damageAmount) {
		this.damageAmount = damageAmount;
	}

	public String getExpanditurePublishDate() {
		return this.expanditurePublishDate;
	}
	public void setExpanditurePublishDate(String expanditurePublishDate) {
		this.expanditurePublishDate = expanditurePublishDate;
	}

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Long getInsuranceAmount() {
		return this.insuranceAmount;
	}
	public void setInsuranceAmount(Long insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public Long getInterestAmount() {
		return this.interestAmount;
	}
	public void setInterestAmount(Long interestAmount) {
		this.interestAmount = interestAmount;
	}

	public Long getLoanCount() {
		return this.loanCount;
	}
	public void setLoanCount(Long loanCount) {
		this.loanCount = loanCount;
	}

	public Long getPenaltyInterestAmount() {
		return this.penaltyInterestAmount;
	}
	public void setPenaltyInterestAmount(Long penaltyInterestAmount) {
		this.penaltyInterestAmount = penaltyInterestAmount;
	}

	public Long getPrincipalAmount() {
		return this.principalAmount;
	}
	public void setPrincipalAmount(Long principalAmount) {
		this.principalAmount = principalAmount;
	}

	public Long getRepayAmount() {
		return this.repayAmount;
	}
	public void setRepayAmount(Long repayAmount) {
		this.repayAmount = repayAmount;
	}

	public String getRepayDate() {
		return this.repayDate;
	}
	public void setRepayDate(String repayDate) {
		this.repayDate = repayDate;
	}

	public String getSelectType() {
		return this.selectType;
	}
	public void setSelectType(String selectType) {
		this.selectType = selectType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
