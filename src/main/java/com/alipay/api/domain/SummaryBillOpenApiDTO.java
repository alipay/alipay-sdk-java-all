package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇总账单信息openapi
 *
 * @author auto create
 * @since 1.0, 2022-11-03 16:34:44
 */
public class SummaryBillOpenApiDTO extends AlipayObject {

	private static final long serialVersionUID = 8155195243713951257L;

	/**
	 * 调账金额
	 */
	@ApiField("adjust_amount")
	private MultiCurrencyMoneyOpenApi adjustAmount;

	/**
	 * 账单金额
	 */
	@ApiField("bill_amount")
	private MultiCurrencyMoneyOpenApi billAmount;

	/**
	 * 账单月份
	 */
	@ApiField("bill_month")
	private String billMonth;

	/**
	 * 账单编码
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * UNCHECKED("unchecked", "未出账"),
PARTIAL_CHECK("partial_checked","部分出账"),
CHECKED("checked", "已出账"),
CONFIRMED("confirmed", "账单已确认");
	 */
	@ApiField("bill_status")
	private String billStatus;

	/**
	 * 业财身份编码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 资金结算时点
	 */
	@ApiField("fund_settle_time")
	private String fundSettleTime;

	/**
	 * 机构OU
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 收款方pid
	 */
	@ApiField("payee_ip_role_id")
	private String payeeIpRoleId;

	/**
	 * 真实账单金额 = 账单金额 + 调账金额
	 */
	@ApiField("real_bill_amount")
	private MultiCurrencyMoneyOpenApi realBillAmount;

	/**
	 * 结算对象pid
	 */
	@ApiField("settle_ip_role_id")
	private String settleIpRoleId;

	/**
	 * 结算状态 code
部分核销 partial_settled、未核销 none_settled、已核销 complelte_settled
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * 结算时间类型
real、delayed
	 */
	@ApiField("settle_time_type")
	private String settleTimeType;

	/**
	 * 已结算金额
	 */
	@ApiField("settled_amount")
	private MultiCurrencyMoneyOpenApi settledAmount;

	/**
	 * 调用者系统名称
	 */
	@ApiField("source")
	private String source;

	public MultiCurrencyMoneyOpenApi getAdjustAmount() {
		return this.adjustAmount;
	}
	public void setAdjustAmount(MultiCurrencyMoneyOpenApi adjustAmount) {
		this.adjustAmount = adjustAmount;
	}

	public MultiCurrencyMoneyOpenApi getBillAmount() {
		return this.billAmount;
	}
	public void setBillAmount(MultiCurrencyMoneyOpenApi billAmount) {
		this.billAmount = billAmount;
	}

	public String getBillMonth() {
		return this.billMonth;
	}
	public void setBillMonth(String billMonth) {
		this.billMonth = billMonth;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getBillStatus() {
		return this.billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getBizPdCode() {
		return this.bizPdCode;
	}
	public void setBizPdCode(String bizPdCode) {
		this.bizPdCode = bizPdCode;
	}

	public String getFundSettleTime() {
		return this.fundSettleTime;
	}
	public void setFundSettleTime(String fundSettleTime) {
		this.fundSettleTime = fundSettleTime;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getPayeeIpRoleId() {
		return this.payeeIpRoleId;
	}
	public void setPayeeIpRoleId(String payeeIpRoleId) {
		this.payeeIpRoleId = payeeIpRoleId;
	}

	public MultiCurrencyMoneyOpenApi getRealBillAmount() {
		return this.realBillAmount;
	}
	public void setRealBillAmount(MultiCurrencyMoneyOpenApi realBillAmount) {
		this.realBillAmount = realBillAmount;
	}

	public String getSettleIpRoleId() {
		return this.settleIpRoleId;
	}
	public void setSettleIpRoleId(String settleIpRoleId) {
		this.settleIpRoleId = settleIpRoleId;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public String getSettleTimeType() {
		return this.settleTimeType;
	}
	public void setSettleTimeType(String settleTimeType) {
		this.settleTimeType = settleTimeType;
	}

	public MultiCurrencyMoneyOpenApi getSettledAmount() {
		return this.settledAmount;
	}
	public void setSettledAmount(MultiCurrencyMoneyOpenApi settledAmount) {
		this.settledAmount = settledAmount;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
