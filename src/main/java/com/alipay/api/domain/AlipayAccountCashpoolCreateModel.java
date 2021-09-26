package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金池创建
 *
 * @author auto create
 * @since 1.0, 2020-07-06 11:19:58
 */
public class AlipayAccountCashpoolCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1824121833262346919L;

	/**
	 * 设置资金池名称
	 */
	@ApiField("cash_pool_name")
	private String cashPoolName;

	/**
	 * INITIAL/RUN/STOP，初始、运行、暂停状态
	 */
	@ApiField("cash_pool_status")
	private String cashPoolStatus;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 提交人名称
	 */
	@ApiField("operator")
	private String operator;

	public String getCashPoolName() {
		return this.cashPoolName;
	}
	public void setCashPoolName(String cashPoolName) {
		this.cashPoolName = cashPoolName;
	}

	public String getCashPoolStatus() {
		return this.cashPoolStatus;
	}
	public void setCashPoolStatus(String cashPoolStatus) {
		this.cashPoolStatus = cashPoolStatus;
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
