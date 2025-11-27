package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.fundtransfer.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-24 11:12:41
 */
public class AlipayEbppIndustrySupervisionFundtransferQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4142385323823444646L;

	/** 
	 * 冻资关联账户
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 划拨金额（整数，单位：分）
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 行业受理操作单号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 资金划拨时对手方账户
	 */
	@ApiField("opposite_account_no")
	private String oppositeAccountNo;

	/** 
	 * 外部请求流水号
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/** 
	 * 资金划拨场景
	 */
	@ApiField("transfer_scene")
	private String transferScene;

	/** 
	 * 资金划拨结果
	 */
	@ApiField("transfer_status")
	private String transferStatus;

	/** 
	 * 资金划拨时间
	 */
	@ApiField("transfer_time")
	private String transferTime;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}
	public String getOperateNo( ) {
		return this.operateNo;
	}

	public void setOppositeAccountNo(String oppositeAccountNo) {
		this.oppositeAccountNo = oppositeAccountNo;
	}
	public String getOppositeAccountNo( ) {
		return this.oppositeAccountNo;
	}

	public void setOutFlowId(String outFlowId) {
		this.outFlowId = outFlowId;
	}
	public String getOutFlowId( ) {
		return this.outFlowId;
	}

	public void setTransferScene(String transferScene) {
		this.transferScene = transferScene;
	}
	public String getTransferScene( ) {
		return this.transferScene;
	}

	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
	public String getTransferStatus( ) {
		return this.transferStatus;
	}

	public void setTransferTime(String transferTime) {
		this.transferTime = transferTime;
	}
	public String getTransferTime( ) {
		return this.transferTime;
	}

}
