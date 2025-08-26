package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 政务监管订单资金划拨流水记录
 *
 * @author auto create
 * @since 1.0, 2024-06-12 10:02:50
 */
public class SupervisionOrderTransferBillInfo extends AlipayObject {

	private static final long serialVersionUID = 7568158271664181555L;

	/**
	 * 用户冻资子户号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 流水金额，整数（单位：分）
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
	 * 外部流水号
	 */
	@ApiField("out_flow_id")
	private String outFlowId;

	/**
	 * 关联外部订单号
	 */
	@ApiField("relation_out_order_no")
	private String relationOutOrderNo;

	/**
	 * 当前资金操作场景
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
	private Date transferTime;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getOutFlowId() {
		return this.outFlowId;
	}
	public void setOutFlowId(String outFlowId) {
		this.outFlowId = outFlowId;
	}

	public String getRelationOutOrderNo() {
		return this.relationOutOrderNo;
	}
	public void setRelationOutOrderNo(String relationOutOrderNo) {
		this.relationOutOrderNo = relationOutOrderNo;
	}

	public String getTransferScene() {
		return this.transferScene;
	}
	public void setTransferScene(String transferScene) {
		this.transferScene = transferScene;
	}

	public String getTransferStatus() {
		return this.transferStatus;
	}
	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}

	public Date getTransferTime() {
		return this.transferTime;
	}
	public void setTransferTime(Date transferTime) {
		this.transferTime = transferTime;
	}

}
