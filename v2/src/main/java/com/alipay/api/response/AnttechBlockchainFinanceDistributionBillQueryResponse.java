package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IncomeDistributionOrderTransInDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.distribution.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-17 17:46:42
 */
public class AnttechBlockchainFinanceDistributionBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3152498458825189896L;

	/** 
	 * 来自于结算单核销流水金额,单位元
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 收益分配订单号
	 */
	@ApiField("distribution_order_id")
	private String distributionOrderId;

	/** 
	 * 收益分配规则Id
	 */
	@ApiField("distribution_rule_id")
	private String distributionRuleId;

	/** 
	 * 关联的结算单编号
	 */
	@ApiField("statement_no")
	private String statementNo;

	/** 
	 * 01-初始；02-执行中；03-执行成功；04-执行失败；
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 交易单号
	 */
	@ApiField("trade_id")
	private String tradeId;

	/** 
	 * 收款方详情
	 */
	@ApiListField("trans_in_detail_list")
	@ApiField("income_distribution_order_trans_in_detail")
	private List<IncomeDistributionOrderTransInDetail> transInDetailList;

	/** 
	 * 分出方账号
	 */
	@ApiField("trans_out_account_no")
	private String transOutAccountNo;

	/** 
	 * 分出方账号类型 01-数币子钱包 02-支付宝账户 03-外部银行账户 04-标准数币钱包
	 */
	@ApiField("trans_out_account_type")
	private String transOutAccountType;

	/** 
	 * 分出方名称
	 */
	@ApiField("trans_out_name")
	private String transOutName;

	/** 
	 * 关联的结算单核销流水号
	 */
	@ApiField("write_off_biz_no")
	private String writeOffBizNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setDistributionOrderId(String distributionOrderId) {
		this.distributionOrderId = distributionOrderId;
	}
	public String getDistributionOrderId( ) {
		return this.distributionOrderId;
	}

	public void setDistributionRuleId(String distributionRuleId) {
		this.distributionRuleId = distributionRuleId;
	}
	public String getDistributionRuleId( ) {
		return this.distributionRuleId;
	}

	public void setStatementNo(String statementNo) {
		this.statementNo = statementNo;
	}
	public String getStatementNo( ) {
		return this.statementNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getTradeId( ) {
		return this.tradeId;
	}

	public void setTransInDetailList(List<IncomeDistributionOrderTransInDetail> transInDetailList) {
		this.transInDetailList = transInDetailList;
	}
	public List<IncomeDistributionOrderTransInDetail> getTransInDetailList( ) {
		return this.transInDetailList;
	}

	public void setTransOutAccountNo(String transOutAccountNo) {
		this.transOutAccountNo = transOutAccountNo;
	}
	public String getTransOutAccountNo( ) {
		return this.transOutAccountNo;
	}

	public void setTransOutAccountType(String transOutAccountType) {
		this.transOutAccountType = transOutAccountType;
	}
	public String getTransOutAccountType( ) {
		return this.transOutAccountType;
	}

	public void setTransOutName(String transOutName) {
		this.transOutName = transOutName;
	}
	public String getTransOutName( ) {
		return this.transOutName;
	}

	public void setWriteOffBizNo(String writeOffBizNo) {
		this.writeOffBizNo = writeOffBizNo;
	}
	public String getWriteOffBizNo( ) {
		return this.writeOffBizNo;
	}

}
