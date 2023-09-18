package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收益分配结算单核销
 *
 * @author auto create
 * @since 1.0, 2023-07-18 22:13:16
 */
public class AnttechBlockchainFinanceIncomeStatementVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4736796716787882672L;

	/**
	 * 核销流水号，幂等ID
	 */
	@ApiField("biz_no")
	private String bizNo;

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
	 * 结算单编号，同结算单同步时的编号
	 */
	@ApiField("statement_no")
	private String statementNo;

	/**
	 * 交易ID，租赁交易登记后返回，按返回ID填写
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 核销金额，单位元
	 */
	@ApiField("write_off_amount")
	private String writeOffAmount;

	/**
	 * 核销时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("write_off_time")
	private Date writeOffTime;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
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

	public String getStatementNo() {
		return this.statementNo;
	}
	public void setStatementNo(String statementNo) {
		this.statementNo = statementNo;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getWriteOffAmount() {
		return this.writeOffAmount;
	}
	public void setWriteOffAmount(String writeOffAmount) {
		this.writeOffAmount = writeOffAmount;
	}

	public Date getWriteOffTime() {
		return this.writeOffTime;
	}
	public void setWriteOffTime(Date writeOffTime) {
		this.writeOffTime = writeOffTime;
	}

}
