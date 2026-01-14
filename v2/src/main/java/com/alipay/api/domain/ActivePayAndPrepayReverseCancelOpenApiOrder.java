package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应付&对应预付占用撤销入参
 *
 * @author auto create
 * @since 1.0, 2025-10-20 09:57:17
 */
public class ActivePayAndPrepayReverseCancelOpenApiOrder extends AlipayObject {

	private static final long serialVersionUID = 7782467694149827351L;

	/**
	 * 撤销金额 一元=100分
	 */
	@ApiField("cancel_amount")
	private MultiCurrencyMoneyOpenApi cancelAmount;

	/**
	 * 调用系统幂等键
	 */
	@ApiField("idempotent_no")
	private String idempotentNo;

	/**
	 * 付款结算单角色来源
	 */
	@ApiField("ip_role_source")
	private String ipRoleSource;

	/**
	 * 操作备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 对应结算待撤销的应付结算单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 上游下发结算参与者信息
	 */
	@ApiField("settle_ip_role_id")
	private String settleIpRoleId;

	/**
	 * 调用系统来源
	 */
	@ApiField("source")
	private String source;

	public MultiCurrencyMoneyOpenApi getCancelAmount() {
		return this.cancelAmount;
	}
	public void setCancelAmount(MultiCurrencyMoneyOpenApi cancelAmount) {
		this.cancelAmount = cancelAmount;
	}

	public String getIdempotentNo() {
		return this.idempotentNo;
	}
	public void setIdempotentNo(String idempotentNo) {
		this.idempotentNo = idempotentNo;
	}

	public String getIpRoleSource() {
		return this.ipRoleSource;
	}
	public void setIpRoleSource(String ipRoleSource) {
		this.ipRoleSource = ipRoleSource;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSettleIpRoleId() {
		return this.settleIpRoleId;
	}
	public void setSettleIpRoleId(String settleIpRoleId) {
		this.settleIpRoleId = settleIpRoleId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
