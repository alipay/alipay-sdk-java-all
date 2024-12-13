package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收益分配结算单同步
 *
 * @author auto create
 * @since 1.0, 2023-06-28 19:30:58
 */
public class AnttechBlockchainFinanceIncomeStatementSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7833515568986671867L;

	/**
	 * 结算单同步流水号，幂等ID
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 减免金额，单位元
	 */
	@ApiField("deduction_amount")
	private String deductionAmount;

	/**
	 * 明细合计金额，单位元
	 */
	@ApiField("detailed_summary_amount")
	private String detailedSummaryAmount;

	/**
	 * 收益分配产品码，可联系产品或运营同学获取
	 */
	@ApiField("distribution_pro_no")
	private String distributionProNo;

	/**
	 * 收益分配合约规则ID，可联系产品或运营同学获取
	 */
	@ApiField("distribution_rule_id")
	private String distributionRuleId;

	/**
	 * 结算单应收金额，按实际结算单应收金额填写，单位元
	 */
	@ApiField("receivable_amount")
	private String receivableAmount;

	/**
	 * 结算单明细列表
	 */
	@ApiField("statement_detaileds")
	private StatementDetaileds statementDetaileds;

	/**
	 * 结算单文件id，按结算单文件提交后返回的fileId填写
	 */
	@ApiField("statement_file_id")
	private String statementFileId;

	/**
	 * 结算单出具日，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("statement_issue_date")
	private Date statementIssueDate;

	/**
	 * 结算单编号，按实际结算单编号填写
	 */
	@ApiField("statement_no")
	private String statementNo;

	/**
	 * 统计结束日期，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("statistics_end_date")
	private Date statisticsEndDate;

	/**
	 * 统计起始日期，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("statistics_start_date")
	private Date statisticsStartDate;

	/**
	 * 补收金额，单位元
	 */
	@ApiField("supplementary_amount")
	private String supplementaryAmount;

	/**
	 * 交易ID，租赁交易登记后返回，结算单同步时填写
	 */
	@ApiField("trade_id")
	private String tradeId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getDeductionAmount() {
		return this.deductionAmount;
	}
	public void setDeductionAmount(String deductionAmount) {
		this.deductionAmount = deductionAmount;
	}

	public String getDetailedSummaryAmount() {
		return this.detailedSummaryAmount;
	}
	public void setDetailedSummaryAmount(String detailedSummaryAmount) {
		this.detailedSummaryAmount = detailedSummaryAmount;
	}

	public String getDistributionProNo() {
		return this.distributionProNo;
	}
	public void setDistributionProNo(String distributionProNo) {
		this.distributionProNo = distributionProNo;
	}

	public String getDistributionRuleId() {
		return this.distributionRuleId;
	}
	public void setDistributionRuleId(String distributionRuleId) {
		this.distributionRuleId = distributionRuleId;
	}

	public String getReceivableAmount() {
		return this.receivableAmount;
	}
	public void setReceivableAmount(String receivableAmount) {
		this.receivableAmount = receivableAmount;
	}

	public StatementDetaileds getStatementDetaileds() {
		return this.statementDetaileds;
	}
	public void setStatementDetaileds(StatementDetaileds statementDetaileds) {
		this.statementDetaileds = statementDetaileds;
	}

	public String getStatementFileId() {
		return this.statementFileId;
	}
	public void setStatementFileId(String statementFileId) {
		this.statementFileId = statementFileId;
	}

	public Date getStatementIssueDate() {
		return this.statementIssueDate;
	}
	public void setStatementIssueDate(Date statementIssueDate) {
		this.statementIssueDate = statementIssueDate;
	}

	public String getStatementNo() {
		return this.statementNo;
	}
	public void setStatementNo(String statementNo) {
		this.statementNo = statementNo;
	}

	public Date getStatisticsEndDate() {
		return this.statisticsEndDate;
	}
	public void setStatisticsEndDate(Date statisticsEndDate) {
		this.statisticsEndDate = statisticsEndDate;
	}

	public Date getStatisticsStartDate() {
		return this.statisticsStartDate;
	}
	public void setStatisticsStartDate(Date statisticsStartDate) {
		this.statisticsStartDate = statisticsStartDate;
	}

	public String getSupplementaryAmount() {
		return this.supplementaryAmount;
	}
	public void setSupplementaryAmount(String supplementaryAmount) {
		this.supplementaryAmount = supplementaryAmount;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}
