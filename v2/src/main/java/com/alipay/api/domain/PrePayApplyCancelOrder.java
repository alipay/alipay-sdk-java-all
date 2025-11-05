package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付取消入参
 *
 * @author auto create
 * @since 1.0, 2025-10-20 09:57:28
 */
public class PrePayApplyCancelOrder extends AlipayObject {

	private static final long serialVersionUID = 6512552497172743644L;

	/**
	 * 预付取消金额 cent为分 1元=100分
	 */
	@ApiField("cancel_amount")
	private MultiCurrencyMoneyOpenApi cancelAmount;

	/**
	 * 调用方保证唯一的幂等id
	 */
	@ApiField("idempotent_no")
	private String idempotentNo;

	/**
	 * 上游下发结算参与者信息
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

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
	 * 预付申请对应外部单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
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

}
