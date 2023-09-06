package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收付款中心结算单模型
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:29:15
 */
public class PayRcvSettleOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 3331254978483691836L;

	/**
	 * 需结算金额
	 */
	@ApiField("amount")
	private MultiCurrencyMoneyOpenApi amount;

	/**
	 * 端产品码
	 */
	@ApiField("ant_pd_code")
	private String antPdCode;

	/**
	 * 收付款引擎申请单id
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 协议号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 业务产品码
	 */
	@ApiField("biz_pd_code")
	private String bizPdCode;

	/**
	 * 结算时点
	 */
	@ApiField("fund_settle_time")
	private String fundSettleTime;

	/**
	 * 结算资金模式
	 */
	@ApiField("initiative_settle")
	private String initiativeSettle;

	/**
	 * 机构
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 销售产品码的签约主体
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 主体来源
	 */
	@ApiField("ip_role_id_source")
	private String ipRoleIdSource;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 结算单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 付款时间
	 */
	@ApiField("pay_date")
	private String payDate;

	/**
	 * 收款支行
	 */
	@ApiField("payee_account_branch_name")
	private String payeeAccountBranchName;

	/**
	 * 收款人
	 */
	@ApiField("payee_account_name")
	private String payeeAccountName;

	/**
	 * 收款方账号
	 */
	@ApiField("payee_account_no")
	private String payeeAccountNo;

	/**
	 * 付款方账号类型
	 */
	@ApiField("payee_account_type")
	private String payeeAccountType;

	/**
	 * 收款方账号类型
	 */
	@ApiField("payee_account_type_name")
	private String payeeAccountTypeName;

	/**
	 * 方
	 */
	@ApiField("payee_ip_role_id")
	private String payeeIpRoleId;

	/**
	 * 付款方支行
	 */
	@ApiField("payer_account_branch_name")
	private String payerAccountBranchName;

	/**
	 * 付款人
	 */
	@ApiField("payer_account_name")
	private String payerAccountName;

	/**
	 * 付款方账号
	 */
	@ApiField("payer_account_no")
	private String payerAccountNo;

	/**
	 * 付款方账号类型
	 */
	@ApiField("payer_account_type")
	private String payerAccountType;

	/**
	 * 付款方账号类型名称
	 */
	@ApiField("payer_account_type_name")
	private String payerAccountTypeName;

	/**
	 * 结算付款方主体
	 */
	@ApiField("payer_ip_role_id")
	private String payerIpRoleId;

	/**
	 * 销售产品码
	 */
	@ApiField("sales_product_code")
	private String salesProductCode;

	/**
	 * 结算的业务类型
	 */
	@ApiField("settle_biz_type")
	private String settleBizType;

	/**
	 * 已结算金额
	 */
	@ApiField("settled_amount")
	private MultiCurrencyMoneyOpenApi settledAmount;

	/**
	 * 结算单状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 状态名称
	 */
	@ApiField("status_name")
	private String statusName;

	public MultiCurrencyMoneyOpenApi getAmount() {
		return this.amount;
	}
	public void setAmount(MultiCurrencyMoneyOpenApi amount) {
		this.amount = amount;
	}

	public String getAntPdCode() {
		return this.antPdCode;
	}
	public void setAntPdCode(String antPdCode) {
		this.antPdCode = antPdCode;
	}

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
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

	public String getInitiativeSettle() {
		return this.initiativeSettle;
	}
	public void setInitiativeSettle(String initiativeSettle) {
		this.initiativeSettle = initiativeSettle;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getIpRoleIdSource() {
		return this.ipRoleIdSource;
	}
	public void setIpRoleIdSource(String ipRoleIdSource) {
		this.ipRoleIdSource = ipRoleIdSource;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayDate() {
		return this.payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getPayeeAccountBranchName() {
		return this.payeeAccountBranchName;
	}
	public void setPayeeAccountBranchName(String payeeAccountBranchName) {
		this.payeeAccountBranchName = payeeAccountBranchName;
	}

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

	public String getPayeeAccountType() {
		return this.payeeAccountType;
	}
	public void setPayeeAccountType(String payeeAccountType) {
		this.payeeAccountType = payeeAccountType;
	}

	public String getPayeeAccountTypeName() {
		return this.payeeAccountTypeName;
	}
	public void setPayeeAccountTypeName(String payeeAccountTypeName) {
		this.payeeAccountTypeName = payeeAccountTypeName;
	}

	public String getPayeeIpRoleId() {
		return this.payeeIpRoleId;
	}
	public void setPayeeIpRoleId(String payeeIpRoleId) {
		this.payeeIpRoleId = payeeIpRoleId;
	}

	public String getPayerAccountBranchName() {
		return this.payerAccountBranchName;
	}
	public void setPayerAccountBranchName(String payerAccountBranchName) {
		this.payerAccountBranchName = payerAccountBranchName;
	}

	public String getPayerAccountName() {
		return this.payerAccountName;
	}
	public void setPayerAccountName(String payerAccountName) {
		this.payerAccountName = payerAccountName;
	}

	public String getPayerAccountNo() {
		return this.payerAccountNo;
	}
	public void setPayerAccountNo(String payerAccountNo) {
		this.payerAccountNo = payerAccountNo;
	}

	public String getPayerAccountType() {
		return this.payerAccountType;
	}
	public void setPayerAccountType(String payerAccountType) {
		this.payerAccountType = payerAccountType;
	}

	public String getPayerAccountTypeName() {
		return this.payerAccountTypeName;
	}
	public void setPayerAccountTypeName(String payerAccountTypeName) {
		this.payerAccountTypeName = payerAccountTypeName;
	}

	public String getPayerIpRoleId() {
		return this.payerIpRoleId;
	}
	public void setPayerIpRoleId(String payerIpRoleId) {
		this.payerIpRoleId = payerIpRoleId;
	}

	public String getSalesProductCode() {
		return this.salesProductCode;
	}
	public void setSalesProductCode(String salesProductCode) {
		this.salesProductCode = salesProductCode;
	}

	public String getSettleBizType() {
		return this.settleBizType;
	}
	public void setSettleBizType(String settleBizType) {
		this.settleBizType = settleBizType;
	}

	public MultiCurrencyMoneyOpenApi getSettledAmount() {
		return this.settledAmount;
	}
	public void setSettledAmount(MultiCurrencyMoneyOpenApi settledAmount) {
		this.settledAmount = settledAmount;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusName() {
		return this.statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}
