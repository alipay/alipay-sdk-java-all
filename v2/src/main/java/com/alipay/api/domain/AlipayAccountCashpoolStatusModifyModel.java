package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金池状态修改
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:20:29
 */
public class AlipayAccountCashpoolStatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7688595116275735143L;

	/**
	 * 资金池状态，INITIAL/RUN/STOP
	 */
	@ApiField("adjust_status")
	private String adjustStatus;

	/**
	 * 资金池ID
	 */
	@ApiField("cash_pool_id")
	private String cashPoolId;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 操作员
	 */
	@ApiField("operator")
	private String operator;

	public String getAdjustStatus() {
		return this.adjustStatus;
	}
	public void setAdjustStatus(String adjustStatus) {
		this.adjustStatus = adjustStatus;
	}

	public String getCashPoolId() {
		return this.cashPoolId;
	}
	public void setCashPoolId(String cashPoolId) {
		this.cashPoolId = cashPoolId;
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

}
